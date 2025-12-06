package com.gda.kepler.proxy.model.marinetraffic.voyageinformation.etatoport;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gda.kepler.proxy.model.marinetraffic.voyageinformation.etatoport.common.BaseVesselEtaToPortResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Extended")
public class VesselEtaToPortExtendedResponse extends BaseVesselEtaToPortResponse {

    /**
     * The Distance (in NM) that the subject vessel has travelled since departing from Last Port
     */
    @Schema(description = "The Distance (in NM) that the subject vessel has travelled since departing from Last Port", example = "519")
    @JsonProperty("DISTANCE_TRAVELLED")
    private String distance_travelled;

    /**
     * The Remaining Distance (in NM) for the subject vessel to reach the reported Destination
     */
    @Schema(description = "The Remaining Distance (in NM) for the subject vessel to reach the reported Destination", example = "2629")
    @JsonProperty("DISTANCE_TO_GO")
    private String distance_to_go;

    /**
     * The Speed of the vessel that MarineTraffic used to produce the ETA_CALC value
     */
    @Schema(description = "The Speed of the vessel that MarineTraffic used to produce the ETA_CALC value", example = "58")
    @JsonProperty("SPEED_CALC")
    private String speed_calc;

    /**
     * The Draught (in metres x10) of the subject vessel according to the AIS transmissions
     */
    @Schema(description = "The Draught (in metres x10) of the subject vessel according to the AIS transmissions", example = "93")
    @JsonProperty("DRAUGHT")
    private String draught;

    /**
     * The Maximum Draught that has been recorded for the subject vessel
     */
    @Schema(description = "The Maximum Draught that has been recorded for the subject vessel", example = "104")
    @JsonProperty("DRAUGHT_MAX")
    private String draught_max;

    /**
     * The Load Condition of the subject vessel (In Ballast, Partially Loaded, Loaded)
     */
    @Schema(description = "The Load Condition of the subject vessel (In Ballast, Partially Loaded, Loaded)", example = "LADEN")
    @JsonProperty("LOAD_STATUS_NAME")
    private String load_status_name;

    /**
     * The estimated route of the subject vessel to destination in WKT format
     */
    @Schema(description = "The estimated route of the subject vessel to destination in WKT format", example = "LINESTRING (-3.25721 50.5102, -3.36854 50.4274, -3.43517 50.4228, -3.43879 50.4169, -3.43297 50.4142, -3.42169 50.4115, -3.41547 50.407, -3.41412 50.4007, -3.41569 50.395, -3.4188 50.3885, -3.56497 50.1962, -4.6912 49.5453, -5.17703 49.2673, -5.78868 48.8526, -6.98989 47.5559, -7.2535 47.316, -7.2102 47.0939, -7.2935 46.9586, -8.33592 45.8395, -9.09363 44.8248, -9.5244 44.2492, -9.70133 44.0603, -10.0427 43.6447, -10.1111 43.4934, -10.2361 43.3193, -10.2123 42.2985, -10.1906 41.2322, -10.1462 40.1117, -10.1056 39.0589, -10.0989 38.6851, -10.0265 38.4306, -10.0125 38.3022, -9.69923 37.261, -9.57864 36.8751, -9.52376 36.7973, -9.25278 36.5721, -9.19231 36.5391, -8.15901 36.2992, -7.0206 36.0401, -6.48534 35.9174, -5.82036 35.9016, -5.63979 35.9169, -5.26123 35.984, -4.97929 36.0055, -4.90942 36.0021, -3.80999 36.1162, -2.70866 36.1953, -1.70453 36.3222, -0.620848 36.4784, 0.607268 36.6633, 1.71278 36.8284, 2.7549 36.9733, 3.87165 37.1261, 4.69295 37.2316, 5.74852 37.2387, 6.90585 37.2472, 8.02881 37.2582, 8.64414 37.2678, 9.70149 37.5087, 10.0471 37.569, 10.1756 37.5695, 10.9414 37.4179, 11.4793 37.2768, 11.9401 37.095, 12.4415 36.9732, 13.4569 36.7885, 13.5064 36.7736, 14.5303 36.6101, 15.1167 36.5096, 16.1937 36.477, 17.4477 36.4471, 18.371 36.4181, 18.7263 36.3965, 20.799 36.3638, 21.7999 36.3351, 22.0905 36.3339, 22.2645 36.3226, 22.7168 36.356, 22.9405 36.4011, 23.1341 36.3843, 23.1449 36.3864, 23.1681 36.3932, 23.176 36.3965, 23.2887 36.4584, 23.2941 36.4631, 23.2984 36.4683, 23.3022 36.4743, 23.3053 36.4812, 23.4143 36.9312, 23.6949 37.4873, 23.7461 37.6468, 23.75 37.6672, 23.749 37.6724, 23.6701 37.8133, 23.5845 37.8766, 23.5848 37.8872)")
    @JsonProperty("ROUTE")
    private String route;

    /**
     * The Estimated Time of Departure from the Port specified in query parameters according to the MarineTraffic calculations based on calculated eta, time at anchorage & time at port
     */
    @Schema(description = "The Estimated Time of Departure from the Port specified in query parameters according to the MarineTraffic calculations based on calculated eta, time at anchorage & time at port", example = "2020-11-26T16:20:14.000Z")
    @JsonProperty("ETD_CALC")
    private LocalDateTime etd_calc;

    /**
     * The median number of days spent at anchorage the previous week
     */
    @Schema(description = "The median number of days spent at anchorage the previous week", example = "3.4")
    @JsonProperty("TIME_ANCH")
    private String time_anch;

    /**
     * The median number of days spent at port by the selected market/shipclass
     */
    @Schema(description = "The median number of days spent at port by the selected market/shipclass", example = "6.1")
    @JsonProperty("TIME_PORT")
    private String time_port;
}
