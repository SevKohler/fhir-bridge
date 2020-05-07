package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import java.lang.String;
import java.util.List;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.fhirbridge.opt.shareddefinition.Language;

@Entity
@Archetype("openEHR-EHR-EVALUATION.exclusion_specific.v1")
@OptionFor("EVALUATION")
public class AusschlussSpezifischEvaluation2 implements AdHocUberschriftOrgEhrbaseEhrEncodeWrappersSnakecase7aa9e414AusschlussSpezifischChoice {
  @Path("/protocol[at0009]/items[at0011]")
  private List<Cluster> erweiterung;

  @Path("/data[at0001]/items[at0003]/value|value")
  private String ausgeschlosseneKategorieValue;

  @Path("/subject")
  private PartyProxy subject;

  @Path("/data[at0001]/items[at0002]/value|value")
  private String aussageUberDenAusschlussValue;

  @Path("/language")
  private Language language;

  @Path("/data[at0001]/items[at0003]/name|defining_code")
  private AusgeschlosseneKategorieDefiningcode ausgeschlosseneKategorieDefiningcode;

  public void setErweiterung(List<Cluster> erweiterung) {
     this.erweiterung = erweiterung;
  }

  public List<Cluster> getErweiterung() {
     return this.erweiterung ;
  }

  public void setAusgeschlosseneKategorieValue(String ausgeschlosseneKategorieValue) {
     this.ausgeschlosseneKategorieValue = ausgeschlosseneKategorieValue;
  }

  public String getAusgeschlosseneKategorieValue() {
     return this.ausgeschlosseneKategorieValue ;
  }

  public void setSubject(PartyProxy subject) {
     this.subject = subject;
  }

  public PartyProxy getSubject() {
     return this.subject ;
  }

  public void setAussageUberDenAusschlussValue(String aussageUberDenAusschlussValue) {
     this.aussageUberDenAusschlussValue = aussageUberDenAusschlussValue;
  }

  public String getAussageUberDenAusschlussValue() {
     return this.aussageUberDenAusschlussValue ;
  }

  public void setLanguage(Language language) {
     this.language = language;
  }

  public Language getLanguage() {
     return this.language ;
  }

  public void setAusgeschlosseneKategorieDefiningcode(
      AusgeschlosseneKategorieDefiningcode ausgeschlosseneKategorieDefiningcode) {
     this.ausgeschlosseneKategorieDefiningcode = ausgeschlosseneKategorieDefiningcode;
  }

  public AusgeschlosseneKategorieDefiningcode getAusgeschlosseneKategorieDefiningcode() {
     return this.ausgeschlosseneKategorieDefiningcode ;
  }
}
