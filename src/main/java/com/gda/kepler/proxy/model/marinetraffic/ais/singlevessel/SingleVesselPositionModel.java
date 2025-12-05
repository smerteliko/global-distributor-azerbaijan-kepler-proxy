package com.gda.kepler.proxy.model.marinetraffic.ais.singlevessel;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gda.kepler.proxy.model.marinetraffic.common.BaseMetadataModel;
import com.gda.kepler.proxy.model.marinetraffic.common.BaseVesselPositionDataModel;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

/**
 * Particular DTO representing refinery details from the /exportvessel/{api_key} endpoint.
 * This DTO mirrors the structure of the successful response (200) from the Kepler API.
 */
@Data
@Schema(description = "Refinery details retrieved from the /exportvessel/{api_key} API")
public class SingleVesselPositionModel {

    @Schema(description = "{vessel.positions.data.list.description}")
    @JsonProperty("DATA")
    private List<BaseVesselPositionDataModel> data;

    @Schema(description = "{vessel.positions.metadata.description}")
    @JsonProperty("METADATA")
    private BaseMetadataModel metadata;

}
