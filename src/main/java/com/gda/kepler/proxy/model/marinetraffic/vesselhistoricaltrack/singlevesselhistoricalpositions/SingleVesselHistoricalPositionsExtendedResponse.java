package com.gda.kepler.proxy.model.marinetraffic.vesselhistoricaltrack.singlevesselhistoricalpositions;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gda.kepler.proxy.model.marinetraffic.vesselhistoricaltrack.common.BaseVesselHistoricalPositionsResponse;
import io.swagger.v3.oas.annotations.media.Schema;

import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "schema.vessel_track.single.extended_response.title")
public class SingleVesselHistoricalPositionsExtendedResponse extends BaseVesselHistoricalPositionsResponse {

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
