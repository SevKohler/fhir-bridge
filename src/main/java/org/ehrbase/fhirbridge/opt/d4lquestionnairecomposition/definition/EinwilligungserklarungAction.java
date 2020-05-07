package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.fhirbridge.opt.shareddefinition.TransitionDefiningcode;

@Entity
@Archetype("openEHR-EHR-ACTION.informed_consent.v0")
public class EinwilligungserklarungAction {
  @Path("/ism_transition[at0013]/careflow_step|defining_code")
  private GeplantDefiningcode geplantDefiningcode;

  @Path("/ism_transition[at0015]/transition|defining_code")
  private TransitionDefiningcode transitionDefiningcode;

  @Path("/ism_transition[at0013]/current_state|defining_code")
  private org.ehrbase.fhirbridge.opt.shareddefinition.GeplantDefiningcode geplantDefiningcodeCurrentState;

  @Path("/ism_transition[at0021]/current_state|defining_code")
  private org.ehrbase.fhirbridge.opt.shareddefinition.EinwilligungNichtErhaltenDefiningcode einwilligungNichtErhaltenDefiningcode;

  @Path("/ism_transition[at0013]/transition|defining_code")
  private TransitionDefiningcode transitionDefiningcodeTransition;

  @Path("/ism_transition[at0017]/transition|defining_code")
  private TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0017;

  @Path("/ism_transition[at0018]/current_state|defining_code")
  private org.ehrbase.fhirbridge.opt.shareddefinition.AbgesagtDefiningcode abgesagtDefiningcode;

  @Path("/ism_transition[at0018]/careflow_step|defining_code")
  private AbgesagtDefiningcode abgesagtDefiningcodeCareflowStep;

  @Path("/ism_transition[at0016]/transition|defining_code")
  private TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0016;

  @Path("/ism_transition[at0027]/transition|defining_code")
  private TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0027;

  @Path("/protocol[at0024]/items[at0028]")
  private List<Cluster> anfordererDerEinwilligungserklarung;

  @Path("/ism_transition[at0022]/current_state|defining_code")
  private org.ehrbase.fhirbridge.opt.shareddefinition.AbgeschlossenDefiningcode abgeschlossenDefiningcode;

  @Path("/description[at0001]/items[at0011]/value|value")
  private String beschreibungDerEinwilligungValue;

  @Path("/ism_transition[at0014]/transition|defining_code")
  private TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0014;

  @Path("/ism_transition[at0022]/careflow_step|defining_code")
  private AbgeschlossenDefiningcode abgeschlossenDefiningcodeCareflowStep;

  @Path("/description[at0001]/items[at0002]")
  private List<EinwilligungserklarungAktivitatElement> aktivitat;

  @Path("/ism_transition[at0017]/current_state|defining_code")
  private org.ehrbase.fhirbridge.opt.shareddefinition.EinwilligungWiderrufenDefiningcode einwilligungWiderrufenDefiningcode;

  @Path("/ism_transition[at0017]/careflow_step|defining_code")
  private EinwilligungWiderrufenDefiningcode einwilligungWiderrufenDefiningcodeCareflowStep;

  @Path("/ism_transition[at0016]/current_state|defining_code")
  private org.ehrbase.fhirbridge.opt.shareddefinition.EinwilligungVerweigertDefiningcode einwilligungVerweigertDefiningcode;

  @Path("/ism_transition[at0016]/careflow_step|defining_code")
  private EinwilligungVerweigertDefiningcode einwilligungVerweigertDefiningcodeCareflowStep;

  @Path("/ism_transition[at0022]/transition|defining_code")
  private TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0022;

  @Path("/ism_transition[at0021]/careflow_step|defining_code")
  private EinwilligungNichtErhaltenDefiningcode einwilligungNichtErhaltenDefiningcodeCareflowStep;

  @Path("/ism_transition[at0021]/transition|defining_code")
  private TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0021;

  @Path("/description[at0001]/items[openEHR-EHR-CLUSTER.address.v0]")
  private List<AdresseCluster> adresse;

  @Path("/ism_transition[at0015]/careflow_step|defining_code")
  private EinwilligungErteiltDefiningcode einwilligungErteiltDefiningcode;

  @Path("/ism_transition[at0015]/current_state|defining_code")
  private org.ehrbase.fhirbridge.opt.shareddefinition.EinwilligungErteiltDefiningcode einwilligungErteiltDefiningcodeCurrentState;

  @Path("/protocol[at0024]/items[at0029]")
  private List<Cluster> einwilligendePerson;

  @Path("/time|value")
  private TemporalAccessor timeValue;

  @Path("/ism_transition[at0019]/current_state|defining_code")
  private org.ehrbase.fhirbridge.opt.shareddefinition.VerschobenDefiningcode verschobenDefiningcode;

  @Path("/ism_transition[at0019]/careflow_step|defining_code")
  private VerschobenDefiningcode verschobenDefiningcodeCareflowStep;

  @Path("/ism_transition[at0014]/current_state|defining_code")
  private org.ehrbase.fhirbridge.opt.shareddefinition.EinwilligungErbetenDefiningcode einwilligungErbetenDefiningcode;

  @Path("/ism_transition[at0014]/careflow_step|defining_code")
  private EinwilligungErbetenDefiningcode einwilligungErbetenDefiningcodeCareflowStep;

  @Path("/ism_transition[at0019]/transition|defining_code")
  private TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0019;

  @Path("/ism_transition[at0027]/careflow_step|defining_code")
  private TerminGeplantDefiningcode terminGeplantDefiningcode;

  @Path("/ism_transition[at0018]/transition|defining_code")
  private TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0018;

  @Path("/ism_transition[at0027]/current_state|defining_code")
  private org.ehrbase.fhirbridge.opt.shareddefinition.TerminGeplantDefiningcode terminGeplantDefiningcodeCurrentState;

  public void setGeplantDefiningcode(GeplantDefiningcode geplantDefiningcode) {
     this.geplantDefiningcode = geplantDefiningcode;
  }

  public GeplantDefiningcode getGeplantDefiningcode() {
     return this.geplantDefiningcode ;
  }

  public void setTransitionDefiningcode(TransitionDefiningcode transitionDefiningcode) {
     this.transitionDefiningcode = transitionDefiningcode;
  }

  public TransitionDefiningcode getTransitionDefiningcode() {
     return this.transitionDefiningcode ;
  }

  public void setGeplantDefiningcodeCurrentState(
      org.ehrbase.fhirbridge.opt.shareddefinition.GeplantDefiningcode geplantDefiningcodeCurrentState) {
     this.geplantDefiningcodeCurrentState = geplantDefiningcodeCurrentState;
  }

  public org.ehrbase.fhirbridge.opt.shareddefinition.GeplantDefiningcode getGeplantDefiningcodeCurrentState(
      ) {
     return this.geplantDefiningcodeCurrentState ;
  }

  public void setEinwilligungNichtErhaltenDefiningcode(
      org.ehrbase.fhirbridge.opt.shareddefinition.EinwilligungNichtErhaltenDefiningcode einwilligungNichtErhaltenDefiningcode) {
     this.einwilligungNichtErhaltenDefiningcode = einwilligungNichtErhaltenDefiningcode;
  }

  public org.ehrbase.fhirbridge.opt.shareddefinition.EinwilligungNichtErhaltenDefiningcode getEinwilligungNichtErhaltenDefiningcode(
      ) {
     return this.einwilligungNichtErhaltenDefiningcode ;
  }

  public void setTransitionDefiningcodeTransition(
      TransitionDefiningcode transitionDefiningcodeTransition) {
     this.transitionDefiningcodeTransition = transitionDefiningcodeTransition;
  }

  public TransitionDefiningcode getTransitionDefiningcodeTransition() {
     return this.transitionDefiningcodeTransition ;
  }

  public void setTransitionDefiningcodeTransitionIsmTransitionAt0017(
      TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0017) {
     this.transitionDefiningcodeTransitionIsmTransitionAt0017 = transitionDefiningcodeTransitionIsmTransitionAt0017;
  }

  public TransitionDefiningcode getTransitionDefiningcodeTransitionIsmTransitionAt0017() {
     return this.transitionDefiningcodeTransitionIsmTransitionAt0017 ;
  }

  public void setAbgesagtDefiningcode(
      org.ehrbase.fhirbridge.opt.shareddefinition.AbgesagtDefiningcode abgesagtDefiningcode) {
     this.abgesagtDefiningcode = abgesagtDefiningcode;
  }

  public org.ehrbase.fhirbridge.opt.shareddefinition.AbgesagtDefiningcode getAbgesagtDefiningcode(
      ) {
     return this.abgesagtDefiningcode ;
  }

  public void setAbgesagtDefiningcodeCareflowStep(
      AbgesagtDefiningcode abgesagtDefiningcodeCareflowStep) {
     this.abgesagtDefiningcodeCareflowStep = abgesagtDefiningcodeCareflowStep;
  }

  public AbgesagtDefiningcode getAbgesagtDefiningcodeCareflowStep() {
     return this.abgesagtDefiningcodeCareflowStep ;
  }

  public void setTransitionDefiningcodeTransitionIsmTransitionAt0016(
      TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0016) {
     this.transitionDefiningcodeTransitionIsmTransitionAt0016 = transitionDefiningcodeTransitionIsmTransitionAt0016;
  }

  public TransitionDefiningcode getTransitionDefiningcodeTransitionIsmTransitionAt0016() {
     return this.transitionDefiningcodeTransitionIsmTransitionAt0016 ;
  }

  public void setTransitionDefiningcodeTransitionIsmTransitionAt0027(
      TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0027) {
     this.transitionDefiningcodeTransitionIsmTransitionAt0027 = transitionDefiningcodeTransitionIsmTransitionAt0027;
  }

  public TransitionDefiningcode getTransitionDefiningcodeTransitionIsmTransitionAt0027() {
     return this.transitionDefiningcodeTransitionIsmTransitionAt0027 ;
  }

  public void setAnfordererDerEinwilligungserklarung(
      List<Cluster> anfordererDerEinwilligungserklarung) {
     this.anfordererDerEinwilligungserklarung = anfordererDerEinwilligungserklarung;
  }

  public List<Cluster> getAnfordererDerEinwilligungserklarung() {
     return this.anfordererDerEinwilligungserklarung ;
  }

  public void setAbgeschlossenDefiningcode(
      org.ehrbase.fhirbridge.opt.shareddefinition.AbgeschlossenDefiningcode abgeschlossenDefiningcode) {
     this.abgeschlossenDefiningcode = abgeschlossenDefiningcode;
  }

  public org.ehrbase.fhirbridge.opt.shareddefinition.AbgeschlossenDefiningcode getAbgeschlossenDefiningcode(
      ) {
     return this.abgeschlossenDefiningcode ;
  }

  public void setBeschreibungDerEinwilligungValue(String beschreibungDerEinwilligungValue) {
     this.beschreibungDerEinwilligungValue = beschreibungDerEinwilligungValue;
  }

  public String getBeschreibungDerEinwilligungValue() {
     return this.beschreibungDerEinwilligungValue ;
  }

  public void setTransitionDefiningcodeTransitionIsmTransitionAt0014(
      TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0014) {
     this.transitionDefiningcodeTransitionIsmTransitionAt0014 = transitionDefiningcodeTransitionIsmTransitionAt0014;
  }

  public TransitionDefiningcode getTransitionDefiningcodeTransitionIsmTransitionAt0014() {
     return this.transitionDefiningcodeTransitionIsmTransitionAt0014 ;
  }

  public void setAbgeschlossenDefiningcodeCareflowStep(
      AbgeschlossenDefiningcode abgeschlossenDefiningcodeCareflowStep) {
     this.abgeschlossenDefiningcodeCareflowStep = abgeschlossenDefiningcodeCareflowStep;
  }

  public AbgeschlossenDefiningcode getAbgeschlossenDefiningcodeCareflowStep() {
     return this.abgeschlossenDefiningcodeCareflowStep ;
  }

  public void setAktivitat(List<EinwilligungserklarungAktivitatElement> aktivitat) {
     this.aktivitat = aktivitat;
  }

  public List<EinwilligungserklarungAktivitatElement> getAktivitat() {
     return this.aktivitat ;
  }

  public void setEinwilligungWiderrufenDefiningcode(
      org.ehrbase.fhirbridge.opt.shareddefinition.EinwilligungWiderrufenDefiningcode einwilligungWiderrufenDefiningcode) {
     this.einwilligungWiderrufenDefiningcode = einwilligungWiderrufenDefiningcode;
  }

  public org.ehrbase.fhirbridge.opt.shareddefinition.EinwilligungWiderrufenDefiningcode getEinwilligungWiderrufenDefiningcode(
      ) {
     return this.einwilligungWiderrufenDefiningcode ;
  }

  public void setEinwilligungWiderrufenDefiningcodeCareflowStep(
      EinwilligungWiderrufenDefiningcode einwilligungWiderrufenDefiningcodeCareflowStep) {
     this.einwilligungWiderrufenDefiningcodeCareflowStep = einwilligungWiderrufenDefiningcodeCareflowStep;
  }

  public EinwilligungWiderrufenDefiningcode getEinwilligungWiderrufenDefiningcodeCareflowStep() {
     return this.einwilligungWiderrufenDefiningcodeCareflowStep ;
  }

  public void setEinwilligungVerweigertDefiningcode(
      org.ehrbase.fhirbridge.opt.shareddefinition.EinwilligungVerweigertDefiningcode einwilligungVerweigertDefiningcode) {
     this.einwilligungVerweigertDefiningcode = einwilligungVerweigertDefiningcode;
  }

  public org.ehrbase.fhirbridge.opt.shareddefinition.EinwilligungVerweigertDefiningcode getEinwilligungVerweigertDefiningcode(
      ) {
     return this.einwilligungVerweigertDefiningcode ;
  }

  public void setEinwilligungVerweigertDefiningcodeCareflowStep(
      EinwilligungVerweigertDefiningcode einwilligungVerweigertDefiningcodeCareflowStep) {
     this.einwilligungVerweigertDefiningcodeCareflowStep = einwilligungVerweigertDefiningcodeCareflowStep;
  }

  public EinwilligungVerweigertDefiningcode getEinwilligungVerweigertDefiningcodeCareflowStep() {
     return this.einwilligungVerweigertDefiningcodeCareflowStep ;
  }

  public void setTransitionDefiningcodeTransitionIsmTransitionAt0022(
      TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0022) {
     this.transitionDefiningcodeTransitionIsmTransitionAt0022 = transitionDefiningcodeTransitionIsmTransitionAt0022;
  }

  public TransitionDefiningcode getTransitionDefiningcodeTransitionIsmTransitionAt0022() {
     return this.transitionDefiningcodeTransitionIsmTransitionAt0022 ;
  }

  public void setEinwilligungNichtErhaltenDefiningcodeCareflowStep(
      EinwilligungNichtErhaltenDefiningcode einwilligungNichtErhaltenDefiningcodeCareflowStep) {
     this.einwilligungNichtErhaltenDefiningcodeCareflowStep = einwilligungNichtErhaltenDefiningcodeCareflowStep;
  }

  public EinwilligungNichtErhaltenDefiningcode getEinwilligungNichtErhaltenDefiningcodeCareflowStep(
      ) {
     return this.einwilligungNichtErhaltenDefiningcodeCareflowStep ;
  }

  public void setTransitionDefiningcodeTransitionIsmTransitionAt0021(
      TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0021) {
     this.transitionDefiningcodeTransitionIsmTransitionAt0021 = transitionDefiningcodeTransitionIsmTransitionAt0021;
  }

  public TransitionDefiningcode getTransitionDefiningcodeTransitionIsmTransitionAt0021() {
     return this.transitionDefiningcodeTransitionIsmTransitionAt0021 ;
  }

  public void setAdresse(List<AdresseCluster> adresse) {
     this.adresse = adresse;
  }

  public List<AdresseCluster> getAdresse() {
     return this.adresse ;
  }

  public void setEinwilligungErteiltDefiningcode(
      EinwilligungErteiltDefiningcode einwilligungErteiltDefiningcode) {
     this.einwilligungErteiltDefiningcode = einwilligungErteiltDefiningcode;
  }

  public EinwilligungErteiltDefiningcode getEinwilligungErteiltDefiningcode() {
     return this.einwilligungErteiltDefiningcode ;
  }

  public void setEinwilligungErteiltDefiningcodeCurrentState(
      org.ehrbase.fhirbridge.opt.shareddefinition.EinwilligungErteiltDefiningcode einwilligungErteiltDefiningcodeCurrentState) {
     this.einwilligungErteiltDefiningcodeCurrentState = einwilligungErteiltDefiningcodeCurrentState;
  }

  public org.ehrbase.fhirbridge.opt.shareddefinition.EinwilligungErteiltDefiningcode getEinwilligungErteiltDefiningcodeCurrentState(
      ) {
     return this.einwilligungErteiltDefiningcodeCurrentState ;
  }

  public void setEinwilligendePerson(List<Cluster> einwilligendePerson) {
     this.einwilligendePerson = einwilligendePerson;
  }

  public List<Cluster> getEinwilligendePerson() {
     return this.einwilligendePerson ;
  }

  public void setTimeValue(TemporalAccessor timeValue) {
     this.timeValue = timeValue;
  }

  public TemporalAccessor getTimeValue() {
     return this.timeValue ;
  }

  public void setVerschobenDefiningcode(
      org.ehrbase.fhirbridge.opt.shareddefinition.VerschobenDefiningcode verschobenDefiningcode) {
     this.verschobenDefiningcode = verschobenDefiningcode;
  }

  public org.ehrbase.fhirbridge.opt.shareddefinition.VerschobenDefiningcode getVerschobenDefiningcode(
      ) {
     return this.verschobenDefiningcode ;
  }

  public void setVerschobenDefiningcodeCareflowStep(
      VerschobenDefiningcode verschobenDefiningcodeCareflowStep) {
     this.verschobenDefiningcodeCareflowStep = verschobenDefiningcodeCareflowStep;
  }

  public VerschobenDefiningcode getVerschobenDefiningcodeCareflowStep() {
     return this.verschobenDefiningcodeCareflowStep ;
  }

  public void setEinwilligungErbetenDefiningcode(
      org.ehrbase.fhirbridge.opt.shareddefinition.EinwilligungErbetenDefiningcode einwilligungErbetenDefiningcode) {
     this.einwilligungErbetenDefiningcode = einwilligungErbetenDefiningcode;
  }

  public org.ehrbase.fhirbridge.opt.shareddefinition.EinwilligungErbetenDefiningcode getEinwilligungErbetenDefiningcode(
      ) {
     return this.einwilligungErbetenDefiningcode ;
  }

  public void setEinwilligungErbetenDefiningcodeCareflowStep(
      EinwilligungErbetenDefiningcode einwilligungErbetenDefiningcodeCareflowStep) {
     this.einwilligungErbetenDefiningcodeCareflowStep = einwilligungErbetenDefiningcodeCareflowStep;
  }

  public EinwilligungErbetenDefiningcode getEinwilligungErbetenDefiningcodeCareflowStep() {
     return this.einwilligungErbetenDefiningcodeCareflowStep ;
  }

  public void setTransitionDefiningcodeTransitionIsmTransitionAt0019(
      TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0019) {
     this.transitionDefiningcodeTransitionIsmTransitionAt0019 = transitionDefiningcodeTransitionIsmTransitionAt0019;
  }

  public TransitionDefiningcode getTransitionDefiningcodeTransitionIsmTransitionAt0019() {
     return this.transitionDefiningcodeTransitionIsmTransitionAt0019 ;
  }

  public void setTerminGeplantDefiningcode(TerminGeplantDefiningcode terminGeplantDefiningcode) {
     this.terminGeplantDefiningcode = terminGeplantDefiningcode;
  }

  public TerminGeplantDefiningcode getTerminGeplantDefiningcode() {
     return this.terminGeplantDefiningcode ;
  }

  public void setTransitionDefiningcodeTransitionIsmTransitionAt0018(
      TransitionDefiningcode transitionDefiningcodeTransitionIsmTransitionAt0018) {
     this.transitionDefiningcodeTransitionIsmTransitionAt0018 = transitionDefiningcodeTransitionIsmTransitionAt0018;
  }

  public TransitionDefiningcode getTransitionDefiningcodeTransitionIsmTransitionAt0018() {
     return this.transitionDefiningcodeTransitionIsmTransitionAt0018 ;
  }

  public void setTerminGeplantDefiningcodeCurrentState(
      org.ehrbase.fhirbridge.opt.shareddefinition.TerminGeplantDefiningcode terminGeplantDefiningcodeCurrentState) {
     this.terminGeplantDefiningcodeCurrentState = terminGeplantDefiningcodeCurrentState;
  }

  public org.ehrbase.fhirbridge.opt.shareddefinition.TerminGeplantDefiningcode getTerminGeplantDefiningcodeCurrentState(
      ) {
     return this.terminGeplantDefiningcodeCurrentState ;
  }
}
