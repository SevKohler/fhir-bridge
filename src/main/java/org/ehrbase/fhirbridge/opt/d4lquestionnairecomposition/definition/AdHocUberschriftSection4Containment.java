package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;

public class AdHocUberschriftSection4Containment extends Containment {
  public SelectAqlField<AdHocUberschriftSection4> AD_HOC_UBERSCHRIFT_SECTION4 = new AqlFieldImp<AdHocUberschriftSection4>(AdHocUberschriftSection4.class, "", "AdHocUberschriftSection4", AdHocUberschriftSection4.class, this);

  public SelectAqlField<AdHocUberschriftOrgEhrbaseEhrEncodeWrappersSnakecase25e49cb2ZusammenfassungDerMedikationChoice> ZUSAMMENFASSUNG_DER_MEDIKATION = new AqlFieldImp<AdHocUberschriftOrgEhrbaseEhrEncodeWrappersSnakecase25e49cb2ZusammenfassungDerMedikationChoice>(AdHocUberschriftSection4.class, "/items[openEHR-EHR-EVALUATION.medication_summary.v0]", "zusammenfassungDerMedikation", AdHocUberschriftOrgEhrbaseEhrEncodeWrappersSnakecase25e49cb2ZusammenfassungDerMedikationChoice.class, this);

  public ListSelectAqlField<ArzneimittelverwaltungAction> ARZNEIMITTELVERWALTUNG = new ListAqlFieldImp<ArzneimittelverwaltungAction>(AdHocUberschriftSection4.class, "/items[openEHR-EHR-ACTION.medication.v1]", "arzneimittelverwaltung", ArzneimittelverwaltungAction.class, this);

  private AdHocUberschriftSection4Containment() {
    super("openEHR-EHR-SECTION.adhoc.v1");
  }

  public static AdHocUberschriftSection4Containment getInstance() {
    return new AdHocUberschriftSection4Containment();
  }
}
