package com.gda.kepler.proxy.service.refineries_v2.particular;

import com.gda.kepler.proxy.model.refineries_v2.particular.ParticularModel;
import com.gda.kepler.proxy.model.refineries_v2.particular.ParticularRequestModel;
import reactor.core.publisher.Mono;

import java.time.LocalDate;
import java.util.List;

/**
 * Service for proxying requests to the Kepler API v2 Refineries.
 * Handles data endpoints like /particulars
 */
public interface RefineriesProxyService {

    /**
     * Proxies the GET request to /refineries/particulars.
     * @param authorizationHeader Authorization header (Bearer token) from the client.
     * @param requestModel Request model containing query parameters.
     * @return Mono with a list of refinery particulars.
     */
    Mono<List<ParticularModel>> getParticulars(
        String authorizationHeader,
        ParticularRequestModel requestModel
    );
}
