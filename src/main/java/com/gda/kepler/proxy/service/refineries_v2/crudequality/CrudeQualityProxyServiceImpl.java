package com.gda.kepler.proxy.service.refineries_v2.crudequality;

import com.gda.kepler.proxy.model.refineries_v2.crudequality.CrudeQualityModel;
import com.gda.kepler.proxy.model.refineries_v2.crudequality.CrudeQualityRequestModel;
import com.gda.kepler.proxy.service.base.KeplerProxyService;
import com.gda.kepler.proxy.service.refineries_v2.common.BaseRefineriesProxyService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;
import reactor.core.publisher.Mono;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
final public class CrudeQualityProxyServiceImpl extends BaseRefineriesProxyService implements CrudeQualityProxyService {

    private static final String CRUDE_QUALITY_PATH = "/refineries/crude-quality";

    // Parameterized types for responses
    private static final ParameterizedTypeReference<List<CrudeQualityModel>> LIST_OF_DATE_SPLIT_OUTPUT =
        new ParameterizedTypeReference<List<CrudeQualityModel>>() {};


    public CrudeQualityProxyServiceImpl(WebClient.Builder webClientBuilder,
                                        @Value("${kepler.api-key}") String keplerApiKey,
                                        @Value("${kepler.api.base-url}") String keplerBaseUrl) {
        super(webClientBuilder, keplerApiKey, keplerBaseUrl);
    }


    /**
     * Proxies the GET request to /refineries/crude-quality.
     */
    @Override
    public Mono<List<CrudeQualityModel>> getCrudeQuality(
        String authorizationHeader,
        String granularity,
        CrudeQualityRequestModel requestModel
    ) {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromPath(CRUDE_QUALITY_PATH);

        uriBuilder.queryParam("granularity", granularity);

        this.addBaseQueryParams(uriBuilder, requestModel);

        return this.get(uriBuilder, authorizationHeader, LIST_OF_DATE_SPLIT_OUTPUT);
    }
}
