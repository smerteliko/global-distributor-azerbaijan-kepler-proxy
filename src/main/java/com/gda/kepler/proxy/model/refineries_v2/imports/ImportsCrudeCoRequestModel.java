package com.gda.kepler.proxy.model.refineries_v2.imports;

import com.gda.kepler.proxy.model.refineries_v2.common.BaseTimeSeriesRequestModel;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * DTO for Imports Crude Co endpoint (/imports/crude-co).
 * Adds support for specific unit, splits, and crude filters.
 */
@Data
@Schema(description = "Request model specific to Crude Oil and Condensate Imports endpoint.")
final public class ImportsCrudeCoRequestModel extends BaseTimeSeriesRequestModel {

    @Parameter(description = "Time series aggregation (monthly, daily, weekly, etc.)", example = "monthly", required = true,
        schema = @Schema(
            allowableValues = {"monthly", "daily", "weekly", "eia-weekly", "yearly", "quarterly"},
            requiredMode = Schema.RequiredMode.REQUIRED
        )
    )
    String granularity;

    @Parameter(description = "Unit of measure used to quantify the volume of feedstock. Default: kbd.", example = "kbd",
        schema = @Schema(allowableValues = {"kbd", "kb", "Mbbl", "m3"}))
    String unit;

    @Parameter(description = "Field names to use on aggregation (includes crude qualities and grades). Default: total.")
    List<String> splits;

    @Parameter(description = "Crude grade names.")
    List<String> crudeGrades;

    @Parameter(description = "Crude Qualities (Light Sweet, Heavy Sour, etc.).")
    List<String> crudeQualities;
}
