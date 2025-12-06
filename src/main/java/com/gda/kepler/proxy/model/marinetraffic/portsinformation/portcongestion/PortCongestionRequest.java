package com.gda.kepler.proxy.model.marinetraffic.portsinformation.portcongestion;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Request parameters for: Port Congestion")
public class PortCongestionRequest {


    /**
     * The MarineTraffic ID of the port for which you wish to retrieve congestion metrics (found on the URL of the respective Port page). If you wish to retrieve congestion metrics for all ports, instead of <b>portid</b> use <b>agg_port=1</b>
     */
    @Schema(description = "The MarineTraffic ID of the port for which you wish to retrieve congestion metrics (found on the URL of the respective Port page). If you wish to retrieve congestion metrics for all ports, instead of portid use agg_port=1", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("portid")
    private Integer portid;

    /**
     * Year of interest (data available back to 1 year). Information further back can be requested ad-hoc
     */
    @Schema(description = "Year of interest (data available back to 1 year). Information further back can be requested ad-hoc", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("year")
    private Integer year;

    /**
     * Week of Year that is of interest (e.g. for week 18/2018 input 18). For range of weeks use comma e.g. for weeks 30 to 35 (30,35)
     */
    @Schema(description = "Week of Year that is of interest (e.g. for week 18/2018 input 18). For range of weeks use comma e.g. for weeks 30 to 35 (30,35)", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("week")
    private Integer week;

    /**
     * Define market for which you would like to receive port congestion - more 
 * * if undefined and ship-class is also undefined, then figures for ALL markets/ship-class 
 * * if undefined and ship-class is defined, returns based on ship-class for ALL applicable to size class markets 
 * * if defined and ship-class is undefined, returns figures for the specific market (no size class breakdown) If you wish to retrieve congestion metrics for all markets, instead of <b>market</b> use <b>agg_market</b> query parameter (=0 or =1)
     */
    @Schema(description = "Define market for which you would like to receive port congestion - more * if undefined and ship-class is also undefined, then figures for ALL markets/ship-class * if undefined and ship-class is defined, returns based on ship-class for ALL applicable to size class markets * if defined and ship-class is undefined, returns figures for the specific market (no size class breakdown) If you wish to retrieve congestion metrics for all markets, instead of market use agg_market query parameter (=0 or =1)", requiredMode = Schema.RequiredMode.REQUIRED, allowableValues = {"if defined and ship-class is undefined, returns figures for the specific market (no size class breakdown)", "if undefined and ship-class is also undefined, then figures for ALL markets/ship-class", "if undefined and ship-class is defined, returns based on ship-class for ALL applicable to size class markets"})
    @JsonProperty("market")
    private Integer market;

    /**
     * Define ship class of interest - more If you wish to retrieve congestion metrics for all ship classes, instead of <b>shipclass</b> use <b>agg_shipclass</b> query parameter (=0 or =1)
     */
    @Schema(description = "Define ship class of interest - more If you wish to retrieve congestion metrics for all ship classes, instead of shipclass use agg_shipclass query parameter (=0 or =1)", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("shipclass")
    private Integer shipclass;

    /**
     * 
 * *
 * *If used, portid should not be in request
 * *
 * * 
 * * when agg_port = 1 is used, aggregation result of all ports are returned 
 * * when agg_port = 1 is used, agg_market cannot be 1
     */
    @Schema(description = "**If used, portid should not be in request** * when agg_port = 1 is used, aggregation result of all ports are returned * when agg_port = 1 is used, agg_market cannot be 1", allowableValues = {"when agg_port = 1 is used, agg_market cannot be 1", "when agg_port = 1 is used, aggregation result of all ports are returned"})
    @JsonProperty("agg_port")
    private Integer aggPort;

    /**
     * 
 * *
 * *If used, market should not be in request
 * *
 * * 
 * * if agg_market = 1, aggregation result of all markets will be returned 
 * * if 0, a breakdown of markets will be returned
     */
    @Schema(description = "**If used, market should not be in request** * if agg_market = 1, aggregation result of all markets will be returned * if 0, a breakdown of markets will be returned", allowableValues = {"if 0, a breakdown of markets will be returned", "if agg_market = 1, aggregation result of all markets will be returned"})
    @JsonProperty("agg_market")
    private Integer aggMarket;

    /**
     * 
 * *
 * *If used, shipclass should not be in request
 * *
 * * 
 * * if agg_shipclass = 1, aggregation result of all classes will be returned 
 * * if 0, a breakdown of classes will be returned
     */
    @Schema(description = "**If used, shipclass should not be in request** * if agg_shipclass = 1, aggregation result of all classes will be returned * if 0, a breakdown of classes will be returned", allowableValues = {"if 0, a breakdown of classes will be returned", "if agg_shipclass = 1, aggregation result of all classes will be returned"})
    @JsonProperty("agg_shipclass")
    private Integer aggShipclass;

    /**
     * The median number of days spent at anchorage by the selected market/shipclass. Values indicate in between set to be returned Comma separated float numbers (one decimal) <b>Available only if extended version of the API is used</b>
     */
    @Schema(description = "The median number of days spent at anchorage by the selected market/shipclass. Values indicate in between set to be returned Comma separated float numbers (one decimal) Available only if extended version of the API is used")
    @JsonProperty("time_anch")
    private String timeAnch;

    /**
     * The median number of days spent at port by the selected market/shipclass. Values indicate in between set to be returned Comma separated float numbers (one decimal) <b>Available only if extended version of the API is used</b>
     */
    @Schema(description = "The median number of days spent at port by the selected market/shipclass. Values indicate in between set to be returned Comma separated float numbers (one decimal) Available only if extended version of the API is used")
    @JsonProperty("time_port")
    private String timePort;

    /**
     * Number of vessels that were used in the median calculations. Value of parameter indicates greater than relation <b>Available only if extended version of the API is used</b>
     */
    @Schema(description = "Number of vessels that were used in the median calculations. Value of parameter indicates greater than relation Available only if extended version of the API is used")
    @JsonProperty("vessels")
    private Integer vessels;

    /**
     * Number of individual calls that were used in the median calculations (e.g. if the same vessel has called twice within the same week, it will count twice in calls and once in vessels. Value of parameter indicates greater than relation <b>Available only if extended version of the API is used</b>
     */
    @Schema(description = "Number of individual calls that were used in the median calculations (e.g. if the same vessel has called twice within the same week, it will count twice in calls and once in vessels. Value of parameter indicates greater than relation Available only if extended version of the API is used")
    @JsonProperty("calls")
    private Integer calls;

    /**
     * The standard deviation of days spent at anchorage the previous week. Values indicate in between set to be returned (time_anch_stdev:0.5,1.5) Comma separated float numbers (one decimal) <b>Available only if full version of the API is used</b>
     */
    @Schema(description = "The standard deviation of days spent at anchorage the previous week. Values indicate in between set to be returned (time_anch_stdev:0.5,1.5) Comma separated float numbers (one decimal) Available only if full version of the API is used")
    @JsonProperty("time_anch_stdev")
    private String timeAnchStdev;

    /**
     * The week-to-week difference of number of days spent at anchorage. Values indicate in between set to be returned Comma separated float numbers (one decimal) <b>Available only if full version of the API is used</b>
     */
    @Schema(description = "The week-to-week difference of number of days spent at anchorage. Values indicate in between set to be returned Comma separated float numbers (one decimal) Available only if full version of the API is used")
    @JsonProperty("time_anch_diff")
    private String timeAnchDiff;

    /**
     * The week-to-week difference of number of days spent at anchorage as a percentage. Values indicate in between set to be returned Comma separated float numbers (one decimal) <b>Available only if full version of the API is used</b>
     */
    @Schema(description = "The week-to-week difference of number of days spent at anchorage as a percentage. Values indicate in between set to be returned Comma separated float numbers (one decimal) Available only if full version of the API is used")
    @JsonProperty("time_anch_diff_perc")
    private String timeAnchDiffPerc;

    /**
     * The standard deviation of days spent at port the previous week. Values indicate in between set to be returned (time_port_stdev:0.5,1.5) Comma separated float numbers (one decimal) <b>Available only if full version of the API is used</b>
     */
    @Schema(description = "The standard deviation of days spent at port the previous week. Values indicate in between set to be returned (time_port_stdev:0.5,1.5) Comma separated float numbers (one decimal) Available only if full version of the API is used")
    @JsonProperty("time_port_stdev")
    private String timePortStdev;

    /**
     * The week-to-week difference of number of days spent at port. Values indicate in between set to be returned Comma separated float numbers (one decimal) <b>Available only if full version of the API is used</b>
     */
    @Schema(description = "The week-to-week difference of number of days spent at port. Values indicate in between set to be returned Comma separated float numbers (one decimal) Available only if full version of the API is used")
    @JsonProperty("time_port_diff")
    private String timePortDiff;

    /**
     * The week-to-week difference of number of days spent at port as a percentage. Values indicate in between set to be returned Comma separated float numbers (one decimal) <b>Available only if full version of the API is used</b>
     */
    @Schema(description = "The week-to-week difference of number of days spent at port as a percentage. Values indicate in between set to be returned Comma separated float numbers (one decimal) Available only if full version of the API is used")
    @JsonProperty("time_port_diff_perc")
    private String timePortDiffPerc;

    /**
     * Response type. Use one of the following: 
 * * xml 
 * * csv 
 * * json 
 * * jsono
     */
    @Schema(description = "Response type. ", defaultValue = "xml", allowableValues = {"csv", "json", "jsono", "xml"})
    @JsonProperty("protocol")
    private String protocol = "xml";
}
