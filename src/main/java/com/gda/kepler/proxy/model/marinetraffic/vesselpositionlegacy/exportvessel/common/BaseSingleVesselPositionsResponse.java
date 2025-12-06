package com.gda.kepler.proxy.model.marinetraffic.vesselpositionlegacy.exportvessel.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data

@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Simple")
public class BaseSingleVesselPositionsResponse {
    /**
     * Maritime Mobile Service Identity - a nine-digit number sent in digital form over a radio frequency that identifies the vessel's transmitter station
     */
    @Schema(description = "Maritime Mobile Service Identity - a nine-digit number sent in digital form over a radio frequency that identifies the vessel's transmitter station", example = "310627000")
    @JsonProperty("MMSI")
    private String mmsi;

    /**
     * Latitude - a geographic coordinate that specifies the north-south position of the vessel on the Earth's surface
     */
    @Schema(description = "Latitude - a geographic coordinate that specifies the north-south position of the vessel on the Earth's surface", example = "50.510560")
    @JsonProperty("LAT")
    private String lat;

    /**
     * Longitude - a geographic coordinate that specifies the east-west position of the vessel on the Earth's surface
     */
    @Schema(description = "Longitude - a geographic coordinate that specifies the east-west position of the vessel on the Earth's surface", example = "-3.452753")
    @JsonProperty("LON")
    private String lon;

    /**
     * The speed (in knots x10) that the subject vessel is reporting according to AIS transmissions
     */
    @Schema(description = "The speed (in knots x10) that the subject vessel is reporting according to AIS transmissions", example = "0")
    @JsonProperty("SPEED")
    private String speed;

    /**
     * The heading (in degrees) that the subject vessel is reporting according to AIS transmissions
     */
    @Schema(description = "The heading (in degrees) that the subject vessel is reporting according to AIS transmissions", example = "347")
    @JsonProperty("HEADING")
    private String heading;

    /**
     * The course (in degrees) that the subject vessel is reporting according to AIS transmissions
     */
    @Schema(description = "The course (in degrees) that the subject vessel is reporting according to AIS transmissions", example = "321")
    @JsonProperty("COURSE")
    private String course;

    /**
     * The AIS Navigational Status of the subject vessel as input by the vessel's crew. There might be discrepancies with the vessel's detail page when vessel speed is near zero (0) knots
     */
    @Schema(description = "The AIS Navigational Status of the subject vessel as input by the vessel's crew. There might be discrepancies with the vessel's detail page when vessel speed is near zero (0) knots", example = "1")
    @JsonProperty("STATUS")
    private String status;

    /**
     * The date and time (in UTC) that the subject vessel's position or event was recorded by MarineTraffic
     */
    @Schema(description = "The date and time (in UTC) that the subject vessel's position or event was recorded by MarineTraffic", example = "2020-10-13T12:21:16.000Z")
    @JsonProperty("TIMESTAMP")
    private LocalDateTime timestamp;

    /**
     * Data Source - Defines whether the transmitted AIS data was received by a Terrestrial or a Satellite AIS Station
     */
    @Schema(description = "Data Source - Defines whether the transmitted AIS data was received by a Terrestrial or a Satellite AIS Station", example = "TER")
    @JsonProperty("DSRC")
    private String dsrc;
}
