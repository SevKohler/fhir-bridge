package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.Boolean;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.fhirbridge.opt.shareddefinition.NachkontrolliertDefiningcode;
import org.ehrbase.fhirbridge.opt.shareddefinition.TransitionDefiningcode;

public class ArzneimittelverwaltungActionContainment extends Containment {
  public SelectAqlField<ArzneimittelverwaltungAction> ARZNEIMITTELVERWALTUNG_ACTION = new AqlFieldImp<ArzneimittelverwaltungAction>(ArzneimittelverwaltungAction.class, "", "ArzneimittelverwaltungAction", ArzneimittelverwaltungAction.class, this);

  public SelectAqlField<TransitionDefiningcode> TRANSITION_DEFININGCODE = new AqlFieldImp<TransitionDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0015]/transition|defining_code", "transitionDefiningcode", TransitionDefiningcode.class, this);

  public SelectAqlField<org.ehrbase.fhirbridge.opt.shareddefinition.MedikamentenbehanlungWurdeVerschobenDefiningcode> MEDIKAMENTENBEHANLUNG_WURDE_VERSCHOBEN_DEFININGCODE = new AqlFieldImp<org.ehrbase.fhirbridge.opt.shareddefinition.MedikamentenbehanlungWurdeVerschobenDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0013]/current_state|defining_code", "medikamentenbehanlungWurdeVerschobenDefiningcode", org.ehrbase.fhirbridge.opt.shareddefinition.MedikamentenbehanlungWurdeVerschobenDefiningcode.class, this);

  public SelectAqlField<org.ehrbase.fhirbridge.opt.shareddefinition.GroEreAnderungDerVerordnungDefiningcode> GRO_ERE_ANDERUNG_DER_VERORDNUNG_DEFININGCODE = new AqlFieldImp<org.ehrbase.fhirbridge.opt.shareddefinition.GroEreAnderungDerVerordnungDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0039]/current_state|defining_code", "groEreAnderungDerVerordnungDefiningcode", org.ehrbase.fhirbridge.opt.shareddefinition.GroEreAnderungDerVerordnungDefiningcode.class, this);

  public SelectAqlField<org.ehrbase.fhirbridge.opt.shareddefinition.RezeptWurdeWiderrufenDefiningcode> REZEPT_WURDE_WIDERRUFEN_DEFININGCODE = new AqlFieldImp<org.ehrbase.fhirbridge.opt.shareddefinition.RezeptWurdeWiderrufenDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0150]/current_state|defining_code", "rezeptWurdeWiderrufenDefiningcode", org.ehrbase.fhirbridge.opt.shareddefinition.RezeptWurdeWiderrufenDefiningcode.class, this);

  public SelectAqlField<ArzneimittelWurdeNeuBewertetDefiningcode> ARZNEIMITTEL_WURDE_NEU_BEWERTET_DEFININGCODE = new AqlFieldImp<ArzneimittelWurdeNeuBewertetDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0005]/careflow_step|defining_code", "arzneimittelWurdeNeuBewertetDefiningcode", ArzneimittelWurdeNeuBewertetDefiningcode.class, this);

  public SelectAqlField<TransitionDefiningcode> TRANSITION_DEFININGCODE_TRANSITION = new AqlFieldImp<TransitionDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0013]/transition|defining_code", "transitionDefiningcodeTransition", TransitionDefiningcode.class, this);

  public SelectAqlField<org.ehrbase.fhirbridge.opt.shareddefinition.VerabreichungEinerDosisWurdeAusgelassenDefiningcode> VERABREICHUNG_EINER_DOSIS_WURDE_AUSGELASSEN_DEFININGCODE = new AqlFieldImp<org.ehrbase.fhirbridge.opt.shareddefinition.VerabreichungEinerDosisWurdeAusgelassenDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0018]/current_state|defining_code", "verabreichungEinerDosisWurdeAusgelassenDefiningcode", org.ehrbase.fhirbridge.opt.shareddefinition.VerabreichungEinerDosisWurdeAusgelassenDefiningcode.class, this);

  public SelectAqlField<TransitionDefiningcode> TRANSITION_DEFININGCODE_TRANSITION_ISM_TRANSITION_AT0012 = new AqlFieldImp<TransitionDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0012]/transition|defining_code", "transitionDefiningcodeTransitionIsmTransitionAt0012", TransitionDefiningcode.class, this);

  public SelectAqlField<TransitionDefiningcode> TRANSITION_DEFININGCODE_TRANSITION_ISM_TRANSITION_AT0016 = new AqlFieldImp<TransitionDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0016]/transition|defining_code", "transitionDefiningcodeTransitionIsmTransitionAt0016", TransitionDefiningcode.class, this);

  public SelectAqlField<org.ehrbase.fhirbridge.opt.shareddefinition.VerabreichungWurdeAusgesetztDefiningcode> VERABREICHUNG_WURDE_AUSGESETZT_DEFININGCODE = new AqlFieldImp<org.ehrbase.fhirbridge.opt.shareddefinition.VerabreichungWurdeAusgesetztDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0009]/current_state|defining_code", "verabreichungWurdeAusgesetztDefiningcode", org.ehrbase.fhirbridge.opt.shareddefinition.VerabreichungWurdeAusgesetztDefiningcode.class, this);

  public SelectAqlField<TransitionDefiningcode> TRANSITION_DEFININGCODE_TRANSITION_ISM_TRANSITION_AT0150 = new AqlFieldImp<TransitionDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0150]/transition|defining_code", "transitionDefiningcodeTransitionIsmTransitionAt0150", TransitionDefiningcode.class, this);

  public SelectAqlField<TransitionDefiningcode> TRANSITION_DEFININGCODE_TRANSITION_ISM_TRANSITION_AT0151 = new AqlFieldImp<TransitionDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0151]/transition|defining_code", "transitionDefiningcodeTransitionIsmTransitionAt0151", TransitionDefiningcode.class, this);

  public SelectAqlField<Cluster> ARZNEIMITTELDETAILS = new AqlFieldImp<Cluster>(ArzneimittelverwaltungAction.class, "/description[at0017]/items[at0104]", "arzneimitteldetails", Cluster.class, this);

  public SelectAqlField<ArzneimittelbehanlungWurdeAbgesagtDefiningcode> ARZNEIMITTELBEHANLUNG_WURDE_ABGESAGT_DEFININGCODE = new AqlFieldImp<ArzneimittelbehanlungWurdeAbgesagtDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0012]/careflow_step|defining_code", "arzneimittelbehanlungWurdeAbgesagtDefiningcode", ArzneimittelbehanlungWurdeAbgesagtDefiningcode.class, this);

  public SelectAqlField<NachkontrolliertDefiningcode> NACHKONTROLLIERT_DEFININGCODE = new AqlFieldImp<NachkontrolliertDefiningcode>(ArzneimittelverwaltungAction.class, "/description[at0017]/items[at0149]/null_flavour|defining_code", "nachkontrolliertDefiningcode", NachkontrolliertDefiningcode.class, this);

  public ListSelectAqlField<Cluster> ERWEITERUNG = new ListAqlFieldImp<Cluster>(ArzneimittelverwaltungAction.class, "/protocol[at0030]/items[at0085]", "erweiterung", Cluster.class, this);

  public SelectAqlField<RezeptWartetAufGenehmigungDefiningcode> REZEPT_WARTET_AUF_GENEHMIGUNG_DEFININGCODE = new AqlFieldImp<RezeptWartetAufGenehmigungDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0145]/careflow_step|defining_code", "rezeptWartetAufGenehmigungDefiningcode", RezeptWartetAufGenehmigungDefiningcode.class, this);

  public SelectAqlField<org.ehrbase.fhirbridge.opt.shareddefinition.ArzneimittelbehandlungHatBegonnenDefiningcode> ARZNEIMITTELBEHANDLUNG_HAT_BEGONNEN_DEFININGCODE = new AqlFieldImp<org.ehrbase.fhirbridge.opt.shareddefinition.ArzneimittelbehandlungHatBegonnenDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0004]/current_state|defining_code", "arzneimittelbehandlungHatBegonnenDefiningcode", org.ehrbase.fhirbridge.opt.shareddefinition.ArzneimittelbehandlungHatBegonnenDefiningcode.class, this);

  public SelectAqlField<org.ehrbase.fhirbridge.opt.shareddefinition.VoraussetzungDefiningcode> VORAUSSETZUNG_DEFININGCODE = new AqlFieldImp<org.ehrbase.fhirbridge.opt.shareddefinition.VoraussetzungDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0016]/current_state|defining_code", "voraussetzungDefiningcode", org.ehrbase.fhirbridge.opt.shareddefinition.VoraussetzungDefiningcode.class, this);

  public SelectAqlField<TransitionDefiningcode> TRANSITION_DEFININGCODE_TRANSITION_ISM_TRANSITION_AT0011 = new AqlFieldImp<TransitionDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0011]/transition|defining_code", "transitionDefiningcodeTransitionIsmTransitionAt0011", TransitionDefiningcode.class, this);

  public SelectAqlField<TransitionDefiningcode> TRANSITION_DEFININGCODE_TRANSITION_ISM_TRANSITION_AT0109 = new AqlFieldImp<TransitionDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0109]/transition|defining_code", "transitionDefiningcodeTransitionIsmTransitionAt0109", TransitionDefiningcode.class, this);

  public SelectAqlField<VerzogerungDerRezeptabgabeDefiningcode> VERZOGERUNG_DER_REZEPTABGABE_DEFININGCODE = new AqlFieldImp<VerzogerungDerRezeptabgabeDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0008]/careflow_step|defining_code", "verzogerungDerRezeptabgabeDefiningcode", VerzogerungDerRezeptabgabeDefiningcode.class, this);

  public SelectAqlField<TransitionDefiningcode> TRANSITION_DEFININGCODE_TRANSITION_ISM_TRANSITION_AT0010 = new AqlFieldImp<TransitionDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0010]/transition|defining_code", "transitionDefiningcodeTransitionIsmTransitionAt0010", TransitionDefiningcode.class, this);

  public SelectAqlField<org.ehrbase.fhirbridge.opt.shareddefinition.RezeptIstReAutorisiertDefiningcode> REZEPT_IST_RE_AUTORISIERT_DEFININGCODE = new AqlFieldImp<org.ehrbase.fhirbridge.opt.shareddefinition.RezeptIstReAutorisiertDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0106]/current_state|defining_code", "rezeptIstReAutorisiertDefiningcode", org.ehrbase.fhirbridge.opt.shareddefinition.RezeptIstReAutorisiertDefiningcode.class, this);

  public SelectAqlField<ArzneimittelbehandlungIstAbgeschlossenDefiningcode> ARZNEIMITTELBEHANDLUNG_IST_ABGESCHLOSSEN_DEFININGCODE = new AqlFieldImp<ArzneimittelbehandlungIstAbgeschlossenDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0007]/careflow_step|defining_code", "arzneimittelbehandlungIstAbgeschlossenDefiningcode", ArzneimittelbehandlungIstAbgeschlossenDefiningcode.class, this);

  public SelectAqlField<org.ehrbase.fhirbridge.opt.shareddefinition.RezeptAusgestelltDefiningcode> REZEPT_AUSGESTELLT_DEFININGCODE = new AqlFieldImp<org.ehrbase.fhirbridge.opt.shareddefinition.RezeptAusgestelltDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0002]/current_state|defining_code", "rezeptAusgestelltDefiningcode", org.ehrbase.fhirbridge.opt.shareddefinition.RezeptAusgestelltDefiningcode.class, this);

  public SelectAqlField<ReAutorisierugDesRezeptsAusstehendDefiningcode> RE_AUTORISIERUG_DES_REZEPTS_AUSSTEHEND_DEFININGCODE = new AqlFieldImp<ReAutorisierugDesRezeptsAusstehendDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0011]/careflow_step|defining_code", "reAutorisierugDesRezeptsAusstehendDefiningcode", ReAutorisierugDesRezeptsAusstehendDefiningcode.class, this);

  public SelectAqlField<GeringfugigeAnderungDerVerordnungDefiningcode> GERINGFUGIGE_ANDERUNG_DER_VERORDNUNG_DEFININGCODE = new AqlFieldImp<GeringfugigeAnderungDerVerordnungDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0041]/careflow_step|defining_code", "geringfugigeAnderungDerVerordnungDefiningcode", GeringfugigeAnderungDerVerordnungDefiningcode.class, this);

  public SelectAqlField<org.ehrbase.fhirbridge.opt.shareddefinition.ArzneimittelbehandlungGestopptDefiningcode> ARZNEIMITTELBEHANDLUNG_GESTOPPT_DEFININGCODE = new AqlFieldImp<org.ehrbase.fhirbridge.opt.shareddefinition.ArzneimittelbehandlungGestopptDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0015]/current_state|defining_code", "arzneimittelbehandlungGestopptDefiningcode", org.ehrbase.fhirbridge.opt.shareddefinition.ArzneimittelbehandlungGestopptDefiningcode.class, this);

  public SelectAqlField<org.ehrbase.fhirbridge.opt.shareddefinition.ArzneimittelWurdeGenehmigtDefiningcode> ARZNEIMITTEL_WURDE_GENEHMIGT_DEFININGCODE = new AqlFieldImp<org.ehrbase.fhirbridge.opt.shareddefinition.ArzneimittelWurdeGenehmigtDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0153]/current_state|defining_code", "arzneimittelWurdeGenehmigtDefiningcode", org.ehrbase.fhirbridge.opt.shareddefinition.ArzneimittelWurdeGenehmigtDefiningcode.class, this);

  public SelectAqlField<TemporalAccessor> TIME_VALUE = new AqlFieldImp<TemporalAccessor>(ArzneimittelverwaltungAction.class, "/time|value", "timeValue", TemporalAccessor.class, this);

  public SelectAqlField<org.ehrbase.fhirbridge.opt.shareddefinition.RezeptIstUngultigOderAbgelaufenDefiningcode> REZEPT_IST_UNGULTIG_ODER_ABGELAUFEN_DEFININGCODE = new AqlFieldImp<org.ehrbase.fhirbridge.opt.shareddefinition.RezeptIstUngultigOderAbgelaufenDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0151]/current_state|defining_code", "rezeptIstUngultigOderAbgelaufenDefiningcode", org.ehrbase.fhirbridge.opt.shareddefinition.RezeptIstUngultigOderAbgelaufenDefiningcode.class, this);

  public SelectAqlField<DosisWurdeVerabreichtDefiningcode> DOSIS_WURDE_VERABREICHT_DEFININGCODE = new AqlFieldImp<DosisWurdeVerabreichtDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0006]/careflow_step|defining_code", "dosisWurdeVerabreichtDefiningcode", DosisWurdeVerabreichtDefiningcode.class, this);

  public SelectAqlField<org.ehrbase.fhirbridge.opt.shareddefinition.VerabreichungEinerDosisWurdeVerschobenDefiningcode> VERABREICHUNG_EINER_DOSIS_WURDE_VERSCHOBEN_DEFININGCODE = new AqlFieldImp<org.ehrbase.fhirbridge.opt.shareddefinition.VerabreichungEinerDosisWurdeVerschobenDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0044]/current_state|defining_code", "verabreichungEinerDosisWurdeVerschobenDefiningcode", org.ehrbase.fhirbridge.opt.shareddefinition.VerabreichungEinerDosisWurdeVerschobenDefiningcode.class, this);

  public SelectAqlField<String> ARZNEIMITTEL_VALUE = new AqlFieldImp<String>(ArzneimittelverwaltungAction.class, "/description[at0017]/items[at0020]/value|value", "arzneimittelValue", String.class, this);

  public SelectAqlField<org.ehrbase.fhirbridge.opt.shareddefinition.ArzneimittelWurdeVorbereitetDefiningcode> ARZNEIMITTEL_WURDE_VORBEREITET_DEFININGCODE = new AqlFieldImp<org.ehrbase.fhirbridge.opt.shareddefinition.ArzneimittelWurdeVorbereitetDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0148]/current_state|defining_code", "arzneimittelWurdeVorbereitetDefiningcode", org.ehrbase.fhirbridge.opt.shareddefinition.ArzneimittelWurdeVorbereitetDefiningcode.class, this);

  public SelectAqlField<Cluster> DOSIS = new AqlFieldImp<Cluster>(ArzneimittelverwaltungAction.class, "/description[at0017]/items[at0131]", "dosis", Cluster.class, this);

  public SelectAqlField<RezeptNeuAusgestelltDefiningcode> REZEPT_NEU_AUSGESTELLT_DEFININGCODE = new AqlFieldImp<RezeptNeuAusgestelltDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0010]/careflow_step|defining_code", "rezeptNeuAusgestelltDefiningcode", RezeptNeuAusgestelltDefiningcode.class, this);

  public SelectAqlField<org.ehrbase.fhirbridge.opt.shareddefinition.RezeptWurdeAusgefuhrtDefiningcode> REZEPT_WURDE_AUSGEFUHRT_DEFININGCODE = new AqlFieldImp<org.ehrbase.fhirbridge.opt.shareddefinition.RezeptWurdeAusgefuhrtDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0152]/current_state|defining_code", "rezeptWurdeAusgefuhrtDefiningcode", org.ehrbase.fhirbridge.opt.shareddefinition.RezeptWurdeAusgefuhrtDefiningcode.class, this);

  public SelectAqlField<EmpfohleneArzneimittelDefiningcode> EMPFOHLENE_ARZNEIMITTEL_DEFININGCODE = new AqlFieldImp<EmpfohleneArzneimittelDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0109]/careflow_step|defining_code", "empfohleneArzneimittelDefiningcode", EmpfohleneArzneimittelDefiningcode.class, this);

  public SelectAqlField<MedikamentenbehanlungWurdeVerschobenDefiningcode> MEDIKAMENTENBEHANLUNG_WURDE_VERSCHOBEN_DEFININGCODE_CAREFLOW_STEP = new AqlFieldImp<MedikamentenbehanlungWurdeVerschobenDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0013]/careflow_step|defining_code", "medikamentenbehanlungWurdeVerschobenDefiningcodeCareflowStep", MedikamentenbehanlungWurdeVerschobenDefiningcode.class, this);

  public SelectAqlField<TransitionDefiningcode> TRANSITION_DEFININGCODE_TRANSITION_ISM_TRANSITION_AT0004 = new AqlFieldImp<TransitionDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0004]/transition|defining_code", "transitionDefiningcodeTransitionIsmTransitionAt0004", TransitionDefiningcode.class, this);

  public SelectAqlField<TransitionDefiningcode> TRANSITION_DEFININGCODE_TRANSITION_ISM_TRANSITION_AT0005 = new AqlFieldImp<TransitionDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0005]/transition|defining_code", "transitionDefiningcodeTransitionIsmTransitionAt0005", TransitionDefiningcode.class, this);

  public SelectAqlField<org.ehrbase.fhirbridge.opt.shareddefinition.ArzneimittelWurdeNeuBewertetDefiningcode> ARZNEIMITTEL_WURDE_NEU_BEWERTET_DEFININGCODE_CURRENT_STATE = new AqlFieldImp<org.ehrbase.fhirbridge.opt.shareddefinition.ArzneimittelWurdeNeuBewertetDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0005]/current_state|defining_code", "arzneimittelWurdeNeuBewertetDefiningcodeCurrentState", org.ehrbase.fhirbridge.opt.shareddefinition.ArzneimittelWurdeNeuBewertetDefiningcode.class, this);

  public SelectAqlField<TransitionDefiningcode> TRANSITION_DEFININGCODE_TRANSITION_ISM_TRANSITION_AT0002 = new AqlFieldImp<TransitionDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0002]/transition|defining_code", "transitionDefiningcodeTransitionIsmTransitionAt0002", TransitionDefiningcode.class, this);

  public SelectAqlField<TransitionDefiningcode> TRANSITION_DEFININGCODE_TRANSITION_ISM_TRANSITION_AT0006 = new AqlFieldImp<TransitionDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0006]/transition|defining_code", "transitionDefiningcodeTransitionIsmTransitionAt0006", TransitionDefiningcode.class, this);

  public SelectAqlField<VerabreichungEinerDosisWurdeAusgelassenDefiningcode> VERABREICHUNG_EINER_DOSIS_WURDE_AUSGELASSEN_DEFININGCODE_CAREFLOW_STEP = new AqlFieldImp<VerabreichungEinerDosisWurdeAusgelassenDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0018]/careflow_step|defining_code", "verabreichungEinerDosisWurdeAusgelassenDefiningcodeCareflowStep", VerabreichungEinerDosisWurdeAusgelassenDefiningcode.class, this);

  public SelectAqlField<VerabreichungWurdeAusgesetztDefiningcode> VERABREICHUNG_WURDE_AUSGESETZT_DEFININGCODE_CAREFLOW_STEP = new AqlFieldImp<VerabreichungWurdeAusgesetztDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0009]/careflow_step|defining_code", "verabreichungWurdeAusgesetztDefiningcodeCareflowStep", VerabreichungWurdeAusgesetztDefiningcode.class, this);

  public SelectAqlField<TransitionDefiningcode> TRANSITION_DEFININGCODE_TRANSITION_ISM_TRANSITION_AT0003 = new AqlFieldImp<TransitionDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0003]/transition|defining_code", "transitionDefiningcodeTransitionIsmTransitionAt0003", TransitionDefiningcode.class, this);

  public SelectAqlField<GroEreAnderungDerVerordnungDefiningcode> GRO_ERE_ANDERUNG_DER_VERORDNUNG_DEFININGCODE_CAREFLOW_STEP = new AqlFieldImp<GroEreAnderungDerVerordnungDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0039]/careflow_step|defining_code", "groEreAnderungDerVerordnungDefiningcodeCareflowStep", GroEreAnderungDerVerordnungDefiningcode.class, this);

  public SelectAqlField<org.ehrbase.fhirbridge.opt.shareddefinition.RezeptWartetAufGenehmigungDefiningcode> REZEPT_WARTET_AUF_GENEHMIGUNG_DEFININGCODE_CURRENT_STATE = new AqlFieldImp<org.ehrbase.fhirbridge.opt.shareddefinition.RezeptWartetAufGenehmigungDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0145]/current_state|defining_code", "rezeptWartetAufGenehmigungDefiningcodeCurrentState", org.ehrbase.fhirbridge.opt.shareddefinition.RezeptWartetAufGenehmigungDefiningcode.class, this);

  public SelectAqlField<TransitionDefiningcode> TRANSITION_DEFININGCODE_TRANSITION_ISM_TRANSITION_AT0041 = new AqlFieldImp<TransitionDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0041]/transition|defining_code", "transitionDefiningcodeTransitionIsmTransitionAt0041", TransitionDefiningcode.class, this);

  public SelectAqlField<org.ehrbase.fhirbridge.opt.shareddefinition.EingelostDefiningcode> EINGELOST_DEFININGCODE = new AqlFieldImp<org.ehrbase.fhirbridge.opt.shareddefinition.EingelostDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0003]/current_state|defining_code", "eingelostDefiningcode", org.ehrbase.fhirbridge.opt.shareddefinition.EingelostDefiningcode.class, this);

  public SelectAqlField<VoraussetzungDefiningcode> VORAUSSETZUNG_DEFININGCODE_ARZNEIMITTEL_STARTDATUM = new AqlFieldImp<VoraussetzungDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0016]/careflow_step|defining_code", "voraussetzungDefiningcodeArzneimittelStartdatum", VoraussetzungDefiningcode.class, this);

  public SelectAqlField<ArzneimittelbehandlungHatBegonnenDefiningcode> ARZNEIMITTELBEHANDLUNG_HAT_BEGONNEN_DEFININGCODE_CAREFLOW_STEP = new AqlFieldImp<ArzneimittelbehandlungHatBegonnenDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0004]/careflow_step|defining_code", "arzneimittelbehandlungHatBegonnenDefiningcodeCareflowStep", ArzneimittelbehandlungHatBegonnenDefiningcode.class, this);

  public SelectAqlField<TransitionDefiningcode> TRANSITION_DEFININGCODE_TRANSITION_ISM_TRANSITION_AT0044 = new AqlFieldImp<TransitionDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0044]/transition|defining_code", "transitionDefiningcodeTransitionIsmTransitionAt0044", TransitionDefiningcode.class, this);

  public SelectAqlField<org.ehrbase.fhirbridge.opt.shareddefinition.VerzogerungDerRezeptabgabeDefiningcode> VERZOGERUNG_DER_REZEPTABGABE_DEFININGCODE_CURRENT_STATE = new AqlFieldImp<org.ehrbase.fhirbridge.opt.shareddefinition.VerzogerungDerRezeptabgabeDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0008]/current_state|defining_code", "verzogerungDerRezeptabgabeDefiningcodeCurrentState", org.ehrbase.fhirbridge.opt.shareddefinition.VerzogerungDerRezeptabgabeDefiningcode.class, this);

  public SelectAqlField<org.ehrbase.fhirbridge.opt.shareddefinition.ArzneimittelbehanlungWurdeAbgesagtDefiningcode> ARZNEIMITTELBEHANLUNG_WURDE_ABGESAGT_DEFININGCODE_CURRENT_STATE = new AqlFieldImp<org.ehrbase.fhirbridge.opt.shareddefinition.ArzneimittelbehanlungWurdeAbgesagtDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0012]/current_state|defining_code", "arzneimittelbehanlungWurdeAbgesagtDefiningcodeCurrentState", org.ehrbase.fhirbridge.opt.shareddefinition.ArzneimittelbehanlungWurdeAbgesagtDefiningcode.class, this);

  public SelectAqlField<RezeptWurdeWiderrufenDefiningcode> REZEPT_WURDE_WIDERRUFEN_DEFININGCODE_CAREFLOW_STEP = new AqlFieldImp<RezeptWurdeWiderrufenDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0150]/careflow_step|defining_code", "rezeptWurdeWiderrufenDefiningcodeCareflowStep", RezeptWurdeWiderrufenDefiningcode.class, this);

  public SelectAqlField<RezeptIstReAutorisiertDefiningcode> REZEPT_IST_RE_AUTORISIERT_DEFININGCODE_CAREFLOW_STEP = new AqlFieldImp<RezeptIstReAutorisiertDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0106]/careflow_step|defining_code", "rezeptIstReAutorisiertDefiningcodeCareflowStep", RezeptIstReAutorisiertDefiningcode.class, this);

  public SelectAqlField<org.ehrbase.fhirbridge.opt.shareddefinition.ArzneimittelbehandlungIstAbgeschlossenDefiningcode> ARZNEIMITTELBEHANDLUNG_IST_ABGESCHLOSSEN_DEFININGCODE_CURRENT_STATE = new AqlFieldImp<org.ehrbase.fhirbridge.opt.shareddefinition.ArzneimittelbehandlungIstAbgeschlossenDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0007]/current_state|defining_code", "arzneimittelbehandlungIstAbgeschlossenDefiningcodeCurrentState", org.ehrbase.fhirbridge.opt.shareddefinition.ArzneimittelbehandlungIstAbgeschlossenDefiningcode.class, this);

  public SelectAqlField<RezeptAusgestelltDefiningcode> REZEPT_AUSGESTELLT_DEFININGCODE_CAREFLOW_STEP = new AqlFieldImp<RezeptAusgestelltDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0002]/careflow_step|defining_code", "rezeptAusgestelltDefiningcodeCareflowStep", RezeptAusgestelltDefiningcode.class, this);

  public SelectAqlField<TransitionDefiningcode> TRANSITION_DEFININGCODE_TRANSITION_ISM_TRANSITION_AT0106 = new AqlFieldImp<TransitionDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0106]/transition|defining_code", "transitionDefiningcodeTransitionIsmTransitionAt0106", TransitionDefiningcode.class, this);

  public SelectAqlField<ArzneimittelbehandlungGestopptDefiningcode> ARZNEIMITTELBEHANDLUNG_GESTOPPT_DEFININGCODE_CAREFLOW_STEP = new AqlFieldImp<ArzneimittelbehandlungGestopptDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0015]/careflow_step|defining_code", "arzneimittelbehandlungGestopptDefiningcodeCareflowStep", ArzneimittelbehandlungGestopptDefiningcode.class, this);

  public ListSelectAqlField<Cluster> ZUSATZLICHE_DETAILS = new ListAqlFieldImp<Cluster>(ArzneimittelverwaltungAction.class, "/description[at0017]/items[at0053]", "zusatzlicheDetails", Cluster.class, this);

  public SelectAqlField<EingelostDefiningcode> EINGELOST_DEFININGCODE_REZEPT_WURDE_AUSGEGEBEN = new AqlFieldImp<EingelostDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0003]/careflow_step|defining_code", "eingelostDefiningcodeRezeptWurdeAusgegeben", EingelostDefiningcode.class, this);

  public SelectAqlField<org.ehrbase.fhirbridge.opt.shareddefinition.GeringfugigeAnderungDerVerordnungDefiningcode> GERINGFUGIGE_ANDERUNG_DER_VERORDNUNG_DEFININGCODE_CURRENT_STATE = new AqlFieldImp<org.ehrbase.fhirbridge.opt.shareddefinition.GeringfugigeAnderungDerVerordnungDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0041]/current_state|defining_code", "geringfugigeAnderungDerVerordnungDefiningcodeCurrentState", org.ehrbase.fhirbridge.opt.shareddefinition.GeringfugigeAnderungDerVerordnungDefiningcode.class, this);

  public SelectAqlField<TransitionDefiningcode> TRANSITION_DEFININGCODE_TRANSITION_ISM_TRANSITION_AT0148 = new AqlFieldImp<TransitionDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0148]/transition|defining_code", "transitionDefiningcodeTransitionIsmTransitionAt0148", TransitionDefiningcode.class, this);

  public SelectAqlField<ArzneimittelWurdeGenehmigtDefiningcode> ARZNEIMITTEL_WURDE_GENEHMIGT_DEFININGCODE_CAREFLOW_STEP = new AqlFieldImp<ArzneimittelWurdeGenehmigtDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0153]/careflow_step|defining_code", "arzneimittelWurdeGenehmigtDefiningcodeCareflowStep", ArzneimittelWurdeGenehmigtDefiningcode.class, this);

  public SelectAqlField<org.ehrbase.fhirbridge.opt.shareddefinition.ReAutorisierugDesRezeptsAusstehendDefiningcode> RE_AUTORISIERUG_DES_REZEPTS_AUSSTEHEND_DEFININGCODE_CURRENT_STATE = new AqlFieldImp<org.ehrbase.fhirbridge.opt.shareddefinition.ReAutorisierugDesRezeptsAusstehendDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0011]/current_state|defining_code", "reAutorisierugDesRezeptsAusstehendDefiningcodeCurrentState", org.ehrbase.fhirbridge.opt.shareddefinition.ReAutorisierugDesRezeptsAusstehendDefiningcode.class, this);

  public SelectAqlField<RezeptIstUngultigOderAbgelaufenDefiningcode> REZEPT_IST_UNGULTIG_ODER_ABGELAUFEN_DEFININGCODE_CAREFLOW_STEP = new AqlFieldImp<RezeptIstUngultigOderAbgelaufenDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0151]/careflow_step|defining_code", "rezeptIstUngultigOderAbgelaufenDefiningcodeCareflowStep", RezeptIstUngultigOderAbgelaufenDefiningcode.class, this);

  public SelectAqlField<TransitionDefiningcode> TRANSITION_DEFININGCODE_TRANSITION_ISM_TRANSITION_AT0153 = new AqlFieldImp<TransitionDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0153]/transition|defining_code", "transitionDefiningcodeTransitionIsmTransitionAt0153", TransitionDefiningcode.class, this);

  public SelectAqlField<org.ehrbase.fhirbridge.opt.shareddefinition.DosisWurdeVerabreichtDefiningcode> DOSIS_WURDE_VERABREICHT_DEFININGCODE_CURRENT_STATE = new AqlFieldImp<org.ehrbase.fhirbridge.opt.shareddefinition.DosisWurdeVerabreichtDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0006]/current_state|defining_code", "dosisWurdeVerabreichtDefiningcodeCurrentState", org.ehrbase.fhirbridge.opt.shareddefinition.DosisWurdeVerabreichtDefiningcode.class, this);

  public SelectAqlField<TransitionDefiningcode> TRANSITION_DEFININGCODE_TRANSITION_ISM_TRANSITION_AT0152 = new AqlFieldImp<TransitionDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0152]/transition|defining_code", "transitionDefiningcodeTransitionIsmTransitionAt0152", TransitionDefiningcode.class, this);

  public SelectAqlField<ArzneimittelWurdeVorbereitetDefiningcode> ARZNEIMITTEL_WURDE_VORBEREITET_DEFININGCODE_CAREFLOW_STEP = new AqlFieldImp<ArzneimittelWurdeVorbereitetDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0148]/careflow_step|defining_code", "arzneimittelWurdeVorbereitetDefiningcodeCareflowStep", ArzneimittelWurdeVorbereitetDefiningcode.class, this);

  public SelectAqlField<VerabreichungEinerDosisWurdeVerschobenDefiningcode> VERABREICHUNG_EINER_DOSIS_WURDE_VERSCHOBEN_DEFININGCODE_CAREFLOW_STEP = new AqlFieldImp<VerabreichungEinerDosisWurdeVerschobenDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0044]/careflow_step|defining_code", "verabreichungEinerDosisWurdeVerschobenDefiningcodeCareflowStep", VerabreichungEinerDosisWurdeVerschobenDefiningcode.class, this);

  public SelectAqlField<Boolean> NACHKONTROLLIERT_VALUE = new AqlFieldImp<Boolean>(ArzneimittelverwaltungAction.class, "/description[at0017]/items[at0149]/value|value", "nachkontrolliertValue", Boolean.class, this);

  public SelectAqlField<TransitionDefiningcode> TRANSITION_DEFININGCODE_TRANSITION_ISM_TRANSITION_AT0008 = new AqlFieldImp<TransitionDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0008]/transition|defining_code", "transitionDefiningcodeTransitionIsmTransitionAt0008", TransitionDefiningcode.class, this);

  public SelectAqlField<TransitionDefiningcode> TRANSITION_DEFININGCODE_TRANSITION_ISM_TRANSITION_AT0009 = new AqlFieldImp<TransitionDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0009]/transition|defining_code", "transitionDefiningcodeTransitionIsmTransitionAt0009", TransitionDefiningcode.class, this);

  public SelectAqlField<org.ehrbase.fhirbridge.opt.shareddefinition.EmpfohleneArzneimittelDefiningcode> EMPFOHLENE_ARZNEIMITTEL_DEFININGCODE_CURRENT_STATE = new AqlFieldImp<org.ehrbase.fhirbridge.opt.shareddefinition.EmpfohleneArzneimittelDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0109]/current_state|defining_code", "empfohleneArzneimittelDefiningcodeCurrentState", org.ehrbase.fhirbridge.opt.shareddefinition.EmpfohleneArzneimittelDefiningcode.class, this);

  public SelectAqlField<TransitionDefiningcode> TRANSITION_DEFININGCODE_TRANSITION_ISM_TRANSITION_AT0145 = new AqlFieldImp<TransitionDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0145]/transition|defining_code", "transitionDefiningcodeTransitionIsmTransitionAt0145", TransitionDefiningcode.class, this);

  public SelectAqlField<TransitionDefiningcode> TRANSITION_DEFININGCODE_TRANSITION_ISM_TRANSITION_AT0039 = new AqlFieldImp<TransitionDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0039]/transition|defining_code", "transitionDefiningcodeTransitionIsmTransitionAt0039", TransitionDefiningcode.class, this);

  public SelectAqlField<TransitionDefiningcode> TRANSITION_DEFININGCODE_TRANSITION_ISM_TRANSITION_AT0007 = new AqlFieldImp<TransitionDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0007]/transition|defining_code", "transitionDefiningcodeTransitionIsmTransitionAt0007", TransitionDefiningcode.class, this);

  public SelectAqlField<TransitionDefiningcode> TRANSITION_DEFININGCODE_TRANSITION_ISM_TRANSITION_AT0018 = new AqlFieldImp<TransitionDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0018]/transition|defining_code", "transitionDefiningcodeTransitionIsmTransitionAt0018", TransitionDefiningcode.class, this);

  public SelectAqlField<org.ehrbase.fhirbridge.opt.shareddefinition.RezeptNeuAusgestelltDefiningcode> REZEPT_NEU_AUSGESTELLT_DEFININGCODE_CURRENT_STATE = new AqlFieldImp<org.ehrbase.fhirbridge.opt.shareddefinition.RezeptNeuAusgestelltDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0010]/current_state|defining_code", "rezeptNeuAusgestelltDefiningcodeCurrentState", org.ehrbase.fhirbridge.opt.shareddefinition.RezeptNeuAusgestelltDefiningcode.class, this);

  public SelectAqlField<RezeptWurdeAusgefuhrtDefiningcode> REZEPT_WURDE_AUSGEFUHRT_DEFININGCODE_CAREFLOW_STEP = new AqlFieldImp<RezeptWurdeAusgefuhrtDefiningcode>(ArzneimittelverwaltungAction.class, "/ism_transition[at0152]/careflow_step|defining_code", "rezeptWurdeAusgefuhrtDefiningcodeCareflowStep", RezeptWurdeAusgefuhrtDefiningcode.class, this);

  public SelectAqlField<String> NACHKONTROLLIERT_VALUE_TREE = new AqlFieldImp<String>(ArzneimittelverwaltungAction.class, "/description[at0017]/items[at0149]/name|value", "nachkontrolliertValueTree", String.class, this);

  private ArzneimittelverwaltungActionContainment() {
    super("openEHR-EHR-ACTION.medication.v1");
  }

  public static ArzneimittelverwaltungActionContainment getInstance() {
    return new ArzneimittelverwaltungActionContainment();
  }
}
