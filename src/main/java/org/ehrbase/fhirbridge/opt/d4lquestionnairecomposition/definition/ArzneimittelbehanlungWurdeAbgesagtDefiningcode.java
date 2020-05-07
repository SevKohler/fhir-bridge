package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum ArzneimittelbehanlungWurdeAbgesagtDefiningcode implements EnumValueSet {
  ARZNEIMITTELBEHANLUNGWURDEABGESAGT("Arzneimittelbehanlung wurde abgesagt", "Die geplante Arzneimittelbehanlung wurde vor der Verabreichung abgesagt.", "local", "at0012");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  ArzneimittelbehanlungWurdeAbgesagtDefiningcode(String value, String description,
      String terminologyId, String code) {
    this.value = value;
    this.description = description;
    this.terminologyId = terminologyId;
    this.code = code;
  }

  public String getValue() {
     return this.value ;
  }

  public String getDescription() {
     return this.description ;
  }

  public String getTerminologyId() {
     return this.terminologyId ;
  }

  public String getCode() {
     return this.code ;
  }
}
