package com.gda.kepler.proxy.model.marinetraffic.vesselhistoricaltrack.vesselhistoricalpositionsinanarea;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gda.kepler.proxy.model.marinetraffic.vesselhistoricaltrack.common.BaseVesselHistoricalPositionsResponse;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;
import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Extended")
public class VesselHistoricalPositionsInAnAreaExtendedResponse extends BaseVesselHistoricalPositionsResponse {
    /**
     * Maritime Mobile Service Identity - a nine-digit number sent in digital form over a radio frequency that identifies the vessel's transmitter station
     */
    @Schema(description = "Maritime Mobile Service Identity - a nine-digit number sent in digital form over a radio frequency that identifies the vessel's transmitter station", example = "239982500")
    @JsonProperty("MMSI")
    private String mmsi;

    /**
     * International Maritime Organisation number - a seven-digit number that uniquely identifies vessels
     */
    @Schema(description = "International Maritime Organisation number - a seven-digit number that uniquely identifies vessels", example = "8348678")
    @JsonProperty("IMO")
    private String imo;

    /**
     * The AIS Navigational Status of the subject vessel as input by the vessel's crew. There might be discrepancies with the vessel's detail page when vessel speed is near zero (0) knots
     */
    @Schema(description = "The AIS Navigational Status of the subject vessel as input by the vessel's crew. There might be discrepancies with the vessel's detail page when vessel speed is near zero (0) knots", example = "5")
    @JsonProperty("STATUS")
    private String status;

    /**
     * The speed (in knots x10) that the subject vessel is reporting according to AIS transmissions
     */
    @Schema(description = "The speed (in knots x10) that the subject vessel is reporting according to AIS transmissions", example = "0")
    @JsonProperty("SPEED")
    private String speed;

    /**
     * Longitude - a geographic coordinate that specifies the east-west position of the vessel on the Earth's surface
     */
    @Schema(description = "Longitude - a geographic coordinate that specifies the east-west position of the vessel on the Earth's surface", example = "23.726880")
    @JsonProperty("LON")
    private String lon;

    /**
     * Latitude - a geographic coordinate that specifies the north-south position of the vessel on the Earth's surface
     */
    @Schema(description = "Latitude - a geographic coordinate that specifies the north-south position of the vessel on the Earth's surface", example = "37.878850")
    @JsonProperty("LAT")
    private String lat;

    /**
     * The course (in degrees) that the subject vessel is reporting according to AIS transmissions
     */
    @Schema(description = "The course (in degrees) that the subject vessel is reporting according to AIS transmissions", example = "0")
    @JsonProperty("COURSE")
    private String course;

    /**
     * The heading (in degrees) that the subject vessel is reporting according to AIS transmissions
     */
    @Schema(description = "The heading (in degrees) that the subject vessel is reporting according to AIS transmissions", example = "320")
    @JsonProperty("HEADING")
    private String heading;

    /**
     * The date and time (in UTC) that the subject vessel's position or event was recorded by MarineTraffic
     */
    @Schema(description = "The date and time (in UTC) that the subject vessel's position or event was recorded by MarineTraffic", example = "2021-02-08T12:57:01.000Z")
    @JsonProperty("TIMESTAMP")
    private LocalDateTime timestamp;

    /**
     * A uniquely assigned ID by MarineTraffic for the subject vessel
     */
    @Schema(description = "A uniquely assigned ID by MarineTraffic for the subject vessel", example = "4317723")
    @JsonProperty("SHIP_ID")
    private String ship_id;

    /**
     * The current angle of the wind in the subject area (in degrees, compared to True North)
     */
    @Schema(description = "The current angle of the wind in the subject area (in degrees, compared to True North)", example = "326")
    @JsonProperty("WIND_ANGLE")
    private String wind_angle;

    /**
     * The current wind speed in the subject area (in knots)
     */
    @Schema(description = "The current wind speed in the subject area (in knots)", example = "10")
    @JsonProperty("WIND_SPEED")
    private String wind_speed;

    /**
     * The current temperature of the wind in the subject area (in Celsius degrees)
     */
    @Schema(description = "The current temperature of the wind in the subject area (in Celsius degrees)", example = "23")
    @JsonProperty("WIND_TEMP")
    private String wind_temp;

    /**
     * The significant wave height in the subject area (in meters x10)
     */
    @Schema(description = "The significant wave height in the subject area (in meters x10)", example = "2")
    @JsonProperty("SIGNIFICANT_WAVE_HEIGHT")
    private String significant_wave_height;

    /**
     * The height of the wind waves in the subjects area (in meters x10)
     */
    @Schema(description = "The height of the wind waves in the subjects area (in meters x10)", example = "1")
    @JsonProperty("WIND_WAVE_HEIGHT")
    private String wind_wave_height;

    /**
     * The period of the wind waves in the subject area (in seconds)
     */
    @Schema(description = "The period of the wind waves in the subject area (in seconds)", example = "16")
    @JsonProperty("WIND_WAVE_PERIOD")
    private String wind_wave_period;

    /**
     * The direction of the wind waves in the subject area (in degrees, compared to True North)
     */
    @Schema(description = "The direction of the wind waves in the subject area (in degrees, compared to True North)", example = "314")
    @JsonProperty("WIND_WAVE_DIRECTION")
    private String wind_wave_direction;

    /**
     * The height of the swells in the subject area (in meters x10)
     */
    @Schema(description = "The height of the swells in the subject area (in meters x10)", example = "1")
    @JsonProperty("SWELL_HEIGHT")
    private String swell_height;

    /**
     * The period of the swells in the subject area (in seconds)
     */
    @Schema(description = "The period of the swells in the subject area (in seconds)", example = "26")
    @JsonProperty("SWELL_PERIOD")
    private String swell_period;

    /**
     * The direction of the swells in the subject area (in degrees, compared to True North)
     */
    @Schema(description = "The direction of the swells in the subject area (in degrees, compared to True North)", example = "317")
    @JsonProperty("SWELL_DIRECTION")
    private String swell_direction;

    /**
     * The angle of the currents in the subject area (in degrees, compared to True North)
     */
    @Schema(description = "The angle of the currents in the subject area (in degrees, compared to True North)", example = "308")
    @JsonProperty("CURRENTS_ANGLE")
    private String currents_angle;

    /**
     * The speed of the currents in the subject area (in knots x100)
     */
    @Schema(description = "The speed of the currents in the subject area (in knots x100)", example = "20")
    @JsonProperty("CURRENTS_SPEED")
    private String currents_speed;
}
