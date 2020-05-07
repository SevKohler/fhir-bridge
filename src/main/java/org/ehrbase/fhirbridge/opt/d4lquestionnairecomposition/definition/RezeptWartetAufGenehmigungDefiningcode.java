package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum RezeptWartetAufGenehmigungDefiningcode implements EnumValueSet {
  REZEPTWARTETAUFGENEHMIGUNG("Rezept wartet auf Genehmigung", "Der Rezeptentwurf wurde erstellt und wartet auf die Bestätigung durch einen autorisierten Arzt. Kann auch verwendet werden, wenn die Re-autorisierung gebündelt erfolgt. Dieser \"careflow_step\" hat den Status \"geplant\" oder \"aktiv\", was die Notwendigkeit widerspiegelt, sowohl Neuaufträge als auch wieder autorisierte Aufträge zu bearbeiten.", "local", "at0145");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  RezeptWartetAufGenehmigungDefiningcode(String value, String description, String terminologyId,
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
