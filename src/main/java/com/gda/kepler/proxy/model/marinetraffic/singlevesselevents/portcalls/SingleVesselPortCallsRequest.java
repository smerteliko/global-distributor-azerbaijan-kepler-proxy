package com.gda.kepler.proxy.model.marinetraffic.singlevesselevents.portcalls;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Request parameters for: Single Vessel Port Calls")
public class SingleVesselPortCallsRequest {

    /**
     * Version of the service to be executed. Use version 6 to get the latest
     */
    @Schema(description = "", requiredMode = Schema.RequiredMode.REQUIRED, defaultValue = "1")
    @JsonProperty("v")
    private Integer v = 1;

    /**
     * A uniquely assigned ID by MarineTraffic for the subject vessel You can <b>instead</b> use imo or mmsi
     */
    @Schema(description = "description.parameter.shipid.or.imo.mmsi", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("shipid")
    private Integer shipid;

    /**
     * The Maritime Mobile Service Identity (MMSI) of the vessel you wish to track
     */
    @Schema(description = "The Maritime Mobile Service Identity (MMSI) of the vessel you wish to track")
    @JsonProperty("mmsi")
    private Integer mmsi;

    /**
     * The International Maritime Organization (IMO) number of the vessel you wish to track
     */
    @Schema(description = "The International Maritime Organization (IMO) number of the vessel you wish to track")
    @JsonProperty("imo")
    private Integer imo;

    /**
     * The maximum age, in minutes, of the returned port calls. Maximum value is 2880
     */
    @Schema(description = "The maximum age, in minutes, of the returned port calls.", defaultValue = "2",maximum = "2880")
    @JsonProperty("timespan")
    private Integer timespan = 2;

    /**
     * Use 0 to only receive arrivals or 1 to only receive departures. If not used, the response will include both
     */
    @Schema(
        description = "Use 0 to only receive arrivals or 1 to only receive departures. If not used, the response will include both",
        allowableValues = {"0","1"}
    )
    @JsonProperty("movetype")
    private Integer movetype;

    /**
     * Use 1 to exclude vessels in transit
     */
    @Schema(description = "Use 1 to exclude vessels in transit")
    @JsonProperty("exclude_intransit")
    private Integer excludeIntransit;

    /**
     * Portcalls between fromdate and todate. Maximum period requested 190 days Date format: YYYY-MM-DD HH:MM
     */
    @Schema(
        description = "Portcalls between fromdate and todate. Maximum period requested 190 days",
        format = "date-time"
    )
    @JsonProperty("fromdate")
    private LocalDateTime fromdate;

    /**
     * Portcalls between fromdate and todate. Maximum period requested 190 days Date format: YYYY-MM-DD HH:MM
     */
    @Schema(
        description = "Portcalls between fromdate and todate. Maximum period requested 190 days",
        format = "date-time"
    )
    @JsonProperty("todate")
    private LocalDateTime todate;

    /**
     * Data filter: minimum DWT Applicable to IMO-having vessels
     */
    @Schema(description = "Data filter: minimum DWT Applicable to IMO-having vessels")
    @JsonProperty("dwt_min")
    private Integer dwtMin;

    /**
     * Data filter: maximum DWT Applicable to IMO-having vessels
     */
    @Schema(description = "Data filter: maximum DWT Applicable to IMO-having vessels")
    @JsonProperty("dwt_max")
    private Integer dwtMax;

    /**
     * Data filter: minimum GT Applicable to IMO-having vessels
     */
    @Schema(description = "Data filter: minimum GT Applicable to IMO-having vessels")
    @JsonProperty("gt_min")
    private Integer gtMin;

    /**
     * Data filter: maximum GT Applicable to IMO-having vessels
     */
    @Schema(description = "Data filter: maximum GT Applicable to IMO-having vessels")
    @JsonProperty("gt_max")
    private Integer gtMax;

    /**
     * Define market(s) for which you would like to receive port calls (single or comma separated values) - more
     */
    @Schema(
        description = "Define market(s) for which you would like to receive port calls (single or comma separated values)",
        allowableValues = {
            "CONTAINER SHIPS",
            "DRY BREAKBULK",
            "DRY BULK",
            "LNG CARRIERS",
            "LPG CARRIERS",
            "WET BULK",
            "PASSENGER SHIPS",
            "OFFSHORE/RIGS",
            "RO/RO",
            "SUPPORTING VESSELS",
            "PLEASURE CRAFT",
            "FISHING",
            "OTHER MARKETS"
        }
    )
    @JsonProperty("market")
    private String market;

    /**
     * Resolution of the response. Available values: 
 * * simple 
 * * extended If used with the value <b>extended</b>, the response includes voyage related data since the previous port call
     */
    @Schema(description = "description.parameter.msgtype.extended", defaultValue = "simple", allowableValues = {"extended", "simple"})
    @JsonProperty("msgtype")
    private String msgtype = "simple";

    /**
     * Response type. Use one of the following: 
 * * xml 
 * * csv 
 * * jsono
     */
    @Schema(description = "protocol.mandatory.description", defaultValue = "xml", allowableValues = {"csv", "jsono", "xml"})
    @JsonProperty("protocol")
    private String protocol = "xml";
}
