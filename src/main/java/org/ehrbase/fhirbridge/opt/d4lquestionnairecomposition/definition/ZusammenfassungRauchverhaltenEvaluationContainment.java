package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.fhirbridge.opt.shareddefinition.Language;

public class ZusammenfassungRauchverhaltenEvaluationContainment extends Containment {
  public SelectAqlField<ZusammenfassungRauchverhaltenEvaluation> ZUSAMMENFASSUNG_RAUCHVERHALTEN_EVALUATION = new AqlFieldImp<ZusammenfassungRauchverhaltenEvaluation>(ZusammenfassungRauchverhaltenEvaluation.class, "", "ZusammenfassungRauchverhaltenEvaluation", ZusammenfassungRauchverhaltenEvaluation.class, this);

  public ListSelectAqlField<Cluster> ERWEITERUNG = new ListAqlFieldImp<Cluster>(ZusammenfassungRauchverhaltenEvaluation.class, "/protocol[at0021]/items[at0073]", "erweiterung", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(ZusammenfassungRauchverhaltenEvaluation.class, "/subject", "subject", PartyProxy.class, this);

  public ListSelectAqlField<Cluster> ALLGEMEINE_DETAILS = new ListAqlFieldImp<Cluster>(ZusammenfassungRauchverhaltenEvaluation.class, "/data[at0001]/items[at0086]", "allgemeineDetails", Cluster.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(ZusammenfassungRauchverhaltenEvaluation.class, "/language", "language", Language.class, this);

  public SelectAqlField<AllgemeinerStatusDefiningcode> ALLGEMEINER_STATUS_DEFININGCODE = new AqlFieldImp<AllgemeinerStatusDefiningcode>(ZusammenfassungRauchverhaltenEvaluation.class, "/data[at0001]/items[at0089]/value|defining_code", "allgemeinerStatusDefiningcode", AllgemeinerStatusDefiningcode.class, this);

  private ZusammenfassungRauchverhaltenEvaluationContainment() {
    super("openEHR-EHR-EVALUATION.tobacco_smoking_summary.v1");
  }

  public static ZusammenfassungRauchverhaltenEvaluationContainment getInstance() {
    return new ZusammenfassungRauchverhaltenEvaluationContainment();
  }
}
