package com.gda.kepler.proxy.model.marinetraffic.vesselhistoricaltrack.singlevesselhistoricalpositions;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gda.kepler.proxy.model.marinetraffic.vesselhistoricaltrack.common.BaseVesselHistoricalPositionsRequest;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Request parameters for: Single Vessel Historical Positions")
public class SingleVesselHistoricalPositionsRequest extends BaseVesselHistoricalPositionsRequest {


}
