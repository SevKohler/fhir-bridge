package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import java.time.temporal.TemporalAccessor;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.fhirbridge.opt.shareddefinition.Language;

public class ZusammenfassungDerBeschaftigungEvaluationContainment extends Containment {
  public SelectAqlField<ZusammenfassungDerBeschaftigungEvaluation> ZUSAMMENFASSUNG_DER_BESCHAFTIGUNG_EVALUATION = new AqlFieldImp<ZusammenfassungDerBeschaftigungEvaluation>(ZusammenfassungDerBeschaftigungEvaluation.class, "", "ZusammenfassungDerBeschaftigungEvaluation", ZusammenfassungDerBeschaftigungEvaluation.class, this);

  public ListSelectAqlField<Cluster> BESCHAFTIGUNGSEPISODE = new ListAqlFieldImp<Cluster>(ZusammenfassungDerBeschaftigungEvaluation.class, "/data[at0001]/items[at0003]", "beschaftigungsepisode", Cluster.class, this);

  public SelectAqlField<TemporalAccessor> ZULETZT_AKTUALISIERT_VALUE = new AqlFieldImp<TemporalAccessor>(ZusammenfassungDerBeschaftigungEvaluation.class, "/protocol[at0007]/items[at0009]/value|value", "zuletztAktualisiertValue", TemporalAccessor.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(ZusammenfassungDerBeschaftigungEvaluation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(ZusammenfassungDerBeschaftigungEvaluation.class, "/language", "language", Language.class, this);

  public ListSelectAqlField<BeschaftigungCluster> BESCHAFTIGUNG = new ListAqlFieldImp<BeschaftigungCluster>(ZusammenfassungDerBeschaftigungEvaluation.class, "/data[at0001]/items[openEHR-EHR-CLUSTER.occupation_record.v1]", "beschaftigung", BeschaftigungCluster.class, this);

  public ListSelectAqlField<Cluster> ERWEITERUNG = new ListAqlFieldImp<Cluster>(ZusammenfassungDerBeschaftigungEvaluation.class, "/protocol[at0007]/items[at0008]", "erweiterung", Cluster.class, this);

  private ZusammenfassungDerBeschaftigungEvaluationContainment() {
    super("openEHR-EHR-EVALUATION.occupation_summary.v1");
  }

  public static ZusammenfassungDerBeschaftigungEvaluationContainment getInstance() {
    return new ZusammenfassungDerBeschaftigungEvaluationContainment();
  }
}
