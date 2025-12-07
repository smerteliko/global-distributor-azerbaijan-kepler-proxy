package com.gda.kepler.proxy.model.marinetraffic.fleets.getfleet;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Simple")
public class VesselsInFleetSimpleResponse {
    /**
     * A uniquely assigned ID by MarineTraffic for the subject vessel
     */
    @Schema(description = "property.SHIP_ID.description", example = "319")
    @JsonProperty("SHIP_ID")
    private String ship_id;

    /**
     * Maritime Mobile Service Identity - a nine-digit number sent in digital form over a radio frequency that identifies the vessel's transmitter station
     */
    @Schema(description = "property.MMSI.description", example = "228316700")
    @JsonProperty("MMSI")
    private String mmsi;

    /**
     * International Maritime Organisation number - a seven-digit number that uniquely identifies vessels
     */
    @Schema(description = "property.IMO.description", example = "9387542")
    @JsonProperty("IMO")
    private String imo;

    /**
     * The Shipname of the subject vessel
     */
    @Schema(description = "property.SHIPNAME.description", example = "KAOMBO NORTE")
    @JsonProperty("SHIPNAME")
    private String shipname;

    /**
     * The Status of the subject vessel (Off = 0, Terrestrial = 1, Satellite = 2 )
     */
    @Schema(description = "property.VESSEL_ACTIVE_STATUS.description", example = "1")
    @JsonProperty("ACTIVE")
    private String active;
}
