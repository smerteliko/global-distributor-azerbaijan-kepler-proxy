package com.gda.kepler.proxy.model.marinetraffic.routinginformation.distancetoport;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gda.kepler.proxy.model.marinetraffic.routinginformation.common.BaseRoutingRequest;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Request parameters for: Distance to Port")
public class DistanceToPortRequest extends BaseRoutingRequest {

}
