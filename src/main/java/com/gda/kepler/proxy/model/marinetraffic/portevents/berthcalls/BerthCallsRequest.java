package com.gda.kepler.proxy.model.marinetraffic.portevents.berthcalls;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Request parameters for: Berth Calls")
public class BerthCallsRequest {

    /**
     * Version of the service to be executed. Use version 3 to get the latest
     */
    @Schema(description = "Version of the service to be executed. Use version 3 to get the latest", requiredMode = Schema.RequiredMode.REQUIRED, defaultValue = "1")
    @JsonProperty("v")
    private Integer v = 1;

    /**
     * A uniquely assigned ID by MarineTraffic for the subject vessel You can <b>instead</b> use imo or mmsi
     */
    @Schema(description = "A uniquely assigned ID by MarineTraffic for the subject vessel You can instead use imo or mmsi", requiredMode = Schema.RequiredMode.REQUIRED)
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
    @Schema(
        description = "The maximum age, in minutes, of the returned port calls",
        defaultValue = "2",
        maximum = "2880"
    )
    @JsonProperty("timespan")
    private Integer timespan = 2;

    /**
     * Berth calls between fromdate and todate. Maximum period requested 15 days Date format: YYYY-MM-DD HH:MM:SS.
     */
    @Schema(
        description = "Berth calls between fromdate and todate. Maximum period requested 15 days",
        format = "date-time"
    )
    @JsonProperty("fromdate")
    private LocalDateTime fromdate;

    /**
     * Berth calls between fromdate and todate. Maximum period requested 15 days Date format: YYYY-MM-DD HH:MM:SS
     */
    @Schema(
        description = "Berth calls between fromdate and todate. Maximum period requested 15 days",
        format = "date-time"
    )
    @JsonProperty("todate")
    private LocalDateTime todate;

    /**
     * Define market for which you would like to receive berth calls - more 
 * * if undefined and ship-class is also undefined, then return all 
 * * if undefined and ship-class is defined, return based on ship-class 
 * * if defined and ship-class is undefined, return all ship-classes of the specific market
     */
    @Schema(
        description = "Define market for which you would like to receive berth calls <ul><li> if undefined and ship-class is also undefined, then return all </li><li> if undefined and ship-class is defined, return based on ship-class </li><li> if defined and ship-class is undefined, return all ship-classes of the specific market</li></ul>",
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
     * Define ship class of interest - more
     */
    @Schema(description = "Define ship class of interest - more")
    @JsonProperty("shipclass")
    private Integer shipclass;

    /**
     * Data filter: minimum DWT Use it to filter by size Cargo and Tanker IMO-having vessels (shiptype = 7,8)
     */
    @Schema(description = "Data filter: minimum DWT Use it to filter by size Cargo and Tanker IMO-having vessels (shiptype = 7,8)")
    @JsonProperty("dwt_min")
    private Integer dwtMin;

    /**
     * Data filter: maximum DWT Use it to filter by size Cargo and Tanker IMO-having vessels (shiptype = 7,8)
     */
    @Schema(description = "Data filter: maximum DWT Use it to filter by size Cargo and Tanker IMO-having vessels (shiptype = 7,8)")
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
     * Use 0 to include both, 1 to only receive dockings or 2 for only undockings within the defined period. If not used, only dockings are returned <b>Available only from version 2 of the service</b>
     */
    @Schema(description = "Use 0 to include both, 1 to only receive dockings or 2 for only undockings within the defined period. If not used, only dockings are returned Available only from version 2 of the service")
    @JsonProperty("movetype")
    private Integer movetype;

    /**
     * Response type. Use one of the following: 
 * * xml 
 * * csv 
 * * jsono
     */
    @Schema(description = "Response type. Use one of the following: * xml * csv * jsono", defaultValue = "xml", allowableValues = {"csv", "jsono", "xml"})
    @JsonProperty("protocol")
    private String protocol = "xml";

    /**
     * Resolution of the response. Available values: 
 * * simple 
 * * extended If used with the value <b>extended</b>, the response includes voyage related data since the previous port call
     */
    @Schema(
        description = "Resolution of the response. If used with the value <b>extended</b>, the response includes voyage related data since the previous port call",
        defaultValue = "simple",
        allowableValues = {"extended", "simple"})
    @JsonProperty("msgtype")
    private String msgtype = "simple";
}
