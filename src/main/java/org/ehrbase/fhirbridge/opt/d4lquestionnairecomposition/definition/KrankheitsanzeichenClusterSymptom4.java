package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;

@Entity
@Archetype("openEHR-EHR-CLUSTER.symptom_sign.v1")
@OptionFor("CLUSTER")
public class KrankheitsanzeichenClusterSymptom4 implements ProblemDiagnoseKrankheitsanzeichenChoice {
  @Path("/items[at0063]")
  private List<Cluster> krankheitsanzeichen;

  @Path("/items[at0001]/value|value")
  private String krankheitsanzeichensValue;

  @Path("/items[at0153]")
  private List<Cluster> spezifischeDetails;

  @Path("/items[at0035]/value|value")
  private Boolean nichtSignifikantValue;

  @Path("/items[at0146]")
  private List<Cluster> vorangegangeneEpisoden;

  @Path("/items[at0147]")
  private List<Cluster> spezifischeAnatomischeLokalisation;

  @Path("/items[at0035]/name|value")
  private String nichtSignifikantValueName;

  public void setKrankheitsanzeichen(List<Cluster> krankheitsanzeichen) {
     this.krankheitsanzeichen = krankheitsanzeichen;
  }

  public List<Cluster> getKrankheitsanzeichen() {
     return this.krankheitsanzeichen ;
  }

  public void setKrankheitsanzeichensValue(String krankheitsanzeichensValue) {
     this.krankheitsanzeichensValue = krankheitsanzeichensValue;
  }

  public String getKrankheitsanzeichensValue() {
     return this.krankheitsanzeichensValue ;
  }

  public void setSpezifischeDetails(List<Cluster> spezifischeDetails) {
     this.spezifischeDetails = spezifischeDetails;
  }

  public List<Cluster> getSpezifischeDetails() {
     return this.spezifischeDetails ;
  }

  public void setNichtSignifikantValue(Boolean nichtSignifikantValue) {
     this.nichtSignifikantValue = nichtSignifikantValue;
  }

  public Boolean isNichtSignifikantValue() {
     return this.nichtSignifikantValue ;
  }

  public void setVorangegangeneEpisoden(List<Cluster> vorangegangeneEpisoden) {
     this.vorangegangeneEpisoden = vorangegangeneEpisoden;
  }

  public List<Cluster> getVorangegangeneEpisoden() {
     return this.vorangegangeneEpisoden ;
  }

  public void setSpezifischeAnatomischeLokalisation(
      List<Cluster> spezifischeAnatomischeLokalisation) {
     this.spezifischeAnatomischeLokalisation = spezifischeAnatomischeLokalisation;
  }

  public List<Cluster> getSpezifischeAnatomischeLokalisation() {
     return this.spezifischeAnatomischeLokalisation ;
  }

  public void setNichtSignifikantValueName(String nichtSignifikantValueName) {
     this.nichtSignifikantValueName = nichtSignifikantValueName;
  }

  public String getNichtSignifikantValueName() {
     return this.nichtSignifikantValueName ;
  }
}
