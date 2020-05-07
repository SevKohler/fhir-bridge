package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.String;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;

public class BeschaftigungClusterContainment extends Containment {
  public SelectAqlField<BeschaftigungCluster> BESCHAFTIGUNG_CLUSTER = new AqlFieldImp<BeschaftigungCluster>(BeschaftigungCluster.class, "", "BeschaftigungCluster", BeschaftigungCluster.class, this);

  public SelectAqlField<String> ROLLE_VALUE = new AqlFieldImp<String>(BeschaftigungCluster.class, "/items[at0005]/value|value", "rolleValue", String.class, this);

  public SelectAqlField<String> ROLLE_VALUE_BERUFSBEZEICHNUNG = new AqlFieldImp<String>(BeschaftigungCluster.class, "/items[at0005]/name|value", "rolleValueBerufsbezeichnung", String.class, this);

  public ListSelectAqlField<Cluster> ANGABEN_ZUR_ORGANISATION = new ListAqlFieldImp<Cluster>(BeschaftigungCluster.class, "/items[at0004]", "angabenZurOrganisation", Cluster.class, this);

  public ListSelectAqlField<Cluster> ZUSATZLICHE_ANGABEN = new ListAqlFieldImp<Cluster>(BeschaftigungCluster.class, "/items[at0018]", "zusatzlicheAngaben", Cluster.class, this);

  private BeschaftigungClusterContainment() {
    super("openEHR-EHR-CLUSTER.occupation_record.v1");
  }

  public static BeschaftigungClusterContainment getInstance() {
    return new BeschaftigungClusterContainment();
  }
}
