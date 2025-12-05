package com.gda.kepler.proxy.service.refineries_v2.imports;

import com.gda.kepler.proxy.model.refineries_v2.imports.ImportsCrudeCoModel;
import com.gda.kepler.proxy.model.refineries_v2.imports.ImportsCrudeCoRequestModel;
import com.gda.kepler.proxy.model.refineries_v2.imports.ImportsOtherFeedstockModel;
import com.gda.kepler.proxy.model.refineries_v2.imports.ImportsOtherFeedstockRequestModel;
import reactor.core.publisher.Mono;

import java.util.List;

public interface ImportsProxyService {

    /**
     * Proxies the GET request to /refineries/imports/crude-co.
     */
    Mono<List<ImportsCrudeCoModel>> getImportsCrudeCo(
        String authorizationHeader,
        ImportsCrudeCoRequestModel requestModel
    );

    /**
     * Proxies the GET request to /refineries/imports/other-feedstock.
     */
    Mono<List<ImportsOtherFeedstockModel>> getImportsOtherFeedstock(
        String authorizationHeader,
        ImportsOtherFeedstockRequestModel requestModel
    );
}