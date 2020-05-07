package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum VerabreichungEinerDosisWurdeVerschobenDefiningcode implements EnumValueSet {
  VERABREICHUNGEINERDOSISWURDEVERSCHOBEN("Verabreichung einer Dosis wurde verschoben", "Die Verabreichung einer Dosis hat sich verzögert, wird aber so schnell wie möglich erfolgen.", "local", "at0044");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  VerabreichungEinerDosisWurdeVerschobenDefiningcode(String value, String description,
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
