package com.gda.kepler.proxy.model.refineries_v2.refinedproducts;

import com.gda.kepler.proxy.model.refineries_v2.common.BaseTimeSeriesRequestModel;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * DTO for Refined Products Supply endpoint (/refined-products-supply).
 * Adds support for specific unit types, product filters, and splits including grades/products.
 */
@Data
@Schema(description = "Request model specific to Refined Products Supply endpoint.")
final public class RefinedProductsRequestModel extends BaseTimeSeriesRequestModel {

    @Parameter(description = "Unit of measure (kbd, kb, Mbbl, m3, %, kt, Mt). Default: kbd.", example = "kbd",
        schema = @Schema(allowableValues = {"kbd", "kb", "Mbbl", "m3", "%", "kt", "Mt"}))
    String unit;

    @Parameter(description = "Field names to use on aggregation (includes products and grades). Default: total.")
    List<String> splits;

    @Parameter(description = "List of refined product names.",
        schema = @Schema(allowableValues = {
            "Top of the Barrel",
            "LPG",
            "Olefins",
            "Naphtha",
            "Gasoline",
            "Middle of the Barrel",
            "Jet",
            "Low Sulfur Diesel",
            "High Sulfur Diesel",
            "Bottom of the Barrel",
            "VGO",
            "Low Sulfur Fuel Oil",
            "High Sulfur Fuel Oil",
            "Asphalt and Bitumen",
            "Lube Oils",
            "Petcoke",
            "Residual Fuel",
            "Diesel",
            "Slurry"
        })
    )
    List<String> products;
}
