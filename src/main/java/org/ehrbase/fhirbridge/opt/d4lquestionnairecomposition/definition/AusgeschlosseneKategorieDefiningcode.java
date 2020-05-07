package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum AusgeschlosseneKategorieDefiningcode implements EnumValueSet {
  DIAGNOSE("Problem/Diagnose", "Das Problem oder die Diagnose, auf die sich die Ausschlussaussage bezieht. Zum Beispiel: \"Diabetes\", \"COPD\" oder \"Asthma\".", "local", "at0004"),

  FAMILIAREKRANKENGESCHICHTE("Familiäre Krankengeschichte", "Das Element der familiären Krankengeschichte auf das sich die Ausschlussaussage bezieht. Zum Beispiel: Herzerkrankung, Diabetes oder Alzheimer.", "local", "at0005"),

  ALLERGEN("Nebenwirkungen auslösende Substanz/Allergen", "Die Bennenung der Nebenwirkungen auslösenden Substanz/des Allergens, welche/s ausgeschlossen wird. Zum Beispiel: \"Penicillin\", \"Erdnüsse\" oder \"Latex\".", "local", "at0008"),

  EINGRIFF("Eingriff", "Der Eingriff, auf den sich die Ausschlussaussage bezieht. Zum Beispiel: \"Herz-OP\" oder \"Appendektomie\" oder \"Hüftersatz\".", "local", "at0007"),

  MEDIKATION("Medikation", "Der Name des Medikaments, auf das sich die Ausschlussaussage bezieht. Zum Beispiel: \"Paracetamol\", \"Codein\" oder \"Antidepressiva\".", "local", "at0006");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  AusgeschlosseneKategorieDefiningcode(String value, String description, String terminologyId,
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
