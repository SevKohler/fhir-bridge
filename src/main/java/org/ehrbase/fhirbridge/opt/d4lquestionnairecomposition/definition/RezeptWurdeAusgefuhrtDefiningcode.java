package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum RezeptWurdeAusgefuhrtDefiningcode implements EnumValueSet {
  REZEPTWURDEAUSGEFUHRT("Rezept wurde ausgeführt", "Das Rezept wurde erfolgreich ausgeführt/eingehalten.", "local", "at0152");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  RezeptWurdeAusgefuhrtDefiningcode(String value, String description, String terminologyId,
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
