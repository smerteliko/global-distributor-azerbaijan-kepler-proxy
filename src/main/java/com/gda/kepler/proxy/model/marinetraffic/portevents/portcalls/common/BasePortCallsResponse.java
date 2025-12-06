package com.gda.kepler.proxy.model.marinetraffic.portevents.portcalls.common;

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
public class BasePortCallsResponse {
    /**
     * A uniquely assigned ID by MarineTraffic for the subject vessel
     */
    @Schema(description = "A uniquely assigned ID by MarineTraffic for the subject vessel", example = "3351323")
    @JsonProperty("SHIP_ID")
    private String ship_id;

    /**
     * International Maritime Organisation number - a seven-digit number that uniquely identifies vessels
     */
    @Schema(description = "International Maritime Organisation number - a seven-digit number that uniquely identifies vessels", example = "0")
    @JsonProperty("IMO")
    private String imo;

    /**
     * Maritime Mobile Service Identity - a nine-digit number sent in digital form over a radio frequency that identifies the vessel's transmitter station
     */
    @Schema(description = "Maritime Mobile Service Identity - a nine-digit number sent in digital form over a radio frequency that identifies the vessel's transmitter station", example = "244770588")
    @JsonProperty("MMSI")
    private String mmsi;

    /**
     * The Shipname of the subject vessel
     */
    @Schema(description = "The Shipname of the subject vessel", example = "PIETERNELLA")
    @JsonProperty("SHIPNAME")
    private String shipname;

    /**
     * The Date and Time (in Local Time) of the Port Call
     */
    @Schema(description = "The Date and Time (in Local Time) of the Port Call", example = "2020-10-20T12:15:00.000Z")
    @JsonProperty("TIMESTAMP_LT")
    private LocalDateTime timestamp_lt;

    /**
     * The Date and Time (in UTC) of the Port Call
     */
    @Schema(description = "The Date and Time (in UTC) of the Port Call", example = "2020-10-20T10:15:00.000Z")
    @JsonProperty("TIMESTAMP_UTC")
    private LocalDateTime timestamp_utc;

    /**
     * 0 or 1 - specifies the Port Call type (0 = Arrival, 1 = Departure)
     */
    @Schema(description = "0 or 1 - specifies the Port Call type (0 = Arrival, 1 = Departure)", example = "0")
    @JsonProperty("MOVE_TYPE")
    private String move_type;

    /**
     * The Type of the subject vessel
     */
    @Schema(description = "The Type of the subject vessel", example = "Inland, Unknown")
    @JsonProperty("TYPE_NAME")
    private String type_name;

    /**
     * A uniquely assigned ID by MarineTraffic for the Current Port
     */
    @Schema(description = "A uniquely assigned ID by MarineTraffic for the Current Port", example = "1766")
    @JsonProperty("PORT_ID")
    private String port_id;

    /**
     * The Name of the subject Port
     */
    @Schema(description = "The Name of the subject Port", example = "AMSTERDAM")
    @JsonProperty("PORT_NAME")
    private String port_name;

    /**
     * The Country Code of the subject Port
     */
    @Schema(description = "The Country Code of the subject Port", example = "")
    @JsonProperty("PORT_COUNTRY_CODE")
    private String port_country_code;

    /**
     * A uniquely assigned ID by United Nations for the subject Port
     */
    @Schema(description = "A uniquely assigned ID by United Nations for the subject Port", example = "NLAMS")
    @JsonProperty("PORT_UNLOCODE")
    private String port_unlocode;

    /**
     * The commercial market segment the subject vessel belongs to
     */
    @Schema(description = "The commercial market segment the subject vessel belongs to")
    @JsonProperty("MARKET")
    private String market;
}
