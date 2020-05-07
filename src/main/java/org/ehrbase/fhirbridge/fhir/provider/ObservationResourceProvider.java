package org.ehrbase.fhirbridge.fhir.provider;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.rest.annotation.Create;
import ca.uhn.fhir.rest.annotation.ResourceParam;
import ca.uhn.fhir.rest.api.MethodOutcome;

import org.ehrbase.client.openehrclient.CompositionEndpoint;
import org.ehrbase.client.openehrclient.OpenEhrClientConfig;
import org.ehrbase.client.openehrclient.VersionUid;
import org.ehrbase.client.openehrclient.defaultrestclient.DefaultRestClient;
import org.ehrbase.client.templateprovider.FileBasedTemplateProvider;
import org.ehrbase.client.templateprovider.TemplateProvider;

import org.ehrbase.fhirbridge.fhir.Profile;
import org.ehrbase.fhirbridge.fhir.ProfileUtils;

import org.ehrbase.fhirbridge.mapping.F2OLabReport;
import org.ehrbase.fhirbridge.mapping.F2OSarsTestResult;
import org.ehrbase.fhirbridge.mapping.F2OTemperature;
import org.ehrbase.fhirbridge.opt.intensivmedizinischesmonitoringkorpertemperaturcomposition.IntensivmedizinischesMonitoringKorpertemperaturComposition;
import org.ehrbase.fhirbridge.opt.kennzeichnungerregernachweissarscov2composition.KennzeichnungErregernachweisSARSCoV2Composition;
import org.ehrbase.fhirbridge.opt.laborbefundcomposition.LaborbefundComposition;
import org.ehrbase.fhirbridge.rest.EhrbaseService;
import org.hl7.fhir.r4.model.IdType;
import org.hl7.fhir.r4.model.InstantType;
import org.hl7.fhir.r4.model.Observation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.net.URI;
import java.util.UUID;


/**
 * Resource provider for Observation
 */
@Component
public class ObservationResourceProvider extends AbstractResourceProvider {

    @Autowired
    public ObservationResourceProvider(FhirContext fhirContext, EhrbaseService service) {
        super(fhirContext);
        this.service = service;
    }

    private final EhrbaseService service;

    @Create
    @SuppressWarnings("unused")
    public MethodOutcome createObservation(@ResourceParam Observation observation) {
        checkProfiles(observation);
        //TODO refactor

        // TODO: Do we need to handle the case where several profiles are defined and valid?
        if (ProfileUtils.hasProfile(observation, Profile.OBSERVATION_LAB)) {

            System.out.println(">>>>>>>>>>>>>>>>>>> OBSERVATION LAB "+ observation.getIdentifier().get(0).getValue());

            try {
                // test map FHIR to openEHR
                LaborbefundComposition composition = F2OLabReport.map(observation);
                UUID ehr_id = service.createEhr(); // <<< reflections error!
                VersionUid versionUid = service.save(ehr_id, composition);
                System.out.println("Composition created with UID "+ versionUid.toString() +" for FHIR profile "+ Profile.OBSERVATION_LAB);

            } catch (Exception e) {
                //e.printStackTrace();
                System.out.println(e.getMessage());
            }

        } else if (ProfileUtils.hasProfile(observation, Profile.CORONARIRUS_NACHWEIS_TEST)) {

            System.out.println(">>>>>>>>>>>>>>>>>>>> OBSERVATION COVID");

            // Map CoronavirusNachweisTest to openEHR
            try {
                // test map FHIR to openEHR
                KennzeichnungErregernachweisSARSCoV2Composition composition = F2OSarsTestResult.map(observation);
                UUID ehr_id = service.createEhr(); // <<< reflections error!
                VersionUid versionUid = service.save(ehr_id, composition);
                System.out.println("Composition created with UID "+ versionUid.toString() +" for FHIR profile "+ Profile.BODY_TEMP);

            } catch (Exception e) {
                //e.printStackTrace();
                System.out.println(e.getMessage());
            }

        } else if (ProfileUtils.hasProfile(observation, Profile.BODY_TEMP)) {

            System.out.println(">>>>>>>>>>>>>>>>>> OBSERVATION TEMP");

            // Map BodyTemp to openEHR
            try {
                // test map FHIR to openEHR
                IntensivmedizinischesMonitoringKorpertemperaturComposition composition = F2OTemperature.map(observation);
                UUID ehr_id = service.createEhr(); // <<< reflections error!
                VersionUid versionUid = service.save(ehr_id, composition);
                System.out.println("Composition created with UID "+ versionUid.toString() +" for FHIR profile "+ Profile.BODY_TEMP);

            } catch (Exception e) {
                //e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }

        observation.setId(new IdType(1L));
        observation.getMeta().setVersionId("1");
        observation.getMeta().setLastUpdatedElement(InstantType.withCurrentTime());

        return new MethodOutcome()
                .setCreated(true)
                .setResource(observation);
    }

    @Override
    public Class<Observation> getResourceType() {
        return Observation.class;
    }

    @Override
    public boolean isDefaultProfileSupported() {
        return false;
    }
}
