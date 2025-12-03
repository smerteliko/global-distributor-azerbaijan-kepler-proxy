package com.gda.kepler.proxy.model.refineries_v2.utilizationrate;

import com.gda.kepler.proxy.model.refineries_v2.common.BaseTimeSeriesRequestModel;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

/**
 * DTO for Utilization Rates endpoint (/utilization-rates).
 * Extends BaseTimeSeriesRequestModel with splits and unitType (optional in query but specific).
 */
@Data
@Schema(description = "Request model specific to Utilization Rates endpoint.")
final public class UtilizationRatesRequestModel extends BaseTimeSeriesRequestModel {

    // Note: This endpoint has no 'unit' parameter.

    @Parameter(description = "Field names to use on aggregation (e.g., total, refinery types, countries). Default: total.")
    List<String> splits;
}
