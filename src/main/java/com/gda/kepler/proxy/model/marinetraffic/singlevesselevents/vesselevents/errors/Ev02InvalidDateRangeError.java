package com.gda.kepler.proxy.model.marinetraffic.singlevesselevents.vesselevents.errors;

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
@Schema(description = "Invalid date range")
public class Ev02InvalidDateRangeError {
    @Schema(example = "[{'code': '1g', 'detail': 'DATE RANGE OUT OF BOUNDS'}]")
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
