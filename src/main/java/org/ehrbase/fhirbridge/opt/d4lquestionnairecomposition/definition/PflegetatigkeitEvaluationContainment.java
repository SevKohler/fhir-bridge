package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import com.nedap.archie.rm.generic.PartyProxy;
import java.lang.Boolean;
import java.lang.String;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.fhirbridge.opt.shareddefinition.Language;

public class PflegetatigkeitEvaluationContainment extends Containment {
  public SelectAqlField<PflegetatigkeitEvaluation> PFLEGETATIGKEIT_EVALUATION = new AqlFieldImp<PflegetatigkeitEvaluation>(PflegetatigkeitEvaluation.class, "", "PflegetatigkeitEvaluation", PflegetatigkeitEvaluation.class, this);

  public SelectAqlField<Boolean> BERUFLICH_VALUE = new AqlFieldImp<Boolean>(PflegetatigkeitEvaluation.class, "/data[at0001]/items[at0021]/value|value", "beruflichValue", Boolean.class, this);

  public SelectAqlField<Boolean> PRIVAT_VALUE = new AqlFieldImp<Boolean>(PflegetatigkeitEvaluation.class, "/data[at0001]/items[at0020]/value|value", "privatValue", Boolean.class, this);

  public SelectAqlField<String> ALLGEMEINE_BESCHREIBUNG_VALUE = new AqlFieldImp<String>(PflegetatigkeitEvaluation.class, "/data[at0001]/items[at0003]/value|value", "allgemeineBeschreibungValue", String.class, this);

  public SelectAqlField<String> ANZAHL_DER_GEPFLEGTEN_PERSONEN_VALUE = new AqlFieldImp<String>(PflegetatigkeitEvaluation.class, "/data[at0001]/items[at0005]/value|value", "anzahlDerGepflegtenPersonenValue", String.class, this);

  public ListSelectAqlField<PflegetatigkeitGrundFurDieTatigkeitElement> GRUND_FUR_DIE_TATIGKEIT = new ListAqlFieldImp<PflegetatigkeitGrundFurDieTatigkeitElement>(PflegetatigkeitEvaluation.class, "/data[at0001]/items[at0011]", "grundFurDieTatigkeit", PflegetatigkeitGrundFurDieTatigkeitElement.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(PflegetatigkeitEvaluation.class, "/language", "language", Language.class, this);

  public SelectAqlField<String> FREQUENZ_DER_PFLEGE_VALUE = new AqlFieldImp<String>(PflegetatigkeitEvaluation.class, "/data[at0001]/items[at0008]/value|value", "frequenzDerPflegeValue", String.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(PflegetatigkeitEvaluation.class, "/subject", "subject", PartyProxy.class, this);

  private PflegetatigkeitEvaluationContainment() {
    super("openEHR-EHR-EVALUATION.care_activity.v0");
  }

  public static PflegetatigkeitEvaluationContainment getInstance() {
    return new PflegetatigkeitEvaluationContainment();
  }
}
