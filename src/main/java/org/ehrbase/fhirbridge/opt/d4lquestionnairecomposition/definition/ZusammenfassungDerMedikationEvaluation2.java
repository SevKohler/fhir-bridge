package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.fhirbridge.opt.shareddefinition.AktuelleAnwendungDefiningcode;
import org.ehrbase.fhirbridge.opt.shareddefinition.Language;

@Entity
@Archetype("openEHR-EHR-EVALUATION.medication_summary.v0")
@OptionFor("EVALUATION")
public class ZusammenfassungDerMedikationEvaluation2 implements AdHocUberschriftOrgEhrbaseEhrEncodeWrappersSnakecase25e49cb2ZusammenfassungDerMedikationChoice {
  @Path("/data[at0001]/items[at0004]/value|value")
  private Boolean aktuelleAnwendungValue;

  @Path("/data[at0001]/items[at0004]/null_flavour|defining_code")
  private AktuelleAnwendungDefiningcode aktuelleAnwendungDefiningcode;

  @Path("/subject")
  private PartyProxy subject;

  @Path("/data[at0001]/items[at0002]/value|value")
  private String nameDesMedikamentsValue;

  @Path("/language")
  private Language language;

  @Path("/protocol[at0005]/items[at0019]")
  private List<Cluster> erweiterung;

  public void setAktuelleAnwendungValue(Boolean aktuelleAnwendungValue) {
     this.aktuelleAnwendungValue = aktuelleAnwendungValue;
  }

  public Boolean isAktuelleAnwendungValue() {
     return this.aktuelleAnwendungValue ;
  }

  public void setAktuelleAnwendungDefiningcode(
      AktuelleAnwendungDefiningcode aktuelleAnwendungDefiningcode) {
     this.aktuelleAnwendungDefiningcode = aktuelleAnwendungDefiningcode;
  }

  public AktuelleAnwendungDefiningcode getAktuelleAnwendungDefiningcode() {
     return this.aktuelleAnwendungDefiningcode ;
  }

  public void setSubject(PartyProxy subject) {
     this.subject = subject;
  }

  public PartyProxy getSubject() {
     return this.subject ;
  }

  public void setNameDesMedikamentsValue(String nameDesMedikamentsValue) {
     this.nameDesMedikamentsValue = nameDesMedikamentsValue;
  }

  public String getNameDesMedikamentsValue() {
     return this.nameDesMedikamentsValue ;
  }

  public void setLanguage(Language language) {
     this.language = language;
  }

  public Language getLanguage() {
     return this.language ;
  }

  public void setErweiterung(List<Cluster> erweiterung) {
     this.erweiterung = erweiterung;
  }

  public List<Cluster> getErweiterung() {
     return this.erweiterung ;
  }
}
