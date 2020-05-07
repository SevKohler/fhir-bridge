package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum AllgemeinerStatusDefiningcode implements EnumValueSet {
  DERZEITIGERRAUCHER("Derzeitiger Raucher", "Die Person ist derzeitiger Tabakraucher.", "local", "at0003");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  AllgemeinerStatusDefiningcode(String value, String description, String terminologyId,
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
