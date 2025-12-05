package com.gda.kepler.proxy.service.marinetraffic.ais.singlevessel;

import com.gda.kepler.proxy.model.marinetraffic.ais.singlevessel.SingleVesselPositionModel;
import com.gda.kepler.proxy.model.marinetraffic.ais.singlevessel.SingleVesselPositionsRequestModel;
import com.gda.kepler.proxy.model.marinetraffic.common.BaseVesselPositionDataModel;
import com.gda.kepler.proxy.model.refineries_v2.consumption.ConsumptionModel;
import com.gda.kepler.proxy.service.base.KeplerProxyService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;

/**
 * Implementation of the service for retrieving the latest available position and voyage information for a single vessel.
 * Endpoint: /exportvessel/{api_key}
 */
@Service
public class SingleVesselPositionsServiceImpl extends KeplerProxyService implements SingleVesselPositionsService {

    // URL for the external MarineTraffic API. IMPORTANT: Trailing space is included for exact path matching.
    private static final String ENDPOINT_URL = "/exportvessel/{apiKey} ";

    public SingleVesselPositionsServiceImpl(WebClient.Builder webClientBuilder) {
        super(webClientBuilder);
    }

    // Defines the expected response type for API deserialization.
    private static final ParameterizedTypeReference<List<SingleVesselPositionModel>> RESPONSE_TYPE =
        new ParameterizedTypeReference<List<SingleVesselPositionModel>>() {};

    /**
     * Retrieves the latest available position and voyage information for a single vessel by calling the Kepler API.
     * @param apiKey API key.
     * @param requestModel Request model with filtering parameters.
     * @return List of vessel position data from the external API.
     */
    @Override
    public Mono<List<SingleVesselPositionModel>> getSingleVesselPositions(
        SingleVesselPositionsRequestModel requestModel
    ) {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromPath(ENDPOINT_URL)
            .path(ENDPOINT_URL.replace("{apiKey}", this.marinetrafficApiKey));
        uriBuilder.queryParam("v", requestModel.getV());

        Optional.ofNullable(requestModel.getShipid()).ifPresent(id -> uriBuilder.queryParam("shipid", id));
        Optional.ofNullable(requestModel.getImo()).ifPresent(id -> uriBuilder.queryParam("imo", id));
        Optional.ofNullable(requestModel.getMmsi()).ifPresent(id -> uriBuilder.queryParam("mmsi", id));

        Optional.ofNullable(requestModel.getTimespan()).ifPresent(ts -> uriBuilder.queryParam("timespan", ts));
        Optional.ofNullable(requestModel.getProtocol()).ifPresent(p -> uriBuilder.queryParam("protocol", p));

        return this.getMarineTraffic(uriBuilder, RESPONSE_TYPE);
    }
}