package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import com.nedap.archie.rm.generic.PartyProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.fhirbridge.opt.shareddefinition.Language;

@Entity
@Archetype("openEHR-EHR-EVALUATION.care_activity.v0")
public class PflegetatigkeitEvaluation {
  @Path("/data[at0001]/items[at0021]/value|value")
  private Boolean beruflichValue;

  @Path("/data[at0001]/items[at0020]/value|value")
  private Boolean privatValue;

  @Path("/data[at0001]/items[at0003]/value|value")
  private String allgemeineBeschreibungValue;

  @Path("/data[at0001]/items[at0005]/value|value")
  private String anzahlDerGepflegtenPersonenValue;

  @Path("/data[at0001]/items[at0011]")
  private List<PflegetatigkeitGrundFurDieTatigkeitElement> grundFurDieTatigkeit;

  @Path("/language")
  private Language language;

  @Path("/data[at0001]/items[at0008]/value|value")
  private String frequenzDerPflegeValue;

  @Path("/subject")
  private PartyProxy subject;

  public void setBeruflichValue(Boolean beruflichValue) {
     this.beruflichValue = beruflichValue;
  }

  public Boolean isBeruflichValue() {
     return this.beruflichValue ;
  }

  public void setPrivatValue(Boolean privatValue) {
     this.privatValue = privatValue;
  }

  public Boolean isPrivatValue() {
     return this.privatValue ;
  }

  public void setAllgemeineBeschreibungValue(String allgemeineBeschreibungValue) {
     this.allgemeineBeschreibungValue = allgemeineBeschreibungValue;
  }

  public String getAllgemeineBeschreibungValue() {
     return this.allgemeineBeschreibungValue ;
  }

  public void setAnzahlDerGepflegtenPersonenValue(String anzahlDerGepflegtenPersonenValue) {
     this.anzahlDerGepflegtenPersonenValue = anzahlDerGepflegtenPersonenValue;
  }

  public String getAnzahlDerGepflegtenPersonenValue() {
     return this.anzahlDerGepflegtenPersonenValue ;
  }

  public void setGrundFurDieTatigkeit(
      List<PflegetatigkeitGrundFurDieTatigkeitElement> grundFurDieTatigkeit) {
     this.grundFurDieTatigkeit = grundFurDieTatigkeit;
  }

  public List<PflegetatigkeitGrundFurDieTatigkeitElement> getGrundFurDieTatigkeit() {
     return this.grundFurDieTatigkeit ;
  }

  public void setLanguage(Language language) {
     this.language = language;
  }

  public Language getLanguage() {
     return this.language ;
  }

  public void setFrequenzDerPflegeValue(String frequenzDerPflegeValue) {
     this.frequenzDerPflegeValue = frequenzDerPflegeValue;
  }

  public String getFrequenzDerPflegeValue() {
     return this.frequenzDerPflegeValue ;
  }

  public void setSubject(PartyProxy subject) {
     this.subject = subject;
  }

  public PartyProxy getSubject() {
     return this.subject ;
  }
}
