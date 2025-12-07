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
    @Schema(description = "property.SHIPNAME.description", example = "QUEEN MARY 2")
    @JsonProperty("SHIPNAME")
    private String shipname;

    /**
     * The Shiptype of the subject vessel according to AIS transmissions
     */
    @Schema(description = "property.SHIPTYPE.description", example = "60")
    @JsonProperty("SHIPTYPE")
    private String shiptype;

    /**
     * International Maritime Organisation number - a seven-digit number that uniquely identifies vessels
     */
    @Schema(description = "property.IMO.description", example = "9241061")
    @JsonProperty("IMO")
    private String imo;

    /**
     * A uniquely designated identifier for the vessel's transmitter station
     */
    @Schema(description = "property.CALLSIGN.description", example = "ZCEF6")
    @JsonProperty("CALLSIGN")
    private String callsign;

    /**
     * The flag of the subject vessel according to AIS transmissions
     */
    @Schema(description = "property.FLAG.description", example = "BM")
    @JsonProperty("FLAG")
    private String flag;

    /**
     * The name of the Port the subject vessel is currently in (NULL if the vessel is underway)
     */
    @Schema(description = "property.CURRENT_PORT.description")
    @JsonProperty("CURRENT_PORT")
    private String current_port;

    /**
     * The Name of the Last Port the vessel has visited
     */
    @Schema(description = "property.LAST_PORT.description", example = "FREMANTLE")
    @JsonProperty("LAST_PORT")
    private String last_port;

    /**
     * The Date and Time (in UTC) that the subject vessel departed from the Last Port
     */
    @Schema(description = "property.LAST_PORT_TIME.description", example = "2017-02-12T12:47:00.000Z")
    @JsonProperty("LAST_PORT_TIME")
    private LocalDateTime last_port_time;

    /**
     * The Destination of the subject vessel according to the AIS transmissions
     */
    @Schema(description = "property.DESTINATION.description", example = "ADELAIDE")
    @JsonProperty("DESTINATION")
    private String destination;

    /**
     * The overall Length (in metres) of the subject vessel
     */
    @Schema(description = "property.LENGTH.description", example = "345.03")
    @JsonProperty("LENGTH")
    private String length;

    /**
     * The Breadth (in metres) of the subject vessel
     */
    @Schema(description = "property.WIDTH.description", example = "48.7")
    @JsonProperty("WIDTH")
    private String width;

    /**
     * The Draught (in metres x10) of the subject vessel according to the AIS transmissions
     */
    @Schema(description = "property.DRAUGHT.description", example = "101")
    @JsonProperty("DRAUGHT")
    private String draught;

    /**
     * Gross Tonnage - unitless measure that calculates the moulded volume of all enclosed spaces of a ship
     */
    @Schema(description = "property.GRT.description", example = "149215")
    @JsonProperty("GRT")
    private String grt;

    /**
     * Deadweight - a measure (in metric tons) of how much weight a vessel can safely carry (excluding the vessel's own weight)
     */
    @Schema(description = "property.DWT.description", example = "19189")
    @JsonProperty("DWT")
    private String dwt;

    /**
     * The year that the subject vessel was built
     */
    @Schema(description = "property.YEAR_BUILT.description", example = "2003")
    @JsonProperty("YEAR_BUILT")
    private String year_built;

    /**
     * A uniquely assigned ID by MarineTraffic for the Current Port
     */
    @Schema(description = "property.CURRENT_PORT_ID.description")
    @JsonProperty("PORT_ID")
    private String port_id;

    /**
     * A uniquely assigned ID by United Nations for the Current Port
     */
    @Schema(description = "property.CURRENT_PORT_UNLOCODE.description")
    @JsonProperty("PORT_UNLOCODE")
    private String port_unlocode;

    /**
     * A uniquely assigned ID by MarineTraffic for the Last Port
     */
    @Schema(description = "property.LAST_PORT_ID.description", example = "768")
    @JsonProperty("LAST_PORT_ID")
    private String last_port_id;

    /**
     * A uniquely assigned ID by United Nations for the Last Port
     */
    @Schema(description = "property.LAST_PORT_UNLOCODE.description", example = "AUFRE")
    @JsonProperty("LAST_PORT_UNLOCODE")
    private String last_port_unlocode;

    /**
     * The Estimated Time of Arrival to Destination of the subject vessel according to the AIS transmissions
     */
    @Schema(description = "property.ETA.description", example = "2017-02-15T23:00:00.000Z")
    @JsonProperty("ETA")
    private LocalDateTime eta;

    /**
     * The Estimated Time of Arrival to Destination of the subject vessel according to the MarineTraffic calculations
     */
    @Schema(description = "property.ETA_CALC.description", example = "2017-02-15T21:30:00.000Z")
    @JsonProperty("ETA_CALC")
    private LocalDateTime eta_calc;

    /**
     * A uniquely assigned ID by MarineTraffic for the Next Port
     */
    @Schema(description = "property.NEXT_PORT_ID.description", example = "890")
    @JsonProperty("NEXT_PORT_ID")
    private String next_port_id;

    /**
     * A uniquely assigned ID by United Nations for the Next Port
     */
    @Schema(description = "property.NEXT_PORT_UNLOCODE.description", example = "AUADL")
    @JsonProperty("NEXT_PORT_UNLOCODE")
    private String next_port_unlocode;

    /**
     * The Name of the Next Port as derived by MarineTraffic based on the subject vessel's reported Destination
     */
    @Schema(description = "property.NEXT_PORT_NAME.description", example = "ADELAIDE")
    @JsonProperty("NEXT_PORT_NAME")
    private String next_port_name;

    /**
     * The Country that the Next Port is located at
     */
    @Schema(description = "property.NEXT_PORT_COUNTRY.description", example = "AU")
    @JsonProperty("NEXT_PORT_COUNTRY")
    private String next_port_country;

    /**
     * The Type of the subject vessel
     */
    @Schema(description = "property.TYPE_NAME.description", example = "Passengers Ship")
    @JsonProperty("TYPE_NAME")
    private String type_name;

    /**
     * Further explanation of the SHIPTYPE ID
     */
    @Schema(description = "property.AIS_TYPE_SUMMARY.description", example = "Passenger")
    @JsonProperty("AIS_TYPE_SUMMARY")
    private String ais_type_summary;
}
