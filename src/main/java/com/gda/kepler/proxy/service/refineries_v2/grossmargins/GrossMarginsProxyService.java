package com.gda.kepler.proxy.service.refineries_v2.grossmargins;

import com.gda.kepler.proxy.model.refineries_v2.grossmargins.GrossMarginsModel;
import com.gda.kepler.proxy.model.refineries_v2.grossmargins.GrossMarginsRequestModel;
import reactor.core.publisher.Mono;

import java.util.List;

public interface GrossMarginsProxyService {

    /**
     * Proxies the GET request to /refineries/margins.
     * @param authorizationHeader The Authorization header value.
     * @param granularity Time series aggregation (required).
     * @param requestModel Request parameters including dates and filters.
     * @return A Mono emitting a list of DateSplitOutputModel.
     */
    Mono<List<GrossMarginsModel>> getGrossMargins(
        String authorizationHeader,
        GrossMarginsRequestModel requestModel
    );
}
