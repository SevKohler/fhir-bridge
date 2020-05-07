package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import java.lang.String;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.fhirbridge.opt.shareddefinition.Language;

public class AusschlussSpezifischEvaluation2Containment extends Containment {
  public SelectAqlField<AusschlussSpezifischEvaluation2> AUSSCHLUSS_SPEZIFISCH_EVALUATION2 = new AqlFieldImp<AusschlussSpezifischEvaluation2>(AusschlussSpezifischEvaluation2.class, "", "AusschlussSpezifischEvaluation2", AusschlussSpezifischEvaluation2.class, this);

  public ListSelectAqlField<Cluster> ERWEITERUNG = new ListAqlFieldImp<Cluster>(AusschlussSpezifischEvaluation2.class, "/protocol[at0009]/items[at0011]", "erweiterung", Cluster.class, this);

  public SelectAqlField<String> AUSGESCHLOSSENE_KATEGORIE_VALUE = new AqlFieldImp<String>(AusschlussSpezifischEvaluation2.class, "/data[at0001]/items[at0003]/value|value", "ausgeschlosseneKategorieValue", String.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(AusschlussSpezifischEvaluation2.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<String> AUSSAGE_UBER_DEN_AUSSCHLUSS_VALUE = new AqlFieldImp<String>(AusschlussSpezifischEvaluation2.class, "/data[at0001]/items[at0002]/value|value", "aussageUberDenAusschlussValue", String.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(AusschlussSpezifischEvaluation2.class, "/language", "language", Language.class, this);

  public SelectAqlField<AusgeschlosseneKategorieDefiningcode> AUSGESCHLOSSENE_KATEGORIE_DEFININGCODE = new AqlFieldImp<AusgeschlosseneKategorieDefiningcode>(AusschlussSpezifischEvaluation2.class, "/data[at0001]/items[at0003]/name|defining_code", "ausgeschlosseneKategorieDefiningcode", AusgeschlosseneKategorieDefiningcode.class, this);

  private AusschlussSpezifischEvaluation2Containment() {
    super("openEHR-EHR-EVALUATION.exclusion_specific.v1");
  }

  public static AusschlussSpezifischEvaluation2Containment getInstance() {
    return new AusschlussSpezifischEvaluation2Containment();
  }
}
