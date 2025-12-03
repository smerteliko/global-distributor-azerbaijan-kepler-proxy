package com.gda.kepler.proxy.service.refineries_v2.consumption;

import com.gda.kepler.proxy.model.refineries_v2.consumption.ConsumptionModel;
import com.gda.kepler.proxy.model.refineries_v2.consumption.ConsumptionRequestModel;
import reactor.core.publisher.Mono;

import java.util.List;

public interface ConsumptionProxyService {

    /**
     * Proxies the GET request to /refineries/consumption/other-feedstock.
     * @param authorizationHeader The Authorization header value.
     * @param granularity Time series aggregation (required).
     * @param requestModel Request parameters including unit, products, splits, dates and filters.
     * @return A Mono emitting a list of DateSplitOutputModel.
     */
    Mono<List<ConsumptionModel>> getConsumptionOtherFeedstock(
        String authorizationHeader,
        String granularity,
        ConsumptionRequestModel requestModel
    );
}
