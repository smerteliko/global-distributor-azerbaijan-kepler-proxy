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
    @Schema(description = "property.FLEET_ID.description", example = "1716163")
    @JsonProperty("FLEET_ID")
    private String fleet_id;

    /**
     * Indicates whether the vessels were successfully deleted from a fleet (0:no, 1:yes)
     */
    @Schema(description = "property.DELETE_FLAG.description", example = "1")
    @JsonProperty("DELETE")
    private String delete;
}
