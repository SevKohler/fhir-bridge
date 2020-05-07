package org.ehrbase.fhirbridge.mapping.F2OQuestionnaire;

import java.time.temporal.TemporalAccessor;

public class QuestionnaireResponsePOJO {
    private String age;
    private String livingSituation;
    private Boolean privateCaregiver;
    private Boolean smoker;
    private Boolean pregnant;
    private String nurse;
    private Boolean contactWithInfected;

    private Boolean fewer24h;
    private Boolean fewer4days;
    private Boolean chills;
    private Boolean tired;
    private Boolean bodyAches;
    private Boolean persistentCoughing;
    private Boolean runningNose;
    private Boolean diarrhea;
    private Boolean soreThroat;
    private Boolean headache;
    private Boolean outOfBreath;
    private Boolean tasteSmellLoss;
    private TemporalAccessor sinceWhenSymptoms;

    private String chronicLungDisease;
    private String diabetes;
    private String heartDisease;
    private String obesity;
    private String steroids;
    private String immunosuppressants;
    private String vaccinatedFlu;

    public QuestionnaireResponsePOJO() {
    }

    public String getAge() {
        return age;
    }

    protected void setAge(String age) {
        this.age = age;
    }

    public String getLivingSituation() {
        return livingSituation;
    }

    protected void setLivingSituation(String housingSituation) {
        this.livingSituation = housingSituation;
    }

    public Boolean getPrivateCaregiver() {
        return privateCaregiver;
    }

    protected void setPrivateCaregiver(Boolean privateCaregiver) {
        this.privateCaregiver = privateCaregiver;
    }

    public Boolean getSmoker() {
        return smoker;
    }

    protected void setSmoker(Boolean smoker) {
        this.smoker = smoker;
    }

    public Boolean getPregnant() {
        return pregnant;
    }

    protected void setPregnant(Boolean pregnant) {
        this.pregnant = pregnant;
    }

    public String getNurse() {
        return nurse;
    }

    protected void setNurse(String nurse) {
        this.nurse = nurse;
    }

    protected void setContactWithInfected(Boolean contactWithInfected) {
        this.contactWithInfected = contactWithInfected;
    }

    public Boolean getContactWithInfected() {
        return contactWithInfected;
    }

    protected void setFewer24h(Boolean fewer24h) {
        this.fewer24h = fewer24h;
    }

    public Boolean getFewer24h() {
        return fewer24h;
    }

    protected void setFewer4days(Boolean fewer4days) {
        this.fewer4days = fewer4days;
    }

    public Boolean getFewer4days() {
        return fewer4days;
    }

    protected void setChills(Boolean chills) {
        this.chills = chills;
    }

    public Boolean getChills() {
        return chills;
    }

    protected void setTired(Boolean tired) {
        this.tired = tired;
    }

    public Boolean getTired() {
        return tired;
    }

    protected void setBodyAches(Boolean bodyAches) {
        this.bodyAches = bodyAches;
    }

    public Boolean getBodyAches() {
        return bodyAches;
    }

    protected void setPersistentCoughing(Boolean persistentCoughing) {
        this.persistentCoughing = persistentCoughing;
    }

    public Boolean getPersistentCoughing() {
        return persistentCoughing;
    }

    protected void setRunningNose(Boolean runningNose) {        this.runningNose = runningNose;    }

    public Boolean getRunningNose() {
        return runningNose;
    }

    protected void setDiarrhea(Boolean diarrhea) {
        this.diarrhea = diarrhea;
    }

    public Boolean getDiarrhea() {
        return diarrhea;
    }

    protected void setSoreThroat(Boolean soreThroat) {      this.soreThroat = soreThroat;    }

    public Boolean getSoreThroat() {
        return soreThroat;
    }

    protected void setHeadache(Boolean headache) {
        this.headache = headache;
    }

    public Boolean getHeadache() {
        return headache;
    }

    protected void setOutOfBreath(Boolean outOfBreath) {
        this.outOfBreath = outOfBreath;
    }

    public Boolean getOutOfBreath() {
        return outOfBreath;
    }

    protected void setTasteSmellLoss(Boolean tasteSmellLoss) {
        this.tasteSmellLoss = tasteSmellLoss;
    }

    public Boolean getTasteSmellLoss() {
        return tasteSmellLoss;
    }

    protected void setSinceWhenSymptoms(TemporalAccessor sinceWhenSymptoms) {
        this.sinceWhenSymptoms = sinceWhenSymptoms;
    }

    public TemporalAccessor getSinceWhenSymptoms() {
        return sinceWhenSymptoms;
    }

    protected void setChronicLungDisease(String chronicLungDisease) {
        this.chronicLungDisease = chronicLungDisease;
    }

    public String getChronicLungDisease() {        return chronicLungDisease;    }

    protected void setDiabetes(String diabetes) {
        this.diabetes = diabetes;
    }

    public String getDiabetes() {
        return diabetes;
    }

    protected void setHeartDisease(String heartDisease) {
        this.heartDisease = heartDisease;
    }

    public String getHeartDisease() {
        return heartDisease;
    }

    protected void setObesity(String obesity) {
        this.obesity = obesity;
    }

    public String getObesity() {
        return obesity;
    }

    protected void setSteroids(String steroids) {
        this.steroids = steroids;
    }

    public String getSteroids() {
        return steroids;
    }

    protected void setImmunosuppressants(String immunosuppressants) {
        this.immunosuppressants = immunosuppressants;
    }

    public String getImmunosuppressants() {
        return immunosuppressants;
    }

    protected void setVaccinatedFlu(String vaccinatedFlu) {
        this.vaccinatedFlu = vaccinatedFlu;
    }

    public String getVaccinatedFlu() {
        return vaccinatedFlu;
    }

}
