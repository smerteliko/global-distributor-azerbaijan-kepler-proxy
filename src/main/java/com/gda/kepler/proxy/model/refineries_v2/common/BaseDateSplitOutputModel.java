package com.gda.kepler.proxy.model.refineries_v2.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Map;

/**
 * DTO for time-series data responses (e.g., unit-runs, utilization-rates, margins, etc.).
 * This corresponds to the DateSplit-Output schema in the OpenAPI spec.
 */
@Data
@Schema(description = "Aggregated time-series data with date splits")
public class BaseDateSplitOutputModel {

    @JsonProperty("Date")
    @Schema(description = "Aggregation date (YYYY-MM-DD or YYYY-MM for monthly)")
    String date;

    @JsonProperty("Splits")
    @Schema(description = "Aggregation keys and corresponding values (including the metric)",
        example = "{'total': 500.5, 'countries': {'United States': 300.2}}")
    Map<String, Object> splits;

}
