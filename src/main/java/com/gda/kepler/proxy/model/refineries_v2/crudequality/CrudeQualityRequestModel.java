package com.gda.kepler.proxy.model.refineries_v2.crudequality;

import com.gda.kepler.proxy.model.refineries_v2.common.BaseTimeSeriesRequestModel;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * DTO for Crude Quality endpoint (/crude-quality).
 * Extends BaseTimeSeriesRequestModel with splits.
 */
@Data
@Schema(description = "Request model specific to Crude Quality endpoint.")
final public class CrudeQualityRequestModel extends BaseTimeSeriesRequestModel {

    @Parameter(description = "Field names to use on aggregation (e.g., total, refinery types, countries). Default: total.")
    List<String> splits;
}
