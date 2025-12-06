package com.gda.kepler.proxy.service.marinetraffic.ais.vesselpositions;

import com.gda.kepler.proxy.model.marinetraffic.ais.exportvessels.VesselPositionsRequest;
import com.gda.kepler.proxy.model.marinetraffic.ais.exportvessels.VesselPositionsResponse;
import reactor.core.publisher.Mono;

/**
 * Interface for the service retrieving vessel positions worldwide with pagination.
 */
public interface VesselPositionsService {

    /**
     * Retrieves the latest available vessel positions worldwide with pagination support.
     * @param apiKey API key.
     * @param requestModel Request model with filtering parameters.
     * @return Mono emitting the paginated vessel position data.
     */
    Mono<VesselPositionsResponse> getVesselPositions(
        VesselPositionsRequest requestModel
    );
}