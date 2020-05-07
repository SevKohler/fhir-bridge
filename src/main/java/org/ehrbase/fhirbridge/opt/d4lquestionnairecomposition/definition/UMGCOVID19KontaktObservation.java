package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import com.nedap.archie.rm.generic.PartyProxy;
import java.lang.Boolean;
import java.time.temporal.TemporalAccessor;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.fhirbridge.opt.shareddefinition.Language;

@Entity
@Archetype("openEHR-EHR-OBSERVATION.covid_19_kontakt.v0")
public class UMGCOVID19KontaktObservation {
  @Path("/data[at0001]/events[at0002]/time|value")
  private TemporalAccessor timeValue;

  @Path("/data[at0001]/events[at0002]/data[at0003]/items[at0007]/value|value")
  private Boolean kontaktZurCovid19PatientValue;

  @Path("/subject")
  private PartyProxy subject;

  @Path("/data[at0001]/origin|value")
  private TemporalAccessor originValue;

  @Path("/language")
  private Language language;

  public void setTimeValue(TemporalAccessor timeValue) {
     this.timeValue = timeValue;
  }

  public TemporalAccessor getTimeValue() {
     return this.timeValue ;
  }

  public void setKontaktZurCovid19PatientValue(Boolean kontaktZurCovid19PatientValue) {
     this.kontaktZurCovid19PatientValue = kontaktZurCovid19PatientValue;
  }

  public Boolean isKontaktZurCovid19PatientValue() {
     return this.kontaktZurCovid19PatientValue ;
  }

  public void setSubject(PartyProxy subject) {
     this.subject = subject;
  }

  public PartyProxy getSubject() {
     return this.subject ;
  }

  public void setOriginValue(TemporalAccessor originValue) {
     this.originValue = originValue;
  }

  public TemporalAccessor getOriginValue() {
     return this.originValue ;
  }

  public void setLanguage(Language language) {
     this.language = language;
  }

  public Language getLanguage() {
     return this.language ;
  }
}
