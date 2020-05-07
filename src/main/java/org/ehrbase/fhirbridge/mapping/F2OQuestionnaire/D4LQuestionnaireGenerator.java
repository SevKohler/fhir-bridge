package org.ehrbase.fhirbridge.mapping.F2OQuestionnaire;

import org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.D4LQuestionnaireComposition;
import org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition.*;

import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.List;

public class D4LQuestionnaireGenerator {
    QuestionnaireResponsePOJO questionnaireResponsePOJO;
    AdHocUberschriftSection generalInformation = new AdHocUberschriftSection();
    AdHocUberschriftSection2 symptome = new AdHocUberschriftSection2();
    AdHocUberschriftSection3 anamnese = new AdHocUberschriftSection3();
    AdHocUberschriftSection4 medication = new AdHocUberschriftSection4();
    AdHocUberschriftSection5 dataDonation = new AdHocUberschriftSection5();
    List<DiagnoseEvaluation> symptomesList = new ArrayList<DiagnoseEvaluation>();

    public D4LQuestionnaireComposition parse(QuestionnaireResponsePOJO questionnaireResponsePOJO) {
        this.questionnaireResponsePOJO = questionnaireResponsePOJO;
        return runMapping();

    }

    private D4LQuestionnaireComposition runMapping() {
        D4LQuestionnaireComposition d4LQuestionnaireComposition = new D4LQuestionnaireComposition();

        mapAge();
        mapLivingSituation();
        mapPrivateCaregiver();
        mapSmoker();
        mapNurse();
        mapPregnant();
        mapContactWithInfected();

        mapFewer24h();
        mapFewer4Days();
        mapChills();
        mapTired();
        mapBodyAches();
        mapPersistentCoughing();
        mapRunningNose();
        mapDiarrhea();
        mapSoreThroat();
        mapHeadache();
        mapOutOfBreath();
        mapSinceWhenSymptoms();
        mapTasteSmellLoss();

        mapChronicLungDisease();
        mapDiabetes();
        mapHeartDisease();
        mapObesity();
        mapSteroids();
        mapImmunosuppressants();
        mapVaccinatedFlu();

        AdHocUberschriftSection adHocUberschriftSection = new AdHocUberschriftSection();
        d4LQuestionnaireComposition.setAdHocUberschrift(generalInformation);

        symptome.setDiagnose(symptomesList);
        d4LQuestionnaireComposition.setAdHocUberschrift(symptome);
        d4LQuestionnaireComposition.setAdHocUberschrift(medication);
        d4LQuestionnaireComposition.setAdHocUberschrift(anamnese);
        d4LQuestionnaireComposition.setAdHocUberschrift(dataDonation);
        return d4LQuestionnaireComposition;

    }

    private void mapAge() {
        String age = questionnaireResponsePOJO.getAge();
        AlterObservation alterObservation = new AlterObservation();
        alterObservation.setKommentarValue(age);
        generalInformation.setAlter(new ArrayList<AlterObservation>() {{
            add(alterObservation);
        }});
    }

    private void mapLivingSituation() {
        String livingSituation = questionnaireResponsePOJO.getLivingSituation();
        WohnsituationEvaluation wohnsituationEvaluation = new WohnsituationEvaluation();
        wohnsituationEvaluation.setWohnsituationValue(livingSituation);
        generalInformation.setWohnsituation(new ArrayList<WohnsituationEvaluation>() {{
            add(wohnsituationEvaluation);
        }});
    }

    private void mapPrivateCaregiver(){
        Boolean privateCaregiver = questionnaireResponsePOJO.getPrivateCaregiver();
        PflegetatigkeitEvaluation pflegetatigkeitEvaluation = new PflegetatigkeitEvaluation();
        pflegetatigkeitEvaluation.setPrivatValue(privateCaregiver);
        generalInformation.setPflegetatigkeit(new ArrayList<>() {{ //TODO what is with the workrelated checkbox
            add(pflegetatigkeitEvaluation);
        }});
    }

    private void mapSmoker(){
        Boolean smoker = questionnaireResponsePOJO.getSmoker();
        if(smoker){
            ZusammenfassungRauchverhaltenEvaluation zusammenfassungRauchverhaltenEvaluation = new ZusammenfassungRauchverhaltenEvaluation();
            zusammenfassungRauchverhaltenEvaluation.setAllgemeinerStatusDefiningcode(AllgemeinerStatusDefiningcode.DERZEITIGERRAUCHER);
            generalInformation.setZusammenfassungRauchverhalten(zusammenfassungRauchverhaltenEvaluation);
        }
    }

    private void mapNurse(){
        String beschaefigung = questionnaireResponsePOJO.getNurse();
        BeschaftigungCluster beschaftigungCluster = new BeschaftigungCluster();
        beschaftigungCluster.setRolleValue(beschaefigung);
        ZusammenfassungDerBeschaftigungEvaluation zusammenfassungDerBeschaftigungEvaluation = new ZusammenfassungDerBeschaftigungEvaluation();
        zusammenfassungDerBeschaftigungEvaluation.setBeschaftigung(new ArrayList<>(){{
            add(beschaftigungCluster);
        }});

        generalInformation.setZusammenfassungDerBeschaftigung(new ArrayList<>(){{
            add(zusammenfassungDerBeschaftigungEvaluation);
        }});

    }

    private void mapPregnant(){
        Boolean pregnant = questionnaireResponsePOJO.getPregnant();
        StillzeitEvaluation stillzeitEvaluation = new StillzeitEvaluation();
        stillzeitEvaluation.setSchwangerValue(pregnant);
        generalInformation.setStillzeit(stillzeitEvaluation);

    }

    private void mapContactWithInfected(){
        Boolean contactWithInfected = questionnaireResponsePOJO.getContactWithInfected();
        UMGCOVID19KontaktObservation umgcovid19KontaktObservation = new UMGCOVID19KontaktObservation();
        umgcovid19KontaktObservation.setKontaktZurCovid19PatientValue(contactWithInfected);
        generalInformation.setUmgCovid19Kontakt(new ArrayList<>(){{add(umgcovid19KontaktObservation);}});

    }

    private void mapSinceWhenSymptoms(){
        TemporalAccessor erstDiagnose = questionnaireResponsePOJO.getSinceWhenSymptoms();
        DiagnoseEvaluation diagnoseEvaluation = new DiagnoseEvaluation();
        diagnoseEvaluation.setDerErstdiagnoseValue(erstDiagnose);
        symptomesList.add(diagnoseEvaluation);

    }


    private void mapFewer24h(){
        Boolean fewer24h = questionnaireResponsePOJO.getFewer24h();
        KrankheitsanzeichenClusterSymptom krankheitsanzeichenClusterSymptom = new KrankheitsanzeichenClusterSymptom();

        DiagnoseEvaluation diagnoseEvaluation = new DiagnoseEvaluation();
        diagnoseEvaluation.setKrankheitsanzeichen(krankheitsanzeichenClusterSymptom);

    //    symptome.setDiagnose();


    }

    private void mapFewer4Days(){

    }

    private void mapChills(){
        Boolean chills = questionnaireResponsePOJO.getChills();
        KrankheitsanzeichenClusterSymptom2 krankheitsanzeichenClusterSymptom = new KrankheitsanzeichenClusterSymptom2();
        DiagnoseEvaluation diagnoseEvaluation = new DiagnoseEvaluation();
        diagnoseEvaluation.setKrankheitsanzeichen(krankheitsanzeichenClusterSymptom);
        krankheitsanzeichenClusterSymptom.setNichtSignifikantValue(chills);
        symptomesList.add(diagnoseEvaluation);
    }
    private void mapPersistentCoughing(){
        Boolean coughing = questionnaireResponsePOJO.getPersistentCoughing();
        KrankheitsanzeichenClusterSymptom3 krankheitsanzeichenClusterSymptom = new KrankheitsanzeichenClusterSymptom3();
        DiagnoseEvaluation diagnoseEvaluation = new DiagnoseEvaluation();
        diagnoseEvaluation.setKrankheitsanzeichen(krankheitsanzeichenClusterSymptom);
        krankheitsanzeichenClusterSymptom.setNichtSignifikantValue(coughing);
        symptomesList.add(diagnoseEvaluation);
    }


    private void mapRunningNose(){
        Boolean runningNose = questionnaireResponsePOJO.getRunningNose();
        KrankheitsanzeichenClusterSymptom4 krankheitsanzeichenClusterSymptom = new KrankheitsanzeichenClusterSymptom4();
        DiagnoseEvaluation diagnoseEvaluation = new DiagnoseEvaluation();
        diagnoseEvaluation.setKrankheitsanzeichen(krankheitsanzeichenClusterSymptom);
        krankheitsanzeichenClusterSymptom.setNichtSignifikantValue(runningNose);
        symptomesList.add(diagnoseEvaluation);
    }

    private void mapSoreThroat(){
        Boolean soreThroat = questionnaireResponsePOJO.getSoreThroat();
        KrankheitsanzeichenClusterSymptom5 krankheitsanzeichenClusterSymptom = new KrankheitsanzeichenClusterSymptom5();
        DiagnoseEvaluation diagnoseEvaluation = new DiagnoseEvaluation();
        diagnoseEvaluation.setKrankheitsanzeichen(krankheitsanzeichenClusterSymptom);
        krankheitsanzeichenClusterSymptom.setNichtSignifikantValue(soreThroat);
        symptomesList.add(diagnoseEvaluation);
    }


    private void mapOutOfBreath(){
        Boolean outOfBreath = questionnaireResponsePOJO.getOutOfBreath();
        KrankheitsanzeichenClusterSymptom6 krankheitsanzeichenClusterSymptom = new KrankheitsanzeichenClusterSymptom6();
        DiagnoseEvaluation diagnoseEvaluation = new DiagnoseEvaluation();
        diagnoseEvaluation.setKrankheitsanzeichen(krankheitsanzeichenClusterSymptom);
        krankheitsanzeichenClusterSymptom.setNichtSignifikantValue(outOfBreath);
        symptomesList.add(diagnoseEvaluation);
    }

    private void mapTired(){
        Boolean tired = questionnaireResponsePOJO.getTired();
        KrankheitsanzeichenClusterSymptom7 krankheitsanzeichenClusterSymptom = new KrankheitsanzeichenClusterSymptom7();
        DiagnoseEvaluation diagnoseEvaluation = new DiagnoseEvaluation();
        diagnoseEvaluation.setKrankheitsanzeichen(krankheitsanzeichenClusterSymptom);
        krankheitsanzeichenClusterSymptom.setNichtSignifikantValue(tired);
        symptomesList.add(diagnoseEvaluation);
    }

    private void mapBodyAches(){
        Boolean bodyAches = questionnaireResponsePOJO.getBodyAches();
        KrankheitsanzeichenClusterSymptom8 krankheitsanzeichenClusterSymptom = new KrankheitsanzeichenClusterSymptom8();
        DiagnoseEvaluation diagnoseEvaluation = new DiagnoseEvaluation();
        diagnoseEvaluation.setKrankheitsanzeichen(krankheitsanzeichenClusterSymptom);
        krankheitsanzeichenClusterSymptom.setNichtSignifikantValue(bodyAches);
        symptomesList.add(diagnoseEvaluation);
    }

    private void mapDiarrhea(){
        Boolean diarrhea = questionnaireResponsePOJO.getDiarrhea();
        KrankheitsanzeichenClusterSymptom9 krankheitsanzeichenClusterSymptom = new KrankheitsanzeichenClusterSymptom9();
        DiagnoseEvaluation diagnoseEvaluation = new DiagnoseEvaluation();
        diagnoseEvaluation.setKrankheitsanzeichen(krankheitsanzeichenClusterSymptom);
        krankheitsanzeichenClusterSymptom.setNichtSignifikantValue(diarrhea);
        symptomesList.add(diagnoseEvaluation);
    }

    private void mapHeadache(){
        Boolean headache = questionnaireResponsePOJO.getHeadache();
        KrankheitsanzeichenClusterSymptom10 krankheitsanzeichenClusterSymptom = new KrankheitsanzeichenClusterSymptom10();
        DiagnoseEvaluation diagnoseEvaluation = new DiagnoseEvaluation();
        diagnoseEvaluation.setKrankheitsanzeichen(krankheitsanzeichenClusterSymptom);
        krankheitsanzeichenClusterSymptom.setNichtSignifikantValue(headache);
        symptomesList.add(diagnoseEvaluation);
    }

    private void mapTasteSmellLoss(){
        Boolean tasteSmellLoss = questionnaireResponsePOJO.getTasteSmellLoss();
        KrankheitsanzeichenClusterSymptom11 krankheitsanzeichenClusterSymptom = new KrankheitsanzeichenClusterSymptom11();
        DiagnoseEvaluation diagnoseEvaluation = new DiagnoseEvaluation();
        diagnoseEvaluation.setKrankheitsanzeichen(krankheitsanzeichenClusterSymptom);
        krankheitsanzeichenClusterSymptom.setNichtSignifikantValue(tasteSmellLoss);
        symptomesList.add(diagnoseEvaluation);

    }

    private void mapChronicLungDisease(){

    }

    private void mapDiabetes(){

    }

    private void mapHeartDisease(){

    }

    private void mapObesity(){

    }

    private void mapSteroids(){

    }

    private void mapImmunosuppressants(){

    }

    private void mapVaccinatedFlu(){

    }
}
