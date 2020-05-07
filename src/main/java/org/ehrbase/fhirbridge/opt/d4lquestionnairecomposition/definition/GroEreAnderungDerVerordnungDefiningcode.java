package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum GroEreAnderungDerVerordnungDefiningcode implements EnumValueSet {
  GROEREANDERUNGDERVERORDNUNG("Größere Änderung der Verordnung", "Eine große Änderung der Verordnung war erforderlich, die dazu führte, dass diese Verordnung gestoppt und ein neue Verordnung ausgestellt wurde.", "local", "at0039");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  GroEreAnderungDerVerordnungDefiningcode(String value, String description, String terminologyId,
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
