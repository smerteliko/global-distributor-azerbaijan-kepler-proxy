package com.gda.kepler.proxy.model.marinetraffic.portsinformation.expectedarrivals.expectedportarivals;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gda.kepler.proxy.model.marinetraffic.portsinformation.expectedarrivals.common.BaseExpectedArrivalsResponse;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Simple")
public class ExpectedPortArrivalsSimpleResponse extends BaseExpectedArrivalsResponse {

}
