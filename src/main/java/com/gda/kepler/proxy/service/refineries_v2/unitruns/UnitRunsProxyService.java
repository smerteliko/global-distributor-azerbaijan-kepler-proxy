package com.gda.kepler.proxy.service.refineries_v2.unitruns;

import com.gda.kepler.proxy.model.refineries_v2.common.BaseDateSplitOutputModel;
import com.gda.kepler.proxy.model.refineries_v2.unitruns.UnitRunsModel;
import com.gda.kepler.proxy.model.refineries_v2.unitruns.UnitRunsRequestModel;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * Service for proxying requests to the Kepler API v2 Unit Runs group.
 * Handles operational run data for primary and secondary distillation units.
 */
public interface UnitRunsProxyService {

    /**
     * Proxies the GET request to /refineries/unit-runs/primary-distillation.
     * @param authorizationHeader Authorization header (Bearer token) from the client.
     * @return Mono with a list of DateSplitOutput objects.
     */
    Mono<List<UnitRunsModel>> getPrimaryDistillationRuns(
        String authorizationHeader,
        String granularity,
        List<String> crudeGrades,
        List<String> crudeQualities,
        UnitRunsRequestModel requestModel
    );

    /**
     * Proxies the GET request to /refineries/unit-runs/secondary-units.
     * @param authorizationHeader Authorization header (Bearer token) from the client.
     * @return Mono with a list of DateSplitOutput objects.
     */
    Mono<List<UnitRunsModel>> getSecondaryUnitsRuns(
        String authorizationHeader,
        String granularity,
        String unitType,
        List<String> splits,
        UnitRunsRequestModel requestModel
    );
}
