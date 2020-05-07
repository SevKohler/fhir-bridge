package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import java.lang.String;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.fhirbridge.opt.shareddefinition.Language;

public class AusschlussSpezifischEvaluationContainment extends Containment {
  public SelectAqlField<AusschlussSpezifischEvaluation> AUSSCHLUSS_SPEZIFISCH_EVALUATION = new AqlFieldImp<AusschlussSpezifischEvaluation>(AusschlussSpezifischEvaluation.class, "", "AusschlussSpezifischEvaluation", AusschlussSpezifischEvaluation.class, this);

  public ListSelectAqlField<Cluster> ERWEITERUNG = new ListAqlFieldImp<Cluster>(AusschlussSpezifischEvaluation.class, "/protocol[at0009]/items[at0011]", "erweiterung", Cluster.class, this);

  public SelectAqlField<String> AUSGESCHLOSSENE_KATEGORIE_VALUE = new AqlFieldImp<String>(AusschlussSpezifischEvaluation.class, "/data[at0001]/items[at0003]/value|value", "ausgeschlosseneKategorieValue", String.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(AusschlussSpezifischEvaluation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<String> AUSSAGE_UBER_DEN_AUSSCHLUSS_VALUE = new AqlFieldImp<String>(AusschlussSpezifischEvaluation.class, "/data[at0001]/items[at0002]/value|value", "aussageUberDenAusschlussValue", String.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(AusschlussSpezifischEvaluation.class, "/language", "language", Language.class, this);

  public SelectAqlField<AusgeschlosseneKategorieDefiningcode> AUSGESCHLOSSENE_KATEGORIE_DEFININGCODE = new AqlFieldImp<AusgeschlosseneKategorieDefiningcode>(AusschlussSpezifischEvaluation.class, "/data[at0001]/items[at0003]/name|defining_code", "ausgeschlosseneKategorieDefiningcode", AusgeschlosseneKategorieDefiningcode.class, this);

  private AusschlussSpezifischEvaluationContainment() {
    super("openEHR-EHR-EVALUATION.exclusion_specific.v1");
  }

  public static AusschlussSpezifischEvaluationContainment getInstance() {
    return new AusschlussSpezifischEvaluationContainment();
  }
}
