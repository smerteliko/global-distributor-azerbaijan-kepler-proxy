package com.gda.kepler.proxy.model.marinetraffic.vesselhistoricaltrack.vesselhistoricalpositionsinanarea;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gda.kepler.proxy.model.marinetraffic.vesselhistoricaltrack.common.BaseVesselHistoricalPositionsRequest;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;
import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Request parameters for: Vessel Historical Positions in an Area")
public class VesselHistoricalPositionsInAnAreaRequest extends BaseVesselHistoricalPositionsRequest {

}
