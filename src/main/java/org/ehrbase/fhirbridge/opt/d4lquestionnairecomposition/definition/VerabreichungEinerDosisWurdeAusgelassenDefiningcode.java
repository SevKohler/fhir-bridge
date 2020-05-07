package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum VerabreichungEinerDosisWurdeAusgelassenDefiningcode implements EnumValueSet {
  VERABREICHUNGEINERDOSISWURDEAUSGELASSEN("Verabreichung einer Dosis wurde ausgelassen", "Eine Gabe des Arzneimittels wurde zurückgehalten und nicht gegeben. Es besteht keine Erwartung, dass sie später verabreicht wird, obwohl die nächste Dosis (falls es eine gibt) gemäß der ursprünglichen Verordnung verabreicht werden sollte.", "local", "at0018");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  VerabreichungEinerDosisWurdeAusgelassenDefiningcode(String value, String description,
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
