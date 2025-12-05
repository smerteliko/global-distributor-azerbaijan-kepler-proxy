package com.gda.kepler.proxy.model.marinetraffic.ais.vesselpositionscustomarea;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gda.kepler.proxy.model.marinetraffic.common.BaseMetadataModel;
import com.gda.kepler.proxy.model.marinetraffic.common.BaseVesselPositionDataModel;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
@Schema(description = "Refinery details retrieved from the /exportvessels-custom-area/{api_key} API")
public class VesselPositionsCustomAreaModel {
    @Schema(description = "{vessel.positions.data.list.description}")
    @JsonProperty("DATA")
    private List<BaseVesselPositionDataModel> data;

    @Schema(description = "{vessel.positions.metadata.description}")
    @JsonProperty("METADATA")
    private BaseMetadataModel metadata;
}
