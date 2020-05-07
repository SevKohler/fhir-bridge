package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum AbgesagtDefiningcode implements EnumValueSet {
  ABGESAGT("Abgesagt", "Die Absicht, eine Einwilligungserklärung anzufordern, wurde aufgehoben, bevor die Einwilligung des Patienten oder seines Vertreters angefordert wurde.", "local", "at0018");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  AbgesagtDefiningcode(String value, String description, String terminologyId, String code) {
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
