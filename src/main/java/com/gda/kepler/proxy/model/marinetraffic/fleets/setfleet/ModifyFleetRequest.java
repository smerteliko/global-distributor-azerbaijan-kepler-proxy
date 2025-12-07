package com.gda.kepler.proxy.model.marinetraffic.fleets.setfleet;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Request parameters for: Modify Fleet")
public class ModifyFleetRequest {
    /**
     * The Maritime Mobile Service Identity (MMSI) of the vessel you wish to handle, comma separated values supported You can <b>instead</b> use imo or shipid
     */
    @Schema(, requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("mmsi")
    private Integer mmsi;

    /**
     * The International Maritime Organization (IMO) number of the vessel you wish to handle, comma separated values supported
     */
    @Schema(description = "The International Maritime Organization (IMO) number of the vessel you wish to handle, comma separated values supported")
    @JsonProperty("imo")
    private Integer imo;

    /**
     * A uniquely assigned ID by MarineTraffic for the subject vessel, comma separated values supported
     */
    @Schema(description = "A uniquely assigned ID by MarineTraffic for the subject vessel, comma separated values supported")
    @JsonProperty("shipid")
    private Integer shipid;

    /**
     * If used, vessel will be added to the specific fleet, otherwise default fleet is used
     */
    @Schema(description = "If used, vessel will be added to the specific fleet, otherwise default fleet is used")
    @JsonProperty("fleet_id")
    private Integer fleetID;

    /**
     * Possible values are: 
 * * 0 to set to inactive 
 * * 1 to activate 
 * * 2 to enable satellite coverage
     */
    @Schema(description = "Possible values are: * 0 to set to inactive * 1 to activate * 2 to enable satellite coverage", allowableValues = {"0 to set to inactive", "1 to activate", "2 to enable satellite coverage"})
    @JsonProperty("active")
    private Integer active;

    /**
     * Set this parameter to 1 to delete a vessel from your fleet
     */
    @Schema(description = "Set this parameter to 1 to delete a vessel from your fleet")
    @JsonProperty("delete")
    private Integer delete;
}
