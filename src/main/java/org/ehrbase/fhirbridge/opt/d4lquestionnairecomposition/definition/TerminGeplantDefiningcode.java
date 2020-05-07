package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum TerminGeplantDefiningcode implements EnumValueSet {
  TERMINGEPLANT("Termin geplant", "Es wurde ein Termin vereinbart, um die Zustimmung einzuholen.", "local", "at0027");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  TerminGeplantDefiningcode(String value, String description, String terminologyId, String code) {
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
