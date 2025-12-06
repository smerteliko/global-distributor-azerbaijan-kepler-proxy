package com.gda.kepler.proxy.model.marinetraffic.fleets.clearfleet;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Simple")
public class ClearFleetSimpleResponse {
    /**
     * The fleet_id you wish to clear
     */
    @Schema(description = "The fleet_id you wish to clear", example = "1716163")
    @JsonProperty("FLEET_ID")
    private String fleet_id;

    /**
     * Indicates whether the vessels were successfully deleted from a fleet (0:no, 1:yes)
     */
    @Schema(description = "Indicates whether the vessels were successfully deleted from a fleet (0:no, 1:yes)", example = "1")
    @JsonProperty("DELETE")
    private String delete;
}
