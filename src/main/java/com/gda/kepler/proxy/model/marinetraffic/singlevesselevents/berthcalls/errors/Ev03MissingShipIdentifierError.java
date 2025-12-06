package com.gda.kepler.proxy.model.marinetraffic.singlevesselevents.berthcalls.errors;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;
import lombok.*;

@Data

@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Missing ship identifier")
public class Ev03MissingShipIdentifierError {
    @Schema(example = "[{'code': '2a8', 'detail': 'VESSEL MMSI OR IMO OR SHIPID OR PORTID OR UNLOCODE OR BERTHID OR TERMINALID MISSING'}]")
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
