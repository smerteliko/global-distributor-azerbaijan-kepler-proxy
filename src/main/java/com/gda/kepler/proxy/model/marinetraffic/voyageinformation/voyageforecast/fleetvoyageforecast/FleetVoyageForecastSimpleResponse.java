package com.gda.kepler.proxy.model.marinetraffic.voyageinformation.voyageforecast.fleetvoyageforecast;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gda.kepler.proxy.model.marinetraffic.voyageinformation.voyageforecast.common.BaseVoyageForecastResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Extended")
public class FleetVoyageForecastSimpleResponse extends BaseVoyageForecastResponse {

}
