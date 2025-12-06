package com.gda.kepler.proxy.model.marinetraffic.ais.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseMetadataResponse {
    /**
     * The pagination cursor that should be provided in the next request
     */
    @Schema(description = "The pagination cursor that should be provided in the next request", example = "abcdef")
    @JsonProperty("CURSOR")
    private String cursor;

    /**
     * The starting date of the returned positions
     */
    @Schema(description = "The starting date of the returned positions", example = "2023-11-20 15:57:00")
    @JsonProperty("DATE_FROM")
    private LocalDateTime date_from;

    /**
     * The ending date of the returned positions
     */
    @Schema(description = "The ending date of the returned positions", example = "2023-11-20 16:57:00")
    @JsonProperty("DATE_TO")
    private LocalDateTime date_to;
}
