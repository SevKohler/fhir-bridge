package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import java.util.List;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;

@Entity
@Archetype("openEHR-EHR-SECTION.adhoc.v1")
@OptionFor("SECTION")
public class AdHocUberschriftSection5 implements D4LQuestionnaireOrgEhrbaseEhrEncodeWrappersSnakecase3ec2eceaAdHocUberschriftChoice {
  @Path("/items[openEHR-EHR-ACTION.informed_consent.v0]")
  private List<EinwilligungserklarungAction> einwilligungserklarung;

  public void setEinwilligungserklarung(List<EinwilligungserklarungAction> einwilligungserklarung) {
     this.einwilligungserklarung = einwilligungserklarung;
  }

  public List<EinwilligungserklarungAction> getEinwilligungserklarung() {
     return this.einwilligungserklarung ;
  }
}
