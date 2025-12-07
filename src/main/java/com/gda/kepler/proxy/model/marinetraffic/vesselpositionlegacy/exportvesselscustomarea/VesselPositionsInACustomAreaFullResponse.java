package com.gda.kepler.proxy.model.marinetraffic.vesselpositionlegacy.exportvesselscustomarea;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gda.kepler.proxy.model.marinetraffic.vesselpositionlegacy.exportvessels.common.BaseExportVesselsResponse;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;
import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "schema.vessel_positions_custom_area.full.title")
public class VesselPositionsInACustomAreaFullResponse extends BaseExportVesselsResponse {
    /**
     * The Shipname of the subject vessel
     */
    @Schema(description = "property.SHIPNAME.description", example = "SUNNY STAR")
    @JsonProperty("SHIPNAME")
    private String shipname;

    /**
     * The Shiptype of the subject vessel according to AIS transmissions
     */
    @Schema(description = "property.SHIPTYPE.description", example = "89")
    @JsonProperty("SHIPTYPE")
    private String shiptype;

    /**
     * A uniquely designated identifier for the vessel's transmitter station
     */
    @Schema(description = "property.CALLSIGN.description", example = "V7TZ6")
    @JsonProperty("CALLSIGN")
    private String callsign;

    /**
     * The flag of the subject vessel according to AIS transmissions
     */
    @Schema(description = "property.FLAG.description", example = "MH")
    @JsonProperty("FLAG")
    private String flag;

    /**
     * The overall Length (in metres) of the subject vessel
     */
    @Schema(description = "property.LENGTH.description", example = "184")
    @JsonProperty("LENGTH")
    private String length;

    /**
     * The Breadth (in metres) of the subject vessel
     */
    @Schema(description = "property.WIDTH.description", example = "27.43")
    @JsonProperty("WIDTH")
    private String width;

    /**
     * Gross Tonnage - unitless measure that calculates the moulded volume of all enclosed spaces of a ship
     */
    @Schema(description = "property.GRT.description", example = "23313")
    @JsonProperty("GRT")
    private String grt;

    /**
     * Deadweight - a measure (in metric tons) of how much weight a vessel can safely carry (excluding the vessel's own weight)
     */
    @Schema(description = "property.DWT.description", example = "37857")
    @JsonProperty("DWT")
    private String dwt;

    /**
     * The Draught (in metres x10) of the subject vessel according to the AIS transmissions
     */
    @Schema(description = "property.DRAUGHT.description", example = "95")
    @JsonProperty("DRAUGHT")
    private String draught;

    /**
     * The year that the subject vessel was built
     */
    @Schema(description = "property.YEAR_BUILT.description", example = "2010")
    @JsonProperty("YEAR_BUILT")
    private String year_built;

    /**
     * Rate of Turn
     */
    @Schema(description = "property.ROT.description", example = "0")
    @JsonProperty("ROT")
    private String rot;

    /**
     * The Type of the subject vessel
     */
    @Schema(description = "property.TYPE_NAME.description", example = "Oil/Chemical Tanker")
    @JsonProperty("TYPE_NAME")
    private String type_name;

    /**
     * Further explanation of the SHIPTYPE ID
     */
    @Schema(description = "property.AIS_TYPE_SUMMARY.description", example = "Tanker")
    @JsonProperty("AIS_TYPE_SUMMARY")
    private String ais_type_summary;

    /**
     * The Destination of the subject vessel according to the AIS transmissions
     */
    @Schema(description = "property.DESTINATION.description", example = "FOR ORDERS")
    @JsonProperty("DESTINATION")
    private String destination;

    /**
     * The Estimated Time of Arrival to Destination of the subject vessel according to the AIS transmissions
     */
    @Schema(description = "property.ETA.description", example = "2020-10-14T12:00:00.000Z")
    @JsonProperty("ETA")
    private LocalDateTime eta;

    /**
     * The name of the Port the subject vessel is currently in (NULL if the vessel is underway)
     */
    @Schema(description = "property.CURRENT_PORT.description", example = "")
    @JsonProperty("CURRENT_PORT")
    private String current_port;

    /**
     * The Name of the Last Port the vessel has visited
     */
    @Schema(description = "property.LAST_PORT.description", example = "AGIOI THEODOROI")
    @JsonProperty("LAST_PORT")
    private String last_port;

    /**
     * The Date and Time (in UTC) that the subject vessel departed from the Last Port
     */
    @Schema(description = "property.LAST_PORT_TIME.description", example = "2020-10-13T23:39:00.000Z")
    @JsonProperty("LAST_PORT_TIME")
    private LocalDateTime last_port_time;

    /**
     * A uniquely assigned ID by MarineTraffic for the Current Port
     */
    @Schema(description = "property.CURRENT_PORT_ID.description", example = "")
    @JsonProperty("CURRENT_PORT_ID")
    private String current_port_id;

    /**
     * A uniquely assigned ID by United Nations for the Current Port
     */
    @Schema(description = "property.CURRENT_PORT_UNLOCODE.description", example = "")
    @JsonProperty("CURRENT_PORT_UNLOCODE")
    private String current_port_unlocode;

    /**
     * The Country that the Current Port is located at
     */
    @Schema(description = "property.CURRENT_PORT_COUNTRY.description", example = "")
    @JsonProperty("CURRENT_PORT_COUNTRY")
    private String current_port_country;

    /**
     * A uniquely assigned ID by MarineTraffic for the Last Port
     */
    @Schema(description = "property.LAST_PORT_ID.description", example = "29")
    @JsonProperty("LAST_PORT_ID")
    private String last_port_id;

    /**
     * A uniquely assigned ID by United Nations for the Last Port
     */
    @Schema(description = "property.LAST_PORT_UNLOCODE.description", example = "GRAGT")
    @JsonProperty("LAST_PORT_UNLOCODE")
    private String last_port_unlocode;

    /**
     * The Country that the Last Port is located at
     */
    @Schema(description = "property.LAST_PORT_COUNTRY.description", example = "GR")
    @JsonProperty("LAST_PORT_COUNTRY")
    private String last_port_country;

    /**
     * A uniquely assigned ID by MarineTraffic for the Next Port
     */
    @Schema(description = "property.NEXT_PORT_ID.description", example = "")
    @JsonProperty("NEXT_PORT_ID")
    private String next_port_id;

    /**
     * A uniquely assigned ID by United Nations for the Next Port
     */
    @Schema(description = "property.NEXT_PORT_UNLOCODE.description", example = "")
    @JsonProperty("NEXT_PORT_UNLOCODE")
    private String next_port_unlocode;

    /**
     * The Name of the Next Port as derived by MarineTraffic based on the subject vessel's reported Destination
     */
    @Schema(description = "property.NEXT_PORT_NAME.description", example = "")
    @JsonProperty("NEXT_PORT_NAME")
    private String next_port_name;

    /**
     * The Country that the Next Port is located at
     */
    @Schema(description = "property.NEXT_PORT_COUNTRY.description", example = "")
    @JsonProperty("NEXT_PORT_COUNTRY")
    private String next_port_country;

    /**
     * The Estimated Time of Arrival to Destination of the subject vessel according to the MarineTraffic calculations
     */
    @Schema(description = "property.ETA_CALC.description", example = "")
    @JsonProperty("ETA_CALC")
    private LocalDateTime eta_calc;

    /**
     * The date and time (in UTC) that the ETA was calculated by MarineTraffic
     */
    @Schema(description = "property.ETA_UPDATED.description", example = "")
    @JsonProperty("ETA_UPDATED")
    private LocalDateTime eta_updated;

    /**
     * The Remaining Distance (in NM) for the subject vessel to reach the reported Destination
     */
    @Schema(description = "property.DISTANCE_TO_GO.description", example = "0")
    @JsonProperty("DISTANCE_TO_GO")
    private String distance_to_go;

    /**
     * The Distance (in NM) that the subject vessel has travelled since departing from Last Port
     */
    @Schema(description = "property.DISTANCE_TRAVELLED.description", example = "74")
    @JsonProperty("DISTANCE_TRAVELLED")
    private String distance_travelled;

    /**
     * The average speed calculated for the subject vessel during the latest voyage (port to port)
     */
    @Schema(description = "property.AVG_SPEED.description", example = "12.6")
    @JsonProperty("AVG_SPEED")
    private String avg_speed;

    /**
     * The maximum speed reported by the subject vessel during the latest voyage (port to port)
     */
    @Schema(description = "property.MAX_SPEED.description", example = "13.2")
    @JsonProperty("MAX_SPEED")
    private String max_speed;
}
