package com.gda.kepler.proxy.service.refineries_v2.particular;

import com.gda.kepler.proxy.model.refineries_v2.particular.ParticularRequestModel;
import com.gda.kepler.proxy.model.refineries_v2.particular.ParticularModel;
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
final public class RefineriesProxyServiceImpl extends BaseRefineriesProxyService implements RefineriesProxyService {

    private static final String PARTICULARS_PATH = "/refineries/particulars";

    // Parameterized types for responses
    private static final ParameterizedTypeReference<List<ParticularModel>> LIST_OF_PARTICULAR =
        new ParameterizedTypeReference<List<ParticularModel>>() {};


    public RefineriesProxyServiceImpl(WebClient.Builder webClientBuilder,
                                      @Value("${kepler.api-key}") String keplerApiKey,
                                      @Value("${kepler.api.base-url}") String keplerBaseUrl) {
        super(webClientBuilder, keplerApiKey, keplerBaseUrl);
    }

    @Override
    public Mono<List<ParticularModel>> getParticulars(
        String authorizationHeader,
        ParticularRequestModel requestModel
    ) {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromPath(PARTICULARS_PATH);
        // Date parameters (Defaults applied in the service if null)
        this.addBaseQueryParams(uriBuilder, requestModel);
        // Execute the request
        return this.get(uriBuilder, authorizationHeader, LIST_OF_PARTICULAR);

    }

}
