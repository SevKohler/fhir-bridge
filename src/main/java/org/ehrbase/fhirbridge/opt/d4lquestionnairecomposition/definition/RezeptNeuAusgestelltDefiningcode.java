package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum RezeptNeuAusgestelltDefiningcode implements EnumValueSet {
  REZEPTNEUAUSGESTELLT("Rezept neu ausgestellt", "Ein Rezept wurde für eine vorhandene Arzneimittelverordnung neu ausgestellt.", "local", "at0010");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  RezeptNeuAusgestelltDefiningcode(String value, String description, String terminologyId,
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
