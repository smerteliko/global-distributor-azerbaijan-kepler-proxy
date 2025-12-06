package com.gda.kepler.proxy.model.marinetraffic.passageplans;

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
@Schema(description = "Simple")
public class ImportPassagePlanSimpleResponse {
    @Schema(example = "[{'code': 's8', 'description': 'PASSAGE PLAN IMPORTED'}]")
    @JsonProperty("status")
    private List<StatusItem> status;



    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class StatusItem {
        /**
         * Success Code Status
         */
        @Schema(description = "Success Code Status")
        @JsonProperty("code")
        private String code;

        /**
         * Success Code Description
         */
        @Schema(description = "Success Code Description")
        @JsonProperty("description")
        private String description;
    }
}
