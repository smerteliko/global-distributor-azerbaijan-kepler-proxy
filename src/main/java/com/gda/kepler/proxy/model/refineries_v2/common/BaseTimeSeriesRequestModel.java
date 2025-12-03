package com.gda.kepler.proxy.model.refineries_v2.common;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

/**
 * Base DTO for all Kepler API time-series aggregation endpoints.
 * Contains common filtering parameters: date ranges, zones, installations, and players.
 * Note: @Data is used here instead of @Value to allow Spring to instantiate fields from query parameters.
 */
@Data
@Schema(description = "Base request model for all Kepler time-series aggregation endpoints.")
public class BaseTimeSeriesRequestModel {

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Parameter(description = "Start date of the selected period (YYYY-MM-DD). Default is one year ago from today.", example = "2023-01-01")
    LocalDate startDate;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Parameter(description = "End date of the selected period (YYYY-MM-DD). Default is +7 days from today.", example = "2024-01-01")
    LocalDate endDate;

    @Parameter(description = "List of zones or IDs (comma-separated, e.g., '447,United States').")
    List<String> zones;

    @Parameter(description = "List of installations or IDs.")
    List<String> installations;

    @Parameter(description = "List of players or IDs.")
    List<String> players;
}
