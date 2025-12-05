package com.gda.kepler.proxy.service.refineries_v2.grossmargins;

import com.gda.kepler.proxy.model.refineries_v2.grossmargins.GrossMarginsModel;
import com.gda.kepler.proxy.model.refineries_v2.grossmargins.GrossMarginsRequestModel;
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
final public class GrossMarginsProxyServiceImpl extends BaseRefineriesProxyService implements GrossMarginsProxyService {

    private static final String GROSS_MARGINS_PATH = "/refineries/margins";

    // Parameterized types for responses
    private static final ParameterizedTypeReference<List<GrossMarginsModel>> LIST_OF_DATE_SPLIT_OUTPUT =
        new ParameterizedTypeReference<List<GrossMarginsModel>>() {};


    public GrossMarginsProxyServiceImpl(WebClient.Builder webClientBuilder) {
        super(webClientBuilder);
    }



    /**
     * Proxies the GET request to /refineries/margins.
     */
    @Override
    public Mono<List<GrossMarginsModel>> getGrossMargins(
        String authorizationHeader,
        GrossMarginsRequestModel requestModel
    ) {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromPath(GROSS_MARGINS_PATH);


        uriBuilder.queryParam("granularity", requestModel.getGranularity());

        Optional.ofNullable(requestModel.getSplits()).filter(l -> !l.isEmpty()).ifPresent(s -> uriBuilder.queryParam("splits", String.join(",", s)));

        this.addBaseQueryParams(uriBuilder, requestModel);

        return this.get(uriBuilder, authorizationHeader, LIST_OF_DATE_SPLIT_OUTPUT);

    }
}
