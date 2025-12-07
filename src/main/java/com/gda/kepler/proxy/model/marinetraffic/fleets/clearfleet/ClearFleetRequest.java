package com.gda.kepler.proxy.model.marinetraffic.fleets.clearfleet;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Request parameters for: Clear Fleet")
public class ClearFleetRequest {

    /**
     * The fleet id you wish to clear
     */
    @Schema(description = "property.FLEET_ID.description", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("fleet_id")
    private Integer fleetID;
}
