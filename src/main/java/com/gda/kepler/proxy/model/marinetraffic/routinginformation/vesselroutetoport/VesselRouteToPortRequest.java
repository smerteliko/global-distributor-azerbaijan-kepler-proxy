package com.gda.kepler.proxy.model.marinetraffic.routinginformation.vesselroutetoport;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gda.kepler.proxy.model.marinetraffic.routinginformation.common.BaseRoutingRequest;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Request parameters for: Vessel Route to Port")
public class VesselRouteToPortRequest  extends BaseRoutingRequest {

}
