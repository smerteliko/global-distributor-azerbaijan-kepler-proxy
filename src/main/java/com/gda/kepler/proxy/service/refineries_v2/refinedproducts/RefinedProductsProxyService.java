package com.gda.kepler.proxy.service.refineries_v2.refinedproducts;

import com.gda.kepler.proxy.model.refineries_v2.refinedproducts.RefinedProductsModel;
import com.gda.kepler.proxy.model.refineries_v2.refinedproducts.RefinedProductsRequestModel;
import reactor.core.publisher.Mono;

import java.util.List;

public interface RefinedProductsProxyService {

    /**
     * Proxies the GET request to /refineries/refined-products-supply.
     * @param authorizationHeader The Authorization header value.
     * @param granularity Time series aggregation (required).
     * @param requestModel Request parameters including unit, products, splits, dates and filters.
     * @return A Mono emitting a list of DateSplitOutputModel.
     */
    Mono<List<RefinedProductsModel>> getRefinedProductsSupply(
        String authorizationHeader,
        String granularity,
        RefinedProductsRequestModel requestModel
    );
}
