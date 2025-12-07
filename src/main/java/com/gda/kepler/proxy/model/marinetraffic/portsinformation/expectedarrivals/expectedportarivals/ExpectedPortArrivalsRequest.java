package com.gda.kepler.proxy.model.marinetraffic.portsinformation.expectedarrivals.expectedportarivals;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Request parameters for: Expected Port Arrivals")
public class ExpectedPortArrivalsRequest {


    /**
     * Version of the service to be executed. Use version 4 to get the latest
     */
    @Schema(description = "description.parameter.v.expected_arrivals", requiredMode = Schema.RequiredMode.REQUIRED, defaultValue = "1")
    @JsonProperty("v")
    private Integer v = 1;

    /**
     * The MarineTraffic ID of the port (found on the URL of the respective Port page)
     */
    @Schema(description = "The MarineTraffic ID of the port (found on the URL of the respective Port page)", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("portid")
    private Integer portid;

    /**
     * Number of days in the future to look for expected arrivals, starting from the time the API call is requested Maximum value is 40 days If neither this nor the fromdate/todate parameters are used, the response only includes vessels currently in port (or the country’s ports) and the last vessel's signal is received during the last 2 days
     */
    @Schema(description = "Number of days in the future to look for expected arrivals, starting from the time the API call is requested Maximum value is 40 days If neither this nor the fromdate/todate parameters are used, the response only includes vessels currently in port (or the country’s ports) and the last vessel's signal is received during the last 2 days",
        maximum = "40",
        minimum = "1",
        defaultValue = "2"
    )
    @JsonProperty("timespan")
    private Integer timespan;

    /**
     * Include vessels currently in port that have transmitted a position within the last x days (based on their last signal timestamp). This parameter only works when no other timeframe is defined.
     */
    @Schema(description = "Include vessels currently in port that have transmitted a position within the last x days (based on their last signal timestamp). This parameter only works when no other timeframe is defined.")
    @JsonProperty("days_last_signal")
    private Integer daysLastSignal;

    /**
     * Timestamp in the future to start looking for expected arrivals. If used, then you should also define the todate parameter Date format: YYYY-MM-DD HH:MM:SS
     */
    @Schema(description = "Timestamp in the future to start looking for expected arrivals. If used, then you should also define the todate parameter Date format: YYYY-MM-DD HH:MM:SS")
    @JsonProperty("fromdate")
    private LocalDateTime fromdate;

    /**
     * Timestamp in the future to start looking for expected arrivals. If used, then you should also define the fromdate parameter Date format: YYYY-MM-DD HH:MM:SS
     */
    @Schema(description = "Timestamp in the future to start looking for expected arrivals. If used, then you should also define the fromdate parameter Date format: YYYY-MM-DD HH:MM:SS")
    @JsonProperty("todate")
    private LocalDateTime todate;

    /**
     * The MarineTraffic ID of the previous port (found on the URL of the respective Port page) or previous port UNLOCODE
     */
    @Schema(description = "The MarineTraffic ID of the previous port (found on the URL of the respective Port page) or previous port UNLOCODE")
    @JsonProperty("fromportid")
    private Integer fromportid;

    /**
     * Filter data by vessel type: 
 * * 2: Fishing 
 * * 4: High Speed Craf 
 * * 6: Passenger 
 * * 7: Cargo 
 * * 8: Tanker
     */
    @Schema(description = "Filter data by vessel type: * 2: Fishing * 4: High Speed Craf * 6: Passenger * 7: Cargo * 8: Tanker", allowableValues = {"2", "4", "6", "7", "8"})
    @JsonProperty("shiptype")
    private Integer shiptype;

    /**
     * Data filter: minimum DWT Use it to filter by size Cargo and Tanker IMO-having vessels (shiptype = 7,8). If used, then you should also define the dwt_max parameter
     */
    @Schema(description = "Data filter: minimum DWT Use it to filter by size Cargo and Tanker IMO-having vessels (shiptype = 7,8). If used, then you should also define the dwt_max parameter")
    @JsonProperty("dwt_min")
    private Integer dwtMin;

    /**
     * Data filter: maximum DWT Use it to filter by size Cargo and Tanker IMO-having vessels (shiptype = 7,8). If used, then you should also define the dwt_min parameter
     */
    @Schema(description = "Data filter: maximum DWT Use it to filter by size Cargo and Tanker IMO-having vessels (shiptype = 7,8). If used, then you should also define the dwt_min parameter")
    @JsonProperty("dwt_max")
    private Integer dwtMax;

    /**
     * Data filter: minimum GT Applicable to IMO-having vessels. If used, then you should also define the gt_max parameter
     */
    @Schema(description = "Data filter: minimum GT Applicable to IMO-having vessels. If used, then you should also define the gt_max parameter")
    @JsonProperty("gt_min")
    private Integer gtMin;

    /**
     * Data filter: maximum GT Applicable to IMO-having vessels. If used, then you should also define the gt_min parameter
     */
    @Schema(description = "Data filter: maximum GT Applicable to IMO-having vessels. If used, then you should also define the gt_min parameter")
    @JsonProperty("gt_max")
    private Integer gtMax;

    /**
     * Resolution of the response. Available values: 
 * * simple 
 * * extended If used with the value <b>extended</b>, apart from the ETA information, the response includes main vessel particulars. If omitted, the returned records include only position and ETA reports
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
