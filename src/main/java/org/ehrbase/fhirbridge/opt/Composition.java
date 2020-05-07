package org.ehrbase.fhirbridge.opt;

import com.nedap.archie.rm.generic.Participation;
import com.nedap.archie.rm.generic.PartyIdentified;
import com.nedap.archie.rm.generic.PartyProxy;
import org.ehrbase.client.annotations.Id;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.openehrclient.VersionUid;
import org.ehrbase.fhirbridge.opt.laborbefundcomposition.definition.FallidentifikationCluster;
import org.ehrbase.fhirbridge.opt.laborbefundcomposition.definition.LaborergebnisObservation;
import org.ehrbase.fhirbridge.opt.shareddefinition.CategoryDefiningcode;
import org.ehrbase.fhirbridge.opt.shareddefinition.Language;
import org.ehrbase.fhirbridge.opt.shareddefinition.SettingDefiningcode;
import org.ehrbase.fhirbridge.opt.shareddefinition.Territory;

import java.time.temporal.TemporalAccessor;
import java.util.List;

public abstract class Composition {

    @Id
    private VersionUid versionUid;


    @Path("/context/participations")
    private List<Participation> participations;

    @Path("/language")
    private Language language;

    @Path("/territory")
    private Territory territory;

    @Path("/context/setting|defining_code")
    private SettingDefiningcode settingDefiningcode;

    @Path("/context/location")
    private String location;

    @Path("/category|defining_code")
    private CategoryDefiningcode categoryDefiningcode;

    @Path("/context/start_time|value")
    private TemporalAccessor startTimeValue;

    //TODO actually implement them since unecessary in other composites (if deleted in pto script)
    public abstract VersionUid getVersionUid();
    public abstract List<Participation> getParticipations() ;
    public abstract Language getLanguage() ;
    public abstract Territory getTerritory();
    public abstract SettingDefiningcode getSettingDefiningcode() ;
    public abstract String getLocation();
    public abstract CategoryDefiningcode getCategoryDefiningcode() ;
    public abstract TemporalAccessor getStartTimeValue() ;
    public abstract void setVersionUid(VersionUid versionUid) ;
    public abstract void setParticipations(List<Participation> participations) ;
    public abstract void setLanguage(Language language);
    public abstract void setTerritory(Territory territory);
    public abstract void setSettingDefiningcode(SettingDefiningcode settingDefiningcode);
    public abstract void setLocation(String location);
    public abstract void setCategoryDefiningcode(CategoryDefiningcode categoryDefiningcode);
    public abstract void setStartTimeValue(TemporalAccessor startTimeValue);
}
