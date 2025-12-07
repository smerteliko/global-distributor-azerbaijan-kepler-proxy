package com.gda.kepler.proxy.model.marinetraffic.fleets.setfleet;

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
@Schema(description = "Update Fleet")
public class ModifyFleetResponse {
    @JsonProperty("status")
    private List<StatusItem> status;



    @Data

    @NoArgsConstructor
    @AllArgsConstructor
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class StatusItem {
        @JsonProperty("success")
        private List<SuccessItem> success;


    @Data

    @NoArgsConstructor
    @AllArgsConstructor
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SuccessItem {
        /**
         * Success code
         */
        @Schema(description = "property.response_code.description")
        @JsonProperty("code")
        private String code;

        /**
         * Success message
         */
        @Schema(description = "property.response_description.descriptioN")
        @JsonProperty("description")
        private String description;
    }
    }
}
