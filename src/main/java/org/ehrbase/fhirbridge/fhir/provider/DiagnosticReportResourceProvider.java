package org.ehrbase.fhirbridge.fhir.provider;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.rest.annotation.Create;
import ca.uhn.fhir.rest.annotation.ResourceParam;
import ca.uhn.fhir.rest.api.MethodOutcome;
import org.ehrbase.client.openehrclient.VersionUid;
import org.ehrbase.fhirbridge.fhir.Profile;
import org.ehrbase.fhirbridge.fhir.ProfileUtils;
import org.ehrbase.fhirbridge.mapping.F2OLabReport;
import org.ehrbase.fhirbridge.opt.laborbefundcomposition.LaborbefundComposition;
import org.ehrbase.fhirbridge.rest.EhrbaseService;
import org.hl7.fhir.r4.model.DiagnosticReport;
import org.hl7.fhir.r4.model.IdType;
import org.hl7.fhir.r4.model.InstantType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * Resource provider for DiagnosticReport
 */
@Component
public class DiagnosticReportResourceProvider extends AbstractResourceProvider {

    @Autowired
    public DiagnosticReportResourceProvider(FhirContext fhirContext, EhrbaseService service) {
        super(fhirContext);
        this.service = service;
    }

    private final EhrbaseService service;

    @Create
    @SuppressWarnings("unused")
    public MethodOutcome createDiagnosticReport(@ResourceParam DiagnosticReport diagnosticReport) {
        checkProfiles(diagnosticReport);

        System.out.println(">>>>>>>>>>>>>>>>>> DIAGNOSTIC REPORT "+ diagnosticReport.getIdentifier().get(0).getValue());
        System.out.println(">>>>>>>>>>>>>>>>>> CONTAINED " + diagnosticReport.getContained().size());

        if (ProfileUtils.hasProfile(diagnosticReport, Profile.DIAGNOSTIC_REPORT_LAB)) {
            try {
                LaborbefundComposition composition = F2OLabReport.map(diagnosticReport);
                UUID ehr_id = service.createEhr(); // <<< reflections error!
                VersionUid versionUid = service.save(ehr_id, composition);
                System.out.println("Composition created with UID "+ versionUid.toString() +" for FHIR profile "+ Profile.BODY_TEMP);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        diagnosticReport.setId(new IdType(1L));
        diagnosticReport.getMeta().setVersionId("1");
        diagnosticReport.getMeta().setLastUpdatedElement(InstantType.withCurrentTime());

        return new MethodOutcome()
                .setCreated(true)
                .setResource(diagnosticReport);
    }

    @Override
    public Class<DiagnosticReport> getResourceType() {
        return DiagnosticReport.class;
    }

    @Override
    public boolean isDefaultProfileSupported() {
        return false;
    }
}
