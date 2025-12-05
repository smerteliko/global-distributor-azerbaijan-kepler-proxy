package com.gda.kepler.proxy.service.refineries_v2.unitruns;

import com.gda.kepler.proxy.model.refineries_v2.common.BaseDateSplitOutputModel;
import com.gda.kepler.proxy.model.refineries_v2.unitruns.UnitRunsModel;
import com.gda.kepler.proxy.model.refineries_v2.unitruns.UnitRunsRequestModel;
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
final public class UnitRunsProxyServiceImpl extends BaseRefineriesProxyService implements UnitRunsProxyService {

    private static final String PRIMARY_DISTILLATION_PATH = "/refineries/unit-runs/primary-distillation";
    private static final String SECONDARY_UNITS_PATH = "/refineries/unit-runs/secondary-units";

    // Parameterized types for responses
    private static final ParameterizedTypeReference<List<UnitRunsModel>> LIST_OF_DATE_SPLIT_OUTPUT =
        new ParameterizedTypeReference<List<UnitRunsModel>>() {};


    public UnitRunsProxyServiceImpl(WebClient.Builder webClientBuilder) {
        super(webClientBuilder);
    }

    /**
     * Proxies the GET request to /refineries/unit-runs/primary-distillation.
     */
    @Override
    public Mono<List<UnitRunsModel>> getPrimaryDistillationRuns(
        String authorizationHeader,
        String granularity,
        List<String> crudeGrades,
        List<String> crudeQualities,
        UnitRunsRequestModel requestModel
    ) {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromPath(PRIMARY_DISTILLATION_PATH);

        // Required parameter
        uriBuilder.queryParam("granularity", granularity);


        // Specific optional filters
        Optional.ofNullable(crudeGrades).filter(l -> !l.isEmpty()).ifPresent(cg -> uriBuilder.queryParam("crudeGrades", String.join(",", cg)));
        Optional.ofNullable(crudeQualities).filter(l -> !l.isEmpty()).ifPresent(cq -> uriBuilder.queryParam("crudeQualities", String.join(",", cq)));

        // Common parameters from request model (including unit and dates)
        this.addBaseQueryParams(uriBuilder, requestModel);
        return this.get(uriBuilder, authorizationHeader, LIST_OF_DATE_SPLIT_OUTPUT);

    }

    /**
     * Proxies the GET request to /refineries/unit-runs/secondary-units.
     */
    @Override
    public Mono<List<UnitRunsModel>> getSecondaryUnitsRuns(
        String authorizationHeader,
        String granularity,
        String unitType, // Required parameter for secondary units
        List<String> splits,
        UnitRunsRequestModel requestModel
    ) {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromPath(SECONDARY_UNITS_PATH);

        // Required parameters
        uriBuilder.queryParam("granularity", granularity);
        uriBuilder.queryParam("unitType", unitType);


        // Common parameters from request model (including unit and dates)
        this.addBaseQueryParams(uriBuilder, requestModel);

        return this.get(uriBuilder, authorizationHeader, LIST_OF_DATE_SPLIT_OUTPUT);

    }
}
