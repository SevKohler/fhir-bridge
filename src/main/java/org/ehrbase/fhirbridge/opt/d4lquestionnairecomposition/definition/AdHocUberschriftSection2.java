package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import java.util.List;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;

@Entity
@Archetype("openEHR-EHR-SECTION.adhoc.v1")
@OptionFor("SECTION")
public class AdHocUberschriftSection2 implements D4LQuestionnaireOrgEhrbaseEhrEncodeWrappersSnakecase3ec2eceaAdHocUberschriftChoice {
  @Path("/items[openEHR-EHR-EVALUATION.problem_diagnosis.v1]")
  private List<DiagnoseEvaluation> diagnose;

  public void setDiagnose(List<DiagnoseEvaluation> diagnose) {
     this.diagnose = diagnose;
  }

  public List<DiagnoseEvaluation> getDiagnose() {
     return this.diagnose ;
  }
}
