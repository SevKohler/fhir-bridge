package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum GeringfugigeAnderungDerVerordnungDefiningcode implements EnumValueSet {
  GERINGFUGIGEANDERUNGDERVERORDNUNG("Geringfügige Änderung der Verordnung", "Die Arzneimittelverordnung wurde so geändert, dass keine neue Verordnung/neues Rezept nach den lokalen klinischen Regeln ausgestellt werden muss.", "local", "at0041");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  GeringfugigeAnderungDerVerordnungDefiningcode(String value, String description,
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
