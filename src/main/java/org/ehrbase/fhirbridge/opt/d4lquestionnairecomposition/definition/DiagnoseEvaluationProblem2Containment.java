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

public class DiagnoseEvaluationProblem2Containment extends Containment {
  public SelectAqlField<DiagnoseEvaluationProblem2> DIAGNOSE_EVALUATION_PROBLEM2 = new AqlFieldImp<DiagnoseEvaluationProblem2>(DiagnoseEvaluationProblem2.class, "", "DiagnoseEvaluationProblem2", DiagnoseEvaluationProblem2.class, this);

  public ListSelectAqlField<Cluster> STATUS = new ListAqlFieldImp<Cluster>(DiagnoseEvaluationProblem2.class, "/data[at0001]/items[at0046]", "status", Cluster.class, this);

  public SelectAqlField<String> KLINISCHE_BESCHREIBUNG_VALUE = new AqlFieldImp<String>(DiagnoseEvaluationProblem2.class, "/data[at0001]/items[at0009]/name|value", "klinischeBeschreibungValue", String.class, this);

  public ListSelectAqlField<Cluster> ERWEITERUNG = new ListAqlFieldImp<Cluster>(DiagnoseEvaluationProblem2.class, "/protocol[at0032]/items[at0071]", "erweiterung", Cluster.class, this);

  public SelectAqlField<String> DER_DIAGNOSE_VALUE = new AqlFieldImp<String>(DiagnoseEvaluationProblem2.class, "/data[at0001]/items[at0002]/value|value", "derDiagnoseValue", String.class, this);

  public ListSelectAqlField<Cluster> ANATOMISCHE_STELLE_STRUKTURIERT = new ListAqlFieldImp<Cluster>(DiagnoseEvaluationProblem2.class, "/data[at0001]/items[at0039]", "anatomischeStelleStrukturiert", Cluster.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(DiagnoseEvaluationProblem2.class, "/language", "language", Language.class, this);

  public SelectAqlField<String> KLINISCHE_BESCHREIBUNG_VALUE_STRUCTURE = new AqlFieldImp<String>(DiagnoseEvaluationProblem2.class, "/data[at0001]/items[at0009]/value|value", "klinischeBeschreibungValueStructure", String.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(DiagnoseEvaluationProblem2.class, "/subject", "subject", PartyProxy.class, this);

  public ListSelectAqlField<Cluster> SPEZIFISCHE_ANGABEN = new ListAqlFieldImp<Cluster>(DiagnoseEvaluationProblem2.class, "/data[at0001]/items[at0043]", "spezifischeAngaben", Cluster.class, this);

  private DiagnoseEvaluationProblem2Containment() {
    super("openEHR-EHR-EVALUATION.problem_diagnosis.v1");
  }

  public static DiagnoseEvaluationProblem2Containment getInstance() {
    return new DiagnoseEvaluationProblem2Containment();
  }
}
