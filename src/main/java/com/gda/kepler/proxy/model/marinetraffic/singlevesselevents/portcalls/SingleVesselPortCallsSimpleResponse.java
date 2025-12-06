package com.gda.kepler.proxy.model.marinetraffic.singlevesselevents.portcalls;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gda.kepler.proxy.model.marinetraffic.singlevesselevents.portcalls.common.BaseSingleVesselPortCallsResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Simple")
public class SingleVesselPortCallsSimpleResponse extends BaseSingleVesselPortCallsResponse {

}
