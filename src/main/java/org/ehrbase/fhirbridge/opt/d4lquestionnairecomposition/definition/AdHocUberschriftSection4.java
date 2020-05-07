package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import java.util.List;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Choice;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;

@Entity
@Archetype("openEHR-EHR-SECTION.adhoc.v1")
@OptionFor("SECTION")
public class AdHocUberschriftSection4 implements D4LQuestionnaireOrgEhrbaseEhrEncodeWrappersSnakecase3ec2eceaAdHocUberschriftChoice {
  @Path("/items[openEHR-EHR-EVALUATION.medication_summary.v0]")
  @Choice
  private List<AdHocUberschriftOrgEhrbaseEhrEncodeWrappersSnakecase25e49cb2ZusammenfassungDerMedikationChoice> zusammenfassungDerMedikation;

  @Path("/items[openEHR-EHR-ACTION.medication.v1]")
  private List<ArzneimittelverwaltungAction> arzneimittelverwaltung;

  public void setZusammenfassungDerMedikation(
      List<AdHocUberschriftOrgEhrbaseEhrEncodeWrappersSnakecase25e49cb2ZusammenfassungDerMedikationChoice> zusammenfassungDerMedikation) {
     this.zusammenfassungDerMedikation = zusammenfassungDerMedikation;
  }

  public List<AdHocUberschriftOrgEhrbaseEhrEncodeWrappersSnakecase25e49cb2ZusammenfassungDerMedikationChoice> getZusammenfassungDerMedikation(
      ) {
     return this.zusammenfassungDerMedikation ;
  }

  public void setArzneimittelverwaltung(List<ArzneimittelverwaltungAction> arzneimittelverwaltung) {
     this.arzneimittelverwaltung = arzneimittelverwaltung;
  }

  public List<ArzneimittelverwaltungAction> getArzneimittelverwaltung() {
     return this.arzneimittelverwaltung ;
  }
}
