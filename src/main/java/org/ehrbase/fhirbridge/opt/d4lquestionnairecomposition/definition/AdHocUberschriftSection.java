package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import java.util.List;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Choice;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;

@Entity
@Archetype("openEHR-EHR-SECTION.adhoc.v1")
@OptionFor("SECTION")
public class AdHocUberschriftSection implements D4LQuestionnaireOrgEhrbaseEhrEncodeWrappersSnakecase3ec2eceaAdHocUberschriftChoice {
  @Path("/items[openEHR-EHR-EVALUATION.exclusion_specific.v1]")
  @Choice
  private AdHocUberschriftOrgEhrbaseEhrEncodeWrappersSnakecase7aa9e414AusschlussSpezifischChoice ausschlussSpezifisch;

  @Path("/items[openEHR-EHR-EVALUATION.care_activity.v0]")
  private List<PflegetatigkeitEvaluation> pflegetatigkeit;

  @Path("/items[openEHR-EHR-EVALUATION.occupation_summary.v1]")
  private List<ZusammenfassungDerBeschaftigungEvaluation> zusammenfassungDerBeschaftigung;

  @Path("/items[openEHR-EHR-EVALUATION.pregnancy_bf_status.v0]")
  private StillzeitEvaluation stillzeit;

  @Path("/items[openEHR-EHR-OBSERVATION.age.v0]")
  private List<AlterObservation> alter;

  @Path("/items[openEHR-EHR-OBSERVATION.covid_19_kontakt.v0]")
  private List<UMGCOVID19KontaktObservation> umgCovid19Kontakt;

  @Path("/items[openEHR-EHR-EVALUATION.tobacco_smoking_summary.v1]")
  private ZusammenfassungRauchverhaltenEvaluation zusammenfassungRauchverhalten;

  @Path("/items[openEHR-EHR-EVALUATION.living_arrangement.v0]")
  private List<WohnsituationEvaluation> wohnsituation;

  public void setAusschlussSpezifisch(
      AdHocUberschriftOrgEhrbaseEhrEncodeWrappersSnakecase7aa9e414AusschlussSpezifischChoice ausschlussSpezifisch) {
     this.ausschlussSpezifisch = ausschlussSpezifisch;
  }

  public AdHocUberschriftOrgEhrbaseEhrEncodeWrappersSnakecase7aa9e414AusschlussSpezifischChoice getAusschlussSpezifisch(
      ) {
     return this.ausschlussSpezifisch ;
  }

  public void setPflegetatigkeit(List<PflegetatigkeitEvaluation> pflegetatigkeit) {
     this.pflegetatigkeit = pflegetatigkeit;
  }

  public List<PflegetatigkeitEvaluation> getPflegetatigkeit() {
     return this.pflegetatigkeit ;
  }

  public void setZusammenfassungDerBeschaftigung(
      List<ZusammenfassungDerBeschaftigungEvaluation> zusammenfassungDerBeschaftigung) {
     this.zusammenfassungDerBeschaftigung = zusammenfassungDerBeschaftigung;
  }

  public List<ZusammenfassungDerBeschaftigungEvaluation> getZusammenfassungDerBeschaftigung() {
     return this.zusammenfassungDerBeschaftigung ;
  }

  public void setStillzeit(StillzeitEvaluation stillzeit) {
     this.stillzeit = stillzeit;
  }

  public StillzeitEvaluation getStillzeit() {
     return this.stillzeit ;
  }

  public void setAlter(List<AlterObservation> alter) {
     this.alter = alter;
  }

  public List<AlterObservation> getAlter() {
     return this.alter ;
  }

  public void setUmgCovid19Kontakt(List<UMGCOVID19KontaktObservation> umgCovid19Kontakt) {
     this.umgCovid19Kontakt = umgCovid19Kontakt;
  }

  public List<UMGCOVID19KontaktObservation> getUmgCovid19Kontakt() {
     return this.umgCovid19Kontakt ;
  }

  public void setZusammenfassungRauchverhalten(
      ZusammenfassungRauchverhaltenEvaluation zusammenfassungRauchverhalten) {
     this.zusammenfassungRauchverhalten = zusammenfassungRauchverhalten;
  }

  public ZusammenfassungRauchverhaltenEvaluation getZusammenfassungRauchverhalten() {
     return this.zusammenfassungRauchverhalten ;
  }

  public void setWohnsituation(List<WohnsituationEvaluation> wohnsituation) {
     this.wohnsituation = wohnsituation;
  }

  public List<WohnsituationEvaluation> getWohnsituation() {
     return this.wohnsituation ;
  }
}
