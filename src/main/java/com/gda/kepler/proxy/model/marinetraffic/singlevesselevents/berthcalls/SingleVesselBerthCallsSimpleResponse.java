package com.gda.kepler.proxy.model.marinetraffic.singlevesselevents.berthcalls;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.gda.kepler.proxy.model.marinetraffic.singlevesselevents.berthcalls.common.BaseSingleVesselBerthCallsResponse;
import io.swagger.v3.oas.annotations.media.Schema;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Simple")
public class SingleVesselBerthCallsSimpleResponse extends BaseSingleVesselBerthCallsResponse {

}
