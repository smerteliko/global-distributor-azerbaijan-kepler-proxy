package com.gda.kepler.proxy.service.marinetraffic.ais.vesselpositionscustomarea;

import com.gda.kepler.proxy.model.marinetraffic.ais.exportvessels_custom_area.VesselPositionsInAnAreaOfInterestRequest;
import com.gda.kepler.proxy.model.marinetraffic.ais.exportvessels_custom_area.VesselPositionsInAnAreaOfInterestResponse;
import reactor.core.publisher.Mono;

/**
 * Interface for the service retrieving vessel positions custom area with pagination.
 */
public interface VesselPositionsCustomAreaService {
    /**
     * Retrieves the latest available vessel positions worldwide with pagination support.
     * @param apiKey API key.
     * @param requestModel Request model with filtering parameters.
     * @return Mono emitting the paginated vessel position data.
     */
    Mono<VesselPositionsInAnAreaOfInterestResponse> getVesselPositionsCustomArea(
        VesselPositionsInAnAreaOfInterestRequest requestModel
    );
}
