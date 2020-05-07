package org.ehrbase.fhirbridge.opt.d4lquestionnairecomposition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import java.lang.Boolean;
import java.lang.String;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.fhirbridge.opt.shareddefinition.AktuelleAnwendungDefiningcode;
import org.ehrbase.fhirbridge.opt.shareddefinition.Language;

public class ZusammenfassungDerMedikationEvaluation2Containment extends Containment {
  public SelectAqlField<ZusammenfassungDerMedikationEvaluation2> ZUSAMMENFASSUNG_DER_MEDIKATION_EVALUATION2 = new AqlFieldImp<ZusammenfassungDerMedikationEvaluation2>(ZusammenfassungDerMedikationEvaluation2.class, "", "ZusammenfassungDerMedikationEvaluation2", ZusammenfassungDerMedikationEvaluation2.class, this);

  public SelectAqlField<Boolean> AKTUELLE_ANWENDUNG_VALUE = new AqlFieldImp<Boolean>(ZusammenfassungDerMedikationEvaluation2.class, "/data[at0001]/items[at0004]/value|value", "aktuelleAnwendungValue", Boolean.class, this);

  public SelectAqlField<AktuelleAnwendungDefiningcode> AKTUELLE_ANWENDUNG_DEFININGCODE = new AqlFieldImp<AktuelleAnwendungDefiningcode>(ZusammenfassungDerMedikationEvaluation2.class, "/data[at0001]/items[at0004]/null_flavour|defining_code", "aktuelleAnwendungDefiningcode", AktuelleAnwendungDefiningcode.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(ZusammenfassungDerMedikationEvaluation2.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<String> NAME_DES_MEDIKAMENTS_VALUE = new AqlFieldImp<String>(ZusammenfassungDerMedikationEvaluation2.class, "/data[at0001]/items[at0002]/value|value", "nameDesMedikamentsValue", String.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(ZusammenfassungDerMedikationEvaluation2.class, "/language", "language", Language.class, this);

  public ListSelectAqlField<Cluster> ERWEITERUNG = new ListAqlFieldImp<Cluster>(ZusammenfassungDerMedikationEvaluation2.class, "/protocol[at0005]/items[at0019]", "erweiterung", Cluster.class, this);

  private ZusammenfassungDerMedikationEvaluation2Containment() {
    super("openEHR-EHR-EVALUATION.medication_summary.v0");
  }

  public static ZusammenfassungDerMedikationEvaluation2Containment getInstance() {
    return new ZusammenfassungDerMedikationEvaluation2Containment();
  }
}
