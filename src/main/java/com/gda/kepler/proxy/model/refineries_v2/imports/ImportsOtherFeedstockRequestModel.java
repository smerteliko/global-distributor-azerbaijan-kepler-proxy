package com.gda.kepler.proxy.model.refineries_v2.imports;

import com.gda.kepler.proxy.model.refineries_v2.common.BaseTimeSeriesRequestModel;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * DTO for Imports Other Feedstock endpoint (/imports/other-feedstock).
 * Adds support for specific unit, splits, and product filters.
 */
@Data
@Schema(description = "Request model specific to Other Feedstocks Imports endpoint.")
final public class ImportsOtherFeedstockRequestModel extends BaseTimeSeriesRequestModel {

    @Parameter(description = "Unit of measure used to quantify the volume of feedstock. Default: kbd.", example = "kbd",
        schema = @Schema(allowableValues = {"kbd", "kb", "Mbbl", "m3"}))
    String unit;

    @Parameter(description = "Field names to use on aggregation (includes products). Default: total.")
    List<String> splits;

    @Parameter(description = "Product names (SRFO, HSFO, VGO).")
    List<String> products;
}
