package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum EinwilligungWiderrufenDefiningcode implements EnumValueSet {
  EINWILLIGUNGWIDERRUFEN("Einwilligung widerrufen", "Nach der ersten Übermittlung einer Einwilligungserklärung wurde diese vom Patienten oder seinem Vertreter widerrufen.", "local", "at0017");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  EinwilligungWiderrufenDefiningcode(String value, String description, String terminologyId,
      String code) {
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
