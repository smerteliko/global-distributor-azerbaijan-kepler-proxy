package com.gda.kepler.proxy.model.marinetraffic.fleets.clearfleet.errors;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import lombok.*;

@Data

@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Missing or invalid fleet identifier")
public class Pu05MissingOrInvalidFleetIdentifierError {
    @Schema(example = "[{'code': '6b', 'detail': 'FLEET NOT FOUND'}]")
    @JsonProperty("errors")
    private List<ErrorsItem> errors;



    @Data

    @NoArgsConstructor
    @AllArgsConstructor
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ErrorsItem {
        /**
         * Error code
         */
        @Schema(description = "Error code")
        @JsonProperty("code")
        private String code;

        /**
         * Error message
         */
        @Schema(description = "Error message")
        @JsonProperty("detail")
        private String detail;
    }
}
