package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum RezeptIstReAutorisiertDefiningcode implements EnumValueSet {
  REZEPTISTREAUTORISIERT("Rezept ist re-autorisiert", "Die ursprüngliche Arzneimittelverordnung wurde erneut genehmigt, um eine wiederholte Verschreibung oder Abgabe zu ermöglichen. In einigen Ländern, wie z.B. Deutschland, muss unter diesen Umständen ein völlig neues Rezept ausgestellt werden.", "local", "at0106");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  RezeptIstReAutorisiertDefiningcode(String value, String description, String terminologyId,
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
