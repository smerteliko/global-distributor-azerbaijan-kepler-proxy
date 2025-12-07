package com.gda.kepler.proxy.model.marinetraffic.passageplans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data

@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Request parameters for: Import Passage Plan")
public class ImportPassagePlanRequest {
    /**
     * API key: 40-character hexadecimal number
     */
    @Schema(description = "API key: 40-character hexadecimal number", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("api_key")
    private String apiKey;

    /**
     * Request's Content-Type
     */
    @Schema(description = "Request's Content-Type", requiredMode = Schema.RequiredMode.REQUIRED, defaultValue = "multipart/form-data")
    @JsonProperty("Content-Type")
    private String contentType = "multipart/form-data";
}
