package com.gda.kepler.proxy.model.marinetraffic.ais.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseDataResponse {
    /**
     * Maritime Mobile Service Identity - a nine-digit number sent in digital form over a radio frequency that identifies the vessel's transmitter station
     */
    @Schema(
        description = "Maritime Mobile Service Identity - a nine-digit number sent in digital form over a radio frequency that identifies the vessel's transmitter station",
        example = "538003913"
    )
    @JsonProperty("MMSI")
    private String mmsi;

    /**
     * International Maritime Organisation number - a seven-digit number that uniquely identifies vessels
     */
    @Schema(
        description = "International Maritime Organisation number - a seven-digit number that uniquely identifies vessels",
        example = "9470959"
    )
    @JsonProperty("IMO")
    private String imo;

    /**
     * A uniquely assigned ID by MarineTraffic for the subject vessel
     */
    @Schema(
        description = "A uniquely assigned ID by MarineTraffic for the subject vessel",
        example = "713139"
    )
    @JsonProperty("SHIP_ID")
    private String ship_id;

    /**
     * Latitude - a geographic coordinate that specifies the north-south position of the vessel on the Earth's surface
     */
    @Schema(
        description = "Latitude - a geographic coordinate that specifies the north-south position of the vessel on the Earth's surface",
        example = "37.388430"
    )
    @JsonProperty("LAT")
    private String lat;

    /**
     * Longitude - a geographic coordinate that specifies the east-west position of the vessel on the Earth's surface
     */
    @Schema(
        description = "Longitude - a geographic coordinate that specifies the east-west position of the vessel on the Earth's surface",
        example = "23.871230"
    )
    @JsonProperty("LON")
    private String lon;

    /**
     * The speed (in knots x10) that the subject vessel is reporting according to AIS transmissions
     */
    @Schema(
        description = "The speed (in knots x10) that the subject vessel is reporting according to AIS transmissions",
        example = "6"
    )
    @JsonProperty("SPEED")
    private String speed;

    /**
     * The heading (in degrees) that the subject vessel is reporting according to AIS transmissions
     */
    @Schema(
        description = "The heading (in degrees) that the subject vessel is reporting according to AIS transmissions",
        example = "104"
    )
    @JsonProperty("HEADING")
    private String heading;

    /**
     * The course (in degrees) that the subject vessel is reporting according to AIS transmissions
     */
    @Schema(
        description = "The course (in degrees) that the subject vessel is reporting according to AIS transmissions",
        example = "41"
    )
    @JsonProperty("COURSE")
    private String course;

    /**
     * The AIS Navigational Status of the subject vessel as input by the vessel's crew. There might be discrepancies with the vessel's detail page when vessel speed is near zero (0) knots
     */
    @Schema(
        description = "The AIS Navigational Status of the subject vessel as input by the vessel's crew. There might be discrepancies with the vessel's detail page when vessel speed is near zero (0) knots",
        example = "0"
    )
    @JsonProperty("STATUS")
    private String status;

    /**
     * The date and time (in UTC) that the subject vessel's position or event was recorded by MarineTraffic
     */
    @Schema(
        description = "The date and time (in UTC) that the subject vessel's position or event was recorded by MarineTraffic",
        example = "2020-10-15T12:21:44.000Z"
    )
    @JsonProperty("TIMESTAMP")
    private LocalDateTime timestamp;

    /**
     * Describes whether the transmitted AIS message was received by a terrestrial (TER), satellite (SAT) or roaming (ROAM) AIS antenna.
     */
    @Schema(
        description = "Describes whether the transmitted AIS message was received by a terrestrial (TER), satellite (SAT) or roaming (ROAM) AIS antenna.",
        example = "TER"
    )
    @JsonProperty("DSRC")
    private String dsrc;

    /**
     * The time slot that the subject vessel uses to transmit information
     */
    @Schema(
        description = "The time slot that the subject vessel uses to transmit information",
        example = "45"
    )
    @JsonProperty("UTC_SECONDS")
    private String utc_seconds;

    /**
     * Vessel's commercial market
     */
    @Schema(
        description = "Vessel's commercial market",
        example = "SUPPORTING VESSELS"
    )
    @JsonProperty("MARKET")
    private String market;

    /**
     * The Shipname of the subject vessel
     */
    @Schema(
        description = "The Shipname of the subject vessel",
        example = "SUNNY STAR"
    )
    @JsonProperty("SHIPNAME")
    private String shipname;


    /**
     * The Shiptype of the subject vessel according to AIS transmissions
     */
    @Schema(
        description = "The Shiptype of the subject vessel according to AIS transmissions",
        example = "89"
    )
    @JsonProperty("SHIPTYPE")
    private String shiptype;

    /**
     * A uniquely designated identifier for the vessel's transmitter station
     */
    @Schema(
        description = "A uniquely designated identifier for the vessel's transmitter station",
        example = "V7TZ6"
    )
    @JsonProperty("CALLSIGN")
    private String callsign;

    /**
     * The flag of the subject vessel according to AIS transmissions
     */
    @Schema(
        description = "The flag of the subject vessel according to AIS transmissions",
        example = "MH"
    )
    @JsonProperty("FLAG")
    private String flag;

    /**
     * The overall Length (in metres) of the subject vessel
     */
    @Schema(
        description = "The overall Length (in metres) of the subject vessel",
        example = "184"
    )
    @JsonProperty("LENGTH")
    private String length;

    /**
     * The Breadth (in metres) of the subject vessel
     */
    @Schema(
        description = "The Breadth (in metres) of the subject vessel",
        example = "27.43"
    )
    @JsonProperty("WIDTH")
    private String width;

    /**
     * Gross Tonnage - unitless measure that calculates the moulded volume of all enclosed spaces of a ship
     */
    @Schema(
        description = "Gross Tonnage - unitless measure that calculates the moulded volume of all enclosed spaces of a ship",
        example = "23313"
    )
    @JsonProperty("GRT")
    private String grt;

    /**
     * Deadweight - a measure (in metric tons) of how much weight a vessel can safely carry (excluding the vessel's own weight)
     */
    @Schema(
        description = "Deadweight - a measure (in metric tons) of how much weight a vessel can safely carry (excluding the vessel's own weight)",
        example = "37857"
    )
    @JsonProperty("DWT")
    private String dwt;

    /**
     * The Draught (in metres x10) of the subject vessel according to the AIS transmissions
     */
    @Schema(
        description = "The Draught (in metres x10) of the subject vessel according to the AIS transmissions",
        example = "95"
    )
    @JsonProperty("DRAUGHT")
    private String draught;


    /**
     * The year that the subject vessel was built
     */
    @Schema(
        description = "The year that the subject vessel was built",
        example = "2010"
    )
    @JsonProperty("YEAR_BUILT")
    private String year_built;

    /**
     * The vessel's country
     */
    @Schema(
        description = "The vessel's country",
        example = "Marshall Is"
    )
    @JsonProperty("SHIP_COUNTRY")
    private String ship_country;

    /**
     * Vessel's class based on commercial market, capacity and/or dimensions
     */
    @Schema(
        description = "Vessel's class based on commercial market, capacity and/or dimensions",
        example = "HANDYSIZE"
    )
    @JsonProperty("SHIP_CLASS")
    private String ship_class;

    /**
     * Rate of Turn
     */
    @Schema(
        description = "Rate of Turn",
        example = "0"
    )
    @JsonProperty("ROT")
    private String rot;

    /**
     * The MarineTraffic ship type of the vessel
     */
    @Schema(
        description = "The MarineTraffic ship type of the vessel",
        example = "Oil/Chemical Tanker"
    )
    @JsonProperty("TYPE_NAME")
    private String type_name;


    /**
     * Further explanation of the SHIPTYPE ID
     */
    @Schema(
        description = "Further explanation of the SHIPTYPE ID",
        example = "Tanker"
    )
    @JsonProperty("AIS_TYPE_SUMMARY")
    private String ais_type_summary;

    /**
     * The Destination of the subject vessel according to the AIS transmissions
     */
    @Schema(
        description = "The Destination of the subject vessel according to the AIS transmissions",
        example = "FOR ORDERS"
    )
    @JsonProperty("DESTINATION")
    private String destination;

    /**
     * The Estimated Time of Arrival to Destination of the subject vessel according to the AIS transmissions
     */
    @Schema(
        description = "The Estimated Time of Arrival to Destination of the subject vessel according to the AIS transmissions",
        example = "2020-10-14T12:00:00.000Z"
    )
    @JsonProperty("ETA")
    private LocalDateTime eta;

    /**
     * The relative distance from the AIS station of the vessel to the foremost of it (front / bow,
     * example = "2010"
     * )
     */
    @Schema(
        description = "The relative distance from the AIS station of the vessel to the foremost of it (front / bow)",
        example = "5"
    )
    @JsonProperty("L_FORE")
    private String l_fore;

    /**
     * The relative distance from the AIS station of the vessel to the leftmost of it (left side / port)
     */
    @Schema(
        description = "The relative distance from the AIS station of the vessel to the leftmost of it (left side / port)",
        example = "5"
    )
    @JsonProperty("W_LEFT")
    private String w_left;

    /**
     * The Name of the Last Port the vessel has visited
     */
    @Schema(
        description = "The Name of the Last Port the vessel has visited",
        example = "AGIOI THEODOROI"
    )
    @JsonProperty("LAST_PORT")
    private String last_port;

    /**
     * The Date and Time (in UTC) that the subject vessel departed from the Last Port
     */
    @Schema(
        description = "The Date and Time (in UTC) that the subject vessel departed from the Last Port",
        example = "2020-10-13T23:39:00.000Z"
    )
    @JsonProperty("LAST_PORT_TIME")
    private LocalDateTime last_port_time;

    /**
     * A uniquely assigned ID by MarineTraffic for the Last Port
     */
    @Schema(
        description = "A uniquely assigned ID by MarineTraffic for the Last Port",
        example = "29"
    )
    @JsonProperty("LAST_PORT_ID")
    private String last_port_id;

    /**
     * A uniquely assigned ID by United Nations for the Last Port
     */
    @Schema(
        description = "A uniquely assigned ID by United Nations for the Last Port",
        example = "GRAGT"
    )
    @JsonProperty("LAST_PORT_UNLOCODE")
    private String last_port_unlocode;

    /**
     * The Country that the Last Port is located at
     */
    @Schema(
        description = "The Country that the Last Port is located at",
        example = "GR"
    )
    @JsonProperty("LAST_PORT_COUNTRY")
    private String last_port_country;

    /**
     * The name of the Port the subject vessel is currently in (NULL if the vessel is underway)
     */
    @Schema(
        description = "The name of the Port the subject vessel is currently in (NULL if the vessel is underway)",
        example = ""
    )
    @JsonProperty("CURRENT_PORT")
    private String current_port;

    /**
     * A uniquely assigned ID by MarineTraffic for the Current Port
     */
    @Schema(
        description = "A uniquely assigned ID by MarineTraffic for the Current Port",
        example = ""
    )
    @JsonProperty("CURRENT_PORT_ID")
    private String current_port_id;

    /**
     * A uniquely assigned ID by United Nations for the Current Port
     */
    @Schema(
        description = "A uniquely assigned ID by United Nations for the Current Port",
        example = ""
    )
    @JsonProperty("CURRENT_PORT_UNLOCODE")
    private String current_port_unlocode;

    /**
     * The Country that the Current Port is located at
     */
    @Schema(
        description = "The Country that the Current Port is located at",
        example = ""
    )
    @JsonProperty("CURRENT_PORT_COUNTRY")
    private String current_port_country;

    /**
     * A uniquely assigned ID by MarineTraffic for the Next Port
     */
    @Schema(
        description = "A uniquely assigned ID by MarineTraffic for the Next Port",
        example = ""
    )
    @JsonProperty("NEXT_PORT_ID")
    private String next_port_id;

    /**
     * A uniquely assigned ID by United Nations for the Next Port
     */
    @Schema(
        description = "A uniquely assigned ID by United Nations for the Next Port",
        example = ""
    )
    @JsonProperty("NEXT_PORT_UNLOCODE")
    private String next_port_unlocode;

    /**
     * The Name of the Next Port as derived by MarineTraffic based on the subject vessel's reported Destination
     */
    @Schema(
        description = "The Name of the Next Port as derived by MarineTraffic based on the subject vessel's reported Destination",
        example = ""
    )
    @JsonProperty("NEXT_PORT_NAME")
    private String next_port_name;

    /**
     * The Country that the Next Port is located at
     */
    @Schema(
        description = "The Country that the Next Port is located at",
        example = ""
    )
    @JsonProperty("NEXT_PORT_COUNTRY")
    private String next_port_country;

    /**
     * The Estimated Time of Arrival to Destination of the subject vessel according to the MarineTraffic calculations
     */
    @Schema(
        description = "The Estimated Time of Arrival to Destination of the subject vessel according to the MarineTraffic calculations",
        example = ""
    )
    @JsonProperty("ETA_CALC")
    private LocalDateTime eta_calc;

    /**
     * The date and time (in UTC) that the ETA was calculated by MarineTraffic
     */
    @Schema(
        description = "The date and time (in UTC) that the ETA was calculated by MarineTraffic",
        example = ""
    )
    @JsonProperty("ETA_UPDATED")
    private LocalDateTime eta_updated;

    /**
     * The Remaining Distance (in NM) for the subject vessel to reach the reported Destination
     */
    @Schema(
        description = "The Remaining Distance (in NM) for the subject vessel to reach the reported Destination",
        example = "0"
    )
    @JsonProperty("DISTANCE_TO_GO")
    private String distance_to_go;

    /**
     * The Distance (in NM) that the subject vessel has travelled since departing from Last Port
     */
    @Schema(
        description = "The Distance (in NM) that the subject vessel has travelled since departing from Last Port",
        example = "74"
    )
    @JsonProperty("DISTANCE_TRAVELLED")
    private String distance_travelled;

    /**
     * The average speed calculated for the subject vessel during the latest voyage (port to port)
     */
    @Schema(
        description = "The average speed calculated for the subject vessel during the latest voyage (port to port)",
        example = "12.6"
    )
    @JsonProperty("AVG_SPEED")
    private String avg_speed;

    /**
     * The maximum speed reported by the subject vessel during the latest voyage (port to port)
     */
    @Schema(
        description = "The maximum speed reported by the subject vessel during the latest voyage (port to port)",
        example = "13.2"
    )
    @JsonProperty("MAX_SPEED")
    private String max_speed;

}
