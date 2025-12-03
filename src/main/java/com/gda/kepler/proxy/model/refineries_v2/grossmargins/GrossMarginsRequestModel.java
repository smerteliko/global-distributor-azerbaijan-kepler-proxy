package com.gda.kepler.proxy.model.refineries_v2.grossmargins;

import com.gda.kepler.proxy.model.refineries_v2.common.BaseTimeSeriesRequestModel;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * DTO for Gross Margins endpoint (/margins).
 * Extends BaseTimeSeriesRequestModel with splits.
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Schema(description = "Request model specific to Gross Margins endpoint.")
final public class GrossMarginsRequestModel extends BaseTimeSeriesRequestModel {

    @Parameter(description = "Field names to use on aggregation (e.g., total, regions, refineries). Default: total.")
    List<String> splits;
}
