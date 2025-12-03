package com.gda.kepler.proxy.service.refineries_v2.utilizationrate;
import com.gda.kepler.proxy.model.refineries_v2.utilizationrate.UtilisationRatesModel;
import com.gda.kepler.proxy.model.refineries_v2.utilizationrate.UtilizationRatesRequestModel;
import com.gda.kepler.proxy.service.base.KeplerProxyService;
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
final public class UtilizationRatesProxyServiceImpl extends KeplerProxyService implements UtilizationRatesProxyService {

    private static final String UTILIZATION_RATES_PATH = "/refineries/utilization-rates";

    // Parameterized types for responses
    private static final ParameterizedTypeReference<List<UtilisationRatesModel>> LIST_OF_DATE_SPLIT_OUTPUT =
        new ParameterizedTypeReference<List<UtilisationRatesModel>>() {};


    public UtilizationRatesProxyServiceImpl(WebClient.Builder webClientBuilder,
                                            @Value("${kepler.api-key}") String keplerApiKey,
                                            @Value("${kepler.api.base-url}") String keplerBaseUrl) {
        super(webClientBuilder, keplerApiKey, keplerBaseUrl);
    }

    /**
     * Helper method to add common query parameters from the base request model.
     */
    private void addBaseQueryParams(UriComponentsBuilder uriBuilder, UtilizationRatesRequestModel requestModel) {
        // Date parameters (Defaults applied in the service if null)
        LocalDate startDate = requestModel.getStartDate() != null
            ? requestModel.getStartDate()
            : LocalDate.now().minusYears(1); // Default: one year ago

        LocalDate endDate = requestModel.getEndDate() != null
            ? requestModel.getEndDate()
            : LocalDate.now().plusDays(7); // Default: +7 days

        uriBuilder.queryParam("startDate", startDate.toString());
        uriBuilder.queryParam("endDate", endDate.toString());

        // Filters
        Optional.ofNullable(requestModel.getZones()).filter(l -> !l.isEmpty()).ifPresent(z -> uriBuilder.queryParam("zones", String.join(",", z)));
        Optional.ofNullable(requestModel.getInstallations()).filter(l -> !l.isEmpty()).ifPresent(i -> uriBuilder.queryParam("installations", String.join(",", i)));
        Optional.ofNullable(requestModel.getPlayers()).filter(l -> !l.isEmpty()).ifPresent(p -> uriBuilder.queryParam("players", String.join(",", p)));
    }


    /**
     * Proxies the GET request to /refineries/utilization-rates.
     */
    @Override
    public Mono<List<UtilisationRatesModel>> getUtilizationRates(
        String authorizationHeader,
        String granularity,
        String unitType, // Optional, defaults to Primary Distillation
        UtilizationRatesRequestModel requestModel
    ) {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromPath(UTILIZATION_RATES_PATH);

        // Required parameter
        uriBuilder.queryParam("granularity", granularity);

        // Optional parameters (unitType defaults to 'Primary Distillation' in controller)
        Optional.ofNullable(unitType).ifPresent(ut -> uriBuilder.queryParam("unitType", ut));

        // Splits (Optional, defaults to 'total' in controller)
        Optional.ofNullable(requestModel.getSplits()).filter(l -> !l.isEmpty()).ifPresent(s -> uriBuilder.queryParam("splits", String.join(",", s)));

        // Common parameters from request model (dates, zones, installations, players)
        addBaseQueryParams(uriBuilder, requestModel);

        return get(uriBuilder, authorizationHeader, LIST_OF_DATE_SPLIT_OUTPUT);

    }
}
