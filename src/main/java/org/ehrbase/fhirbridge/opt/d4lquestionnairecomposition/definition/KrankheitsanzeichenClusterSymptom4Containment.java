package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.Boolean;
import java.lang.String;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;

public class KrankheitsanzeichenClusterSymptom4Containment extends Containment {
  public SelectAqlField<KrankheitsanzeichenClusterSymptom4> KRANKHEITSANZEICHEN_CLUSTER_SYMPTOM4 = new AqlFieldImp<KrankheitsanzeichenClusterSymptom4>(KrankheitsanzeichenClusterSymptom4.class, "", "KrankheitsanzeichenClusterSymptom4", KrankheitsanzeichenClusterSymptom4.class, this);

  public ListSelectAqlField<Cluster> KRANKHEITSANZEICHEN = new ListAqlFieldImp<Cluster>(KrankheitsanzeichenClusterSymptom4.class, "/items[at0063]", "krankheitsanzeichen", Cluster.class, this);

  public SelectAqlField<String> KRANKHEITSANZEICHENS_VALUE = new AqlFieldImp<String>(KrankheitsanzeichenClusterSymptom4.class, "/items[at0001]/value|value", "krankheitsanzeichensValue", String.class, this);

  public ListSelectAqlField<Cluster> SPEZIFISCHE_DETAILS = new ListAqlFieldImp<Cluster>(KrankheitsanzeichenClusterSymptom4.class, "/items[at0153]", "spezifischeDetails", Cluster.class, this);

  public SelectAqlField<Boolean> NICHT_SIGNIFIKANT_VALUE = new AqlFieldImp<Boolean>(KrankheitsanzeichenClusterSymptom4.class, "/items[at0035]/value|value", "nichtSignifikantValue", Boolean.class, this);

  public ListSelectAqlField<Cluster> VORANGEGANGENE_EPISODEN = new ListAqlFieldImp<Cluster>(KrankheitsanzeichenClusterSymptom4.class, "/items[at0146]", "vorangegangeneEpisoden", Cluster.class, this);

  public ListSelectAqlField<Cluster> SPEZIFISCHE_ANATOMISCHE_LOKALISATION = new ListAqlFieldImp<Cluster>(KrankheitsanzeichenClusterSymptom4.class, "/items[at0147]", "spezifischeAnatomischeLokalisation", Cluster.class, this);

  public SelectAqlField<String> NICHT_SIGNIFIKANT_VALUE_NAME = new AqlFieldImp<String>(KrankheitsanzeichenClusterSymptom4.class, "/items[at0035]/name|value", "nichtSignifikantValueName", String.class, this);

  private KrankheitsanzeichenClusterSymptom4Containment() {
    super("openEHR-EHR-CLUSTER.symptom_sign.v1");
  }

  public static KrankheitsanzeichenClusterSymptom4Containment getInstance() {
    return new KrankheitsanzeichenClusterSymptom4Containment();
  }
}
