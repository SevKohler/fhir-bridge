package org.ehrbase.fhirbridge.opt.shareddefinition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum ArzneimittelbehandlungGestopptDefiningcode implements EnumValueSet {
  ABORTED("aborted", "aborted", "openehr", "531");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  ArzneimittelbehandlungGestopptDefiningcode(String value, String description, String terminologyId,
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
