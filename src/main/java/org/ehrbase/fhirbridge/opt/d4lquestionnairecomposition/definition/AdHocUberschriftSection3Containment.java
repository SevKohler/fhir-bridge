package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.SelectAqlField;

public class AdHocUberschriftSection3Containment extends Containment {
  public SelectAqlField<AdHocUberschriftSection3> AD_HOC_UBERSCHRIFT_SECTION3 = new AqlFieldImp<AdHocUberschriftSection3>(AdHocUberschriftSection3.class, "", "AdHocUberschriftSection3", AdHocUberschriftSection3.class, this);

  public SelectAqlField<AdHocUberschriftDiagnoseChoice> DIAGNOSE = new AqlFieldImp<AdHocUberschriftDiagnoseChoice>(AdHocUberschriftSection3.class, "/items[openEHR-EHR-EVALUATION.problem_diagnosis.v1]", "diagnose", AdHocUberschriftDiagnoseChoice.class, this);

  private AdHocUberschriftSection3Containment() {
    super("openEHR-EHR-SECTION.adhoc.v1");
  }

  public static AdHocUberschriftSection3Containment getInstance() {
    return new AdHocUberschriftSection3Containment();
  }
}
