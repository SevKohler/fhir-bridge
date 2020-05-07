package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Choice;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.fhirbridge.opt.shareddefinition.Language;

@Entity
@Archetype("openEHR-EHR-EVALUATION.problem_diagnosis.v1")
public class DiagnoseEvaluation {
  @Path("/data[at0001]/items[openEHR-EHR-CLUSTER.symptom_sign.v1]")
  @Choice
  private ProblemDiagnoseKrankheitsanzeichenChoice krankheitsanzeichen;

  @Path("/data[at0001]/items[at0046]")
  private List<Cluster> status;

  @Path("/data[at0001]/items[at0077]/value|value")
  private TemporalAccessor derErstdiagnoseValue;

  @Path("/protocol[at0032]/items[at0071]")
  private List<Cluster> erweiterung;

  @Path("/data[at0001]/items[at0002]/value|value")
  private String derDiagnoseValue;

  @Path("/data[at0001]/items[at0039]")
  private List<Cluster> anatomischeStelleStrukturiert;

  @Path("/language")
  private Language language;

  @Path("/subject")
  private PartyProxy subject;

  public void setKrankheitsanzeichen(ProblemDiagnoseKrankheitsanzeichenChoice krankheitsanzeichen) {
     this.krankheitsanzeichen = krankheitsanzeichen;
  }

  public ProblemDiagnoseKrankheitsanzeichenChoice getKrankheitsanzeichen() {
     return this.krankheitsanzeichen ;
  }

  public void setStatus(List<Cluster> status) {
     this.status = status;
  }

  public List<Cluster> getStatus() {
     return this.status ;
  }

  public void setDerErstdiagnoseValue(TemporalAccessor derErstdiagnoseValue) {
     this.derErstdiagnoseValue = derErstdiagnoseValue;
  }

  public TemporalAccessor getDerErstdiagnoseValue() {
     return this.derErstdiagnoseValue ;
  }

  public void setErweiterung(List<Cluster> erweiterung) {
     this.erweiterung = erweiterung;
  }

  public List<Cluster> getErweiterung() {
     return this.erweiterung ;
  }

  public void setDerDiagnoseValue(String derDiagnoseValue) {
     this.derDiagnoseValue = derDiagnoseValue;
  }

  public String getDerDiagnoseValue() {
     return this.derDiagnoseValue ;
  }

  public void setAnatomischeStelleStrukturiert(List<Cluster> anatomischeStelleStrukturiert) {
     this.anatomischeStelleStrukturiert = anatomischeStelleStrukturiert;
  }

  public List<Cluster> getAnatomischeStelleStrukturiert() {
     return this.anatomischeStelleStrukturiert ;
  }

  public void setLanguage(Language language) {
     this.language = language;
  }

  public Language getLanguage() {
     return this.language ;
  }

  public void setSubject(PartyProxy subject) {
     this.subject = subject;
  }

  public PartyProxy getSubject() {
     return this.subject ;
  }
}
