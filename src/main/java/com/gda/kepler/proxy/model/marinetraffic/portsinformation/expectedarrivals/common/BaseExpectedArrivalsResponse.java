package com.gda.kepler.proxy.model.marinetraffic.portsinformation.expectedarrivals.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Request parameters for: Expected Port Arrivals")
public class BaseExpectedArrivalsResponse {
    /**
     * Maritime Mobile Service Identity - a nine-digit number sent in digital form over a radio frequency that identifies the vessel's transmitter station
     */
    @Schema(description = "Maritime Mobile Service Identity - a nine-digit number sent in digital form over a radio frequency that identifies the vessel's transmitter station", example = "229001000")
    @JsonProperty("MMSI")
    private String mmsi;

    /**
     * International Maritime Organisation number - a seven-digit number that uniquely identifies vessels
     */
    @Schema(description = "International Maritime Organisation number - a seven-digit number that uniquely identifies vessels", example = "")
    @JsonProperty("IMO")
    private String imo;

    /**
     * A uniquely assigned ID by MarineTraffic for the subject vessel
     */
    @Schema(description = "A uniquely assigned ID by MarineTraffic for the subject vessel", example = "")
    @JsonProperty("SHIP_ID")
    private String ship_id;

    /**
     * The Shipname of the subject vessel
     */
    @Schema(description = "The Shipname of the subject vessel", example = "")
    @JsonProperty("SHIPNAME")
    private String shipname;

    /**
     * Latitude - a geographic coordinate that specifies the north-south position of the vessel on the Earth's surface
     */
    @Schema(description = "Latitude - a geographic coordinate that specifies the north-south position of the vessel on the Earth's surface", example = "37.938690")
    @JsonProperty("LAT")
    private String lat;

    /**
     * Longitude - a geographic coordinate that specifies the east-west position of the vessel on the Earth's surface
     */
    @Schema(description = "Longitude - a geographic coordinate that specifies the east-west position of the vessel on the Earth's surface", example = "23.634480")
    @JsonProperty("LON")
    private String lon;

    /**
     * The speed (in knots x10) that the subject vessel is reporting according to AIS transmissions
     */
    @Schema(description = "The speed (in knots x10) that the subject vessel is reporting according to AIS transmissions", example = "0")
    @JsonProperty("SPEED")
    private String speed;

    /**
     * The course (in degrees) that the subject vessel is reporting according to AIS transmissions
     */
    @Schema(description = "The course (in degrees) that the subject vessel is reporting according to AIS transmissions", example = "129")
    @JsonProperty("COURSE")
    private String course;

    /**
     * The AIS Navigational Status of the subject vessel as input by the vessel's crew. There might be discrepancies with the vessel's detail page when vessel speed is near zero (0) knots
     */
    @Schema(description = "The AIS Navigational Status of the subject vessel as input by the vessel's crew. There might be discrepancies with the vessel's detail page when vessel speed is near zero (0) knots", example = "5")
    @JsonProperty("STATUS")
    private String status;

    /**
     * A uniquely assigned ID by MarineTraffic for the Current Port
     */
    @Schema(description = "A uniquely assigned ID by MarineTraffic for the Current Port", example = "1")
    @JsonProperty("PORT_ID")
    private String port_id;

    /**
     * A uniquely assigned ID by United Nations for the Current Port
     */
    @Schema(description = "A uniquely assigned ID by United Nations for the Current Port", example = "GRPIR")
    @JsonProperty("PORT_UNLOCODE")
    private String port_unlocode;

    /**
     * The name of the Port the subject vessel is currently in (NULL if the vessel is underway)
     */
    @Schema(description = "The name of the Port the subject vessel is currently in (NULL if the vessel is underway)", example = "PIRAEUS")
    @JsonProperty("CURRENT_PORT")
    private String current_port;

    /**
     * The Country that the Current Port is located at
     */
    @Schema(description = "The Country that the Current Port is located at", example = "GR")
    @JsonProperty("CURRENT_PORT_COUNTRY")
    private String current_port_country;

    /**
     * A uniquely assigned ID by MarineTraffic for the Next Port
     */
    @Schema(description = "A uniquely assigned ID by MarineTraffic for the Next Port", example = "1")
    @JsonProperty("NEXT_PORT_ID")
    private String next_port_id;

    /**
     * A uniquely assigned ID by United Nations for the Next Port
     */
    @Schema(description = "A uniquely assigned ID by United Nations for the Next Port", example = "GRPIR")
    @JsonProperty("NEXT_PORT_UNLOCODE")
    private String next_port_unlocode;

    /**
     * The Name of the Next Port as derived by MarineTraffic based on the subject vessel's reported Destination
     */
    @Schema(description = "The Name of the Next Port as derived by MarineTraffic based on the subject vessel's reported Destination", example = "PIRAEUS")
    @JsonProperty("NEXT_PORT_NAME")
    private String next_port_name;

    /**
     * The Country that the Next Port is located at
     */
    @Schema(description = "The Country that the Next Port is located at", example = "GR")
    @JsonProperty("NEXT_PORT_COUNTRY")
    private String next_port_country;

    /**
     * The Estimated Time of Arrival to Destination of the subject vessel according to the AIS transmissions
     */
    @Schema(description = "The Estimated Time of Arrival to Destination of the subject vessel according to the AIS transmissions", example = "2021-03-14T05:40:00.000Z")
    @JsonProperty("ETA")
    private LocalDateTime eta;

    /**
     * The Estimated Time of Arrival to Destination of the subject vessel according to the MarineTraffic calculations
     */
    @Schema(description = "The Estimated Time of Arrival to Destination of the subject vessel according to the MarineTraffic calculations", example = "")
    @JsonProperty("ETA_CALC")
    private LocalDateTime eta_calc;

    /**
     * The date and time (in UTC) that the ETA was calculated by MarineTraffic
     */
    @Schema(description = "The date and time (in UTC) that the ETA was calculated by MarineTraffic", example = "")
    @JsonProperty("ETA_UPDATED")
    private LocalDateTime eta_updated;

    /**
     * The date and time (in UTC) that the subject vessel's position or event was recorded by MarineTraffic
     */
    @Schema(description = "The date and time (in UTC) that the subject vessel's position or event was recorded by MarineTraffic", example = "2020-10-30T08:58:08.000Z")
    @JsonProperty("TIMESTAMP")
    private LocalDateTime timestamp;
}
