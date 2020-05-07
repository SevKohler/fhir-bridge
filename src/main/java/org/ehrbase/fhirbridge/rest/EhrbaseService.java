package org.ehrbase.fhirbridge.rest;

import org.ehrbase.client.openehrclient.VersionUid;
import org.ehrbase.client.openehrclient.defaultrestclient.DefaultRestClient;
import org.ehrbase.fhirbridge.opt.Composition;
import org.ehrbase.fhirbridge.opt.diagnosecomposition.DiagnoseComposition;
import org.ehrbase.fhirbridge.opt.intensivmedizinischesmonitoringkorpertemperaturcomposition.IntensivmedizinischesMonitoringKorpertemperaturComposition;
import org.ehrbase.fhirbridge.opt.kennzeichnungerregernachweissarscov2composition.KennzeichnungErregernachweisSARSCoV2Composition;
import org.ehrbase.fhirbridge.opt.laborbefundcomposition.LaborbefundComposition;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class EhrbaseService {

    private final DefaultRestClient client;

    public EhrbaseService(DefaultRestClient client) {
        this.client = client;
    }

    public UUID createEhr() {
        return client.ehrEndpoint().createEhr();
    }

    public VersionUid save(UUID ehrId, Composition composition) {
        client.compositionEndpoint(ehrId).mergeCompositionEntity(composition);
        return composition.getVersionUid();
    }

}
