package com.gda.kepler.proxy.service.refineries_v2.utilizationrate;

import com.gda.kepler.proxy.model.refineries_v2.common.BaseDateSplitOutputModel;
import com.gda.kepler.proxy.model.refineries_v2.utilizationrate.UtilisationRatesModel;
import com.gda.kepler.proxy.model.refineries_v2.utilizationrate.UtilizationRatesRequestModel;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * Service for proxying requests to the Kepler API v2 Utilization Rates group.
 * Handles available utilization rate data.
 */
public interface UtilizationRatesProxyService {

    /**
     * Proxies the GET request to /refineries/utilization-rates.
     * @param authorizationHeader Authorization header (Bearer token) from the client.
     * @param granularity Time series aggregation (required).
     * @param unitType Refinery unit name (optional, defaults to Primary Distillation).
     * @param requestModel Request model containing query parameters (splits, dates, filters).
     * @return Mono with a list of DateSplitOutputModel objects.
     */
    Mono<List<UtilisationRatesModel>> getUtilizationRates(
        String authorizationHeader,
        String granularity,
        String unitType,
        UtilizationRatesRequestModel requestModel
    );
}
