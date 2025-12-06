package com.gda.kepler.proxy.model.marinetraffic.ais.exportvesselscustomarea;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gda.kepler.proxy.model.marinetraffic.ais.common.BaseDataResponse;
import com.gda.kepler.proxy.model.marinetraffic.ais.common.BaseMetadataResponse;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;
import lombok.*;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Default")
public class VesselPositionsInAnAreaOfInterestResponse {
    @JsonProperty("DATA")
    private List<BaseDataResponse> data;


    @JsonProperty("METADATA")
    private BaseMetadataResponse metadata;
}
