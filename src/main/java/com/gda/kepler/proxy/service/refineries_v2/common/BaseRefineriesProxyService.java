package com.gda.kepler.proxy.service.refineries_v2.common;

import com.gda.kepler.proxy.model.refineries_v2.common.BaseTimeSeriesRequestModel;
import com.gda.kepler.proxy.service.base.KeplerProxyService;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;

import java.time.LocalDate;
import java.util.Optional;

/**
 * Abstract base class for all V2 Refineries time-series proxy services (Unit Runs, Margins, Imports, etc.).
 * This class handles common logic like dynamic date defaults and generic filter application.
 */
public abstract class BaseRefineriesProxyService extends KeplerProxyService {
    public BaseRefineriesProxyService(WebClient.Builder webClientBuilder, String keplerApiKey, String keplerBaseUrl) {
        super(webClientBuilder, keplerApiKey, keplerBaseUrl);
    }

    /**
     * Helper method to add common query parameters to the URI builder.
     * Handles dynamic default date logic and standard filters (zones, installations, players).
     *
     * @param uriBuilder The URI builder to append parameters to.
     * @param requestModel The request model containing the base time series parameters.
     */
    protected <T extends BaseTimeSeriesRequestModel> void addBaseQueryParams(UriComponentsBuilder uriBuilder, T requestModel) {
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
        // Note: Splits and unit (if applicable) are usually handled by the specific service implementation
        // as they are not present in the BaseTimeSeriesRequestModel,
        // but zones/installations/players are handled here.
        Optional.ofNullable(requestModel.getZones()).filter(l -> !l.isEmpty()).ifPresent(z -> uriBuilder.queryParam("zones", String.join(",", z)));
        Optional.ofNullable(requestModel.getInstallations()).filter(l -> !l.isEmpty()).ifPresent(i -> uriBuilder.queryParam("installations", String.join(",", i)));
        Optional.ofNullable(requestModel.getPlayers()).filter(l -> !l.isEmpty()).ifPresent(p -> uriBuilder.queryParam("players", String.join(",", p)));
    }
}
