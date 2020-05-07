package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import com.nedap.archie.rm.generic.PartyProxy;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.fhirbridge.opt.shareddefinition.Language;

public class AlterObservationContainment extends Containment {
  public SelectAqlField<AlterObservation> ALTER_OBSERVATION = new AqlFieldImp<AlterObservation>(AlterObservation.class, "", "AlterObservation", AlterObservation.class, this);

  public SelectAqlField<TemporalAccessor> TIME_VALUE = new AqlFieldImp<TemporalAccessor>(AlterObservation.class, "/data[at0001]/events[at0002]/time|value", "timeValue", TemporalAccessor.class, this);

  public SelectAqlField<String> KOMMENTAR_VALUE = new AqlFieldImp<String>(AlterObservation.class, "/data[at0001]/events[at0002]/data[at0003]/items[at0006]/value|value", "kommentarValue", String.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(AlterObservation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<TemporalAccessor> ORIGIN_VALUE = new AqlFieldImp<TemporalAccessor>(AlterObservation.class, "/data[at0001]/origin|value", "originValue", TemporalAccessor.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(AlterObservation.class, "/language", "language", Language.class, this);

  public SelectAqlField<String> KOMMENTAR_VALUE_TREE = new AqlFieldImp<String>(AlterObservation.class, "/data[at0001]/events[at0002]/data[at0003]/items[at0006]/name|value", "kommentarValueTree", String.class, this);

  private AlterObservationContainment() {
    super("openEHR-EHR-OBSERVATION.age.v0");
  }

  public static AlterObservationContainment getInstance() {
    return new AlterObservationContainment();
  }
}
