package com.gda.kepler.proxy.model.marinetraffic.ais.exportvessels_custom_area;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gda.kepler.proxy.model.marinetraffic.ais.common.BaseDataResponse;
import com.gda.kepler.proxy.model.marinetraffic.ais.common.BaseMetadataResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.*;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Default")
public class VesselPositionsInAnAreaOfInterestResponse {
    @JsonProperty("DATA")
    private List<BaseDataResponse> data;


    @JsonProperty("METADATA")
    private BaseMetadataResponse metadata;



}
