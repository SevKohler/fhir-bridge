package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum ArzneimittelWurdeNeuBewertetDefiningcode implements EnumValueSet {
  ARZNEIMITTELWURDENEUBEWERTET("Arzneimittel wurde neu bewertet", "Das individuelle Arzneimittel wurde neu bewertet, beispielsweise ob das Arzneimittel noch angewendet werden soll. Eine Überprüfung der Arzneimittelliste soll nicht durchgeführt werden.", "local", "at0005");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  ArzneimittelWurdeNeuBewertetDefiningcode(String value, String description, String terminologyId,
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
