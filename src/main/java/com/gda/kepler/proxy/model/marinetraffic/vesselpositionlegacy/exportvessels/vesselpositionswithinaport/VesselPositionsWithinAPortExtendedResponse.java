package com.gda.kepler.proxy.model.marinetraffic.vesselpositionlegacy.exportvessels.vesselpositionswithinaport;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gda.kepler.proxy.model.marinetraffic.vesselpositionlegacy.exportvessels.common.BaseExportVesselsResponse;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;
import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Extended")
public class VesselPositionsWithinAPortExtendedResponse extends BaseExportVesselsResponse {
    /**
     * The Shipname of the subject vessel
     */
    @Schema(description = "The Shipname of the subject vessel", example = "IJVEER 52")
    @JsonProperty("SHIPNAME")
    private String shipname;

    /**
     * The Shiptype of the subject vessel according to AIS transmissions
     */
    @Schema(description = "The Shiptype of the subject vessel according to AIS transmissions", example = "60")
    @JsonProperty("SHIPTYPE")
    private String shiptype;

    /**
     * A uniquely designated identifier for the vessel's transmitter station
     */
    @Schema(description = "A uniquely designated identifier for the vessel's transmitter station", example = "PH2792")
    @JsonProperty("CALLSIGN")
    private String callsign;

    /**
     * The flag of the subject vessel according to AIS transmissions
     */
    @Schema(description = "The flag of the subject vessel according to AIS transmissions", example = "NL")
    @JsonProperty("FLAG")
    private String flag;

    /**
     * The overall Length (in metres) of the subject vessel
     */
    @Schema(description = "The overall Length (in metres) of the subject vessel", example = "28.6")
    @JsonProperty("LENGTH")
    private String length;

    /**
     * The Breadth (in metres) of the subject vessel
     */
    @Schema(description = "The Breadth (in metres) of the subject vessel", example = "9")
    @JsonProperty("WIDTH")
    private String width;

    /**
     * Gross Tonnage - unitless measure that calculates the moulded volume of all enclosed spaces of a ship
     */
    @Schema(description = "Gross Tonnage - unitless measure that calculates the moulded volume of all enclosed spaces of a ship", example = "")
    @JsonProperty("GRT")
    private String grt;

    /**
     * Deadweight - a measure (in metric tons) of how much weight a vessel can safely carry (excluding the vessel's own weight)
     */
    @Schema(description = "Deadweight - a measure (in metric tons) of how much weight a vessel can safely carry (excluding the vessel's own weight)", example = "")
    @JsonProperty("DWT")
    private String dwt;

    /**
     * The Draught (in metres x10) of the subject vessel according to the AIS transmissions
     */
    @Schema(description = "The Draught (in metres x10) of the subject vessel according to the AIS transmissions", example = "24")
    @JsonProperty("DRAUGHT")
    private String draught;

    /**
     * The year that the subject vessel was built
     */
    @Schema(description = "The year that the subject vessel was built", example = "")
    @JsonProperty("YEAR_BUILT")
    private String year_built;

    /**
     * Rate of Turn
     */
    @Schema(description = "Rate of Turn", example = "0")
    @JsonProperty("ROT")
    private String rot;

    /**
     * The Type of the subject vessel
     */
    @Schema(description = "The Type of the subject vessel", example = "Inland, Ferry")
    @JsonProperty("TYPE_NAME")
    private String type_name;

    /**
     * Further explanation of the SHIPTYPE ID
     */
    @Schema(description = "Further explanation of the SHIPTYPE ID", example = "Passenger")
    @JsonProperty("AIS_TYPE_SUMMARY")
    private String ais_type_summary;

    /**
     * The Destination of the subject vessel according to the AIS transmissions
     */
    @Schema(description = "The Destination of the subject vessel according to the AIS transmissions", example = "")
    @JsonProperty("DESTINATION")
    private String destination;

    /**
     * The Estimated Time of Arrival to Destination of the subject vessel according to the AIS transmissions
     */
    @Schema(description = "The Estimated Time of Arrival to Destination of the subject vessel according to the AIS transmissions", example = "")
    @JsonProperty("ETA")
    private LocalDateTime eta;
}
