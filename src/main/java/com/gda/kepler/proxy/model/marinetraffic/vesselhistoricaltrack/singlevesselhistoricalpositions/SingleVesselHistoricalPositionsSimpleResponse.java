package com.gda.kepler.proxy.model.marinetraffic.vesselhistoricaltrack.singlevesselhistoricalpositions;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.gda.kepler.proxy.model.marinetraffic.vesselhistoricaltrack.common.BaseVesselHistoricalPositionsResponse;
import io.swagger.v3.oas.annotations.media.Schema;

import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "schema.vessel_track.single.simple_response.title")
public class SingleVesselHistoricalPositionsSimpleResponse extends BaseVesselHistoricalPositionsResponse {

}
