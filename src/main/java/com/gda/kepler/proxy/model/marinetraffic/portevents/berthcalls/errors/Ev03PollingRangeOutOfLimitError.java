package com.gda.kepler.proxy.model.marinetraffic.portevents.berthcalls.errors;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;
import lombok.*;

@Data

@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Polling range out of limit")
public class Ev03PollingRangeOutOfLimitError {
    @Schema(example = "[{'code': '1m', 'detail': 'POLLING RANGE EXCEEDED BY 15 DAYS'}]")
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
