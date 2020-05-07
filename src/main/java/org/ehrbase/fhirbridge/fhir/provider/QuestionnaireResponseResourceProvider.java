package org.ehrbase.fhirbridge.fhir.provider;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.rest.annotation.Create;
import ca.uhn.fhir.rest.annotation.ResourceParam;
import ca.uhn.fhir.rest.api.MethodOutcome;
import org.ehrbase.client.openehrclient.VersionUid;
import org.ehrbase.fhirbridge.mapping.F2OQuestionnaire.F2OQuestionnaire;
import org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.D4LQuestionnaireComposition;
import org.ehrbase.fhirbridge.rest.EhrbaseService;
import org.hl7.fhir.instance.model.api.IBaseResource;
import org.hl7.fhir.r4.model.IdType;
import org.hl7.fhir.r4.model.InstantType;
import org.hl7.fhir.r4.model.QuestionnaireResponse;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class QuestionnaireResponseResourceProvider extends AbstractResourceProvider{
    private final EhrbaseService service;

    public QuestionnaireResponseResourceProvider(FhirContext fhirContext, EhrbaseService service) {
        super(fhirContext);
        this.service = service;
    }
    @Override
    public Class<? extends IBaseResource> getResourceType() {
        return QuestionnaireResponse.class;
    }

    @Create
    @SuppressWarnings("unused")
    public MethodOutcome createQuestionnaireResponse(@ResourceParam QuestionnaireResponse questionnaireResponse) {
        try {
            System.out.println("----------------------------------------");
            // test map FHIR to openEHR
            D4LQuestionnaireComposition d4LQuestionnaireComposition = (D4LQuestionnaireComposition) F2OQuestionnaire.map(questionnaireResponse);
            UUID ehr_id = service.createEhr(); // <<< reflections error!
            VersionUid versionUid = service.save(ehr_id, d4LQuestionnaireComposition);
            System.out.println("Composition created with UID "+ versionUid.toString() +" for FHIR resource "); //Add Resource in fhir
        } catch (Exception e) {
            e.printStackTrace();
        }
        questionnaireResponse.setId(new IdType(1L));
        questionnaireResponse.getMeta().setVersionId("1");
        questionnaireResponse.getMeta().setLastUpdatedElement(InstantType.withCurrentTime());
        return new MethodOutcome()
                .setCreated(true)
                .setResource(questionnaireResponse);
    }
}
