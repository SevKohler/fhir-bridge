package org.ehrbase.fhirbridge.mapping.F2OQuestionnaire;

import com.nedap.archie.rm.generic.PartySelf;
import org.ehrbase.fhirbridge.opt.Composition;
import org.ehrbase.fhirbridge.opt.shareddefinition.CategoryDefiningcode;
import org.ehrbase.fhirbridge.opt.shareddefinition.Language;
import org.ehrbase.fhirbridge.opt.shareddefinition.SettingDefiningcode;
import org.ehrbase.fhirbridge.opt.shareddefinition.Territory;
import org.hl7.fhir.r4.model.DomainResource;

import java.time.OffsetDateTime;

public abstract class F2O {

    public static Composition map(DomainResource fhirResource){
        throw new IllegalArgumentException("No mapping class defined");
    };

    public static Composition generateRequiredFields(Composition composition){
        composition.setLanguage(Language.EN);
        composition.setLocation("test");
        composition.setSettingDefiningcode(SettingDefiningcode.EMERGENCYCARE);
        composition.setTerritory(Territory.DE);
        composition.setCategoryDefiningcode(CategoryDefiningcode.EVENT);
        composition.setStartTimeValue(OffsetDateTime.now());
        composition.setComposer(new PartySelf());
        return composition;
    }
}
