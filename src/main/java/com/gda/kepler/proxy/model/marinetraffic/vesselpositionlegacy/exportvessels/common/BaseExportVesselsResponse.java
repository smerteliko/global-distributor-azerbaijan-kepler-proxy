package com.gda.kepler.proxy.model.marinetraffic.vesselpositionlegacy.exportvessels.common;

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
@Schema(description = "Base")
public class BaseExportVesselsResponse {    /**
 * Maritime Mobile Service Identity - a nine-digit number sent in digital form over a radio frequency that identifies the vessel's transmitter station
 */
@Schema(description = "property.MMSI.description", example = "538006210")
@JsonProperty("MMSI")
private String mmsi;

    /**
     * International Maritime Organisation number - a seven-digit number that uniquely identifies vessels
     */
    @Schema(description = "property.IMO.description", example = "9314105")
    @JsonProperty("IMO")
    private String imo;

    /**
     * A uniquely assigned ID by MarineTraffic for the subject vessel
     */
    @Schema(description = "property.SHIP_ID.description", example = "475106")
    @JsonProperty("SHIP_ID")
    private String ship_id;

    /**
     * Latitude - a geographic coordinate that specifies the north-south position of the vessel on the Earth's surface
     */
    @Schema(description = "property.LAT.description", example = "36.007480")
    @JsonProperty("LAT")
    private String lat;

    /**
     * Longitude - a geographic coordinate that specifies the east-west position of the vessel on the Earth's surface
     */
    @Schema(description = "property.LON.description", example = "22.291650")
    @JsonProperty("LON")
    private String lon;

    /**
     * The speed (in knots x10) that the subject vessel is reporting according to AIS transmissions
     */
    @Schema(description = "property.SPEED.description", example = "4")
    @JsonProperty("SPEED")
    private String speed;

    /**
     * The heading (in degrees) that the subject vessel is reporting according to AIS transmissions
     */
    @Schema(description = "property.HEADING.description", example = "273")
    @JsonProperty("HEADING")
    private String heading;

    /**
     * The course (in degrees) that the subject vessel is reporting according to AIS transmissions
     */
    @Schema(description = "property.COURSE.description", example = "49")
    @JsonProperty("COURSE")
    private String course;

    /**
     * The AIS Navigational Status of the subject vessel as input by the vessel's crew. There might be discrepancies with the vessel's detail page when vessel speed is near zero (0) knots
     */
    @Schema(description = "property.STATUS.description", example = "0")
    @JsonProperty("STATUS")
    private String status;

    /**
     * The date and time (in UTC) that the subject vessel's position or event was recorded by MarineTraffic
     */
    @Schema(description = "property.TIMESTAMP.description", example = "2020-10-15T12:26:10.000Z")
    @JsonProperty("TIMESTAMP")
    private LocalDateTime timestamp;

    /**
     * Data Source - Defines whether the transmitted AIS data was received by a Terrestrial or a Satellite AIS Station
     */
    @Schema(description = "property.DSRC.description", example = "TER")
    @JsonProperty("DSRC")
    private String dsrc;

    /**
     * The time slot that the subject vessel uses to transmit information
     */
    @Schema(description = "property.UTC_SECONDS.description", example = "7")
    @JsonProperty("UTC_SECONDS")
    private String utc_seconds;
}
