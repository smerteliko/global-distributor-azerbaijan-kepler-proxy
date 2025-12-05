package com.gda.kepler.proxy.service.refineries_v2.crudequality;

import com.gda.kepler.proxy.model.refineries_v2.crudequality.CrudeQualityModel;
import com.gda.kepler.proxy.model.refineries_v2.crudequality.CrudeQualityRequestModel;
import reactor.core.publisher.Mono;

import java.util.List;

public interface CrudeQualityProxyService {

    /**
     * Proxies the GET request to /refineries/crude-quality.
     * @param authorizationHeader The Authorization header value.
     * @param granularity Time series aggregation (required).
     * @param requestModel Request parameters including dates and filters.
     * @return A Mono emitting a list of DateSplitOutputModel.
     */
    Mono<List<CrudeQualityModel>> getCrudeQuality(
        String authorizationHeader,
        CrudeQualityRequestModel requestModel
    );
}
