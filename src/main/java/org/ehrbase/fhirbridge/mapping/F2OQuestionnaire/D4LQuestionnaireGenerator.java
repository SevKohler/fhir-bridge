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
    List<DiagnoseEvaluation> symptomesList = new ArrayList<DiagnoseEvaluation>();

    AdHocUberschriftSection3 anamnese = new AdHocUberschriftSection3();
    List<AdHocUberschriftDiagnoseChoice> anamneseList = new ArrayList<AdHocUberschriftDiagnoseChoice>();

    AdHocUberschriftSection4 medication = new AdHocUberschriftSection4();
    List<AdHocUberschriftOrgEhrbaseEhrEncodeWrappersSnakecase25e49cb2ZusammenfassungDerMedikationChoice> summaryMedicationList =
            new ArrayList<AdHocUberschriftOrgEhrbaseEhrEncodeWrappersSnakecase25e49cb2ZusammenfassungDerMedikationChoice>();
    List<ArzneimittelverwaltungAction> medicationManagementList = new ArrayList<>();

    AdHocUberschriftSection5 dataDonation = new AdHocUberschriftSection5();


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

        mapNameDesProblems();
        mapSinceWhenSymptoms();
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
        mapTasteSmellLoss();

        mapChronicLungDisease();
        mapDiabetes();
        mapHeartDisease();
        mapObesity();
        mapSteroids();
        mapImmunosuppressants();
        mapVaccinatedFlu();

        mapDataDonation();

        d4LQuestionnaireComposition.setAdHocUberschrift(generalInformation);
        symptome.setDiagnose(symptomesList);
        anamnese.setDiagnose(anamneseList);
        medication.setZusammenfassungDerMedikation(summaryMedicationList);
        medication.setArzneimittelverwaltung(medicationManagementList);

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
        // alterObservation.setKommentarValueTree("Alterskategorie");
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

    private void mapPrivateCaregiver() {
        //TODO SET ACKTUELLE DATUM
        Boolean privateCaregiver = questionnaireResponsePOJO.getPrivateCaregiver();
        PflegetatigkeitEvaluation pflegetatigkeitEvaluation = new PflegetatigkeitEvaluation();
        pflegetatigkeitEvaluation.setPrivatValue(privateCaregiver);
        pflegetatigkeitEvaluation.setAllgemeineBeschreibungValue("");

        pflegetatigkeitEvaluation.setAnzahlDerGepflegtenPersonenValue("Mindestens eine Person");
        pflegetatigkeitEvaluation.setFrequenzDerPflegeValue("Mindestens einmal die Woche");

        PflegetatigkeitGrundFurDieTatigkeitElement pflegetatigkeitGrundFurDieTatigkeitElement = new PflegetatigkeitGrundFurDieTatigkeitElement();
        pflegetatigkeitGrundFurDieTatigkeitElement.setValue("alterbedingten Beschwerden, chronischen Erkrankungen oder Gebrechlichkeit");

        pflegetatigkeitEvaluation.setGrundFurDieTatigkeit(new ArrayList<>() {{
            add(pflegetatigkeitGrundFurDieTatigkeitElement);
        }});


        generalInformation.setPflegetatigkeit(new ArrayList<>() {{ //TODO what is with the workrelated checkbox
            add(pflegetatigkeitEvaluation);
        }});
    }


    private void mapNurse() {
        String beschaefigung = questionnaireResponsePOJO.getNurse();
        BeschaftigungCluster beschaftigungCluster = new BeschaftigungCluster();
        beschaftigungCluster.setRolleValue(beschaefigung);
        ZusammenfassungDerBeschaftigungEvaluation zusammenfassungDerBeschaftigungEvaluation = new ZusammenfassungDerBeschaftigungEvaluation();
        zusammenfassungDerBeschaftigungEvaluation.setBeschaftigung(new ArrayList<>() {{
            add(beschaftigungCluster);
        }});
        zusammenfassungDerBeschaftigungEvaluation.setZuletztAktualisiertValue(java.time.LocalDate.now()); //TODO set time now ???
        generalInformation.setZusammenfassungDerBeschaftigung(new ArrayList<>() {{
            add(zusammenfassungDerBeschaftigungEvaluation);
        }});
    }

    private void mapSmoker() {
        Boolean smoker = questionnaireResponsePOJO.getSmoker();
        if (smoker) {
            ZusammenfassungRauchverhaltenEvaluation zusammenfassungRauchverhaltenEvaluation = new ZusammenfassungRauchverhaltenEvaluation();
            zusammenfassungRauchverhaltenEvaluation.setAllgemeinerStatusDefiningcode(AllgemeinerStatusDefiningcode.DERZEITIGERRAUCHER);
            generalInformation.setZusammenfassungRauchverhalten(zusammenfassungRauchverhaltenEvaluation);
        } else {
            AusschlussSpezifischEvaluation ausschlussSpezifischEvaluation = new AusschlussSpezifischEvaluation();
            ausschlussSpezifischEvaluation.setAussageUberDenAusschlussValue("Rauchen");
            ausschlussSpezifischEvaluation.setAusgeschlosseneKategorieDefiningcode(AusgeschlosseneKategorieDefiningcode.ALLERGEN);
            ausschlussSpezifischEvaluation.setAusgeschlosseneKategorieValue("Nebenwirkungen auszulösende Substanz/Allergen");
            generalInformation.setAusschlussSpezifisch(ausschlussSpezifischEvaluation);
        }
    }

    private void mapPregnant() {
        Boolean pregnant = questionnaireResponsePOJO.getPregnant();
        StillzeitEvaluation stillzeitEvaluation = new StillzeitEvaluation();
        stillzeitEvaluation.setSchwangerValue(pregnant);
        generalInformation.setStillzeit(stillzeitEvaluation);
    }

    private void mapContactWithInfected() {
        Boolean contactWithInfected = questionnaireResponsePOJO.getContactWithInfected();
        UMGCOVID19KontaktObservation umgcovid19KontaktObservation = new UMGCOVID19KontaktObservation();
        umgcovid19KontaktObservation.setKontaktZurCovid19PatientValue(contactWithInfected);
        generalInformation.setUmgCovid19Kontakt(new ArrayList<>() {{
            add(umgcovid19KontaktObservation);
        }});

    }

    private void mapNameDesProblems() {
        DiagnoseEvaluation diagnoseEvaluation = new DiagnoseEvaluation();
        diagnoseEvaluation.setDerDiagnoseValue("");
        symptomesList.add(diagnoseEvaluation);
    }


    private void mapSinceWhenSymptoms() {
        TemporalAccessor erstDiagnose = questionnaireResponsePOJO.getSinceWhenSymptoms();
        DiagnoseEvaluation diagnoseEvaluation = new DiagnoseEvaluation();
        diagnoseEvaluation.setDerErstdiagnoseValue(erstDiagnose);
        symptomesList.add(diagnoseEvaluation);
    }


    private void mapFewer24h() {
        Boolean fewer24h = questionnaireResponsePOJO.getFewer24h();

        KrankheitsanzeichenClusterSymptom krankheitsanzeichenClusterSymptom = new KrankheitsanzeichenClusterSymptom();
        krankheitsanzeichenClusterSymptom.setName("Fieber in den letzten 24 Stunden");
        krankheitsanzeichenClusterSymptom.setKrankheitsanzeichensValue("Fieber");
        krankheitsanzeichenClusterSymptom.setNichtSignifikantValue(fewer24h);
        krankheitsanzeichenClusterSymptom.setSchweregradValue("38°C");

        DiagnoseEvaluation diagnoseEvaluation = new DiagnoseEvaluation();
        diagnoseEvaluation.setKrankheitsanzeichen(krankheitsanzeichenClusterSymptom);
        symptomesList.add(diagnoseEvaluation);
    }

    private void mapFewer4Days() {
        Boolean fewer4days = questionnaireResponsePOJO.getFewer4days();
        //TODO duplicated
        KrankheitsanzeichenClusterSymptom krankheitsanzeichenClusterSymptom = new KrankheitsanzeichenClusterSymptom();
        krankheitsanzeichenClusterSymptom.setKrankheitsanzeichensValue("Fieber"); //TODO make hashmap for this so values are not entered manually
        krankheitsanzeichenClusterSymptom.setName("Fieber in den letzten 4 Tagen");
        krankheitsanzeichenClusterSymptom.setNichtSignifikantValue(fewer4days);
        krankheitsanzeichenClusterSymptom.setSchweregradValue("38°C");

        DiagnoseEvaluation diagnoseEvaluation = new DiagnoseEvaluation();
        diagnoseEvaluation.setKrankheitsanzeichen(krankheitsanzeichenClusterSymptom);
        symptomesList.add(diagnoseEvaluation);
    }

    private void mapChills() {
        Boolean chills = questionnaireResponsePOJO.getChills();

        KrankheitsanzeichenClusterSymptom2 krankheitsanzeichenClusterSymptom = new KrankheitsanzeichenClusterSymptom2();
        krankheitsanzeichenClusterSymptom.setKrankheitsanzeichensValue("Schüttelfrost");

        DiagnoseEvaluation diagnoseEvaluation = new DiagnoseEvaluation();
        diagnoseEvaluation.setKrankheitsanzeichen(krankheitsanzeichenClusterSymptom);
        krankheitsanzeichenClusterSymptom.setNichtSignifikantValue(chills);

        symptomesList.add(diagnoseEvaluation);
    }

    private void mapPersistentCoughing() {
        Boolean coughing = questionnaireResponsePOJO.getPersistentCoughing();

        KrankheitsanzeichenClusterSymptom3 krankheitsanzeichenClusterSymptom = new KrankheitsanzeichenClusterSymptom3();
        krankheitsanzeichenClusterSymptom.setKrankheitsanzeichensValue("Husten");

        DiagnoseEvaluation diagnoseEvaluation = new DiagnoseEvaluation();
        diagnoseEvaluation.setKrankheitsanzeichen(krankheitsanzeichenClusterSymptom);
        krankheitsanzeichenClusterSymptom.setNichtSignifikantValue(coughing);

        symptomesList.add(diagnoseEvaluation);
    }


    private void mapRunningNose() {
        Boolean runningNose = questionnaireResponsePOJO.getRunningNose();

        KrankheitsanzeichenClusterSymptom4 krankheitsanzeichenClusterSymptom = new KrankheitsanzeichenClusterSymptom4();
        krankheitsanzeichenClusterSymptom.setKrankheitsanzeichensValue("Schnupfen");

        DiagnoseEvaluation diagnoseEvaluation = new DiagnoseEvaluation();
        diagnoseEvaluation.setKrankheitsanzeichen(krankheitsanzeichenClusterSymptom);
        krankheitsanzeichenClusterSymptom.setNichtSignifikantValue(runningNose);

        symptomesList.add(diagnoseEvaluation);
    }

    private void mapSoreThroat() {
        Boolean soreThroat = questionnaireResponsePOJO.getSoreThroat();

        KrankheitsanzeichenClusterSymptom5 krankheitsanzeichenClusterSymptom = new KrankheitsanzeichenClusterSymptom5();
        krankheitsanzeichenClusterSymptom.setKrankheitsanzeichensValue("Halsschmerzen");

        DiagnoseEvaluation diagnoseEvaluation = new DiagnoseEvaluation();
        diagnoseEvaluation.setKrankheitsanzeichen(krankheitsanzeichenClusterSymptom);
        krankheitsanzeichenClusterSymptom.setNichtSignifikantValue(soreThroat);

        symptomesList.add(diagnoseEvaluation);
    }


    private void mapOutOfBreath() {
        Boolean outOfBreath = questionnaireResponsePOJO.getOutOfBreath();
        KrankheitsanzeichenClusterSymptom6 krankheitsanzeichenClusterSymptom = new KrankheitsanzeichenClusterSymptom6();
        krankheitsanzeichenClusterSymptom.setKrankheitsanzeichensValue("Atemprobleme");

        DiagnoseEvaluation diagnoseEvaluation = new DiagnoseEvaluation();
        diagnoseEvaluation.setKrankheitsanzeichen(krankheitsanzeichenClusterSymptom);
        krankheitsanzeichenClusterSymptom.setNichtSignifikantValue(outOfBreath);

        symptomesList.add(diagnoseEvaluation);
    }

    private void mapTired() {
        Boolean tired = questionnaireResponsePOJO.getTired();
        KrankheitsanzeichenClusterSymptom7 krankheitsanzeichenClusterSymptom = new KrankheitsanzeichenClusterSymptom7();
        krankheitsanzeichenClusterSymptom.setKrankheitsanzeichensValue("Fühlte mich schlapp oder angeschlagen");

        DiagnoseEvaluation diagnoseEvaluation = new DiagnoseEvaluation();
        diagnoseEvaluation.setKrankheitsanzeichen(krankheitsanzeichenClusterSymptom);
        krankheitsanzeichenClusterSymptom.setNichtSignifikantValue(tired);
        symptomesList.add(diagnoseEvaluation);
    }

    private void mapBodyAches() {
        Boolean bodyAches = questionnaireResponsePOJO.getBodyAches();
        KrankheitsanzeichenClusterSymptom8 krankheitsanzeichenClusterSymptom = new KrankheitsanzeichenClusterSymptom8();
        krankheitsanzeichenClusterSymptom.setKrankheitsanzeichensValue("Gliederschmerzen");

        DiagnoseEvaluation diagnoseEvaluation = new DiagnoseEvaluation();
        diagnoseEvaluation.setKrankheitsanzeichen(krankheitsanzeichenClusterSymptom);
        krankheitsanzeichenClusterSymptom.setNichtSignifikantValue(bodyAches);
        symptomesList.add(diagnoseEvaluation);
    }

    private void mapDiarrhea() {
        Boolean diarrhea = questionnaireResponsePOJO.getDiarrhea();
        KrankheitsanzeichenClusterSymptom9 krankheitsanzeichenClusterSymptom = new KrankheitsanzeichenClusterSymptom9();
        krankheitsanzeichenClusterSymptom.setKrankheitsanzeichensValue("Durchfall");

        DiagnoseEvaluation diagnoseEvaluation = new DiagnoseEvaluation();
        diagnoseEvaluation.setKrankheitsanzeichen(krankheitsanzeichenClusterSymptom);
        krankheitsanzeichenClusterSymptom.setNichtSignifikantValue(diarrhea);
        symptomesList.add(diagnoseEvaluation);
    }

    private void mapHeadache() {
        Boolean headache = questionnaireResponsePOJO.getHeadache();
        KrankheitsanzeichenClusterSymptom10 krankheitsanzeichenClusterSymptom = new KrankheitsanzeichenClusterSymptom10();
        krankheitsanzeichenClusterSymptom.setKrankheitsanzeichensValue("Kopfschmerzen");

        DiagnoseEvaluation diagnoseEvaluation = new DiagnoseEvaluation();
        diagnoseEvaluation.setKrankheitsanzeichen(krankheitsanzeichenClusterSymptom);
        krankheitsanzeichenClusterSymptom.setNichtSignifikantValue(headache);
        symptomesList.add(diagnoseEvaluation);
    }

    private void mapTasteSmellLoss() {
        Boolean tasteSmellLoss = questionnaireResponsePOJO.getTasteSmellLoss();
        KrankheitsanzeichenClusterSymptom11 krankheitsanzeichenClusterSymptom = new KrankheitsanzeichenClusterSymptom11();
        krankheitsanzeichenClusterSymptom.setKrankheitsanzeichensValue("Geschmacks- und/oder Geruchsverlust");

        DiagnoseEvaluation diagnoseEvaluation = new DiagnoseEvaluation();
        diagnoseEvaluation.setKrankheitsanzeichen(krankheitsanzeichenClusterSymptom);
        krankheitsanzeichenClusterSymptom.setNichtSignifikantValue(tasteSmellLoss);
        symptomesList.add(diagnoseEvaluation);

    }

    private void mapChronicLungDisease() {
        String chronicLungDisease = questionnaireResponsePOJO.getChronicLungDisease();
        DiagnoseEvaluationProblem diagnoseEvaluationProblem = new DiagnoseEvaluationProblem();
        diagnoseEvaluationProblem.setDerDiagnoseValue("Chronische Lungenkrankheit");
        diagnoseEvaluationProblem.setKlinischeBeschreibungValueStructure(chronicLungDisease);
        anamneseList.add(diagnoseEvaluationProblem);
    }

    private void mapDiabetes() {
        String diabetes = questionnaireResponsePOJO.getDiabetes();
        DiagnoseEvaluationProblem2 diagnoseEvaluationProblem2 = new DiagnoseEvaluationProblem2();
        diagnoseEvaluationProblem2.setDerDiagnoseValue("Diabetes");
        diagnoseEvaluationProblem2.setKlinischeBeschreibungValueStructure(diabetes);
        anamneseList.add(diagnoseEvaluationProblem2);

    }

    private void mapHeartDisease() {
        String heartDisease = questionnaireResponsePOJO.getHeartDisease();
        DiagnoseEvaluationProblem3 diagnoseEvaluationProblem3 = new DiagnoseEvaluationProblem3();
        diagnoseEvaluationProblem3.setDerDiagnoseValue("Herzerkrankung");
        diagnoseEvaluationProblem3.setKlinischeBeschreibungValueStructure(heartDisease);
        anamneseList.add(diagnoseEvaluationProblem3);

    }

    private void mapObesity() {
        String obesity = questionnaireResponsePOJO.getObesity();
        DiagnoseEvaluationProblem4 diagnoseEvaluationProblem4 = new DiagnoseEvaluationProblem4();
        diagnoseEvaluationProblem4.setDerDiagnoseValue("Adipositas");
        diagnoseEvaluationProblem4.setKlinischeBeschreibungValueStructure(obesity);
        anamneseList.add(diagnoseEvaluationProblem4);

    }

    private void mapSteroids() {
        Boolean steroids = questionnaireResponsePOJO.getSteroids();
        ZusammenfassungDerMedikationEvaluation zusammenfassungDerMedikationEvaluation = new ZusammenfassungDerMedikationEvaluation();
        zusammenfassungDerMedikationEvaluation.setNameDesMedikamentsValue("Kortison-Tabletten");
        zusammenfassungDerMedikationEvaluation.setAktuelleAnwendungValue(steroids);
        summaryMedicationList.add(zusammenfassungDerMedikationEvaluation);

    }

    private void mapImmunosuppressants() {
        Boolean immunosuppressants = questionnaireResponsePOJO.getImmunosuppressants();
        ZusammenfassungDerMedikationEvaluation2 zusammenfassungDerMedikationEvaluation2 = new ZusammenfassungDerMedikationEvaluation2();
        zusammenfassungDerMedikationEvaluation2.setNameDesMedikamentsValue("Immunsuppressiva");
        zusammenfassungDerMedikationEvaluation2.setAktuelleAnwendungValue(immunosuppressants);
        summaryMedicationList.add(zusammenfassungDerMedikationEvaluation2);
    }

    private void mapVaccinatedFlu() {
        Boolean vaccinatedFlu = questionnaireResponsePOJO.getVaccinatedFlu();
        ArzneimittelverwaltungAction arzneimittelverwaltungAction = new ArzneimittelverwaltungAction();
        arzneimittelverwaltungAction.setArzneimittelValue("Grippeimpfung");
        arzneimittelverwaltungAction.setNachkontrolliertValue(vaccinatedFlu);
        medicationManagementList.add(arzneimittelverwaltungAction);
    }

    private void mapDataDonation() {
        //TODO currently not in the FHIR file
    }


}
