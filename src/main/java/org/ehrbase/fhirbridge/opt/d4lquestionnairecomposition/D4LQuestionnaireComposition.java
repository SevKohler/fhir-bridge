package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition;

import com.nedap.archie.rm.generic.Participation;
import com.nedap.archie.rm.generic.PartyIdentified;
import com.nedap.archie.rm.generic.PartyProxy;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Choice;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Id;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.annotations.Template;
import org.ehrbase.client.openehrclient.VersionUid;
import org.ehrbase.fhirbridge.opt.Composition;
import org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition.D4LQuestionnaireOrgEhrbaseEhrEncodeWrappersSnakecase3ec2eceaAdHocUberschriftChoice;
import org.ehrbase.fhirbridge.opt.shareddefinition.CategoryDefiningcode;
import org.ehrbase.fhirbridge.opt.shareddefinition.Language;
import org.ehrbase.fhirbridge.opt.shareddefinition.SettingDefiningcode;
import org.ehrbase.fhirbridge.opt.shareddefinition.Territory;

@Entity
@Archetype("openEHR-EHR-COMPOSITION.self_monitoring.v0")
@Template("D4L_questionnaire")
public class D4LQuestionnaireComposition extends Composition {
  @Id
  private VersionUid versionUid;

  @Path("/context/end_time|value")
  private TemporalAccessor endTimeValue;

  @Path("/context/participations")
  private List<Participation> participations;

  @Path("/language")
  private Language language;

  @Path("/context/health_care_facility")
  private PartyIdentified healthCareFacility;

  @Path("/composer")
  private PartyProxy composer;

  @Path("/context/setting|defining_code")
  private SettingDefiningcode settingDefiningcode;

  @Path("/territory")
  private Territory territory;

  @Path("/context/location")
  private String location;

  @Path("/content[openEHR-EHR-SECTION.adhoc.v1]")
  @Choice
  private D4LQuestionnaireOrgEhrbaseEhrEncodeWrappersSnakecase3ec2eceaAdHocUberschriftChoice adHocUberschrift;

  @Path("/category|defining_code")
  private CategoryDefiningcode categoryDefiningcode;

  @Path("/context/start_time|value")
  private TemporalAccessor startTimeValue;

  public VersionUid getVersionUid() {
     return this.versionUid ;
  }

  public void setVersionUid(VersionUid versionUid) {
     this.versionUid = versionUid;
  }

  public void setEndTimeValue(TemporalAccessor endTimeValue) {
     this.endTimeValue = endTimeValue;
  }

  public TemporalAccessor getEndTimeValue() {
     return this.endTimeValue ;
  }

  public void setParticipations(List<Participation> participations) {
     this.participations = participations;
  }

  public List<Participation> getParticipations() {
     return this.participations ;
  }

  public void setLanguage(Language language) {
     this.language = language;
  }

  public Language getLanguage() {
     return this.language ;
  }

  public void setHealthCareFacility(PartyIdentified healthCareFacility) {
     this.healthCareFacility = healthCareFacility;
  }

  public PartyIdentified getHealthCareFacility() {
     return this.healthCareFacility ;
  }

  public void setComposer(PartyProxy composer) {
     this.composer = composer;
  }

  public PartyProxy getComposer() {
     return this.composer ;
  }

  public void setSettingDefiningcode(SettingDefiningcode settingDefiningcode) {
     this.settingDefiningcode = settingDefiningcode;
  }

  public SettingDefiningcode getSettingDefiningcode() {
     return this.settingDefiningcode ;
  }

  public void setTerritory(Territory territory) {
     this.territory = territory;
  }

  public Territory getTerritory() {
     return this.territory ;
  }

  public void setLocation(String location) {
     this.location = location;
  }

  public String getLocation() {
     return this.location ;
  }

  public void setAdHocUberschrift(
      D4LQuestionnaireOrgEhrbaseEhrEncodeWrappersSnakecase3ec2eceaAdHocUberschriftChoice adHocUberschrift) {
     this.adHocUberschrift = adHocUberschrift;
  }

  public D4LQuestionnaireOrgEhrbaseEhrEncodeWrappersSnakecase3ec2eceaAdHocUberschriftChoice getAdHocUberschrift(
      ) {
     return this.adHocUberschrift ;
  }

  public void setCategoryDefiningcode(CategoryDefiningcode categoryDefiningcode) {
     this.categoryDefiningcode = categoryDefiningcode;
  }

  public CategoryDefiningcode getCategoryDefiningcode() {
     return this.categoryDefiningcode ;
  }

  public void setStartTimeValue(TemporalAccessor startTimeValue) {
     this.startTimeValue = startTimeValue;
  }

  public TemporalAccessor getStartTimeValue() {
     return this.startTimeValue ;
  }
}
