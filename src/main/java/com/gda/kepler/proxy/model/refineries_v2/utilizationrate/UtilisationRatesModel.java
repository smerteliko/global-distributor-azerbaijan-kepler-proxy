package com.gda.kepler.proxy.model.refineries_v2.utilizationrate;

import com.gda.kepler.proxy.model.refineries_v2.common.BaseDateSplitOutputModel;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.Value;

/**
 * DTO representing all query parameters and headers required for the /particulars API endpoint.
 * This model simplifies the controller and service method signatures.
 */
@Data
@Schema(description = "Refinery details retrieved from the /utilization-rates API" )
final public class UtilisationRatesModel extends BaseDateSplitOutputModel {
}
