package com.gda.kepler.proxy.model.refineries_v2.crudequality;

import com.gda.kepler.proxy.model.refineries_v2.common.BaseDateSplitOutputModel;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * Particular DTO representing refinery details from the /crude-quality endpoint.
 * This DTO mirrors the structure of the successful response (200) from the Kepler API.
 */
@Data
@Schema(description = "Refinery details retrieved from the /crude-quality API")
final public class CrudeQualityModel extends BaseDateSplitOutputModel {
}
