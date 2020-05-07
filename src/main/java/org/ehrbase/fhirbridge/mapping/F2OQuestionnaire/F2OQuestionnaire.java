package org.ehrbase.fhirbridge.mapping.F2OQuestionnaire;

import org.ehrbase.fhirbridge.opt.Composition;
import org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.D4LQuestionnaireComposition;
import org.hl7.fhir.r4.model.DomainResource;
import org.hl7.fhir.r4.model.QuestionnaireResponse;

public class F2OQuestionnaire extends F2O {
    // eigene ehrId

    public static Composition map(DomainResource fhirResource) {
        QuestionnaireResponse questionnaireResponse = (QuestionnaireResponse) fhirResource;
        QuestionnaireResponsePOJO questionnaireResponsePOJO = QuestionnaireResponseParser.parseToPojo(questionnaireResponse);
        D4LQuestionnaireComposition d4LQuestionnaireComposition = new D4LQuestionnaireGenerator().parse(questionnaireResponsePOJO);
        System.out.println(questionnaireResponsePOJO.getPregnant());
        d4LQuestionnaireComposition = (D4LQuestionnaireComposition) generateRequiredFields(d4LQuestionnaireComposition);
        return d4LQuestionnaireComposition;

    }

}