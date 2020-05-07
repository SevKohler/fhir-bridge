package org.ehrbase.fhirbridge.mapping.F2OQuestionnaire;

import org.ehrbase.fhirbridge.mapping.Utils;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.QuestionnaireResponse;

import java.time.LocalDate;
import java.util.List;

public class QuestionnaireResponseParser {
    private static final String P = "P";
    private static final String C = "C";
    private static final String S = "S";
    private static final String D = "D";
    private static final String M = "M";

    private static final String P0 = "P0";
    private static final String P2 = "P2";
    private static final String P3 = "P3";
    private static final String P4 = "P4";
    private static final String P5 = "P5";
    private static final String P6 = "P6";

    private static final String C0 = "C0";

    private static final String S0 = "S0";
    private static final String S1 = "S1";
    private static final String S3 = "S3";
    private static final String S4 = "S4";
    private static final String S5 = "S5";
    private static final String S6 = "S6";
    private static final String S7 = "S7";
    private static final String S8 = "S8";
    private static final String S9 = "S9";
    private static final String SA = "SA";
    private static final String SB = "SB";
    private static final String SC = "SC";
    private static final String SZ = "SZ";

    private static final String D0 = "D0";
    private static final String D1 = "D1";
    private static final String D2 = "D2";
    private static final String D3 = "D3";

    private static final String M0 = "M0";
    private static final String M1 = "M1";
    private static final String M2 = "M2";


    private static QuestionnaireResponsePOJO questionnaireResponsePOJO;

    protected static QuestionnaireResponsePOJO parseToPojo(QuestionnaireResponse questionnaireResponse) {
        questionnaireResponsePOJO = new QuestionnaireResponsePOJO();
        for (QuestionnaireResponse.QuestionnaireResponseItemComponent item : questionnaireResponse.getItem()) {
            switch (item.getLinkId()) {
                case P:
                    extractGeneralInformation(item.getItem());
                    break;
                case C:
                    extractContactWithInfected(item.getItem());
                    break;
                case S:
                    extractSymptoms(item.getItem());
                    break;
                case D:
                    extractAnamnesis(item.getItem());
                    break;
                case M:
                    extractMedication(item.getItem());
                    break;
                default:
                    throw new IllegalArgumentException("LinkId " + item.getLinkId() + " undefined");
            }
        }
        return questionnaireResponsePOJO;
    }

    private static void extractGeneralInformation(List<QuestionnaireResponse.QuestionnaireResponseItemComponent> item) {
        for (QuestionnaireResponse.QuestionnaireResponseItemComponent question : item) {
            switch (question.getLinkId()) {
                case P0:
                    questionnaireResponsePOJO.setAge((String) getValueCode(question));
                    break;
                case P2:
                    questionnaireResponsePOJO.setLivingSituation((String) getValueCode(question));
                    break;
                case P3:
                    questionnaireResponsePOJO.setPrivateCaregiver((Boolean) getValueCode(question));
                    break;
                case P4:
                    questionnaireResponsePOJO.setNurse((String) getValueCode(question));
                    break;
                case P5:
                    questionnaireResponsePOJO.setSmoker((Boolean) getValueCode(question));
                    break;
                case P6:
                    questionnaireResponsePOJO.setPregnant((Boolean) getValueCode(question));
                    break;
                default:
                    throw new IllegalArgumentException("LinkId " + question.getLinkId() + " undefined");

            }
        }
    }

    private static void extractContactWithInfected(List<QuestionnaireResponse.QuestionnaireResponseItemComponent> item) {
        for (QuestionnaireResponse.QuestionnaireResponseItemComponent question : item) {
            switch (question.getLinkId()) {
                case C0:
                    Object value =  getValueCode(question); //TODO workaround since unknown can be an answer
                    if(value instanceof String)
                        value = Boolean.FALSE;

                    questionnaireResponsePOJO.setContactWithInfected((Boolean) value);
                    break;
                default:
                    throw new IllegalArgumentException("LinkId " + question.getLinkId() + " undefined");
            }
        }
    }

    private static void extractSymptoms(List<QuestionnaireResponse.QuestionnaireResponseItemComponent> item) {
        for (QuestionnaireResponse.QuestionnaireResponseItemComponent question : item) {
            switch (question.getLinkId()) {
                case S0:
                    questionnaireResponsePOJO.setFewer24h((Boolean) getValueCode(question));
                    break;
                case S1:
                    questionnaireResponsePOJO.setFewer4days((Boolean) getValueCode(question));
                    break;
                case S3:
                    questionnaireResponsePOJO.setChills((Boolean) getValueCode(question));
                    break;
                case S4:
                    questionnaireResponsePOJO.setTired((Boolean) getValueCode(question));
                    break;
                case S5:
                    questionnaireResponsePOJO.setBodyAches((Boolean) getValueCode(question));
                    break;
                case S6:
                    questionnaireResponsePOJO.setPersistentCoughing((Boolean) getValueCode(question));
                    break;
                case S7:
                    questionnaireResponsePOJO.setRunningNose((Boolean) getValueCode(question));
                    break;
                case S8:
                    questionnaireResponsePOJO.setDiarrhea((Boolean) getValueCode(question));
                    break;
                case S9:
                    questionnaireResponsePOJO.setSoreThroat((Boolean) getValueCode(question));
                    break;
                case SA:
                    questionnaireResponsePOJO.setHeadache((Boolean) getValueCode(question));
                    break;
                case SB:
                    questionnaireResponsePOJO.setOutOfBreath((Boolean) getValueCode(question));
                    break;
                case SC:
                    questionnaireResponsePOJO.setTasteSmellLoss((Boolean) getValueCode(question));
                    break;
                case SZ:
                    LocalDate date = LocalDate.parse((String) getValueCode(question));
                    questionnaireResponsePOJO.setSinceWhenSymptoms(date);
                    break;
                default:
                    throw new IllegalArgumentException("LinkId " + question.getLinkId() + " undefined");
            }
        }
    }

    private static void extractAnamnesis(List<QuestionnaireResponse.QuestionnaireResponseItemComponent> item) {
            for (QuestionnaireResponse.QuestionnaireResponseItemComponent question : item) {
                switch (question.getLinkId()) {
                    case D0:
                    //    questionnaireResponsePOJO.setChronicLungDisease(getValueCode(question));
                        break;
                    case D1:
                 //       questionnaireResponsePOJO.setDiabetes(getValueCode(question));
                        break;
                    case D2:
                //        questionnaireResponsePOJO.setHeartDisease(getValueCode(question));
                        break;
                    case D3:
                 //       questionnaireResponsePOJO.setObesity(getValueCode(question));
                        break;
                    default:
                        throw new IllegalArgumentException("LinkId " + question.getLinkId() + " undefined");
                }
            }
        }


    private static void extractMedication(List<QuestionnaireResponse.QuestionnaireResponseItemComponent> item) {
        for (QuestionnaireResponse.QuestionnaireResponseItemComponent question : item) {
            switch (question.getLinkId()) {
                case M0:
                    //     questionnaireResponsePOJO.setSteroids(getValueCode(question));
                    break;
                case M1:
                    //       questionnaireResponsePOJO.setImmunosuppressants(getValueCode(question));
                    break;
                case M2:
                    //        questionnaireResponsePOJO.setVaccinatedFlu(getValueCode(question));
                    break;
                default:
                    throw new IllegalArgumentException("LinkId " + question.getLinkId() + " undefined");
            }
        }
    }

    private static Object getValueCode(QuestionnaireResponse.QuestionnaireResponseItemComponent i) {
        try {

            Object code = i.getAnswer().get(0).getValueCoding().getCode();
            String codeString = code.toString();

            if(Utils.isLoincCode(codeString))
                code = Utils.decodeLOINCCode(codeString);

            if(Utils.isFhirCode(codeString))
                code = Utils.decodeFhirCode(codeString);

            return code;
        }catch (FHIRException e){ //TODO fix to support every value (at the moment only codes or empty)
            return "";
        }
    }

}
