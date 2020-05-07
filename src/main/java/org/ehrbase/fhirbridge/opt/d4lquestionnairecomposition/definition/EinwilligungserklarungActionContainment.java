package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.fhirbridge.opt.shareddefinition.TransitionDefiningcode;

public class EinwilligungserklarungActionContainment extends Containment {
  public SelectAqlField<EinwilligungserklarungAction> EINWILLIGUNGSERKLARUNG_ACTION = new AqlFieldImp<EinwilligungserklarungAction>(EinwilligungserklarungAction.class, "", "EinwilligungserklarungAction", EinwilligungserklarungAction.class, this);

  public SelectAqlField<GeplantDefiningcode> GEPLANT_DEFININGCODE = new AqlFieldImp<GeplantDefiningcode>(EinwilligungserklarungAction.class, "/ism_transition[at0013]/careflow_step|defining_code", "geplantDefiningcode", GeplantDefiningcode.class, this);

  public SelectAqlField<TransitionDefiningcode> TRANSITION_DEFININGCODE = new AqlFieldImp<TransitionDefiningcode>(EinwilligungserklarungAction.class, "/ism_transition[at0015]/transition|defining_code", "transitionDefiningcode", TransitionDefiningcode.class, this);

  public SelectAqlField<org.ehrbase.fhirbridge.opt.shareddefinition.GeplantDefiningcode> GEPLANT_DEFININGCODE_CURRENT_STATE = new AqlFieldImp<org.ehrbase.fhirbridge.opt.shareddefinition.GeplantDefiningcode>(EinwilligungserklarungAction.class, "/ism_transition[at0013]/current_state|defining_code", "geplantDefiningcodeCurrentState", org.ehrbase.fhirbridge.opt.shareddefinition.GeplantDefiningcode.class, this);

  public SelectAqlField<org.ehrbase.fhirbridge.opt.shareddefinition.EinwilligungNichtErhaltenDefiningcode> EINWILLIGUNG_NICHT_ERHALTEN_DEFININGCODE = new AqlFieldImp<org.ehrbase.fhirbridge.opt.shareddefinition.EinwilligungNichtErhaltenDefiningcode>(EinwilligungserklarungAction.class, "/ism_transition[at0021]/current_state|defining_code", "einwilligungNichtErhaltenDefiningcode", org.ehrbase.fhirbridge.opt.shareddefinition.EinwilligungNichtErhaltenDefiningcode.class, this);

  public SelectAqlField<TransitionDefiningcode> TRANSITION_DEFININGCODE_TRANSITION = new AqlFieldImp<TransitionDefiningcode>(EinwilligungserklarungAction.class, "/ism_transition[at0013]/transition|defining_code", "transitionDefiningcodeTransition", TransitionDefiningcode.class, this);

  public SelectAqlField<TransitionDefiningcode> TRANSITION_DEFININGCODE_TRANSITION_ISM_TRANSITION_AT0017 = new AqlFieldImp<TransitionDefiningcode>(EinwilligungserklarungAction.class, "/ism_transition[at0017]/transition|defining_code", "transitionDefiningcodeTransitionIsmTransitionAt0017", TransitionDefiningcode.class, this);

  public SelectAqlField<org.ehrbase.fhirbridge.opt.shareddefinition.AbgesagtDefiningcode> ABGESAGT_DEFININGCODE = new AqlFieldImp<org.ehrbase.fhirbridge.opt.shareddefinition.AbgesagtDefiningcode>(EinwilligungserklarungAction.class, "/ism_transition[at0018]/current_state|defining_code", "abgesagtDefiningcode", org.ehrbase.fhirbridge.opt.shareddefinition.AbgesagtDefiningcode.class, this);

  public SelectAqlField<AbgesagtDefiningcode> ABGESAGT_DEFININGCODE_CAREFLOW_STEP = new AqlFieldImp<AbgesagtDefiningcode>(EinwilligungserklarungAction.class, "/ism_transition[at0018]/careflow_step|defining_code", "abgesagtDefiningcodeCareflowStep", AbgesagtDefiningcode.class, this);

  public SelectAqlField<TransitionDefiningcode> TRANSITION_DEFININGCODE_TRANSITION_ISM_TRANSITION_AT0016 = new AqlFieldImp<TransitionDefiningcode>(EinwilligungserklarungAction.class, "/ism_transition[at0016]/transition|defining_code", "transitionDefiningcodeTransitionIsmTransitionAt0016", TransitionDefiningcode.class, this);

  public SelectAqlField<TransitionDefiningcode> TRANSITION_DEFININGCODE_TRANSITION_ISM_TRANSITION_AT0027 = new AqlFieldImp<TransitionDefiningcode>(EinwilligungserklarungAction.class, "/ism_transition[at0027]/transition|defining_code", "transitionDefiningcodeTransitionIsmTransitionAt0027", TransitionDefiningcode.class, this);

  public ListSelectAqlField<Cluster> ANFORDERER_DER_EINWILLIGUNGSERKLARUNG = new ListAqlFieldImp<Cluster>(EinwilligungserklarungAction.class, "/protocol[at0024]/items[at0028]", "anfordererDerEinwilligungserklarung", Cluster.class, this);

  public SelectAqlField<org.ehrbase.fhirbridge.opt.shareddefinition.AbgeschlossenDefiningcode> ABGESCHLOSSEN_DEFININGCODE = new AqlFieldImp<org.ehrbase.fhirbridge.opt.shareddefinition.AbgeschlossenDefiningcode>(EinwilligungserklarungAction.class, "/ism_transition[at0022]/current_state|defining_code", "abgeschlossenDefiningcode", org.ehrbase.fhirbridge.opt.shareddefinition.AbgeschlossenDefiningcode.class, this);

  public SelectAqlField<String> BESCHREIBUNG_DER_EINWILLIGUNG_VALUE = new AqlFieldImp<String>(EinwilligungserklarungAction.class, "/description[at0001]/items[at0011]/value|value", "beschreibungDerEinwilligungValue", String.class, this);

  public SelectAqlField<TransitionDefiningcode> TRANSITION_DEFININGCODE_TRANSITION_ISM_TRANSITION_AT0014 = new AqlFieldImp<TransitionDefiningcode>(EinwilligungserklarungAction.class, "/ism_transition[at0014]/transition|defining_code", "transitionDefiningcodeTransitionIsmTransitionAt0014", TransitionDefiningcode.class, this);

  public SelectAqlField<AbgeschlossenDefiningcode> ABGESCHLOSSEN_DEFININGCODE_CAREFLOW_STEP = new AqlFieldImp<AbgeschlossenDefiningcode>(EinwilligungserklarungAction.class, "/ism_transition[at0022]/careflow_step|defining_code", "abgeschlossenDefiningcodeCareflowStep", AbgeschlossenDefiningcode.class, this);

  public ListSelectAqlField<EinwilligungserklarungAktivitatElement> AKTIVITAT = new ListAqlFieldImp<EinwilligungserklarungAktivitatElement>(EinwilligungserklarungAction.class, "/description[at0001]/items[at0002]", "aktivitat", EinwilligungserklarungAktivitatElement.class, this);

  public SelectAqlField<org.ehrbase.fhirbridge.opt.shareddefinition.EinwilligungWiderrufenDefiningcode> EINWILLIGUNG_WIDERRUFEN_DEFININGCODE = new AqlFieldImp<org.ehrbase.fhirbridge.opt.shareddefinition.EinwilligungWiderrufenDefiningcode>(EinwilligungserklarungAction.class, "/ism_transition[at0017]/current_state|defining_code", "einwilligungWiderrufenDefiningcode", org.ehrbase.fhirbridge.opt.shareddefinition.EinwilligungWiderrufenDefiningcode.class, this);

  public SelectAqlField<EinwilligungWiderrufenDefiningcode> EINWILLIGUNG_WIDERRUFEN_DEFININGCODE_CAREFLOW_STEP = new AqlFieldImp<EinwilligungWiderrufenDefiningcode>(EinwilligungserklarungAction.class, "/ism_transition[at0017]/careflow_step|defining_code", "einwilligungWiderrufenDefiningcodeCareflowStep", EinwilligungWiderrufenDefiningcode.class, this);

  public SelectAqlField<org.ehrbase.fhirbridge.opt.shareddefinition.EinwilligungVerweigertDefiningcode> EINWILLIGUNG_VERWEIGERT_DEFININGCODE = new AqlFieldImp<org.ehrbase.fhirbridge.opt.shareddefinition.EinwilligungVerweigertDefiningcode>(EinwilligungserklarungAction.class, "/ism_transition[at0016]/current_state|defining_code", "einwilligungVerweigertDefiningcode", org.ehrbase.fhirbridge.opt.shareddefinition.EinwilligungVerweigertDefiningcode.class, this);

  public SelectAqlField<EinwilligungVerweigertDefiningcode> EINWILLIGUNG_VERWEIGERT_DEFININGCODE_CAREFLOW_STEP = new AqlFieldImp<EinwilligungVerweigertDefiningcode>(EinwilligungserklarungAction.class, "/ism_transition[at0016]/careflow_step|defining_code", "einwilligungVerweigertDefiningcodeCareflowStep", EinwilligungVerweigertDefiningcode.class, this);

  public SelectAqlField<TransitionDefiningcode> TRANSITION_DEFININGCODE_TRANSITION_ISM_TRANSITION_AT0022 = new AqlFieldImp<TransitionDefiningcode>(EinwilligungserklarungAction.class, "/ism_transition[at0022]/transition|defining_code", "transitionDefiningcodeTransitionIsmTransitionAt0022", TransitionDefiningcode.class, this);

  public SelectAqlField<EinwilligungNichtErhaltenDefiningcode> EINWILLIGUNG_NICHT_ERHALTEN_DEFININGCODE_CAREFLOW_STEP = new AqlFieldImp<EinwilligungNichtErhaltenDefiningcode>(EinwilligungserklarungAction.class, "/ism_transition[at0021]/careflow_step|defining_code", "einwilligungNichtErhaltenDefiningcodeCareflowStep", EinwilligungNichtErhaltenDefiningcode.class, this);

  public SelectAqlField<TransitionDefiningcode> TRANSITION_DEFININGCODE_TRANSITION_ISM_TRANSITION_AT0021 = new AqlFieldImp<TransitionDefiningcode>(EinwilligungserklarungAction.class, "/ism_transition[at0021]/transition|defining_code", "transitionDefiningcodeTransitionIsmTransitionAt0021", TransitionDefiningcode.class, this);

  public ListSelectAqlField<AdresseCluster> ADRESSE = new ListAqlFieldImp<AdresseCluster>(EinwilligungserklarungAction.class, "/description[at0001]/items[openEHR-EHR-CLUSTER.address.v0]", "adresse", AdresseCluster.class, this);

  public SelectAqlField<EinwilligungErteiltDefiningcode> EINWILLIGUNG_ERTEILT_DEFININGCODE = new AqlFieldImp<EinwilligungErteiltDefiningcode>(EinwilligungserklarungAction.class, "/ism_transition[at0015]/careflow_step|defining_code", "einwilligungErteiltDefiningcode", EinwilligungErteiltDefiningcode.class, this);

  public SelectAqlField<org.ehrbase.fhirbridge.opt.shareddefinition.EinwilligungErteiltDefiningcode> EINWILLIGUNG_ERTEILT_DEFININGCODE_CURRENT_STATE = new AqlFieldImp<org.ehrbase.fhirbridge.opt.shareddefinition.EinwilligungErteiltDefiningcode>(EinwilligungserklarungAction.class, "/ism_transition[at0015]/current_state|defining_code", "einwilligungErteiltDefiningcodeCurrentState", org.ehrbase.fhirbridge.opt.shareddefinition.EinwilligungErteiltDefiningcode.class, this);

  public ListSelectAqlField<Cluster> EINWILLIGENDE_PERSON = new ListAqlFieldImp<Cluster>(EinwilligungserklarungAction.class, "/protocol[at0024]/items[at0029]", "einwilligendePerson", Cluster.class, this);

  public SelectAqlField<TemporalAccessor> TIME_VALUE = new AqlFieldImp<TemporalAccessor>(EinwilligungserklarungAction.class, "/time|value", "timeValue", TemporalAccessor.class, this);

  public SelectAqlField<org.ehrbase.fhirbridge.opt.shareddefinition.VerschobenDefiningcode> VERSCHOBEN_DEFININGCODE = new AqlFieldImp<org.ehrbase.fhirbridge.opt.shareddefinition.VerschobenDefiningcode>(EinwilligungserklarungAction.class, "/ism_transition[at0019]/current_state|defining_code", "verschobenDefiningcode", org.ehrbase.fhirbridge.opt.shareddefinition.VerschobenDefiningcode.class, this);

  public SelectAqlField<VerschobenDefiningcode> VERSCHOBEN_DEFININGCODE_CAREFLOW_STEP = new AqlFieldImp<VerschobenDefiningcode>(EinwilligungserklarungAction.class, "/ism_transition[at0019]/careflow_step|defining_code", "verschobenDefiningcodeCareflowStep", VerschobenDefiningcode.class, this);

  public SelectAqlField<org.ehrbase.fhirbridge.opt.shareddefinition.EinwilligungErbetenDefiningcode> EINWILLIGUNG_ERBETEN_DEFININGCODE = new AqlFieldImp<org.ehrbase.fhirbridge.opt.shareddefinition.EinwilligungErbetenDefiningcode>(EinwilligungserklarungAction.class, "/ism_transition[at0014]/current_state|defining_code", "einwilligungErbetenDefiningcode", org.ehrbase.fhirbridge.opt.shareddefinition.EinwilligungErbetenDefiningcode.class, this);

  public SelectAqlField<EinwilligungErbetenDefiningcode> EINWILLIGUNG_ERBETEN_DEFININGCODE_CAREFLOW_STEP = new AqlFieldImp<EinwilligungErbetenDefiningcode>(EinwilligungserklarungAction.class, "/ism_transition[at0014]/careflow_step|defining_code", "einwilligungErbetenDefiningcodeCareflowStep", EinwilligungErbetenDefiningcode.class, this);

  public SelectAqlField<TransitionDefiningcode> TRANSITION_DEFININGCODE_TRANSITION_ISM_TRANSITION_AT0019 = new AqlFieldImp<TransitionDefiningcode>(EinwilligungserklarungAction.class, "/ism_transition[at0019]/transition|defining_code", "transitionDefiningcodeTransitionIsmTransitionAt0019", TransitionDefiningcode.class, this);

  public SelectAqlField<TerminGeplantDefiningcode> TERMIN_GEPLANT_DEFININGCODE = new AqlFieldImp<TerminGeplantDefiningcode>(EinwilligungserklarungAction.class, "/ism_transition[at0027]/careflow_step|defining_code", "terminGeplantDefiningcode", TerminGeplantDefiningcode.class, this);

  public SelectAqlField<TransitionDefiningcode> TRANSITION_DEFININGCODE_TRANSITION_ISM_TRANSITION_AT0018 = new AqlFieldImp<TransitionDefiningcode>(EinwilligungserklarungAction.class, "/ism_transition[at0018]/transition|defining_code", "transitionDefiningcodeTransitionIsmTransitionAt0018", TransitionDefiningcode.class, this);

  public SelectAqlField<org.ehrbase.fhirbridge.opt.shareddefinition.TerminGeplantDefiningcode> TERMIN_GEPLANT_DEFININGCODE_CURRENT_STATE = new AqlFieldImp<org.ehrbase.fhirbridge.opt.shareddefinition.TerminGeplantDefiningcode>(EinwilligungserklarungAction.class, "/ism_transition[at0027]/current_state|defining_code", "terminGeplantDefiningcodeCurrentState", org.ehrbase.fhirbridge.opt.shareddefinition.TerminGeplantDefiningcode.class, this);

  private EinwilligungserklarungActionContainment() {
    super("openEHR-EHR-ACTION.informed_consent.v0");
  }

  public static EinwilligungserklarungActionContainment getInstance() {
    return new EinwilligungserklarungActionContainment();
  }
}
