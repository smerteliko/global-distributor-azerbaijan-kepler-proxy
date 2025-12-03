package com.gda.kepler.proxy.model.refineries_v2.unitruns;

import com.gda.kepler.proxy.model.refineries_v2.common.BaseTimeSeriesRequestModel;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

/**
 * DTO representing common query parameters for Unit Runs and other time-series API endpoints.
 * This model simplifies controller and service method signatures for common filtering/aggregation fields.
 */
@Data
@Schema(description = "Common request model for Unit Runs and other time-series aggregation endpoints.")
final public class UnitRunsRequestModel extends BaseTimeSeriesRequestModel {

    // Note: Default value is set in the controller using @RequestParam(defaultValue="...")
    @Parameter(description = "Unit of measure (kbd, kb, Mbbl, m3), varies per endpoint. Default: kbd.", example = "kbd",
        schema = @Schema(allowableValues = {"kbd", "kb", "Mbbl", "m3"}))
    String unit;

    @Parameter(description = "Field names to use on aggregation (e.g., total, refinery types, countries). Default: total.")
    List<String> splits;

    // Specific Primary Distillation Optional Filters




}