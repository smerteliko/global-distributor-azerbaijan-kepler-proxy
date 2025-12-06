package com.gda.kepler.proxy.model.marinetraffic.singlevesselevents.berthcalls.common;

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
public class BaseSingleVesselBerthCallsResponse {
    /**
     * A uniquely assigned ID by MarineTraffic for the subject vessel
     */
    @Schema(description = "A uniquely assigned ID by MarineTraffic for the subject vessel", example = "5567750")
    @JsonProperty("SHIP_ID")
    private String ship_id;

    /**
     * Maritime Mobile Service Identity - a nine-digit number sent in digital form over a radio frequency that identifies the vessel's transmitter station
     */
    @Schema(description = "Maritime Mobile Service Identity - a nine-digit number sent in digital form over a radio frequency that identifies the vessel's transmitter station", example = "237710500")
    @JsonProperty("MMSI")
    private String mmsi;

    /**
     * International Maritime Organisation number - a seven-digit number that uniquely identifies vessels
     */
    @Schema(description = "International Maritime Organisation number - a seven-digit number that uniquely identifies vessels", example = "0")
    @JsonProperty("IMO")
    private String imo;

    /**
     * The Date and Time (in Local Time) the subject vessel was Docked at the Berth
     */
    @Schema(description = "The Date and Time (in Local Time) the subject vessel was Docked at the Berth", example = "2020-10-20T06:22:00.000Z")
    @JsonProperty("DOCK_TIMESTAMP_LT")
    private LocalDateTime dock_timestamp_lt;

    /**
     * The Date and Time (in UTC) the subject vessel was Docked at the Berth
     */
    @Schema(description = "The Date and Time (in UTC) the subject vessel was Docked at the Berth", example = "2020-10-20T03:22:00.000Z")
    @JsonProperty("DOCK_TIMESTAMP_UTC")
    private LocalDateTime dock_timestamp_utc;

    /**
     * The time zone offset at the time of arrival/docking
     */
    @Schema(description = "The time zone offset at the time of arrival/docking", example = "3.000000")
    @JsonProperty("DOCK_TIMESTAMP_OFFSET")
    private String dock_timestamp_offset;

    /**
     * The Date and Time (in Local Time) the subject vessel was Undocked from the Berth
     */
    @Schema(description = "The Date and Time (in Local Time) the subject vessel was Undocked from the Berth", example = "2020-10-20T06:45:00.000Z")
    @JsonProperty("UNDOCK_TIMESTAMP_LT")
    private LocalDateTime undock_timestamp_lt;

    /**
     * The Date and Time (in UTC) the subject vessel was Undocked from the Berth
     */
    @Schema(description = "The Date and Time (in UTC) the subject vessel was Undocked from the Berth", example = "2020-10-20T03:45:00.000Z")
    @JsonProperty("UNDOCK_TIMESTAMP_UTC")
    private LocalDateTime undock_timestamp_utc;

    /**
     * The time zone offset at the time of undocking/departure
     */
    @Schema(description = "The time zone offset at the time of undocking/departure", example = "3.000000")
    @JsonProperty("UNDOCK_TIMESTAMP_OFFSET")
    private String undock_timestamp_offset;

    /**
     * The Shipname of the subject vessel
     */
    @Schema(description = "The Shipname of the subject vessel", example = "PILOT BOAT PY56")
    @JsonProperty("SHIPNAME")
    private String shipname;

    /**
     * The Type of the subject vessel.
     */
    @Schema(description = "The Type of the subject vessel.", example = "Pilot Vessel")
    @JsonProperty("TYPE_NAME")
    private String type_name;

    /**
     * Deadweight - a measure (in metric tons) of how much weight a vessel can safely carry (excluding the vessel's own weight)
     */
    @Schema(description = "Deadweight - a measure (in metric tons) of how much weight a vessel can safely carry (excluding the vessel's own weight)")
    @JsonProperty("DWT")
    private String dwt;

    /**
     * Gross Tonnage - unitless measure that calculates the moulded volume of all enclosed spaces of a ship
     */
    @Schema(description = "Gross Tonnage - unitless measure that calculates the moulded volume of all enclosed spaces of a ship")
    @JsonProperty("GRT")
    private String grt;

    /**
     * The flag of the subject vessel according to AIS transmissions
     */
    @Schema(description = "The flag of the subject vessel according to AIS transmissions", example = "GR")
    @JsonProperty("FLAG")
    private String flag;

    /**
     * The year that the subject vessel was built
     */
    @Schema(description = "The year that the subject vessel was built")
    @JsonProperty("YEAR_BUILT")
    private String year_built;

    /**
     * A uniquely assigned ID by MarineTraffic for the Current Berth
     */
    @Schema(description = "A uniquely assigned ID by MarineTraffic for the Current Berth", example = "6")
    @JsonProperty("BERTH_ID")
    private String berth_id;

    /**
     * The Name of the subject Berth
     */
    @Schema(description = "The Name of the subject Berth", example = "Container Terminal")
    @JsonProperty("BERTH_NAME")
    private String berth_name;

    /**
     * A uniquely assigned ID by MarineTraffic for the Terminal where the Berth belongs (if available)
     */
    @Schema(description = "A uniquely assigned ID by MarineTraffic for the Terminal where the Berth belongs (if available)", example = "978")
    @JsonProperty("TERMINAL_ID")
    private String terminal_id;

    /**
     * The Name of the Terminal where the Berth belongs (if available)
     */
    @Schema(description = "The Name of the Terminal where the Berth belongs (if available)", example = "Container Terminal")
    @JsonProperty("TERMINAL_NAME")
    private String terminal_name;

    /**
     * A uniquely assigned ID by MarineTraffic for the Current Port
     */
    @Schema(description = "A uniquely assigned ID by MarineTraffic for the Current Port", example = "1")
    @JsonProperty("PORT_ID")
    private String port_id;

    /**
     * The Name of the subject Port
     */
    @Schema(description = "The Name of the subject Port", example = "PIRAEUS")
    @JsonProperty("PORT_NAME")
    private String port_name;

    /**
     * A uniquely assigned ID by United Nations for the subject Port
     */
    @Schema(description = "A uniquely assigned ID by United Nations for the subject Port", example = "GRPIR")
    @JsonProperty("PORT_UNLOCODE")
    private String port_unlocode;

    /**
     * The Country of the subject Port
     */
    @Schema(description = "The Country of the subject Port", example = "GR")
    @JsonProperty("PORT_COUNTRY_CODE")
    private String port_country_code;

    /**
     * Api Rspfield Destination Id
     */
    @Schema(description = "Api Rspfield Destination Id", example = "1")
    @JsonProperty("DESTINATION_ID")
    private String destination_id;

    /**
     * The Destination of the subject vessel according to the AIS transmissions
     */
    @Schema(description = "The Destination of the subject vessel according to the AIS transmissions", example = "PIRAEUS")
    @JsonProperty("DESTINATION")
    private String destination;

    /**
     * The commercial market segment the subject vessel belongs to
     */
    @Schema(description = "The commercial market segment the subject vessel belongs to")
    @JsonProperty("MARKET")
    private String market;
}
