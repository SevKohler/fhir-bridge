package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum AbgeschlossenDefiningcode implements EnumValueSet {
  ABGESCHLOSSEN("Abgeschlossen", "Der Patient oder sein Vertreter hat eine Einwilligungserklärung abgegeben und die Aktivität ist nun abgeschlossen.", "local", "at0022");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  AbgeschlossenDefiningcode(String value, String description, String terminologyId, String code) {
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
