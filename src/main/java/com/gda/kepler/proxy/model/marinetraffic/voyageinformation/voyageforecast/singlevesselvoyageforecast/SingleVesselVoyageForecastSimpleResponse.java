package com.gda.kepler.proxy.model.marinetraffic.voyageinformation.voyageforecast.singlevesselvoyageforecast;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.gda.kepler.proxy.model.marinetraffic.voyageinformation.voyageforecast.common.BaseVoyageForecastResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Simple")
public class SingleVesselVoyageForecastSimpleResponse extends BaseVoyageForecastResponse {

}
