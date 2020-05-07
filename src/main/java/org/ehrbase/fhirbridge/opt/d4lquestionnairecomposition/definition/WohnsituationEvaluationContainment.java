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

public class WohnsituationEvaluationContainment extends Containment {
  public SelectAqlField<WohnsituationEvaluation> WOHNSITUATION_EVALUATION = new AqlFieldImp<WohnsituationEvaluation>(WohnsituationEvaluation.class, "", "WohnsituationEvaluation", WohnsituationEvaluation.class, this);

  public SelectAqlField<String> WOHNSITUATION_VALUE = new AqlFieldImp<String>(WohnsituationEvaluation.class, "/data[at0001]/items[at0004]/value|value", "wohnsituationValue", String.class, this);

  public ListSelectAqlField<Cluster> ERGANZENDE_DETAILS = new ListAqlFieldImp<Cluster>(WohnsituationEvaluation.class, "/data[at0001]/items[at0008]", "erganzendeDetails", Cluster.class, this);

  public ListSelectAqlField<Cluster> ERWEITERUNG = new ListAqlFieldImp<Cluster>(WohnsituationEvaluation.class, "/protocol[at0002]/items[at0011]", "erweiterung", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(WohnsituationEvaluation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(WohnsituationEvaluation.class, "/language", "language", Language.class, this);

  private WohnsituationEvaluationContainment() {
    super("openEHR-EHR-EVALUATION.living_arrangement.v0");
  }

  public static WohnsituationEvaluationContainment getInstance() {
    return new WohnsituationEvaluationContainment();
  }
}
