package com.gda.kepler.proxy.model.marinetraffic.passageplans.errors;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Vessel not found")
public class Pu06VesselNotFoundError {
    @Schema(example = "[{'code': '2a11', 'description': 'VESSEL NOT FOUND'}]")
    @JsonProperty("error")
    private List<ErrorItem> error;



    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ErrorItem {
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
        @JsonProperty("description")
        private String description;
    }
}
