package com.gda.kepler.proxy.service.refineries_v2.refinedproducts;

import com.gda.kepler.proxy.model.refineries_v2.refinedproducts.RefinedProductsModel;
import com.gda.kepler.proxy.model.refineries_v2.refinedproducts.RefinedProductsRequestModel;
import com.gda.kepler.proxy.service.base.KeplerProxyService;
import com.gda.kepler.proxy.service.refineries_v2.common.BaseRefineriesProxyService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.springframework.web.util.UriComponentsBuilder;
import reactor.core.publisher.Mono;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
final public class RefinedProductsProxyServiceImpl extends BaseRefineriesProxyService implements RefinedProductsProxyService {

    private static final String REFINED_PRODUCTS_SUPPLY_PATH = "/refineries/refined-products-supply";

    // Parameterized types for responses
    private static final ParameterizedTypeReference<List<RefinedProductsModel>> LIST_OF_DATE_SPLIT_OUTPUT =
        new ParameterizedTypeReference<List<RefinedProductsModel>>() {
        };


    public RefinedProductsProxyServiceImpl(WebClient.Builder webClientBuilder) {
        super(webClientBuilder);
    }

    /**
     * Proxies the GET request to /refineries/refined-products-supply.
     */
    @Override
    public Mono<List<RefinedProductsModel>> getRefinedProductsSupply(
        String authorizationHeader,
        RefinedProductsRequestModel requestModel
    ) {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromPath(REFINED_PRODUCTS_SUPPLY_PATH);

        uriBuilder.queryParam("granularity", requestModel.getGranularity());

        Optional.ofNullable(requestModel.getUnit()).ifPresent(u -> uriBuilder.queryParam("unit", u));
        Optional.ofNullable(requestModel.getSplits()).filter(l -> !l.isEmpty()).ifPresent(s -> uriBuilder.queryParam("splits", String.join(",", s)));
        Optional.ofNullable(requestModel.getProducts()).filter(l -> !l.isEmpty()).ifPresent(p -> uriBuilder.queryParam("products", String.join(",", p)));

        this.addBaseQueryParams(uriBuilder, requestModel);

        return this.get(uriBuilder, authorizationHeader, LIST_OF_DATE_SPLIT_OUTPUT);
    }
}