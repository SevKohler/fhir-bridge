package org.ehrbase.fhirbridge.mapping.F2OQuestionnaire;

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

    public static Composition generateRequiredFields(Composition composite){
        composite.setLanguage(Language.EN);
        composite.setLocation("test");
        composite.setSettingDefiningcode(SettingDefiningcode.EMERGENCYCARE);
        composite.setTerritory(Territory.DE);
        composite.setCategoryDefiningcode(CategoryDefiningcode.EVENT);
        composite.setStartTimeValue(OffsetDateTime.now());
        return composite;
    }
}
