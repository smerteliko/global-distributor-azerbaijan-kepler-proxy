package com.gda.kepler.proxy.service.refineries_v2.consumption;

import com.gda.kepler.proxy.model.refineries_v2.consumption.ConsumptionModel;
import com.gda.kepler.proxy.model.refineries_v2.consumption.ConsumptionRequestModel;
import com.gda.kepler.proxy.service.refineries_v2.common.BaseRefineriesProxyService; // НАСЛЕДУЕМ
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;

@Service
final public class ConsumptionProxyServiceImpl extends BaseRefineriesProxyService implements ConsumptionProxyService {

    private static final String OTHER_FEEDSTOCK_PATH = "/refineries/consumption/other-feedstock";

    // Parameterized types for responses
    private static final ParameterizedTypeReference<List<ConsumptionModel>> LIST_OF_DATE_SPLIT_OUTPUT =
        new ParameterizedTypeReference<List<ConsumptionModel>>() {};


    public ConsumptionProxyServiceImpl(WebClient.Builder webClientBuilder,
                                       @Value("${kepler.api-key}") String keplerApiKey,
                                       @Value("${kepler.api.base-url}") String keplerBaseUrl) {
        super(webClientBuilder, keplerApiKey, keplerBaseUrl);
    }

    /**
     * Helper method to add specific query parameters.
     */
    protected void addSpecificQueryParams(UriComponentsBuilder uriBuilder, ConsumptionRequestModel requestModel) {
        Optional.ofNullable(requestModel.getUnit()).ifPresent(u -> uriBuilder.queryParam("unit", u));
        Optional.ofNullable(requestModel.getProducts()).filter(l -> !l.isEmpty()).ifPresent(p -> uriBuilder.queryParam("products", String.join(",", p)));

        Optional.ofNullable(requestModel.getSplits()).filter(l -> !l.isEmpty()).ifPresent(s -> uriBuilder.queryParam("splits", String.join(",", s)));
    }

    /**
     * Proxies the GET request to /refineries/consumption/other-feedstock.
     */
    @Override
    public Mono<List<ConsumptionModel>> getConsumptionOtherFeedstock(
        String authorizationHeader,
        String granularity,
        ConsumptionRequestModel requestModel
    ) {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromPath(OTHER_FEEDSTOCK_PATH);

        uriBuilder.queryParam("granularity", granularity);

        this.addBaseQueryParams(uriBuilder, requestModel);

        addSpecificQueryParams(uriBuilder, requestModel);

        return this.get(uriBuilder, authorizationHeader, LIST_OF_DATE_SPLIT_OUTPUT);
    }
}
