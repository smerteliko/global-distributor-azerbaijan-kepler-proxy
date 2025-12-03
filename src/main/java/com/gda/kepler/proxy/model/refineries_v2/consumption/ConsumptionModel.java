package com.gda.kepler.proxy.model.refineries_v2.consumption;


import com.gda.kepler.proxy.model.refineries_v2.common.BaseDateSplitOutputModel;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * Particular DTO representing refinery details from the /consumption/other-feedstock endpoint.
 * This DTO mirrors the structure of the successful response (200) from the Kepler API.
 */
@Data
@Schema(description = "Refinery details retrieved from the /consumption/other-feedstock API")
final public class ConsumptionModel extends BaseDateSplitOutputModel {
}
