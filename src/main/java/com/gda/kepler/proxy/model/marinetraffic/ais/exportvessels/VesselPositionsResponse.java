package com.gda.kepler.proxy.model.marinetraffic.ais.exportvessels;

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
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "vessel.positions.response.model.description")
public class VesselPositionsResponse {
    @JsonProperty("DATA")
    @Schema(description = "vessel.positions.data.list.description")
    private List<BaseDataResponse> data;

    @JsonProperty("METADATA")
    @Schema(description = "vessel.positions.metadata.description")
    private BaseMetadataResponse metadata;


}
