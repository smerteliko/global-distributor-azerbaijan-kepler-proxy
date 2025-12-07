package com.gda.kepler.proxy.model.marinetraffic.vesselhistoricaltrack.common;

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
public class BaseVesselHistoricalPositionsResponse {
    /**
     * Maritime Mobile Service Identity - a nine-digit number sent in digital form over a radio frequency that identifies the vessel's transmitter station
     */
    @Schema(description = "property.MMSI.description", example = "239982500")
    @JsonProperty("MMSI")
    private String mmsi;

    /**
     * International Maritime Organisation number - a seven-digit number that uniquely identifies vessels
     */
    @Schema(description = "property.IMO.description", example = "8348678")
    @JsonProperty("IMO")
    private String imo;

    /**
     * The AIS Navigational Status of the subject vessel as input by the vessel's crew. There might be discrepancies with the vessel's detail page when vessel speed is near zero (0) knots
     */
    @Schema(description = "property.STATUS.description", example = "5")
    @JsonProperty("STATUS")
    private String status;

    /**
     * The speed (in knots x10) that the subject vessel is reporting according to AIS transmissions
     */
    @Schema(description = "property.SPEED.description", example = "0")
    @JsonProperty("SPEED")
    private String speed;

    /**
     * Longitude - a geographic coordinate that specifies the east-west position of the vessel on the Earth's surface
     */
    @Schema(description = "property.LON.description", example = "23.726880")
    @JsonProperty("LON")
    private String lon;

    /**
     * Latitude - a geographic coordinate that specifies the north-south position of the vessel on the Earth's surface
     */
    @Schema(description = "property.LAT.description", example = "37.878850")
    @JsonProperty("LAT")
    private String lat;

    /**
     * The course (in degrees) that the subject vessel is reporting according to AIS transmissions
     */
    @Schema(description = "property.COURSE.description", example = "0")
    @JsonProperty("COURSE")
    private String course;

    /**
     * The heading (in degrees) that the subject vessel is reporting according to AIS transmissions
     */
    @Schema(description = "property.HEADING.description", example = "320")
    @JsonProperty("HEADING")
    private String heading;

    /**
     * The date and time (in UTC) that the subject vessel's position or event was recorded by MarineTraffic
     */
    @Schema(description = "property.TIMESTAMP.description", example = "2021-02-08T12:57:01.000Z")
    @JsonProperty("TIMESTAMP")
    private LocalDateTime timestamp;

    /**
     * A uniquely assigned ID by MarineTraffic for the subject vessel
     */
    @Schema(description = "property.SHIP_ID.description", example = "4317723")
    @JsonProperty("SHIP_ID")
    private String ship_id;
}
