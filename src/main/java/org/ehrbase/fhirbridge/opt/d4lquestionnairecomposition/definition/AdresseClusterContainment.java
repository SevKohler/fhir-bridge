package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;

public class AdresseClusterContainment extends Containment {
  public SelectAqlField<AdresseCluster> ADRESSE_CLUSTER = new AqlFieldImp<AdresseCluster>(AdresseCluster.class, "", "AdresseCluster", AdresseCluster.class, this);

  public ListSelectAqlField<AdresseAdresseCluster> ADRESSE = new ListAqlFieldImp<AdresseAdresseCluster>(AdresseCluster.class, "/items[at0001]", "adresse", AdresseAdresseCluster.class, this);

  private AdresseClusterContainment() {
    super("openEHR-EHR-CLUSTER.address.v0");
  }

  public static AdresseClusterContainment getInstance() {
    return new AdresseClusterContainment();
  }
}
