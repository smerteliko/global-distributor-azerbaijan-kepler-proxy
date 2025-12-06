package com.gda.kepler.proxy.model.marinetraffic.singlevesselevents.portcalls;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Extended")
public class SingleVesselPortCallsExtendedResponse {

    /**
     * The latitude of the subject Port
     */
    @Schema(description = "The latitude of the subject Port", example = "")
    @JsonProperty("PORT_LAT")
    private String port_lat;

    /**
     * The longitude of the subject Port
     */
    @Schema(description = "The longitude of the subject Port", example = "")
    @JsonProperty("PORT_LON")
    private String port_lon;


    /**
     * The Draught (in metres x10) of the subject vessel according to the AIS transmissions
     */
    @Schema(description = "The Draught (in metres x10) of the subject vessel according to the AIS transmissions", example = "59")
    @JsonProperty("DRAUGHT")
    private String draught;

    /**
     * The load status of the subject vessel (0 : N/A, 1 : In Ballast, 2 : Partially Laden, 3 : Fully Laden) <b>Available after 2017-10-01 (YYYY-MM-DD)</b>
     */
    @Schema(description = "The load status of the subject vessel (0 : N/A, 1 : In Ballast, 2 : Partially Laden, 3 : Fully Laden) Available after 2017-10-01 (YYYY-MM-DD)", example = "0")
    @JsonProperty("LOAD_STATUS")
    private String load_status;

    /**
     * Indicates LOAD/DISCHARGE operations in the subject Port Call event (0 : N/A, 1 : load, 2 : discharge, 3 : both, 4 : none) <b>Available after 2017-10-01 (YYYY-MM-DD)</b>
     */
    @Schema(description = "Indicates LOAD/DISCHARGE operations in the subject Port Call event (0 : N/A, 1 : load, 2 : discharge, 3 : both, 4 : none) Available after 2017-10-01 (YYYY-MM-DD)", example = "0")
    @JsonProperty("PORT_OPERATION")
    private String port_operation;

    /**
     * 0 or 1 - specifies whether the vessel anchored in the Port or was In Transit (1 = In Transit)
     */
    @Schema(description = "0 or 1 - specifies whether the vessel anchored in the Port or was In Transit (1 = In Transit)", example = "0")
    @JsonProperty("INTRANSIT")
    private String intransit;

    /**
     * The Distance (in NM) that the subject vessel has travelled since departing from Last Port
     */
    @Schema(description = "The Distance (in NM) that the subject vessel has travelled since departing from Last Port", example = "0")
    @JsonProperty("DISTANCE_TRAVELLED")
    private String distance_travelled;

    /**
     * Average Maintained Speed (in knots x10) since the last Port Call while steaming at speed > 5 knots - Updated upon Arrival
     */
    @Schema(description = "Average Maintained Speed (in knots x10) since the last Port Call while steaming at speed > 5 knots - Updated upon Arrival")
    @JsonProperty("VOYAGE_SPEED_AVG")
    private String voyage_speed_avg;

    /**
     * Maximum Recorded Speed (in knots x10) since the last Port Call - Updated upon Arrival
     */
    @Schema(description = "Maximum Recorded Speed (in knots x10) since the last Port Call - Updated upon Arrival")
    @JsonProperty("VOYAGE_SPEED_MAX")
    private String voyage_speed_max;

    /**
     * Total time in minutes since the previous Port Call while the vessel stopped or moving at speed < 3 knots - Updated upon Arrival
     */
    @Schema(description = "Total time in minutes since the previous Port Call while the vessel stopped or moving at speed < 3 knots - Updated upon Arrival")
    @JsonProperty("VOYAGE_IDLE_TIME_MINS")
    private String voyage_idle_time_mins;

    /**
     * Total time of Voyage since the previous Port Call except Anchorages and Canals - Updated upon Arrival
     */
    @Schema(description = "Total time of Voyage since the previous Port Call except Anchorages and Canals - Updated upon Arrival", example = "672")
    @JsonProperty("ELAPSED_NOANCH")
    private String elapsed_noanch;

    /**
     * The distance (in NM) between the last two calls regardless of Port Type
     */
    @Schema(description = "The distance (in NM) between the last two calls regardless of Port Type")
    @JsonProperty("DISTANCE_LEG")
    private String distance_leg;

    /**
     * The class of the subject vessel based on vessel type and size
     */
    @Schema(description = "The class of the subject vessel based on vessel type and size")
    @JsonProperty("SHIPCLASS")
    private String shipclass;
}
