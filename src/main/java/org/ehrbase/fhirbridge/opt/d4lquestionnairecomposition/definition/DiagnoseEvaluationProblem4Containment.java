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

public class DiagnoseEvaluationProblem4Containment extends Containment {
  public SelectAqlField<DiagnoseEvaluationProblem4> DIAGNOSE_EVALUATION_PROBLEM4 = new AqlFieldImp<DiagnoseEvaluationProblem4>(DiagnoseEvaluationProblem4.class, "", "DiagnoseEvaluationProblem4", DiagnoseEvaluationProblem4.class, this);

  public ListSelectAqlField<Cluster> STATUS = new ListAqlFieldImp<Cluster>(DiagnoseEvaluationProblem4.class, "/data[at0001]/items[at0046]", "status", Cluster.class, this);

  public SelectAqlField<String> KLINISCHE_BESCHREIBUNG_VALUE = new AqlFieldImp<String>(DiagnoseEvaluationProblem4.class, "/data[at0001]/items[at0009]/name|value", "klinischeBeschreibungValue", String.class, this);

  public ListSelectAqlField<Cluster> ERWEITERUNG = new ListAqlFieldImp<Cluster>(DiagnoseEvaluationProblem4.class, "/protocol[at0032]/items[at0071]", "erweiterung", Cluster.class, this);

  public SelectAqlField<String> DER_DIAGNOSE_VALUE = new AqlFieldImp<String>(DiagnoseEvaluationProblem4.class, "/data[at0001]/items[at0002]/value|value", "derDiagnoseValue", String.class, this);

  public ListSelectAqlField<Cluster> ANATOMISCHE_STELLE_STRUKTURIERT = new ListAqlFieldImp<Cluster>(DiagnoseEvaluationProblem4.class, "/data[at0001]/items[at0039]", "anatomischeStelleStrukturiert", Cluster.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(DiagnoseEvaluationProblem4.class, "/language", "language", Language.class, this);

  public SelectAqlField<String> KLINISCHE_BESCHREIBUNG_VALUE_STRUCTURE = new AqlFieldImp<String>(DiagnoseEvaluationProblem4.class, "/data[at0001]/items[at0009]/value|value", "klinischeBeschreibungValueStructure", String.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(DiagnoseEvaluationProblem4.class, "/subject", "subject", PartyProxy.class, this);

  public ListSelectAqlField<Cluster> SPEZIFISCHE_ANGABEN = new ListAqlFieldImp<Cluster>(DiagnoseEvaluationProblem4.class, "/data[at0001]/items[at0043]", "spezifischeAngaben", Cluster.class, this);

  private DiagnoseEvaluationProblem4Containment() {
    super("openEHR-EHR-EVALUATION.problem_diagnosis.v1");
  }

  public static DiagnoseEvaluationProblem4Containment getInstance() {
    return new DiagnoseEvaluationProblem4Containment();
  }
}
