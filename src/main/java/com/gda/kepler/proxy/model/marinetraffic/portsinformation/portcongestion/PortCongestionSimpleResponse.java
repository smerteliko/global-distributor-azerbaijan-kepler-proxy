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
@Schema(description = "Simple")
public class PortCongestionSimpleResponse {
    /**
     * A uniquely assigned ID by MarineTraffic for the Current Port
     */
    @Schema(description = "property.CURRENT_PORT_ID.description", example = "1766")
    @JsonProperty("PORT_ID")
    private String port_id;

    /**
     * Year of week the data are referring to
     */
    @Schema(description = "property.YEAR.description", example = "2020")
    @JsonProperty("YEAR")
    private String year;

    /**
     * Week of year the data are referring to
     */
    @Schema(description = "property.WEEK.description", example = "8")
    @JsonProperty("WEEK")
    private String week;

    /**
     * The commercial market segment the subject vessel belongs to
     */
    @Schema(description = "property.MARKET.description", example = "DRY BULK")
    @JsonProperty("MARKET")
    private String market;

    /**
     * The class of the subject vessel based on vessel type and size
     */
    @Schema(description = "property.SHIPCLASS.description", example = "HANDYSIZE")
    @JsonProperty("SHIPCLASS")
    private String shipclass;

    /**
     * The median number of days spent at anchorage the previous week
     */
    @Schema(description = "property.TIME_ANCH.description", example = "")
    @JsonProperty("TIME_ANCH")
    private String time_anch;

    /**
     * The median number of days spent at port by the selected market/shipclass
     */
    @Schema(description = "property.TIME_PORT.description", example = "3.4")
    @JsonProperty("TIME_PORT")
    private String time_port;

    /**
     * Number of vessels that were used in the median calculations
     */
    @Schema(description = "property.VESSELS.description", example = "2")
    @JsonProperty("VESSELS")
    private String vessels;

    /**
     * Number of individual calls that were used in the median calculations (e.g. if the same vessel has called twice within the same week, it will count twice in CALLS and once in VESSELS
     */
    @Schema(description = "property.CALLS.description", example = "2")
    @JsonProperty("CALLS")
    private String calls;

    /**
     * The week-to-week standard deviation in days spent at anchorage
     */
    @Schema(description = "property.TIME_ANCH_STDEV.description", example = "")
    @JsonProperty("TIME_ANCH_STDEV")
    private String time_anch_stdev;

    /**
     * The week-to-week difference of number of days spent at anchorage
     */
    @Schema(description = "property.TIME_ANCH_DIFF.description", example = "")
    @JsonProperty("TIME_ANCH_DIFF")
    private String time_anch_diff;

    /**
     * The week-to-week difference of number of days spent at anchorage as a percentage
     */
    @Schema(description = "property.TIME_ANCH_DIFF_PERC.description", example = "")
    @JsonProperty("TIME_ANCH_DIFF_PERC")
    private String time_anch_diff_perc;

    /**
     * The week-to-week standard deviation in days spent at port
     */
    @Schema(description = "property.TIME_PORT_STDEV.description", example = "3.5")
    @JsonProperty("TIME_PORT_STDEV")
    private String time_port_stdev;

    /**
     * The week-to-week difference of number of days spent at port
     */
    @Schema(description = "property.TIME_PORT_DIFF.description", example = "-9.9")
    @JsonProperty("TIME_PORT_DIFF")
    private String time_port_diff;

    /**
     * The week-to-week difference of number of days spent at port as a percentage
     */
    @Schema(description = "property.TIME_PORT_DIFF_PERC.description", example = "-74.4")
    @JsonProperty("TIME_PORT_DIFF_PERC")
    private String time_port_diff_perc;
}
