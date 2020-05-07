package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition;

import com.nedap.archie.rm.generic.Participation;
import com.nedap.archie.rm.generic.PartyIdentified;
import com.nedap.archie.rm.generic.PartyProxy;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition.D4LQuestionnaireOrgEhrbaseEhrEncodeWrappersSnakecase3ec2eceaAdHocUberschriftChoice;
import org.ehrbase.fhirbridge.opt.shareddefinition.CategoryDefiningcode;
import org.ehrbase.fhirbridge.opt.shareddefinition.Language;
import org.ehrbase.fhirbridge.opt.shareddefinition.SettingDefiningcode;
import org.ehrbase.fhirbridge.opt.shareddefinition.Territory;

public class D4LQuestionnaireCompositionContainment extends Containment {
  public SelectAqlField<D4LQuestionnaireComposition> D4_L_QUESTIONNAIRE_COMPOSITION = new AqlFieldImp<D4LQuestionnaireComposition>(D4LQuestionnaireComposition.class, "", "D4LQuestionnaireComposition", D4LQuestionnaireComposition.class, this);

  public SelectAqlField<TemporalAccessor> END_TIME_VALUE = new AqlFieldImp<TemporalAccessor>(D4LQuestionnaireComposition.class, "/context/end_time|value", "endTimeValue", TemporalAccessor.class, this);

  public ListSelectAqlField<Participation> PARTICIPATIONS = new ListAqlFieldImp<Participation>(D4LQuestionnaireComposition.class, "/context/participations", "participations", Participation.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(D4LQuestionnaireComposition.class, "/language", "language", Language.class, this);

  public SelectAqlField<PartyIdentified> HEALTH_CARE_FACILITY = new AqlFieldImp<PartyIdentified>(D4LQuestionnaireComposition.class, "/context/health_care_facility", "healthCareFacility", PartyIdentified.class, this);

  public SelectAqlField<PartyProxy> COMPOSER = new AqlFieldImp<PartyProxy>(D4LQuestionnaireComposition.class, "/composer", "composer", PartyProxy.class, this);

  public SelectAqlField<SettingDefiningcode> SETTING_DEFININGCODE = new AqlFieldImp<SettingDefiningcode>(D4LQuestionnaireComposition.class, "/context/setting|defining_code", "settingDefiningcode", SettingDefiningcode.class, this);

  public SelectAqlField<Territory> TERRITORY = new AqlFieldImp<Territory>(D4LQuestionnaireComposition.class, "/territory", "territory", Territory.class, this);

  public SelectAqlField<String> LOCATION = new AqlFieldImp<String>(D4LQuestionnaireComposition.class, "/context/location", "location", String.class, this);

  public SelectAqlField<D4LQuestionnaireOrgEhrbaseEhrEncodeWrappersSnakecase3ec2eceaAdHocUberschriftChoice> AD_HOC_UBERSCHRIFT = new AqlFieldImp<D4LQuestionnaireOrgEhrbaseEhrEncodeWrappersSnakecase3ec2eceaAdHocUberschriftChoice>(D4LQuestionnaireComposition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]", "adHocUberschrift", D4LQuestionnaireOrgEhrbaseEhrEncodeWrappersSnakecase3ec2eceaAdHocUberschriftChoice.class, this);

  public SelectAqlField<CategoryDefiningcode> CATEGORY_DEFININGCODE = new AqlFieldImp<CategoryDefiningcode>(D4LQuestionnaireComposition.class, "/category|defining_code", "categoryDefiningcode", CategoryDefiningcode.class, this);

  public SelectAqlField<TemporalAccessor> START_TIME_VALUE = new AqlFieldImp<TemporalAccessor>(D4LQuestionnaireComposition.class, "/context/start_time|value", "startTimeValue", TemporalAccessor.class, this);

  private D4LQuestionnaireCompositionContainment() {
    super("openEHR-EHR-COMPOSITION.self_monitoring.v0");
  }

  public static D4LQuestionnaireCompositionContainment getInstance() {
    return new D4LQuestionnaireCompositionContainment();
  }
}
