package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum ReAutorisierugDesRezeptsAusstehendDefiningcode implements EnumValueSet {
  REAUTORISIERUGDESREZEPTSAUSSTEHEND("Re-Autorisierug des Rezepts ausstehend", "Die Ausstellung des Rezeptes wartet auf die erneute Re-Autorisierung durch einen Arzt.", "local", "at0011");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  ReAutorisierugDesRezeptsAusstehendDefiningcode(String value, String description,
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
