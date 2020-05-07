package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Choice;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;

@Entity
@Archetype("openEHR-EHR-SECTION.adhoc.v1")
@OptionFor("SECTION")
public class AdHocUberschriftSection3 implements D4LQuestionnaireOrgEhrbaseEhrEncodeWrappersSnakecase3ec2eceaAdHocUberschriftChoice {
  @Path("/items[openEHR-EHR-EVALUATION.problem_diagnosis.v1]")
  @Choice
  private AdHocUberschriftDiagnoseChoice diagnose;

  public void setDiagnose(AdHocUberschriftDiagnoseChoice diagnose) {
     this.diagnose = diagnose;
  }

  public AdHocUberschriftDiagnoseChoice getDiagnose() {
     return this.diagnose ;
  }
}
