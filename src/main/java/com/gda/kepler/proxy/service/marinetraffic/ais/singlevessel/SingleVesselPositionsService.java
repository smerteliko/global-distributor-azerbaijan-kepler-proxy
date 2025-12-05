package com.gda.kepler.proxy.service.marinetraffic.ais.singlevessel;

import com.gda.kepler.proxy.model.marinetraffic.ais.singlevessel.SingleVesselPositionModel;
import com.gda.kepler.proxy.model.marinetraffic.common.BaseVesselPositionDataModel;
import com.gda.kepler.proxy.model.marinetraffic.ais.singlevessel.SingleVesselPositionsRequestModel;
import com.gda.kepler.proxy.service.base.KeplerProxyService;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * Interface for the service retrieving the latest available position and voyage information for a single vessel.
 */
public interface SingleVesselPositionsService {

    /**
     * Retrieves the latest available position and voyage information for a single vessel.
     * @param apiKey API key.
     * @param requestModel Request model with filtering parameters.
     * @return List of vessel position data.
     */
    Mono<List<SingleVesselPositionModel>> getSingleVesselPositions(
        SingleVesselPositionsRequestModel requestModel
    );
}
