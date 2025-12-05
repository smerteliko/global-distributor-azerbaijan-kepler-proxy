package com.gda.kepler.proxy.model.marinetraffic.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Base data model for pagination metadata in API responses (e.g., in 200_MTA030AD schema).
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "{metadata.model.description}")
public class BaseMetadataModel {

    @Schema(description = "{metadata.cursor.description}", example = "abcdef")
    @JsonProperty("CURSOR")
    private String cursor;

    @Schema(description = "{metadata.date.from.description}", example = "2023-11-20 15:57:00")
    @JsonProperty("DATE_FROM")
    private String dateFrom;

    @Schema(description = "{metadata.date.to.description}", example = "2023-11-20 16:57:00")
    @JsonProperty("DATE_TO")
    private String dateTo;
}
