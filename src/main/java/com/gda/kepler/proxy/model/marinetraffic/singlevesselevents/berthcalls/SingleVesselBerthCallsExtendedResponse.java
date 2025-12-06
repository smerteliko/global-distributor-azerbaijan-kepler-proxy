package com.gda.kepler.proxy.model.marinetraffic.singlevesselevents.berthcalls;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gda.kepler.proxy.model.marinetraffic.singlevesselevents.berthcalls.common.BaseSingleVesselBerthCallsResponse;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;
import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Extended")
public class SingleVesselBerthCallsExtendedResponse extends BaseSingleVesselBerthCallsResponse {
    /**
     * Api Rspfield Destination Id
     */
    @Schema(description = "Api Rspfield Destination Id")
    @JsonProperty("DESTINATION_ID")
    private String destination_id;

    /**
     * The Date and Time (in Local Time) the subject vessel arrived at the port, before the docking
     */
    @Schema(description = "The Date and Time (in Local Time) the subject vessel arrived at the port, before the docking", example = "2020-10-20T15:25:00.000Z")
    @JsonProperty("ARR_TIMESTAMP_LT")
    private LocalDateTime arr_timestamp_lt;

    /**
     * The Date and Time (in UTC) the subject vessel arrived at the port, before the docking
     */
    @Schema(description = "The Date and Time (in UTC) the subject vessel arrived at the port, before the docking", example = "2020-10-20T12:25:00.000Z")
    @JsonProperty("ARR_TIMESTAMP_UTC")
    private LocalDateTime arr_timestamp_utc;

    /**
     * The Draught (in metres x10) of the subject vessel, at the time of arrival, according to the AIS transmissions
     */
    @Schema(description = "The Draught (in metres x10) of the subject vessel, at the time of arrival, according to the AIS transmissions", example = "0")
    @JsonProperty("ARR_DRAUGHT")
    private String arr_draught;

    /**
     * The load status of the subject vessel (0 : N/A, 1 : In Ballast, 2 : Partially Laden, 3 : Fully Laden) at the time of arrival
     */
    @Schema(description = "The load status of the subject vessel (0 : N/A, 1 : In Ballast, 2 : Partially Laden, 3 : Fully Laden) at the time of arrival", example = "0")
    @JsonProperty("ARR_LOAD_STATUS")
    private String arr_load_status;

    /**
     * The Distance (in NM) that the subject vessel has travelled since departing from Last Port
     */
    @Schema(description = "The Distance (in NM) that the subject vessel has travelled since departing from Last Port", example = "2")
    @JsonProperty("DISTANCE_TRAVELLED")
    private String distance_travelled;

    /**
     * Average Maintained Speed (in knots x10) since the last Port Call while steaming at speed > 5 knots - Updated upon Arrival
     */
    @Schema(description = "Average Maintained Speed (in knots x10) since the last Port Call while steaming at speed > 5 knots - Updated upon Arrival", example = "166")
    @JsonProperty("VOYAGE_SPEED_AVG")
    private String voyage_speed_avg;

    /**
     * Maximum Recorded Speed (in knots x10) since the last Port Call - Updated upon Arrival
     */
    @Schema(description = "Maximum Recorded Speed (in knots x10) since the last Port Call - Updated upon Arrival", example = "166")
    @JsonProperty("VOYAGE_SPEED_MAX")
    private String voyage_speed_max;

    /**
     * Total time in minutes since the previous Port Call while the vessel stopped or moving at speed < 3 knots - Updated upon Arrival
     */
    @Schema(description = "Total time in minutes since the previous Port Call while the vessel stopped or moving at speed < 3 knots - Updated upon Arrival", example = "0")
    @JsonProperty("VOYAGE_IDLE_TIME_MINS")
    private String voyage_idle_time_mins;

    /**
     * The ID of the port of origin
     */
    @Schema(description = "The ID of the port of origin", example = "1")
    @JsonProperty("PREVIOUS_NOANCH_ID")
    private String previous_noanch_id;

    /**
     * The time of Departure form the port of origin (UTC)
     */
    @Schema(description = "The time of Departure form the port of origin (UTC)", example = "2020-10-20T12:22:00.000Z")
    @JsonProperty("PREVIOUS_NOANCH_TIMESTAMP")
    private LocalDateTime previous_noanch_timestamp;

    /**
     * The name of the port of origin
     */
    @Schema(description = "The name of the port of origin", example = "PIRAEUS")
    @JsonProperty("PREVIOUS_NOANCH_NAME")
    private String previous_noanch_name;

    /**
     * Total time of Voyage since the previous Port Call except Anchorages and Canals - Updated upon Arrival
     */
    @Schema(description = "Total time of Voyage since the previous Port Call except Anchorages and Canals - Updated upon Arrival", example = "3")
    @JsonProperty("ELAPSED_NOANCH")
    private String elapsed_noanch;

    /**
     * The Date and Time (in Local Time) the subject vessel departed from the port, after the undocking
     */
    @Schema(description = "The Date and Time (in Local Time) the subject vessel departed from the port, after the undocking")
    @JsonProperty("DEP_TIMESTAMP_LT")
    private LocalDateTime dep_timestamp_lt;

    /**
     * The Date and Time (in UTC) the subject vessel departed from the port, after the undocking
     */
    @Schema(description = "The Date and Time (in UTC) the subject vessel departed from the port, after the undocking")
    @JsonProperty("DEP_TIMESTAMP_UTC")
    private LocalDateTime dep_timestamp_utc;

    /**
     * The Draught (in metres x10) of the subject vessel, at the time of departure, according to the AIS transmissions
     */
    @Schema(description = "The Draught (in metres x10) of the subject vessel, at the time of departure, according to the AIS transmissions")
    @JsonProperty("DEP_DRAUGHT")
    private String dep_draught;

    /**
     * The load status of the subject vessel (0 : N/A, 1 : In Ballast, 2 : Partially Laden, 3 : Fully Laden) at the time of departure
     */
    @Schema(description = "The load status of the subject vessel (0 : N/A, 1 : In Ballast, 2 : Partially Laden, 3 : Fully Laden) at the time of departure")
    @JsonProperty("DEP_LOAD_STATUS")
    private String dep_load_status;

    /**
     * Indicates LOAD/DISCHARGE operations in the subject Port Call event (0 : N/A, 1 : load, 2 : discharge, 3 : both, 4 : none)
     */
    @Schema(description = "Indicates LOAD/DISCHARGE operations in the subject Port Call event (0 : N/A, 1 : load, 2 : discharge, 3 : both, 4 : none)")
    @JsonProperty("PORT_OPERATION")
    private String port_operation;

    /**
     * The total time in minutes that the vessel stayed at berth
     */
    @Schema(description = "The total time in minutes that the vessel stayed at berth", example = "3")
    @JsonProperty("TIME_AT_BERTH")
    private String time_at_berth;

    /**
     * The total time in minutes that the vessel stayed at port
     */
    @Schema(description = "The total time in minutes that the vessel stayed at port")
    @JsonProperty("TIME_AT_PORT")
    private String time_at_port;

    /**
     * The class of the subject vessel based on vessel type and size
     */
    @Schema(description = "The class of the subject vessel based on vessel type and size")
    @JsonProperty("SHIPCLASS")
    private String shipclass;
}
