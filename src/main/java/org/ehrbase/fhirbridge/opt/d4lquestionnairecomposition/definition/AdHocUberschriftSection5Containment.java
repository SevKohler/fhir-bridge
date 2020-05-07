package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;

public class AdHocUberschriftSection5Containment extends Containment {
  public SelectAqlField<AdHocUberschriftSection5> AD_HOC_UBERSCHRIFT_SECTION5 = new AqlFieldImp<AdHocUberschriftSection5>(AdHocUberschriftSection5.class, "", "AdHocUberschriftSection5", AdHocUberschriftSection5.class, this);

  public ListSelectAqlField<EinwilligungserklarungAction> EINWILLIGUNGSERKLARUNG = new ListAqlFieldImp<EinwilligungserklarungAction>(AdHocUberschriftSection5.class, "/items[openEHR-EHR-ACTION.informed_consent.v0]", "einwilligungserklarung", EinwilligungserklarungAction.class, this);

  private AdHocUberschriftSection5Containment() {
    super("openEHR-EHR-SECTION.adhoc.v1");
  }

  public static AdHocUberschriftSection5Containment getInstance() {
    return new AdHocUberschriftSection5Containment();
  }
}
