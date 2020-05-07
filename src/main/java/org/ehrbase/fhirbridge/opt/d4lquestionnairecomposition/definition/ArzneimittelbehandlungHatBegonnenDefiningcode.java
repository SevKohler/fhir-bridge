package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum ArzneimittelbehandlungHatBegonnenDefiningcode implements EnumValueSet {
  ARZNEIMITTELBEHANDLUNGHATBEGONNEN("Arzneimittelbehandlung hat begonnen", "Das Arzneimittel wurde zum ersten Mal von dem Patienten eingenommen oder verabreicht. Obwohl in einigen Situation die erste von mehreren Anwendungen errechenbar ist, kann es in der Primärversorgung sein, dass genaue Verabreichungsdaten nicht ohne weiteres verfügbar sind.", "local", "at0004");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  ArzneimittelbehandlungHatBegonnenDefiningcode(String value, String description,
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
