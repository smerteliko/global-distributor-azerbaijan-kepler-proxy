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
@Schema(description = "Request parameters for: Single Vessel Historical Positions")
public class BaseVesselHistoricalPositionsRequest {
    /**
     * Version of the service to be executed. Use version 3 to get the latest
     */
    @Schema(description = "description.parameter.v.historical", defaultValue = "1")
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
    @Schema(description = "description.parameter.mmsi")
    @JsonProperty("mmsi")
    private Integer mmsi;

    /**
     * The International Maritime Organization (IMO) number of the vessel you wish to track
     */
    @Schema(description = "The International Maritime Organization (IMO) number of the vessel you wish to track")
    @JsonProperty("imo")
    private Integer imo;

    /**
     * The number of days, starting from the time of request and going backwards, for which the response should look for position data Maximum value is 190 (days)
     */
    @Schema(description = "The number of days, starting from the time of request and going backwards, for which the response should look for position data Maximum value is 190 (days)", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("days")
    private Integer days;

    /**
     * Use with todate <b>instead</b> of days to get data for a date period
     */
    @Schema(description = "Use with todate instead of days to get data for a date period")
    @JsonProperty("fromdate")
    private String fromdate;

    /**
     * Use with fromdate <b>instead</b> of days to get data for a date period
     */
    @Schema(description = "Use with fromdate instead of days to get data for a date period")
    @JsonProperty("todate")
    private String todate;

    /**
     * Limit position per vessel. Omit to get all the available positions Values are:
     * * hourly: get one position per hour
     * * daily: get one position per day
     */
    @Schema(description = "Limit position per vessel. Omit to get all the available positions Values are: * hourly: get one position per hour * daily: get one position per day", allowableValues = {"daily", "hourly"})
    @JsonProperty("period")
    private String period;

    /**
     * Resolution of the response. Available values:
     * * simple
     * * extended If used with the value <b>extended</b>, the response includes also weather data
     */
    @Schema(description = "description.parameter.msgtype.extended", defaultValue = "simple", allowableValues = {"extended", "simple"})
    @JsonProperty("msgtype")
    private String msgtype = "simple";

    /**
     * Response type. Use one of the following:
     * * xml
     * * csv
     * * json
     * * jsono
     */
    @Schema(description = "protocol.mandatory.description", defaultValue = "xml", allowableValues = {"csv", "json", "jsono", "xml"})
    @JsonProperty("protocol")
    private String protocol = "xml";
}
