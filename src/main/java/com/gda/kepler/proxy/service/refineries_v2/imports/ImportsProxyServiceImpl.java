package com.gda.kepler.proxy.service.refineries_v2.imports;

import com.gda.kepler.proxy.model.refineries_v2.common.BaseTimeSeriesRequestModel;
import com.gda.kepler.proxy.model.refineries_v2.imports.ImportsCrudeCoModel;
import com.gda.kepler.proxy.model.refineries_v2.imports.ImportsCrudeCoRequestModel;
import com.gda.kepler.proxy.model.refineries_v2.imports.ImportsOtherFeedstockModel;
import com.gda.kepler.proxy.model.refineries_v2.imports.ImportsOtherFeedstockRequestModel;
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
final public class ImportsProxyServiceImpl extends BaseRefineriesProxyService implements ImportsProxyService {

    private static final String CRUDE_CO_PATH = "/refineries/imports/crude-co";
    private static final String OTHER_FEEDSTOCK_PATH = "/refineries/imports/other-feedstock";

    // Parameterized types for responses
    private static final ParameterizedTypeReference<List<ImportsCrudeCoModel>> LIST_CRUDE_CO =
        new ParameterizedTypeReference<List<ImportsCrudeCoModel>>() {};
    private static final ParameterizedTypeReference<List<ImportsOtherFeedstockModel>> LIST_OF_FEEDSTOCK =
        new ParameterizedTypeReference<List<ImportsOtherFeedstockModel>>() {};


    public ImportsProxyServiceImpl(WebClient.Builder webClientBuilder,
                                   @Value("${kepler.api-key}") String keplerApiKey,
                                   @Value("${kepler.api.base-url}") String keplerBaseUrl) {
        super(webClientBuilder, keplerApiKey, keplerBaseUrl);
    }



    /**
     * Proxies the GET request to /refineries/imports/crude-co.
     */
    @Override
    public Mono<List<ImportsCrudeCoModel>> getImportsCrudeCo(
        String authorizationHeader,
        String granularity,
        ImportsCrudeCoRequestModel requestModel
    ) {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromPath(CRUDE_CO_PATH);

        // Required parameter
        uriBuilder.queryParam("granularity", granularity);

        // Specific parameters
        Optional.ofNullable(requestModel.getUnit()).ifPresent(u -> uriBuilder.queryParam("unit", u));
        Optional.ofNullable(requestModel.getSplits()).filter(l -> !l.isEmpty()).ifPresent(s -> uriBuilder.queryParam("splits", String.join(",", s)));
        Optional.ofNullable(requestModel.getCrudeGrades()).filter(l -> !l.isEmpty()).ifPresent(cg -> uriBuilder.queryParam("crudeGrades", String.join(",", cg)));
        Optional.ofNullable(requestModel.getCrudeQualities()).filter(l -> !l.isEmpty()).ifPresent(cq -> uriBuilder.queryParam("crudeQualities", String.join(",", cq)));

        // Common parameters from base request model
        this.addBaseQueryParams(uriBuilder, requestModel);

        // Используем чистый метод родителя
        return this.get(uriBuilder, authorizationHeader, LIST_CRUDE_CO);
    }

    /**
     * Proxies the GET request to /refineries/imports/other-feedstock.
     */
    @Override
    public Mono<List<ImportsOtherFeedstockModel>> getImportsOtherFeedstock(
        String authorizationHeader,
        String granularity,
        ImportsOtherFeedstockRequestModel requestModel
    ) {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromPath(OTHER_FEEDSTOCK_PATH);

        // Required parameter
        uriBuilder.queryParam("granularity", granularity);

        // Specific parameters
        Optional.ofNullable(requestModel.getUnit()).ifPresent(u -> uriBuilder.queryParam("unit", u));
        Optional.ofNullable(requestModel.getSplits()).filter(l -> !l.isEmpty()).ifPresent(s -> uriBuilder.queryParam("splits", String.join(",", s)));
        Optional.ofNullable(requestModel.getProducts()).filter(l -> !l.isEmpty()).ifPresent(p -> uriBuilder.queryParam("products", String.join(",", p)));

        // Common parameters from base request model
        this.addBaseQueryParams(uriBuilder, requestModel);

        // Используем чистый метод родителя
        return this.get(uriBuilder, authorizationHeader, LIST_OF_FEEDSTOCK);
    }
}
