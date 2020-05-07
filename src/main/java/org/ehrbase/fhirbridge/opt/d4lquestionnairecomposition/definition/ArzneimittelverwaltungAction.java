package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.Boolean;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.fhirbridge.opt.shareddefinition.NachkontrolliertDefiningcode;
import org.ehrbase.fhirbridge.opt.shareddefinition.TransitionDefiningcode;

@Entity
@Archetype("openEHR-EHR-ACTION.medication.v1")
public class ArzneimittelverwaltungAction {
  @Path("/ism_transition[at0015]/transition|defining_code")
  private TransitionDefiningcode transitionDefiningcode;

  @Path("/ism_transition[at0013]/current_state|defining_code")
  private org.ehrbase.fhirbridge.opt.shareddefinition.MedikamentenbehanlungWurdeVerschobenDefiningcode medikamentenbehanlungWurdeVerschobenDefiningcode;

  @Path("/ism_transition[at0039]/current_state|defining_code")
  private org.ehrbase.fhirbridge.opt.shareddefinition.GroEreAnderungDerVerordnungDefiningcode groEreAnderungDerVerordnungDefiningcode;

  @Path("/ism_transition[at0150]/current_state|defining_code")
  private org.ehrbase.fhirbridge.opt.shareddefinition.RezeptWurdeWiderrufenDefiningcode rezeptWurdeWiderrufenDefiningcode;

  @Path("/ism_transition[at0005]/careflow_step|defining_code")
  private ArzneimittelWurdeNeuBewertetDefiningcode arzneimittelWurdeNeuBewertetDefiningcode;

  @Path("/ism_transition[at0013]/transition|defining_code")
  private TransitionDefiningcode transitionDefiningcodeTransition;

  @Path("/ism_transition[at0018]/current_state|defining_code")
  private org.ehrbase.fhirbridge.opt.shareddefinition.VerabreichungEinerDosisWurdeAusgelassenDefiningcode verabreichungEinerDosisWurdeAusgelassenDefiningcode;

  @Path("/ism_transition[at0012]/transition|defining_code")
  private TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0012;

  @Path("/ism_transition[at0016]/transition|defining_code")
  private TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0016;

  @Path("/ism_transition[at0009]/current_state|defining_code")
  private org.ehrbase.fhirbridge.opt.shareddefinition.VerabreichungWurdeAusgesetztDefiningcode verabreichungWurdeAusgesetztDefiningcode;

  @Path("/ism_transition[at0150]/transition|defining_code")
  private TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0150;

  @Path("/ism_transition[at0151]/transition|defining_code")
  private TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0151;

  @Path("/description[at0017]/items[at0104]")
  private Cluster arzneimitteldetails;

  @Path("/ism_transition[at0012]/careflow_step|defining_code")
  private ArzneimittelbehanlungWurdeAbgesagtDefiningcode arzneimittelbehanlungWurdeAbgesagtDefiningcode;

  @Path("/description[at0017]/items[at0149]/null_flavour|defining_code")
  private NachkontrolliertDefiningcode nachkontrolliertDefiningcode;

  @Path("/protocol[at0030]/items[at0085]")
  private List<Cluster> erweiterung;

  @Path("/ism_transition[at0145]/careflow_step|defining_code")
  private RezeptWartetAufGenehmigungDefiningcode rezeptWartetAufGenehmigungDefiningcode;

  @Path("/ism_transition[at0004]/current_state|defining_code")
  private org.ehrbase.fhirbridge.opt.shareddefinition.ArzneimittelbehandlungHatBegonnenDefiningcode arzneimittelbehandlungHatBegonnenDefiningcode;

  @Path("/ism_transition[at0016]/current_state|defining_code")
  private org.ehrbase.fhirbridge.opt.shareddefinition.VoraussetzungDefiningcode voraussetzungDefiningcode;

  @Path("/ism_transition[at0011]/transition|defining_code")
  private TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0011;

  @Path("/ism_transition[at0109]/transition|defining_code")
  private TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0109;

  @Path("/ism_transition[at0008]/careflow_step|defining_code")
  private VerzogerungDerRezeptabgabeDefiningcode verzogerungDerRezeptabgabeDefiningcode;

  @Path("/ism_transition[at0010]/transition|defining_code")
  private TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0010;

  @Path("/ism_transition[at0106]/current_state|defining_code")
  private org.ehrbase.fhirbridge.opt.shareddefinition.RezeptIstReAutorisiertDefiningcode rezeptIstReAutorisiertDefiningcode;

  @Path("/ism_transition[at0007]/careflow_step|defining_code")
  private ArzneimittelbehandlungIstAbgeschlossenDefiningcode arzneimittelbehandlungIstAbgeschlossenDefiningcode;

  @Path("/ism_transition[at0002]/current_state|defining_code")
  private org.ehrbase.fhirbridge.opt.shareddefinition.RezeptAusgestelltDefiningcode rezeptAusgestelltDefiningcode;

  @Path("/ism_transition[at0011]/careflow_step|defining_code")
  private ReAutorisierugDesRezeptsAusstehendDefiningcode reAutorisierugDesRezeptsAusstehendDefiningcode;

  @Path("/ism_transition[at0041]/careflow_step|defining_code")
  private GeringfugigeAnderungDerVerordnungDefiningcode geringfugigeAnderungDerVerordnungDefiningcode;

  @Path("/ism_transition[at0015]/current_state|defining_code")
  private org.ehrbase.fhirbridge.opt.shareddefinition.ArzneimittelbehandlungGestopptDefiningcode arzneimittelbehandlungGestopptDefiningcode;

  @Path("/ism_transition[at0153]/current_state|defining_code")
  private org.ehrbase.fhirbridge.opt.shareddefinition.ArzneimittelWurdeGenehmigtDefiningcode arzneimittelWurdeGenehmigtDefiningcode;

  @Path("/time|value")
  private TemporalAccessor timeValue;

  @Path("/ism_transition[at0151]/current_state|defining_code")
  private org.ehrbase.fhirbridge.opt.shareddefinition.RezeptIstUngultigOderAbgelaufenDefiningcode rezeptIstUngultigOderAbgelaufenDefiningcode;

  @Path("/ism_transition[at0006]/careflow_step|defining_code")
  private DosisWurdeVerabreichtDefiningcode dosisWurdeVerabreichtDefiningcode;

  @Path("/ism_transition[at0044]/current_state|defining_code")
  private org.ehrbase.fhirbridge.opt.shareddefinition.VerabreichungEinerDosisWurdeVerschobenDefiningcode verabreichungEinerDosisWurdeVerschobenDefiningcode;

  @Path("/description[at0017]/items[at0020]/value|value")
  private String arzneimittelValue;

  @Path("/ism_transition[at0148]/current_state|defining_code")
  private org.ehrbase.fhirbridge.opt.shareddefinition.ArzneimittelWurdeVorbereitetDefiningcode arzneimittelWurdeVorbereitetDefiningcode;

  @Path("/description[at0017]/items[at0131]")
  private Cluster dosis;

  @Path("/ism_transition[at0010]/careflow_step|defining_code")
  private RezeptNeuAusgestelltDefiningcode rezeptNeuAusgestelltDefiningcode;

  @Path("/ism_transition[at0152]/current_state|defining_code")
  private org.ehrbase.fhirbridge.opt.shareddefinition.RezeptWurdeAusgefuhrtDefiningcode rezeptWurdeAusgefuhrtDefiningcode;

  @Path("/ism_transition[at0109]/careflow_step|defining_code")
  private EmpfohleneArzneimittelDefiningcode empfohleneArzneimittelDefiningcode;

  @Path("/ism_transition[at0013]/careflow_step|defining_code")
  private MedikamentenbehanlungWurdeVerschobenDefiningcode medikamentenbehanlungWurdeVerschobenDefiningcodeCareflowStep;

  @Path("/ism_transition[at0004]/transition|defining_code")
  private TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0004;

  @Path("/ism_transition[at0005]/transition|defining_code")
  private TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0005;

  @Path("/ism_transition[at0005]/current_state|defining_code")
  private org.ehrbase.fhirbridge.opt.shareddefinition.ArzneimittelWurdeNeuBewertetDefiningcode arzneimittelWurdeNeuBewertetDefiningcodeCurrentState;

  @Path("/ism_transition[at0002]/transition|defining_code")
  private TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0002;

  @Path("/ism_transition[at0006]/transition|defining_code")
  private TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0006;

  @Path("/ism_transition[at0018]/careflow_step|defining_code")
  private VerabreichungEinerDosisWurdeAusgelassenDefiningcode verabreichungEinerDosisWurdeAusgelassenDefiningcodeCareflowStep;

  @Path("/ism_transition[at0009]/careflow_step|defining_code")
  private VerabreichungWurdeAusgesetztDefiningcode verabreichungWurdeAusgesetztDefiningcodeCareflowStep;

  @Path("/ism_transition[at0003]/transition|defining_code")
  private TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0003;

  @Path("/ism_transition[at0039]/careflow_step|defining_code")
  private GroEreAnderungDerVerordnungDefiningcode groEreAnderungDerVerordnungDefiningcodeCareflowStep;

  @Path("/ism_transition[at0145]/current_state|defining_code")
  private org.ehrbase.fhirbridge.opt.shareddefinition.RezeptWartetAufGenehmigungDefiningcode rezeptWartetAufGenehmigungDefiningcodeCurrentState;

  @Path("/ism_transition[at0041]/transition|defining_code")
  private TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0041;

  @Path("/ism_transition[at0003]/current_state|defining_code")
  private org.ehrbase.fhirbridge.opt.shareddefinition.EingelostDefiningcode eingelostDefiningcode;

  @Path("/ism_transition[at0016]/careflow_step|defining_code")
  private VoraussetzungDefiningcode voraussetzungDefiningcodeArzneimittelStartdatum;

  @Path("/ism_transition[at0004]/careflow_step|defining_code")
  private ArzneimittelbehandlungHatBegonnenDefiningcode arzneimittelbehandlungHatBegonnenDefiningcodeCareflowStep;

  @Path("/ism_transition[at0044]/transition|defining_code")
  private TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0044;

  @Path("/ism_transition[at0008]/current_state|defining_code")
  private org.ehrbase.fhirbridge.opt.shareddefinition.VerzogerungDerRezeptabgabeDefiningcode verzogerungDerRezeptabgabeDefiningcodeCurrentState;

  @Path("/ism_transition[at0012]/current_state|defining_code")
  private org.ehrbase.fhirbridge.opt.shareddefinition.ArzneimittelbehanlungWurdeAbgesagtDefiningcode arzneimittelbehanlungWurdeAbgesagtDefiningcodeCurrentState;

  @Path("/ism_transition[at0150]/careflow_step|defining_code")
  private RezeptWurdeWiderrufenDefiningcode rezeptWurdeWiderrufenDefiningcodeCareflowStep;

  @Path("/ism_transition[at0106]/careflow_step|defining_code")
  private RezeptIstReAutorisiertDefiningcode rezeptIstReAutorisiertDefiningcodeCareflowStep;

  @Path("/ism_transition[at0007]/current_state|defining_code")
  private org.ehrbase.fhirbridge.opt.shareddefinition.ArzneimittelbehandlungIstAbgeschlossenDefiningcode arzneimittelbehandlungIstAbgeschlossenDefiningcodeCurrentState;

  @Path("/ism_transition[at0002]/careflow_step|defining_code")
  private RezeptAusgestelltDefiningcode rezeptAusgestelltDefiningcodeCareflowStep;

  @Path("/ism_transition[at0106]/transition|defining_code")
  private TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0106;

  @Path("/ism_transition[at0015]/careflow_step|defining_code")
  private ArzneimittelbehandlungGestopptDefiningcode arzneimittelbehandlungGestopptDefiningcodeCareflowStep;

  @Path("/description[at0017]/items[at0053]")
  private List<Cluster> zusatzlicheDetails;

  @Path("/ism_transition[at0003]/careflow_step|defining_code")
  private EingelostDefiningcode eingelostDefiningcodeRezeptWurdeAusgegeben;

  @Path("/ism_transition[at0041]/current_state|defining_code")
  private org.ehrbase.fhirbridge.opt.shareddefinition.GeringfugigeAnderungDerVerordnungDefiningcode geringfugigeAnderungDerVerordnungDefiningcodeCurrentState;

  @Path("/ism_transition[at0148]/transition|defining_code")
  private TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0148;

  @Path("/ism_transition[at0153]/careflow_step|defining_code")
  private ArzneimittelWurdeGenehmigtDefiningcode arzneimittelWurdeGenehmigtDefiningcodeCareflowStep;

  @Path("/ism_transition[at0011]/current_state|defining_code")
  private org.ehrbase.fhirbridge.opt.shareddefinition.ReAutorisierugDesRezeptsAusstehendDefiningcode reAutorisierugDesRezeptsAusstehendDefiningcodeCurrentState;

  @Path("/ism_transition[at0151]/careflow_step|defining_code")
  private RezeptIstUngultigOderAbgelaufenDefiningcode rezeptIstUngultigOderAbgelaufenDefiningcodeCareflowStep;

  @Path("/ism_transition[at0153]/transition|defining_code")
  private TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0153;

  @Path("/ism_transition[at0006]/current_state|defining_code")
  private org.ehrbase.fhirbridge.opt.shareddefinition.DosisWurdeVerabreichtDefiningcode dosisWurdeVerabreichtDefiningcodeCurrentState;

  @Path("/ism_transition[at0152]/transition|defining_code")
  private TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0152;

  @Path("/ism_transition[at0148]/careflow_step|defining_code")
  private ArzneimittelWurdeVorbereitetDefiningcode arzneimittelWurdeVorbereitetDefiningcodeCareflowStep;

  @Path("/ism_transition[at0044]/careflow_step|defining_code")
  private VerabreichungEinerDosisWurdeVerschobenDefiningcode verabreichungEinerDosisWurdeVerschobenDefiningcodeCareflowStep;

  @Path("/description[at0017]/items[at0149]/value|value")
  private Boolean nachkontrolliertValue;

  @Path("/ism_transition[at0008]/transition|defining_code")
  private TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0008;

  @Path("/ism_transition[at0009]/transition|defining_code")
  private TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0009;

  @Path("/ism_transition[at0109]/current_state|defining_code")
  private org.ehrbase.fhirbridge.opt.shareddefinition.EmpfohleneArzneimittelDefiningcode empfohleneArzneimittelDefiningcodeCurrentState;

  @Path("/ism_transition[at0145]/transition|defining_code")
  private TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0145;

  @Path("/ism_transition[at0039]/transition|defining_code")
  private TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0039;

  @Path("/ism_transition[at0007]/transition|defining_code")
  private TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0007;

  @Path("/ism_transition[at0018]/transition|defining_code")
  private TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0018;

  @Path("/ism_transition[at0010]/current_state|defining_code")
  private org.ehrbase.fhirbridge.opt.shareddefinition.RezeptNeuAusgestelltDefiningcode rezeptNeuAusgestelltDefiningcodeCurrentState;

  @Path("/ism_transition[at0152]/careflow_step|defining_code")
  private RezeptWurdeAusgefuhrtDefiningcode rezeptWurdeAusgefuhrtDefiningcodeCareflowStep;

  @Path("/description[at0017]/items[at0149]/name|value")
  private String nachkontrolliertValueTree;

  public void setTransitionDefiningcode(TransitionDefiningcode transitionDefiningcode) {
     this.transitionDefiningcode = transitionDefiningcode;
  }

  public TransitionDefiningcode getTransitionDefiningcode() {
     return this.transitionDefiningcode ;
  }

  public void setMedikamentenbehanlungWurdeVerschobenDefiningcode(
      org.ehrbase.fhirbridge.opt.shareddefinition.MedikamentenbehanlungWurdeVerschobenDefiningcode medikamentenbehanlungWurdeVerschobenDefiningcode) {
     this.medikamentenbehanlungWurdeVerschobenDefiningcode = medikamentenbehanlungWurdeVerschobenDefiningcode;
  }

  public org.ehrbase.fhirbridge.opt.shareddefinition.MedikamentenbehanlungWurdeVerschobenDefiningcode getMedikamentenbehanlungWurdeVerschobenDefiningcode(
      ) {
     return this.medikamentenbehanlungWurdeVerschobenDefiningcode ;
  }

  public void setGroEreAnderungDerVerordnungDefiningcode(
      org.ehrbase.fhirbridge.opt.shareddefinition.GroEreAnderungDerVerordnungDefiningcode groEreAnderungDerVerordnungDefiningcode) {
     this.groEreAnderungDerVerordnungDefiningcode = groEreAnderungDerVerordnungDefiningcode;
  }

  public org.ehrbase.fhirbridge.opt.shareddefinition.GroEreAnderungDerVerordnungDefiningcode getGroEreAnderungDerVerordnungDefiningcode(
      ) {
     return this.groEreAnderungDerVerordnungDefiningcode ;
  }

  public void setRezeptWurdeWiderrufenDefiningcode(
      org.ehrbase.fhirbridge.opt.shareddefinition.RezeptWurdeWiderrufenDefiningcode rezeptWurdeWiderrufenDefiningcode) {
     this.rezeptWurdeWiderrufenDefiningcode = rezeptWurdeWiderrufenDefiningcode;
  }

  public org.ehrbase.fhirbridge.opt.shareddefinition.RezeptWurdeWiderrufenDefiningcode getRezeptWurdeWiderrufenDefiningcode(
      ) {
     return this.rezeptWurdeWiderrufenDefiningcode ;
  }

  public void setArzneimittelWurdeNeuBewertetDefiningcode(
      ArzneimittelWurdeNeuBewertetDefiningcode arzneimittelWurdeNeuBewertetDefiningcode) {
     this.arzneimittelWurdeNeuBewertetDefiningcode = arzneimittelWurdeNeuBewertetDefiningcode;
  }

  public ArzneimittelWurdeNeuBewertetDefiningcode getArzneimittelWurdeNeuBewertetDefiningcode() {
     return this.arzneimittelWurdeNeuBewertetDefiningcode ;
  }

  public void setTransitionDefiningcodeTransition(
      TransitionDefiningcode transitionDefiningcodeTransition) {
     this.transitionDefiningcodeTransition = transitionDefiningcodeTransition;
  }

  public TransitionDefiningcode getTransitionDefiningcodeTransition() {
     return this.transitionDefiningcodeTransition ;
  }

  public void setVerabreichungEinerDosisWurdeAusgelassenDefiningcode(
      org.ehrbase.fhirbridge.opt.shareddefinition.VerabreichungEinerDosisWurdeAusgelassenDefiningcode verabreichungEinerDosisWurdeAusgelassenDefiningcode) {
     this.verabreichungEinerDosisWurdeAusgelassenDefiningcode = verabreichungEinerDosisWurdeAusgelassenDefiningcode;
  }

  public org.ehrbase.fhirbridge.opt.shareddefinition.VerabreichungEinerDosisWurdeAusgelassenDefiningcode getVerabreichungEinerDosisWurdeAusgelassenDefiningcode(
      ) {
     return this.verabreichungEinerDosisWurdeAusgelassenDefiningcode ;
  }

  public void setTransitionDefiningcodeTransitionIsmTransitionAt0012(
      TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0012) {
     this.transitionDefiningcodeTransitionIsmTransitionAt0012 = transitionDefiningcodeTransitionIsmTransitionAt0012;
  }

  public TransitionDefiningcode getTransitionDefiningcodeTransitionIsmTransitionAt0012() {
     return this.transitionDefiningcodeTransitionIsmTransitionAt0012 ;
  }

  public void setTransitionDefiningcodeTransitionIsmTransitionAt0016(
      TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0016) {
     this.transitionDefiningcodeTransitionIsmTransitionAt0016 = transitionDefiningcodeTransitionIsmTransitionAt0016;
  }

  public TransitionDefiningcode getTransitionDefiningcodeTransitionIsmTransitionAt0016() {
     return this.transitionDefiningcodeTransitionIsmTransitionAt0016 ;
  }

  public void setVerabreichungWurdeAusgesetztDefiningcode(
      org.ehrbase.fhirbridge.opt.shareddefinition.VerabreichungWurdeAusgesetztDefiningcode verabreichungWurdeAusgesetztDefiningcode) {
     this.verabreichungWurdeAusgesetztDefiningcode = verabreichungWurdeAusgesetztDefiningcode;
  }

  public org.ehrbase.fhirbridge.opt.shareddefinition.VerabreichungWurdeAusgesetztDefiningcode getVerabreichungWurdeAusgesetztDefiningcode(
      ) {
     return this.verabreichungWurdeAusgesetztDefiningcode ;
  }

  public void setTransitionDefiningcodeTransitionIsmTransitionAt0150(
      TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0150) {
     this.transitionDefiningcodeTransitionIsmTransitionAt0150 = transitionDefiningcodeTransitionIsmTransitionAt0150;
  }

  public TransitionDefiningcode getTransitionDefiningcodeTransitionIsmTransitionAt0150() {
     return this.transitionDefiningcodeTransitionIsmTransitionAt0150 ;
  }

  public void setTransitionDefiningcodeTransitionIsmTransitionAt0151(
      TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0151) {
     this.transitionDefiningcodeTransitionIsmTransitionAt0151 = transitionDefiningcodeTransitionIsmTransitionAt0151;
  }

  public TransitionDefiningcode getTransitionDefiningcodeTransitionIsmTransitionAt0151() {
     return this.transitionDefiningcodeTransitionIsmTransitionAt0151 ;
  }

  public void setArzneimitteldetails(Cluster arzneimitteldetails) {
     this.arzneimitteldetails = arzneimitteldetails;
  }

  public Cluster getArzneimitteldetails() {
     return this.arzneimitteldetails ;
  }

  public void setArzneimittelbehanlungWurdeAbgesagtDefiningcode(
      ArzneimittelbehanlungWurdeAbgesagtDefiningcode arzneimittelbehanlungWurdeAbgesagtDefiningcode) {
     this.arzneimittelbehanlungWurdeAbgesagtDefiningcode = arzneimittelbehanlungWurdeAbgesagtDefiningcode;
  }

  public ArzneimittelbehanlungWurdeAbgesagtDefiningcode getArzneimittelbehanlungWurdeAbgesagtDefiningcode(
      ) {
     return this.arzneimittelbehanlungWurdeAbgesagtDefiningcode ;
  }

  public void setNachkontrolliertDefiningcode(
      NachkontrolliertDefiningcode nachkontrolliertDefiningcode) {
     this.nachkontrolliertDefiningcode = nachkontrolliertDefiningcode;
  }

  public NachkontrolliertDefiningcode getNachkontrolliertDefiningcode() {
     return this.nachkontrolliertDefiningcode ;
  }

  public void setErweiterung(List<Cluster> erweiterung) {
     this.erweiterung = erweiterung;
  }

  public List<Cluster> getErweiterung() {
     return this.erweiterung ;
  }

  public void setRezeptWartetAufGenehmigungDefiningcode(
      RezeptWartetAufGenehmigungDefiningcode rezeptWartetAufGenehmigungDefiningcode) {
     this.rezeptWartetAufGenehmigungDefiningcode = rezeptWartetAufGenehmigungDefiningcode;
  }

  public RezeptWartetAufGenehmigungDefiningcode getRezeptWartetAufGenehmigungDefiningcode() {
     return this.rezeptWartetAufGenehmigungDefiningcode ;
  }

  public void setArzneimittelbehandlungHatBegonnenDefiningcode(
      org.ehrbase.fhirbridge.opt.shareddefinition.ArzneimittelbehandlungHatBegonnenDefiningcode arzneimittelbehandlungHatBegonnenDefiningcode) {
     this.arzneimittelbehandlungHatBegonnenDefiningcode = arzneimittelbehandlungHatBegonnenDefiningcode;
  }

  public org.ehrbase.fhirbridge.opt.shareddefinition.ArzneimittelbehandlungHatBegonnenDefiningcode getArzneimittelbehandlungHatBegonnenDefiningcode(
      ) {
     return this.arzneimittelbehandlungHatBegonnenDefiningcode ;
  }

  public void setVoraussetzungDefiningcode(
      org.ehrbase.fhirbridge.opt.shareddefinition.VoraussetzungDefiningcode voraussetzungDefiningcode) {
     this.voraussetzungDefiningcode = voraussetzungDefiningcode;
  }

  public org.ehrbase.fhirbridge.opt.shareddefinition.VoraussetzungDefiningcode getVoraussetzungDefiningcode(
      ) {
     return this.voraussetzungDefiningcode ;
  }

  public void setTransitionDefiningcodeTransitionIsmTransitionAt0011(
      TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0011) {
     this.transitionDefiningcodeTransitionIsmTransitionAt0011 = transitionDefiningcodeTransitionIsmTransitionAt0011;
  }

  public TransitionDefiningcode getTransitionDefiningcodeTransitionIsmTransitionAt0011() {
     return this.transitionDefiningcodeTransitionIsmTransitionAt0011 ;
  }

  public void setTransitionDefiningcodeTransitionIsmTransitionAt0109(
      TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0109) {
     this.transitionDefiningcodeTransitionIsmTransitionAt0109 = transitionDefiningcodeTransitionIsmTransitionAt0109;
  }

  public TransitionDefiningcode getTransitionDefiningcodeTransitionIsmTransitionAt0109() {
     return this.transitionDefiningcodeTransitionIsmTransitionAt0109 ;
  }

  public void setVerzogerungDerRezeptabgabeDefiningcode(
      VerzogerungDerRezeptabgabeDefiningcode verzogerungDerRezeptabgabeDefiningcode) {
     this.verzogerungDerRezeptabgabeDefiningcode = verzogerungDerRezeptabgabeDefiningcode;
  }

  public VerzogerungDerRezeptabgabeDefiningcode getVerzogerungDerRezeptabgabeDefiningcode() {
     return this.verzogerungDerRezeptabgabeDefiningcode ;
  }

  public void setTransitionDefiningcodeTransitionIsmTransitionAt0010(
      TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0010) {
     this.transitionDefiningcodeTransitionIsmTransitionAt0010 = transitionDefiningcodeTransitionIsmTransitionAt0010;
  }

  public TransitionDefiningcode getTransitionDefiningcodeTransitionIsmTransitionAt0010() {
     return this.transitionDefiningcodeTransitionIsmTransitionAt0010 ;
  }

  public void setRezeptIstReAutorisiertDefiningcode(
      org.ehrbase.fhirbridge.opt.shareddefinition.RezeptIstReAutorisiertDefiningcode rezeptIstReAutorisiertDefiningcode) {
     this.rezeptIstReAutorisiertDefiningcode = rezeptIstReAutorisiertDefiningcode;
  }

  public org.ehrbase.fhirbridge.opt.shareddefinition.RezeptIstReAutorisiertDefiningcode getRezeptIstReAutorisiertDefiningcode(
      ) {
     return this.rezeptIstReAutorisiertDefiningcode ;
  }

  public void setArzneimittelbehandlungIstAbgeschlossenDefiningcode(
      ArzneimittelbehandlungIstAbgeschlossenDefiningcode arzneimittelbehandlungIstAbgeschlossenDefiningcode) {
     this.arzneimittelbehandlungIstAbgeschlossenDefiningcode = arzneimittelbehandlungIstAbgeschlossenDefiningcode;
  }

  public ArzneimittelbehandlungIstAbgeschlossenDefiningcode getArzneimittelbehandlungIstAbgeschlossenDefiningcode(
      ) {
     return this.arzneimittelbehandlungIstAbgeschlossenDefiningcode ;
  }

  public void setRezeptAusgestelltDefiningcode(
      org.ehrbase.fhirbridge.opt.shareddefinition.RezeptAusgestelltDefiningcode rezeptAusgestelltDefiningcode) {
     this.rezeptAusgestelltDefiningcode = rezeptAusgestelltDefiningcode;
  }

  public org.ehrbase.fhirbridge.opt.shareddefinition.RezeptAusgestelltDefiningcode getRezeptAusgestelltDefiningcode(
      ) {
     return this.rezeptAusgestelltDefiningcode ;
  }

  public void setReAutorisierugDesRezeptsAusstehendDefiningcode(
      ReAutorisierugDesRezeptsAusstehendDefiningcode reAutorisierugDesRezeptsAusstehendDefiningcode) {
     this.reAutorisierugDesRezeptsAusstehendDefiningcode = reAutorisierugDesRezeptsAusstehendDefiningcode;
  }

  public ReAutorisierugDesRezeptsAusstehendDefiningcode getReAutorisierugDesRezeptsAusstehendDefiningcode(
      ) {
     return this.reAutorisierugDesRezeptsAusstehendDefiningcode ;
  }

  public void setGeringfugigeAnderungDerVerordnungDefiningcode(
      GeringfugigeAnderungDerVerordnungDefiningcode geringfugigeAnderungDerVerordnungDefiningcode) {
     this.geringfugigeAnderungDerVerordnungDefiningcode = geringfugigeAnderungDerVerordnungDefiningcode;
  }

  public GeringfugigeAnderungDerVerordnungDefiningcode getGeringfugigeAnderungDerVerordnungDefiningcode(
      ) {
     return this.geringfugigeAnderungDerVerordnungDefiningcode ;
  }

  public void setArzneimittelbehandlungGestopptDefiningcode(
      org.ehrbase.fhirbridge.opt.shareddefinition.ArzneimittelbehandlungGestopptDefiningcode arzneimittelbehandlungGestopptDefiningcode) {
     this.arzneimittelbehandlungGestopptDefiningcode = arzneimittelbehandlungGestopptDefiningcode;
  }

  public org.ehrbase.fhirbridge.opt.shareddefinition.ArzneimittelbehandlungGestopptDefiningcode getArzneimittelbehandlungGestopptDefiningcode(
      ) {
     return this.arzneimittelbehandlungGestopptDefiningcode ;
  }

  public void setArzneimittelWurdeGenehmigtDefiningcode(
      org.ehrbase.fhirbridge.opt.shareddefinition.ArzneimittelWurdeGenehmigtDefiningcode arzneimittelWurdeGenehmigtDefiningcode) {
     this.arzneimittelWurdeGenehmigtDefiningcode = arzneimittelWurdeGenehmigtDefiningcode;
  }

  public org.ehrbase.fhirbridge.opt.shareddefinition.ArzneimittelWurdeGenehmigtDefiningcode getArzneimittelWurdeGenehmigtDefiningcode(
      ) {
     return this.arzneimittelWurdeGenehmigtDefiningcode ;
  }

  public void setTimeValue(TemporalAccessor timeValue) {
     this.timeValue = timeValue;
  }

  public TemporalAccessor getTimeValue() {
     return this.timeValue ;
  }

  public void setRezeptIstUngultigOderAbgelaufenDefiningcode(
      org.ehrbase.fhirbridge.opt.shareddefinition.RezeptIstUngultigOderAbgelaufenDefiningcode rezeptIstUngultigOderAbgelaufenDefiningcode) {
     this.rezeptIstUngultigOderAbgelaufenDefiningcode = rezeptIstUngultigOderAbgelaufenDefiningcode;
  }

  public org.ehrbase.fhirbridge.opt.shareddefinition.RezeptIstUngultigOderAbgelaufenDefiningcode getRezeptIstUngultigOderAbgelaufenDefiningcode(
      ) {
     return this.rezeptIstUngultigOderAbgelaufenDefiningcode ;
  }

  public void setDosisWurdeVerabreichtDefiningcode(
      DosisWurdeVerabreichtDefiningcode dosisWurdeVerabreichtDefiningcode) {
     this.dosisWurdeVerabreichtDefiningcode = dosisWurdeVerabreichtDefiningcode;
  }

  public DosisWurdeVerabreichtDefiningcode getDosisWurdeVerabreichtDefiningcode() {
     return this.dosisWurdeVerabreichtDefiningcode ;
  }

  public void setVerabreichungEinerDosisWurdeVerschobenDefiningcode(
      org.ehrbase.fhirbridge.opt.shareddefinition.VerabreichungEinerDosisWurdeVerschobenDefiningcode verabreichungEinerDosisWurdeVerschobenDefiningcode) {
     this.verabreichungEinerDosisWurdeVerschobenDefiningcode = verabreichungEinerDosisWurdeVerschobenDefiningcode;
  }

  public org.ehrbase.fhirbridge.opt.shareddefinition.VerabreichungEinerDosisWurdeVerschobenDefiningcode getVerabreichungEinerDosisWurdeVerschobenDefiningcode(
      ) {
     return this.verabreichungEinerDosisWurdeVerschobenDefiningcode ;
  }

  public void setArzneimittelValue(String arzneimittelValue) {
     this.arzneimittelValue = arzneimittelValue;
  }

  public String getArzneimittelValue() {
     return this.arzneimittelValue ;
  }

  public void setArzneimittelWurdeVorbereitetDefiningcode(
      org.ehrbase.fhirbridge.opt.shareddefinition.ArzneimittelWurdeVorbereitetDefiningcode arzneimittelWurdeVorbereitetDefiningcode) {
     this.arzneimittelWurdeVorbereitetDefiningcode = arzneimittelWurdeVorbereitetDefiningcode;
  }

  public org.ehrbase.fhirbridge.opt.shareddefinition.ArzneimittelWurdeVorbereitetDefiningcode getArzneimittelWurdeVorbereitetDefiningcode(
      ) {
     return this.arzneimittelWurdeVorbereitetDefiningcode ;
  }

  public void setDosis(Cluster dosis) {
     this.dosis = dosis;
  }

  public Cluster getDosis() {
     return this.dosis ;
  }

  public void setRezeptNeuAusgestelltDefiningcode(
      RezeptNeuAusgestelltDefiningcode rezeptNeuAusgestelltDefiningcode) {
     this.rezeptNeuAusgestelltDefiningcode = rezeptNeuAusgestelltDefiningcode;
  }

  public RezeptNeuAusgestelltDefiningcode getRezeptNeuAusgestelltDefiningcode() {
     return this.rezeptNeuAusgestelltDefiningcode ;
  }

  public void setRezeptWurdeAusgefuhrtDefiningcode(
      org.ehrbase.fhirbridge.opt.shareddefinition.RezeptWurdeAusgefuhrtDefiningcode rezeptWurdeAusgefuhrtDefiningcode) {
     this.rezeptWurdeAusgefuhrtDefiningcode = rezeptWurdeAusgefuhrtDefiningcode;
  }

  public org.ehrbase.fhirbridge.opt.shareddefinition.RezeptWurdeAusgefuhrtDefiningcode getRezeptWurdeAusgefuhrtDefiningcode(
      ) {
     return this.rezeptWurdeAusgefuhrtDefiningcode ;
  }

  public void setEmpfohleneArzneimittelDefiningcode(
      EmpfohleneArzneimittelDefiningcode empfohleneArzneimittelDefiningcode) {
     this.empfohleneArzneimittelDefiningcode = empfohleneArzneimittelDefiningcode;
  }

  public EmpfohleneArzneimittelDefiningcode getEmpfohleneArzneimittelDefiningcode() {
     return this.empfohleneArzneimittelDefiningcode ;
  }

  public void setMedikamentenbehanlungWurdeVerschobenDefiningcodeCareflowStep(
      MedikamentenbehanlungWurdeVerschobenDefiningcode medikamentenbehanlungWurdeVerschobenDefiningcodeCareflowStep) {
     this.medikamentenbehanlungWurdeVerschobenDefiningcodeCareflowStep = medikamentenbehanlungWurdeVerschobenDefiningcodeCareflowStep;
  }

  public MedikamentenbehanlungWurdeVerschobenDefiningcode getMedikamentenbehanlungWurdeVerschobenDefiningcodeCareflowStep(
      ) {
     return this.medikamentenbehanlungWurdeVerschobenDefiningcodeCareflowStep ;
  }

  public void setTransitionDefiningcodeTransitionIsmTransitionAt0004(
      TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0004) {
     this.transitionDefiningcodeTransitionIsmTransitionAt0004 = transitionDefiningcodeTransitionIsmTransitionAt0004;
  }

  public TransitionDefiningcode getTransitionDefiningcodeTransitionIsmTransitionAt0004() {
     return this.transitionDefiningcodeTransitionIsmTransitionAt0004 ;
  }

  public void setTransitionDefiningcodeTransitionIsmTransitionAt0005(
      TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0005) {
     this.transitionDefiningcodeTransitionIsmTransitionAt0005 = transitionDefiningcodeTransitionIsmTransitionAt0005;
  }

  public TransitionDefiningcode getTransitionDefiningcodeTransitionIsmTransitionAt0005() {
     return this.transitionDefiningcodeTransitionIsmTransitionAt0005 ;
  }

  public void setArzneimittelWurdeNeuBewertetDefiningcodeCurrentState(
      org.ehrbase.fhirbridge.opt.shareddefinition.ArzneimittelWurdeNeuBewertetDefiningcode arzneimittelWurdeNeuBewertetDefiningcodeCurrentState) {
     this.arzneimittelWurdeNeuBewertetDefiningcodeCurrentState = arzneimittelWurdeNeuBewertetDefiningcodeCurrentState;
  }

  public org.ehrbase.fhirbridge.opt.shareddefinition.ArzneimittelWurdeNeuBewertetDefiningcode getArzneimittelWurdeNeuBewertetDefiningcodeCurrentState(
      ) {
     return this.arzneimittelWurdeNeuBewertetDefiningcodeCurrentState ;
  }

  public void setTransitionDefiningcodeTransitionIsmTransitionAt0002(
      TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0002) {
     this.transitionDefiningcodeTransitionIsmTransitionAt0002 = transitionDefiningcodeTransitionIsmTransitionAt0002;
  }

  public TransitionDefiningcode getTransitionDefiningcodeTransitionIsmTransitionAt0002() {
     return this.transitionDefiningcodeTransitionIsmTransitionAt0002 ;
  }

  public void setTransitionDefiningcodeTransitionIsmTransitionAt0006(
      TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0006) {
     this.transitionDefiningcodeTransitionIsmTransitionAt0006 = transitionDefiningcodeTransitionIsmTransitionAt0006;
  }

  public TransitionDefiningcode getTransitionDefiningcodeTransitionIsmTransitionAt0006() {
     return this.transitionDefiningcodeTransitionIsmTransitionAt0006 ;
  }

  public void setVerabreichungEinerDosisWurdeAusgelassenDefiningcodeCareflowStep(
      VerabreichungEinerDosisWurdeAusgelassenDefiningcode verabreichungEinerDosisWurdeAusgelassenDefiningcodeCareflowStep) {
     this.verabreichungEinerDosisWurdeAusgelassenDefiningcodeCareflowStep = verabreichungEinerDosisWurdeAusgelassenDefiningcodeCareflowStep;
  }

  public VerabreichungEinerDosisWurdeAusgelassenDefiningcode getVerabreichungEinerDosisWurdeAusgelassenDefiningcodeCareflowStep(
      ) {
     return this.verabreichungEinerDosisWurdeAusgelassenDefiningcodeCareflowStep ;
  }

  public void setVerabreichungWurdeAusgesetztDefiningcodeCareflowStep(
      VerabreichungWurdeAusgesetztDefiningcode verabreichungWurdeAusgesetztDefiningcodeCareflowStep) {
     this.verabreichungWurdeAusgesetztDefiningcodeCareflowStep = verabreichungWurdeAusgesetztDefiningcodeCareflowStep;
  }

  public VerabreichungWurdeAusgesetztDefiningcode getVerabreichungWurdeAusgesetztDefiningcodeCareflowStep(
      ) {
     return this.verabreichungWurdeAusgesetztDefiningcodeCareflowStep ;
  }

  public void setTransitionDefiningcodeTransitionIsmTransitionAt0003(
      TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0003) {
     this.transitionDefiningcodeTransitionIsmTransitionAt0003 = transitionDefiningcodeTransitionIsmTransitionAt0003;
  }

  public TransitionDefiningcode getTransitionDefiningcodeTransitionIsmTransitionAt0003() {
     return this.transitionDefiningcodeTransitionIsmTransitionAt0003 ;
  }

  public void setGroEreAnderungDerVerordnungDefiningcodeCareflowStep(
      GroEreAnderungDerVerordnungDefiningcode groEreAnderungDerVerordnungDefiningcodeCareflowStep) {
     this.groEreAnderungDerVerordnungDefiningcodeCareflowStep = groEreAnderungDerVerordnungDefiningcodeCareflowStep;
  }

  public GroEreAnderungDerVerordnungDefiningcode getGroEreAnderungDerVerordnungDefiningcodeCareflowStep(
      ) {
     return this.groEreAnderungDerVerordnungDefiningcodeCareflowStep ;
  }

  public void setRezeptWartetAufGenehmigungDefiningcodeCurrentState(
      org.ehrbase.fhirbridge.opt.shareddefinition.RezeptWartetAufGenehmigungDefiningcode rezeptWartetAufGenehmigungDefiningcodeCurrentState) {
     this.rezeptWartetAufGenehmigungDefiningcodeCurrentState = rezeptWartetAufGenehmigungDefiningcodeCurrentState;
  }

  public org.ehrbase.fhirbridge.opt.shareddefinition.RezeptWartetAufGenehmigungDefiningcode getRezeptWartetAufGenehmigungDefiningcodeCurrentState(
      ) {
     return this.rezeptWartetAufGenehmigungDefiningcodeCurrentState ;
  }

  public void setTransitionDefiningcodeTransitionIsmTransitionAt0041(
      TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0041) {
     this.transitionDefiningcodeTransitionIsmTransitionAt0041 = transitionDefiningcodeTransitionIsmTransitionAt0041;
  }

  public TransitionDefiningcode getTransitionDefiningcodeTransitionIsmTransitionAt0041() {
     return this.transitionDefiningcodeTransitionIsmTransitionAt0041 ;
  }

  public void setEingelostDefiningcode(
      org.ehrbase.fhirbridge.opt.shareddefinition.EingelostDefiningcode eingelostDefiningcode) {
     this.eingelostDefiningcode = eingelostDefiningcode;
  }

  public org.ehrbase.fhirbridge.opt.shareddefinition.EingelostDefiningcode getEingelostDefiningcode(
      ) {
     return this.eingelostDefiningcode ;
  }

  public void setVoraussetzungDefiningcodeArzneimittelStartdatum(
      VoraussetzungDefiningcode voraussetzungDefiningcodeArzneimittelStartdatum) {
     this.voraussetzungDefiningcodeArzneimittelStartdatum = voraussetzungDefiningcodeArzneimittelStartdatum;
  }

  public VoraussetzungDefiningcode getVoraussetzungDefiningcodeArzneimittelStartdatum() {
     return this.voraussetzungDefiningcodeArzneimittelStartdatum ;
  }

  public void setArzneimittelbehandlungHatBegonnenDefiningcodeCareflowStep(
      ArzneimittelbehandlungHatBegonnenDefiningcode arzneimittelbehandlungHatBegonnenDefiningcodeCareflowStep) {
     this.arzneimittelbehandlungHatBegonnenDefiningcodeCareflowStep = arzneimittelbehandlungHatBegonnenDefiningcodeCareflowStep;
  }

  public ArzneimittelbehandlungHatBegonnenDefiningcode getArzneimittelbehandlungHatBegonnenDefiningcodeCareflowStep(
      ) {
     return this.arzneimittelbehandlungHatBegonnenDefiningcodeCareflowStep ;
  }

  public void setTransitionDefiningcodeTransitionIsmTransitionAt0044(
      TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0044) {
     this.transitionDefiningcodeTransitionIsmTransitionAt0044 = transitionDefiningcodeTransitionIsmTransitionAt0044;
  }

  public TransitionDefiningcode getTransitionDefiningcodeTransitionIsmTransitionAt0044() {
     return this.transitionDefiningcodeTransitionIsmTransitionAt0044 ;
  }

  public void setVerzogerungDerRezeptabgabeDefiningcodeCurrentState(
      org.ehrbase.fhirbridge.opt.shareddefinition.VerzogerungDerRezeptabgabeDefiningcode verzogerungDerRezeptabgabeDefiningcodeCurrentState) {
     this.verzogerungDerRezeptabgabeDefiningcodeCurrentState = verzogerungDerRezeptabgabeDefiningcodeCurrentState;
  }

  public org.ehrbase.fhirbridge.opt.shareddefinition.VerzogerungDerRezeptabgabeDefiningcode getVerzogerungDerRezeptabgabeDefiningcodeCurrentState(
      ) {
     return this.verzogerungDerRezeptabgabeDefiningcodeCurrentState ;
  }

  public void setArzneimittelbehanlungWurdeAbgesagtDefiningcodeCurrentState(
      org.ehrbase.fhirbridge.opt.shareddefinition.ArzneimittelbehanlungWurdeAbgesagtDefiningcode arzneimittelbehanlungWurdeAbgesagtDefiningcodeCurrentState) {
     this.arzneimittelbehanlungWurdeAbgesagtDefiningcodeCurrentState = arzneimittelbehanlungWurdeAbgesagtDefiningcodeCurrentState;
  }

  public org.ehrbase.fhirbridge.opt.shareddefinition.ArzneimittelbehanlungWurdeAbgesagtDefiningcode getArzneimittelbehanlungWurdeAbgesagtDefiningcodeCurrentState(
      ) {
     return this.arzneimittelbehanlungWurdeAbgesagtDefiningcodeCurrentState ;
  }

  public void setRezeptWurdeWiderrufenDefiningcodeCareflowStep(
      RezeptWurdeWiderrufenDefiningcode rezeptWurdeWiderrufenDefiningcodeCareflowStep) {
     this.rezeptWurdeWiderrufenDefiningcodeCareflowStep = rezeptWurdeWiderrufenDefiningcodeCareflowStep;
  }

  public RezeptWurdeWiderrufenDefiningcode getRezeptWurdeWiderrufenDefiningcodeCareflowStep() {
     return this.rezeptWurdeWiderrufenDefiningcodeCareflowStep ;
  }

  public void setRezeptIstReAutorisiertDefiningcodeCareflowStep(
      RezeptIstReAutorisiertDefiningcode rezeptIstReAutorisiertDefiningcodeCareflowStep) {
     this.rezeptIstReAutorisiertDefiningcodeCareflowStep = rezeptIstReAutorisiertDefiningcodeCareflowStep;
  }

  public RezeptIstReAutorisiertDefiningcode getRezeptIstReAutorisiertDefiningcodeCareflowStep() {
     return this.rezeptIstReAutorisiertDefiningcodeCareflowStep ;
  }

  public void setArzneimittelbehandlungIstAbgeschlossenDefiningcodeCurrentState(
      org.ehrbase.fhirbridge.opt.shareddefinition.ArzneimittelbehandlungIstAbgeschlossenDefiningcode arzneimittelbehandlungIstAbgeschlossenDefiningcodeCurrentState) {
     this.arzneimittelbehandlungIstAbgeschlossenDefiningcodeCurrentState = arzneimittelbehandlungIstAbgeschlossenDefiningcodeCurrentState;
  }

  public org.ehrbase.fhirbridge.opt.shareddefinition.ArzneimittelbehandlungIstAbgeschlossenDefiningcode getArzneimittelbehandlungIstAbgeschlossenDefiningcodeCurrentState(
      ) {
     return this.arzneimittelbehandlungIstAbgeschlossenDefiningcodeCurrentState ;
  }

  public void setRezeptAusgestelltDefiningcodeCareflowStep(
      RezeptAusgestelltDefiningcode rezeptAusgestelltDefiningcodeCareflowStep) {
     this.rezeptAusgestelltDefiningcodeCareflowStep = rezeptAusgestelltDefiningcodeCareflowStep;
  }

  public RezeptAusgestelltDefiningcode getRezeptAusgestelltDefiningcodeCareflowStep() {
     return this.rezeptAusgestelltDefiningcodeCareflowStep ;
  }

  public void setTransitionDefiningcodeTransitionIsmTransitionAt0106(
      TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0106) {
     this.transitionDefiningcodeTransitionIsmTransitionAt0106 = transitionDefiningcodeTransitionIsmTransitionAt0106;
  }

  public TransitionDefiningcode getTransitionDefiningcodeTransitionIsmTransitionAt0106() {
     return this.transitionDefiningcodeTransitionIsmTransitionAt0106 ;
  }

  public void setArzneimittelbehandlungGestopptDefiningcodeCareflowStep(
      ArzneimittelbehandlungGestopptDefiningcode arzneimittelbehandlungGestopptDefiningcodeCareflowStep) {
     this.arzneimittelbehandlungGestopptDefiningcodeCareflowStep = arzneimittelbehandlungGestopptDefiningcodeCareflowStep;
  }

  public ArzneimittelbehandlungGestopptDefiningcode getArzneimittelbehandlungGestopptDefiningcodeCareflowStep(
      ) {
     return this.arzneimittelbehandlungGestopptDefiningcodeCareflowStep ;
  }

  public void setZusatzlicheDetails(List<Cluster> zusatzlicheDetails) {
     this.zusatzlicheDetails = zusatzlicheDetails;
  }

  public List<Cluster> getZusatzlicheDetails() {
     return this.zusatzlicheDetails ;
  }

  public void setEingelostDefiningcodeRezeptWurdeAusgegeben(
      EingelostDefiningcode eingelostDefiningcodeRezeptWurdeAusgegeben) {
     this.eingelostDefiningcodeRezeptWurdeAusgegeben = eingelostDefiningcodeRezeptWurdeAusgegeben;
  }

  public EingelostDefiningcode getEingelostDefiningcodeRezeptWurdeAusgegeben() {
     return this.eingelostDefiningcodeRezeptWurdeAusgegeben ;
  }

  public void setGeringfugigeAnderungDerVerordnungDefiningcodeCurrentState(
      org.ehrbase.fhirbridge.opt.shareddefinition.GeringfugigeAnderungDerVerordnungDefiningcode geringfugigeAnderungDerVerordnungDefiningcodeCurrentState) {
     this.geringfugigeAnderungDerVerordnungDefiningcodeCurrentState = geringfugigeAnderungDerVerordnungDefiningcodeCurrentState;
  }

  public org.ehrbase.fhirbridge.opt.shareddefinition.GeringfugigeAnderungDerVerordnungDefiningcode getGeringfugigeAnderungDerVerordnungDefiningcodeCurrentState(
      ) {
     return this.geringfugigeAnderungDerVerordnungDefiningcodeCurrentState ;
  }

  public void setTransitionDefiningcodeTransitionIsmTransitionAt0148(
      TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0148) {
     this.transitionDefiningcodeTransitionIsmTransitionAt0148 = transitionDefiningcodeTransitionIsmTransitionAt0148;
  }

  public TransitionDefiningcode getTransitionDefiningcodeTransitionIsmTransitionAt0148() {
     return this.transitionDefiningcodeTransitionIsmTransitionAt0148 ;
  }

  public void setArzneimittelWurdeGenehmigtDefiningcodeCareflowStep(
      ArzneimittelWurdeGenehmigtDefiningcode arzneimittelWurdeGenehmigtDefiningcodeCareflowStep) {
     this.arzneimittelWurdeGenehmigtDefiningcodeCareflowStep = arzneimittelWurdeGenehmigtDefiningcodeCareflowStep;
  }

  public ArzneimittelWurdeGenehmigtDefiningcode getArzneimittelWurdeGenehmigtDefiningcodeCareflowStep(
      ) {
     return this.arzneimittelWurdeGenehmigtDefiningcodeCareflowStep ;
  }

  public void setReAutorisierugDesRezeptsAusstehendDefiningcodeCurrentState(
      org.ehrbase.fhirbridge.opt.shareddefinition.ReAutorisierugDesRezeptsAusstehendDefiningcode reAutorisierugDesRezeptsAusstehendDefiningcodeCurrentState) {
     this.reAutorisierugDesRezeptsAusstehendDefiningcodeCurrentState = reAutorisierugDesRezeptsAusstehendDefiningcodeCurrentState;
  }

  public org.ehrbase.fhirbridge.opt.shareddefinition.ReAutorisierugDesRezeptsAusstehendDefiningcode getReAutorisierugDesRezeptsAusstehendDefiningcodeCurrentState(
      ) {
     return this.reAutorisierugDesRezeptsAusstehendDefiningcodeCurrentState ;
  }

  public void setRezeptIstUngultigOderAbgelaufenDefiningcodeCareflowStep(
      RezeptIstUngultigOderAbgelaufenDefiningcode rezeptIstUngultigOderAbgelaufenDefiningcodeCareflowStep) {
     this.rezeptIstUngultigOderAbgelaufenDefiningcodeCareflowStep = rezeptIstUngultigOderAbgelaufenDefiningcodeCareflowStep;
  }

  public RezeptIstUngultigOderAbgelaufenDefiningcode getRezeptIstUngultigOderAbgelaufenDefiningcodeCareflowStep(
      ) {
     return this.rezeptIstUngultigOderAbgelaufenDefiningcodeCareflowStep ;
  }

  public void setTransitionDefiningcodeTransitionIsmTransitionAt0153(
      TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0153) {
     this.transitionDefiningcodeTransitionIsmTransitionAt0153 = transitionDefiningcodeTransitionIsmTransitionAt0153;
  }

  public TransitionDefiningcode getTransitionDefiningcodeTransitionIsmTransitionAt0153() {
     return this.transitionDefiningcodeTransitionIsmTransitionAt0153 ;
  }

  public void setDosisWurdeVerabreichtDefiningcodeCurrentState(
      org.ehrbase.fhirbridge.opt.shareddefinition.DosisWurdeVerabreichtDefiningcode dosisWurdeVerabreichtDefiningcodeCurrentState) {
     this.dosisWurdeVerabreichtDefiningcodeCurrentState = dosisWurdeVerabreichtDefiningcodeCurrentState;
  }

  public org.ehrbase.fhirbridge.opt.shareddefinition.DosisWurdeVerabreichtDefiningcode getDosisWurdeVerabreichtDefiningcodeCurrentState(
      ) {
     return this.dosisWurdeVerabreichtDefiningcodeCurrentState ;
  }

  public void setTransitionDefiningcodeTransitionIsmTransitionAt0152(
      TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0152) {
     this.transitionDefiningcodeTransitionIsmTransitionAt0152 = transitionDefiningcodeTransitionIsmTransitionAt0152;
  }

  public TransitionDefiningcode getTransitionDefiningcodeTransitionIsmTransitionAt0152() {
     return this.transitionDefiningcodeTransitionIsmTransitionAt0152 ;
  }

  public void setArzneimittelWurdeVorbereitetDefiningcodeCareflowStep(
      ArzneimittelWurdeVorbereitetDefiningcode arzneimittelWurdeVorbereitetDefiningcodeCareflowStep) {
     this.arzneimittelWurdeVorbereitetDefiningcodeCareflowStep = arzneimittelWurdeVorbereitetDefiningcodeCareflowStep;
  }

  public ArzneimittelWurdeVorbereitetDefiningcode getArzneimittelWurdeVorbereitetDefiningcodeCareflowStep(
      ) {
     return this.arzneimittelWurdeVorbereitetDefiningcodeCareflowStep ;
  }

  public void setVerabreichungEinerDosisWurdeVerschobenDefiningcodeCareflowStep(
      VerabreichungEinerDosisWurdeVerschobenDefiningcode verabreichungEinerDosisWurdeVerschobenDefiningcodeCareflowStep) {
     this.verabreichungEinerDosisWurdeVerschobenDefiningcodeCareflowStep = verabreichungEinerDosisWurdeVerschobenDefiningcodeCareflowStep;
  }

  public VerabreichungEinerDosisWurdeVerschobenDefiningcode getVerabreichungEinerDosisWurdeVerschobenDefiningcodeCareflowStep(
      ) {
     return this.verabreichungEinerDosisWurdeVerschobenDefiningcodeCareflowStep ;
  }

  public void setNachkontrolliertValue(Boolean nachkontrolliertValue) {
     this.nachkontrolliertValue = nachkontrolliertValue;
  }

  public Boolean isNachkontrolliertValue() {
     return this.nachkontrolliertValue ;
  }

  public void setTransitionDefiningcodeTransitionIsmTransitionAt0008(
      TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0008) {
     this.transitionDefiningcodeTransitionIsmTransitionAt0008 = transitionDefiningcodeTransitionIsmTransitionAt0008;
  }

  public TransitionDefiningcode getTransitionDefiningcodeTransitionIsmTransitionAt0008() {
     return this.transitionDefiningcodeTransitionIsmTransitionAt0008 ;
  }

  public void setTransitionDefiningcodeTransitionIsmTransitionAt0009(
      TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0009) {
     this.transitionDefiningcodeTransitionIsmTransitionAt0009 = transitionDefiningcodeTransitionIsmTransitionAt0009;
  }

  public TransitionDefiningcode getTransitionDefiningcodeTransitionIsmTransitionAt0009() {
     return this.transitionDefiningcodeTransitionIsmTransitionAt0009 ;
  }

  public void setEmpfohleneArzneimittelDefiningcodeCurrentState(
      org.ehrbase.fhirbridge.opt.shareddefinition.EmpfohleneArzneimittelDefiningcode empfohleneArzneimittelDefiningcodeCurrentState) {
     this.empfohleneArzneimittelDefiningcodeCurrentState = empfohleneArzneimittelDefiningcodeCurrentState;
  }

  public org.ehrbase.fhirbridge.opt.shareddefinition.EmpfohleneArzneimittelDefiningcode getEmpfohleneArzneimittelDefiningcodeCurrentState(
      ) {
     return this.empfohleneArzneimittelDefiningcodeCurrentState ;
  }

  public void setTransitionDefiningcodeTransitionIsmTransitionAt0145(
      TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0145) {
     this.transitionDefiningcodeTransitionIsmTransitionAt0145 = transitionDefiningcodeTransitionIsmTransitionAt0145;
  }

  public TransitionDefiningcode getTransitionDefiningcodeTransitionIsmTransitionAt0145() {
     return this.transitionDefiningcodeTransitionIsmTransitionAt0145 ;
  }

  public void setTransitionDefiningcodeTransitionIsmTransitionAt0039(
      TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0039) {
     this.transitionDefiningcodeTransitionIsmTransitionAt0039 = transitionDefiningcodeTransitionIsmTransitionAt0039;
  }

  public TransitionDefiningcode getTransitionDefiningcodeTransitionIsmTransitionAt0039() {
     return this.transitionDefiningcodeTransitionIsmTransitionAt0039 ;
  }

  public void setTransitionDefiningcodeTransitionIsmTransitionAt0007(
      TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0007) {
     this.transitionDefiningcodeTransitionIsmTransitionAt0007 = transitionDefiningcodeTransitionIsmTransitionAt0007;
  }

  public TransitionDefiningcode getTransitionDefiningcodeTransitionIsmTransitionAt0007() {
     return this.transitionDefiningcodeTransitionIsmTransitionAt0007 ;
  }

  public void setTransitionDefiningcodeTransitionIsmTransitionAt0018(
      TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0018) {
     this.transitionDefiningcodeTransitionIsmTransitionAt0018 = transitionDefiningcodeTransitionIsmTransitionAt0018;
  }

  public TransitionDefiningcode getTransitionDefiningcodeTransitionIsmTransitionAt0018() {
     return this.transitionDefiningcodeTransitionIsmTransitionAt0018 ;
  }

  public void setRezeptNeuAusgestelltDefiningcodeCurrentState(
      org.ehrbase.fhirbridge.opt.shareddefinition.RezeptNeuAusgestelltDefiningcode rezeptNeuAusgestelltDefiningcodeCurrentState) {
     this.rezeptNeuAusgestelltDefiningcodeCurrentState = rezeptNeuAusgestelltDefiningcodeCurrentState;
  }

  public org.ehrbase.fhirbridge.opt.shareddefinition.RezeptNeuAusgestelltDefiningcode getRezeptNeuAusgestelltDefiningcodeCurrentState(
      ) {
     return this.rezeptNeuAusgestelltDefiningcodeCurrentState ;
  }

  public void setRezeptWurdeAusgefuhrtDefiningcodeCareflowStep(
      RezeptWurdeAusgefuhrtDefiningcode rezeptWurdeAusgefuhrtDefiningcodeCareflowStep) {
     this.rezeptWurdeAusgefuhrtDefiningcodeCareflowStep = rezeptWurdeAusgefuhrtDefiningcodeCareflowStep;
  }

  public RezeptWurdeAusgefuhrtDefiningcode getRezeptWurdeAusgefuhrtDefiningcodeCareflowStep() {
     return this.rezeptWurdeAusgefuhrtDefiningcodeCareflowStep ;
  }

  public void setNachkontrolliertValueTree(String nachkontrolliertValueTree) {
     this.nachkontrolliertValueTree = nachkontrolliertValueTree;
  }

  public String getNachkontrolliertValueTree() {
     return this.nachkontrolliertValueTree ;
  }
}
