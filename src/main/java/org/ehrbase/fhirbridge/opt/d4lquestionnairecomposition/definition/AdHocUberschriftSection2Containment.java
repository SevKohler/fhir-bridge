package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;

public class AdHocUberschriftSection2Containment extends Containment {
  public SelectAqlField<AdHocUberschriftSection2> AD_HOC_UBERSCHRIFT_SECTION2 = new AqlFieldImp<AdHocUberschriftSection2>(AdHocUberschriftSection2.class, "", "AdHocUberschriftSection2", AdHocUberschriftSection2.class, this);

  public ListSelectAqlField<DiagnoseEvaluation> DIAGNOSE = new ListAqlFieldImp<DiagnoseEvaluation>(AdHocUberschriftSection2.class, "/items[openEHR-EHR-EVALUATION.problem_diagnosis.v1]", "diagnose", DiagnoseEvaluation.class, this);

  private AdHocUberschriftSection2Containment() {
    super("openEHR-EHR-SECTION.adhoc.v1");
  }

  public static AdHocUberschriftSection2Containment getInstance() {
    return new AdHocUberschriftSection2Containment();
  }
}
