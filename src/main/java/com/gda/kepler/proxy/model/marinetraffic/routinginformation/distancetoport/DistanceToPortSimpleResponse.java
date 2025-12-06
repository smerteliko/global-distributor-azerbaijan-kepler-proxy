package com.gda.kepler.proxy.model.marinetraffic.routinginformation.distancetoport;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gda.kepler.proxy.model.marinetraffic.routinginformation.common.BaseRoutingResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Simple")
public class DistanceToPortSimpleResponse extends BaseRoutingResponse {

}
