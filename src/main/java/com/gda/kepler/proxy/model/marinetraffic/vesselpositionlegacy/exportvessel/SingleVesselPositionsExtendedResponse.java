package com.gda.kepler.proxy.model.marinetraffic.vesselpositionlegacy.exportvessel;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gda.kepler.proxy.model.marinetraffic.vesselpositionlegacy.exportvessel.common.BaseSingleVesselPositionsResponse;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;
import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Extended")
public class SingleVesselPositionsExtendedResponse extends BaseSingleVesselPositionsResponse {

    /**
     * The Shipname of the subject vessel
     */
    @Schema(description = "The Shipname of the subject vessel", example = "QUEEN MARY 2")
    @JsonProperty("SHIPNAME")
    private String shipname;

    /**
     * The Shiptype of the subject vessel according to AIS transmissions
     */
    @Schema(description = "The Shiptype of the subject vessel according to AIS transmissions", example = "60")
    @JsonProperty("SHIPTYPE")
    private String shiptype;

    /**
     * International Maritime Organisation number - a seven-digit number that uniquely identifies vessels
     */
    @Schema(description = "International Maritime Organisation number - a seven-digit number that uniquely identifies vessels", example = "9241061")
    @JsonProperty("IMO")
    private String imo;

    /**
     * A uniquely designated identifier for the vessel's transmitter station
     */
    @Schema(description = "A uniquely designated identifier for the vessel's transmitter station", example = "ZCEF6")
    @JsonProperty("CALLSIGN")
    private String callsign;

    /**
     * The flag of the subject vessel according to AIS transmissions
     */
    @Schema(description = "The flag of the subject vessel according to AIS transmissions", example = "BM")
    @JsonProperty("FLAG")
    private String flag;

    /**
     * The name of the Port the subject vessel is currently in (NULL if the vessel is underway)
     */
    @Schema(description = "The name of the Port the subject vessel is currently in (NULL if the vessel is underway)")
    @JsonProperty("CURRENT_PORT")
    private String current_port;

    /**
     * The Name of the Last Port the vessel has visited
     */
    @Schema(description = "The Name of the Last Port the vessel has visited", example = "FREMANTLE")
    @JsonProperty("LAST_PORT")
    private String last_port;

    /**
     * The Date and Time (in UTC) that the subject vessel departed from the Last Port
     */
    @Schema(description = "The Date and Time (in UTC) that the subject vessel departed from the Last Port", example = "2017-02-12T12:47:00.000Z")
    @JsonProperty("LAST_PORT_TIME")
    private LocalDateTime last_port_time;

    /**
     * The Destination of the subject vessel according to the AIS transmissions
     */
    @Schema(description = "The Destination of the subject vessel according to the AIS transmissions", example = "ADELAIDE")
    @JsonProperty("DESTINATION")
    private String destination;

    /**
     * The overall Length (in metres) of the subject vessel
     */
    @Schema(description = "The overall Length (in metres) of the subject vessel", example = "345.03")
    @JsonProperty("LENGTH")
    private String length;

    /**
     * The Breadth (in metres) of the subject vessel
     */
    @Schema(description = "The Breadth (in metres) of the subject vessel", example = "48.7")
    @JsonProperty("WIDTH")
    private String width;

    /**
     * The Draught (in metres x10) of the subject vessel according to the AIS transmissions
     */
    @Schema(description = "The Draught (in metres x10) of the subject vessel according to the AIS transmissions", example = "101")
    @JsonProperty("DRAUGHT")
    private String draught;

    /**
     * Gross Tonnage - unitless measure that calculates the moulded volume of all enclosed spaces of a ship
     */
    @Schema(description = "Gross Tonnage - unitless measure that calculates the moulded volume of all enclosed spaces of a ship", example = "149215")
    @JsonProperty("GRT")
    private String grt;

    /**
     * Deadweight - a measure (in metric tons) of how much weight a vessel can safely carry (excluding the vessel's own weight)
     */
    @Schema(description = "Deadweight - a measure (in metric tons) of how much weight a vessel can safely carry (excluding the vessel's own weight)", example = "19189")
    @JsonProperty("DWT")
    private String dwt;

    /**
     * The year that the subject vessel was built
     */
    @Schema(description = "The year that the subject vessel was built", example = "2003")
    @JsonProperty("YEAR_BUILT")
    private String year_built;

    /**
     * A uniquely assigned ID by MarineTraffic for the Current Port
     */
    @Schema(description = "A uniquely assigned ID by MarineTraffic for the Current Port")
    @JsonProperty("PORT_ID")
    private String port_id;

    /**
     * A uniquely assigned ID by United Nations for the Current Port
     */
    @Schema(description = "A uniquely assigned ID by United Nations for the Current Port")
    @JsonProperty("PORT_UNLOCODE")
    private String port_unlocode;

    /**
     * A uniquely assigned ID by MarineTraffic for the Last Port
     */
    @Schema(description = "A uniquely assigned ID by MarineTraffic for the Last Port", example = "768")
    @JsonProperty("LAST_PORT_ID")
    private String last_port_id;

    /**
     * A uniquely assigned ID by United Nations for the Last Port
     */
    @Schema(description = "A uniquely assigned ID by United Nations for the Last Port", example = "AUFRE")
    @JsonProperty("LAST_PORT_UNLOCODE")
    private String last_port_unlocode;

    /**
     * The Estimated Time of Arrival to Destination of the subject vessel according to the AIS transmissions
     */
    @Schema(description = "The Estimated Time of Arrival to Destination of the subject vessel according to the AIS transmissions", example = "2017-02-15T23:00:00.000Z")
    @JsonProperty("ETA")
    private LocalDateTime eta;

    /**
     * The Estimated Time of Arrival to Destination of the subject vessel according to the MarineTraffic calculations
     */
    @Schema(description = "The Estimated Time of Arrival to Destination of the subject vessel according to the MarineTraffic calculations", example = "2017-02-15T21:30:00.000Z")
    @JsonProperty("ETA_CALC")
    private LocalDateTime eta_calc;

    /**
     * A uniquely assigned ID by MarineTraffic for the Next Port
     */
    @Schema(description = "A uniquely assigned ID by MarineTraffic for the Next Port", example = "890")
    @JsonProperty("NEXT_PORT_ID")
    private String next_port_id;

    /**
     * A uniquely assigned ID by United Nations for the Next Port
     */
    @Schema(description = "A uniquely assigned ID by United Nations for the Next Port", example = "AUADL")
    @JsonProperty("NEXT_PORT_UNLOCODE")
    private String next_port_unlocode;

    /**
     * The Name of the Next Port as derived by MarineTraffic based on the subject vessel's reported Destination
     */
    @Schema(description = "The Name of the Next Port as derived by MarineTraffic based on the subject vessel's reported Destination", example = "ADELAIDE")
    @JsonProperty("NEXT_PORT_NAME")
    private String next_port_name;

    /**
     * The Country that the Next Port is located at
     */
    @Schema(description = "The Country that the Next Port is located at", example = "AU")
    @JsonProperty("NEXT_PORT_COUNTRY")
    private String next_port_country;

    /**
     * The Type of the subject vessel
     */
    @Schema(description = "The Type of the subject vessel", example = "Passengers Ship")
    @JsonProperty("TYPE_NAME")
    private String type_name;

    /**
     * Further explanation of the SHIPTYPE ID
     */
    @Schema(description = "Further explanation of the SHIPTYPE ID", example = "Passenger")
    @JsonProperty("AIS_TYPE_SUMMARY")
    private String ais_type_summary;
}
