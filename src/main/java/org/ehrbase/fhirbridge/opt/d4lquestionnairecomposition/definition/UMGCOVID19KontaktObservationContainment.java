package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import com.nedap.archie.rm.generic.PartyProxy;
import java.lang.Boolean;
import java.time.temporal.TemporalAccessor;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.fhirbridge.opt.shareddefinition.Language;

public class UMGCOVID19KontaktObservationContainment extends Containment {
  public SelectAqlField<UMGCOVID19KontaktObservation> U_M_G_C_O_V_ID19_KONTAKT_OBSERVATION = new AqlFieldImp<UMGCOVID19KontaktObservation>(UMGCOVID19KontaktObservation.class, "", "UMGCOVID19KontaktObservation", UMGCOVID19KontaktObservation.class, this);

  public SelectAqlField<TemporalAccessor> TIME_VALUE = new AqlFieldImp<TemporalAccessor>(UMGCOVID19KontaktObservation.class, "/data[at0001]/events[at0002]/time|value", "timeValue", TemporalAccessor.class, this);

  public SelectAqlField<Boolean> KONTAKT_ZUR_COVID19_PATIENT_VALUE = new AqlFieldImp<Boolean>(UMGCOVID19KontaktObservation.class, "/data[at0001]/events[at0002]/data[at0003]/items[at0007]/value|value", "kontaktZurCovid19PatientValue", Boolean.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(UMGCOVID19KontaktObservation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<TemporalAccessor> ORIGIN_VALUE = new AqlFieldImp<TemporalAccessor>(UMGCOVID19KontaktObservation.class, "/data[at0001]/origin|value", "originValue", TemporalAccessor.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(UMGCOVID19KontaktObservation.class, "/language", "language", Language.class, this);

  private UMGCOVID19KontaktObservationContainment() {
    super("openEHR-EHR-OBSERVATION.covid_19_kontakt.v0");
  }

  public static UMGCOVID19KontaktObservationContainment getInstance() {
    return new UMGCOVID19KontaktObservationContainment();
  }
}
