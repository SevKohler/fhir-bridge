package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import java.lang.Boolean;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.fhirbridge.opt.shareddefinition.Language;
import org.ehrbase.fhirbridge.opt.shareddefinition.SchwangerDefiningcode;

public class StillzeitEvaluationContainment extends Containment {
  public SelectAqlField<StillzeitEvaluation> STILLZEIT_EVALUATION = new AqlFieldImp<StillzeitEvaluation>(StillzeitEvaluation.class, "", "StillzeitEvaluation", StillzeitEvaluation.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(StillzeitEvaluation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Boolean> SCHWANGER_VALUE = new AqlFieldImp<Boolean>(StillzeitEvaluation.class, "/data[at0001]/items[at0002]/value|value", "schwangerValue", Boolean.class, this);

  public SelectAqlField<SchwangerDefiningcode> SCHWANGER_DEFININGCODE = new AqlFieldImp<SchwangerDefiningcode>(StillzeitEvaluation.class, "/data[at0001]/items[at0002]/null_flavour|defining_code", "schwangerDefiningcode", SchwangerDefiningcode.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(StillzeitEvaluation.class, "/language", "language", Language.class, this);

  public ListSelectAqlField<Cluster> ERWEITERUNG = new ListAqlFieldImp<Cluster>(StillzeitEvaluation.class, "/protocol[at0004]/items[at0006]", "erweiterung", Cluster.class, this);

  private StillzeitEvaluationContainment() {
    super("openEHR-EHR-EVALUATION.pregnancy_bf_status.v0");
  }

  public static StillzeitEvaluationContainment getInstance() {
    return new StillzeitEvaluationContainment();
  }
}
