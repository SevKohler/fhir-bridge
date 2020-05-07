package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;

public class AdHocUberschriftSectionContainment extends Containment {
  public SelectAqlField<AdHocUberschriftSection> AD_HOC_UBERSCHRIFT_SECTION = new AqlFieldImp<AdHocUberschriftSection>(AdHocUberschriftSection.class, "", "AdHocUberschriftSection", AdHocUberschriftSection.class, this);

  public SelectAqlField<AdHocUberschriftOrgEhrbaseEhrEncodeWrappersSnakecase7aa9e414AusschlussSpezifischChoice> AUSSCHLUSS_SPEZIFISCH = new AqlFieldImp<AdHocUberschriftOrgEhrbaseEhrEncodeWrappersSnakecase7aa9e414AusschlussSpezifischChoice>(AdHocUberschriftSection.class, "/items[openEHR-EHR-EVALUATION.exclusion_specific.v1]", "ausschlussSpezifisch", AdHocUberschriftOrgEhrbaseEhrEncodeWrappersSnakecase7aa9e414AusschlussSpezifischChoice.class, this);

  public ListSelectAqlField<PflegetatigkeitEvaluation> PFLEGETATIGKEIT = new ListAqlFieldImp<PflegetatigkeitEvaluation>(AdHocUberschriftSection.class, "/items[openEHR-EHR-EVALUATION.care_activity.v0]", "pflegetatigkeit", PflegetatigkeitEvaluation.class, this);

  public ListSelectAqlField<ZusammenfassungDerBeschaftigungEvaluation> ZUSAMMENFASSUNG_DER_BESCHAFTIGUNG = new ListAqlFieldImp<ZusammenfassungDerBeschaftigungEvaluation>(AdHocUberschriftSection.class, "/items[openEHR-EHR-EVALUATION.occupation_summary.v1]", "zusammenfassungDerBeschaftigung", ZusammenfassungDerBeschaftigungEvaluation.class, this);

  public SelectAqlField<StillzeitEvaluation> STILLZEIT = new AqlFieldImp<StillzeitEvaluation>(AdHocUberschriftSection.class, "/items[openEHR-EHR-EVALUATION.pregnancy_bf_status.v0]", "stillzeit", StillzeitEvaluation.class, this);

  public ListSelectAqlField<AlterObservation> ALTER = new ListAqlFieldImp<AlterObservation>(AdHocUberschriftSection.class, "/items[openEHR-EHR-OBSERVATION.age.v0]", "alter", AlterObservation.class, this);

  public ListSelectAqlField<UMGCOVID19KontaktObservation> UMG_COVID19_KONTAKT = new ListAqlFieldImp<UMGCOVID19KontaktObservation>(AdHocUberschriftSection.class, "/items[openEHR-EHR-OBSERVATION.covid_19_kontakt.v0]", "umgCovid19Kontakt", UMGCOVID19KontaktObservation.class, this);

  public SelectAqlField<ZusammenfassungRauchverhaltenEvaluation> ZUSAMMENFASSUNG_RAUCHVERHALTEN = new AqlFieldImp<ZusammenfassungRauchverhaltenEvaluation>(AdHocUberschriftSection.class, "/items[openEHR-EHR-EVALUATION.tobacco_smoking_summary.v1]", "zusammenfassungRauchverhalten", ZusammenfassungRauchverhaltenEvaluation.class, this);

  public ListSelectAqlField<WohnsituationEvaluation> WOHNSITUATION = new ListAqlFieldImp<WohnsituationEvaluation>(AdHocUberschriftSection.class, "/items[openEHR-EHR-EVALUATION.living_arrangement.v0]", "wohnsituation", WohnsituationEvaluation.class, this);

  private AdHocUberschriftSectionContainment() {
    super("openEHR-EHR-SECTION.adhoc.v1");
  }

  public static AdHocUberschriftSectionContainment getInstance() {
    return new AdHocUberschriftSectionContainment();
  }
}
