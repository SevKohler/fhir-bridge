package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.fhirbridge.opt.shareddefinition.Language;

@Entity
@Archetype("openEHR-EHR-EVALUATION.occupation_summary.v1")
public class ZusammenfassungDerBeschaftigungEvaluation {
  @Path("/data[at0001]/items[at0003]")
  private List<Cluster> beschaftigungsepisode;

  @Path("/protocol[at0007]/items[at0009]/value|value")
  private TemporalAccessor zuletztAktualisiertValue;

  @Path("/subject")
  private PartyProxy subject;

  @Path("/language")
  private Language language;

  @Path("/data[at0001]/items[openEHR-EHR-CLUSTER.occupation_record.v1]")
  private List<BeschaftigungCluster> beschaftigung;

  @Path("/protocol[at0007]/items[at0008]")
  private List<Cluster> erweiterung;

  public void setBeschaftigungsepisode(List<Cluster> beschaftigungsepisode) {
     this.beschaftigungsepisode = beschaftigungsepisode;
  }

  public List<Cluster> getBeschaftigungsepisode() {
     return this.beschaftigungsepisode ;
  }

  public void setZuletztAktualisiertValue(TemporalAccessor zuletztAktualisiertValue) {
     this.zuletztAktualisiertValue = zuletztAktualisiertValue;
  }

  public TemporalAccessor getZuletztAktualisiertValue() {
     return this.zuletztAktualisiertValue ;
  }

  public void setSubject(PartyProxy subject) {
     this.subject = subject;
  }

  public PartyProxy getSubject() {
     return this.subject ;
  }

  public void setLanguage(Language language) {
     this.language = language;
  }

  public Language getLanguage() {
     return this.language ;
  }

  public void setBeschaftigung(List<BeschaftigungCluster> beschaftigung) {
     this.beschaftigung = beschaftigung;
  }

  public List<BeschaftigungCluster> getBeschaftigung() {
     return this.beschaftigung ;
  }

  public void setErweiterung(List<Cluster> erweiterung) {
     this.erweiterung = erweiterung;
  }

  public List<Cluster> getErweiterung() {
     return this.erweiterung ;
  }
}
