package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum VerabreichungWurdeAusgesetztDefiningcode implements EnumValueSet {
  VERABREICHUNGWURDEAUSGESETZT("Verabreichung wurde ausgesetzt", "Die Verabreichung des Arzneimittels wurde bis zum Erhalt weiterer Informationen ausgesetzt. Es sollten keine weiteren Dosen, bis zur Bekanntgabe des neuen Startdatums oder bis die Bedingungen erfüllt sind, verabreicht werden. Wenn Sie das Datum/Bedingungen für den Neustart nach dem Aussetzen festlegen, sollte ein \"suspend_step\" von der ausgesetzten Gabe und zurück erfolgen.", "local", "at0009");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  VerabreichungWurdeAusgesetztDefiningcode(String value, String description, String terminologyId,
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
