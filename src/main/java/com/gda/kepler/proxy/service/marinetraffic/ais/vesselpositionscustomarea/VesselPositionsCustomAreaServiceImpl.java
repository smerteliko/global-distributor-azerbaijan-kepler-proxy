package com.gda.kepler.proxy.service.marinetraffic.ais.vesselpositionscustomarea;

import com.gda.kepler.proxy.model.marinetraffic.ais.vesselpositions.VesselPositionsModel;
import com.gda.kepler.proxy.model.marinetraffic.ais.vesselpositions.VesselPositionsRequestModel;
import com.gda.kepler.proxy.model.marinetraffic.ais.vesselpositionscustomarea.VesselPositionsCustomAreaModel;
import com.gda.kepler.proxy.model.marinetraffic.ais.vesselpositionscustomarea.VesselPositionsCustomAreaRequestModel;
import com.gda.kepler.proxy.service.base.KeplerProxyService;
import com.gda.kepler.proxy.service.marinetraffic.ais.vesselpositions.VesselPositionsService;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;
import reactor.core.publisher.Mono;

import java.util.Optional;

/**
 * Implementation of the reactive service for retrieving vessel positions custom area.
 * Endpoint: /exportvessels-custom-area/{api_key}
 */
@Service
public class VesselPositionsCustomAreaServiceImpl extends KeplerProxyService implements VesselPositionsCustomAreaService {
    // URL path template. IMPORTANT: Five spaces are included for exact path matching.
    private static final String ENDPOINT_PATH = "/exportvessels-custom-area/{apiKey} ";

    // Defines the expected response type for API deserialization.
    private static final ParameterizedTypeReference<VesselPositionsCustomAreaModel> RESPONSE_TYPE =
        new ParameterizedTypeReference<VesselPositionsCustomAreaModel>() {};

    /**
     * Constructor using the base class constructor to initialize WebClients.
     */
    public VesselPositionsCustomAreaServiceImpl(WebClient.Builder webClientBuilder) {
        super(webClientBuilder);
    }

    /**
     * Retrieves the latest available vessel positions worldwide by calling the Marine Traffic API reactively.
     * @param apiKey API key (used as containerApiKey).
     * @param requestModel Request model with filtering parameters.
     * @return Mono emitting the paginated vessel position data from the external API.
     */
    @Override
    public Mono<VesselPositionsCustomAreaModel> getVesselPositionsCustomArea(
        VesselPositionsCustomAreaRequestModel requestModel
    ) {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromPath(ENDPOINT_PATH)
            .path(ENDPOINT_PATH.replace("{apiKey}", this.marinetrafficApiKey));
        uriBuilder.queryParam("v", requestModel.getV());

        Optional.ofNullable(requestModel.getVesseltypeid()).ifPresent(vtid -> uriBuilder.queryParam("vesseltypeid", vtid));
        Optional.ofNullable(requestModel.getTimespan()).ifPresent(ts -> uriBuilder.queryParam("timespan", ts));
        Optional.ofNullable(requestModel.getCursor()).ifPresent(c -> uriBuilder.queryParam("cursor", c));
        Optional.ofNullable(requestModel.getLimit()).ifPresent(l -> uriBuilder.queryParam("limit", l));
        Optional.ofNullable(requestModel.getProtocol()).ifPresent(p -> uriBuilder.queryParam("protocol", p));

        return this.getMarineTraffic(uriBuilder, RESPONSE_TYPE);
    }
}
