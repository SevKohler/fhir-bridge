package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import java.util.List;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;

@Entity
@Archetype("openEHR-EHR-CLUSTER.address.v0")
public class AdresseCluster {
  @Path("/items[at0001]")
  private List<AdresseAdresseCluster> adresse;

  public void setAdresse(List<AdresseAdresseCluster> adresse) {
     this.adresse = adresse;
  }

  public List<AdresseAdresseCluster> getAdresse() {
     return this.adresse ;
  }
}
