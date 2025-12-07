package com.gda.kepler.proxy.model.marinetraffic.voyageinformation.voyageforecast.singlevesselvoyageforecast;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gda.kepler.proxy.model.marinetraffic.voyageinformation.voyageforecast.common.BaseVoyageForecastResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Extended")
public class SingleVesselVoyageForecastExtendedResponse extends BaseVoyageForecastResponse {

    /**
     * The Distance (in NM) that the subject vessel has travelled since departing from Last Port
     */
    @Schema(description = "property.DISTANCE_TRAVELLED.description", example = "201")
    @JsonProperty("DISTANCE_TRAVELLED")
    private String distance_travelled;

    /**
     * The Remaining Distance (in NM) for the subject vessel to reach the reported Destination
     */
    @Schema(description = "property.DISTANCE_TO_GO.description", example = "0")
    @JsonProperty("DISTANCE_TO_GO")
    private String distance_to_go;

    /**
     * The Speed of the vessel that MarineTraffic used to produce the ETA_CALC value
     */
    @Schema(description = "property.SPEED_CALC.description", example = "")
    @JsonProperty("SPEED_CALC")
    private String speed_calc;

    /**
     * The Draught (in metres x10) of the subject vessel according to the AIS transmissions
     */
    @Schema(description = "property.DRAUGHT.description", example = "101")
    @JsonProperty("DRAUGHT")
    private String draught;

    /**
     * The Maximum Draught that has been recorded for the subject vessel
     */
    @Schema(description = "property.DRAUGHT_MAX.description", example = "105")
    @JsonProperty("DRAUGHT_MAX")
    private String draught_max;

    /**
     * The Load Condition of the subject vessel (In Ballast, Partially Loaded, Loaded)
     */
    @Schema(description = "property.LOAD_STATUS_NAME.description", example = "N/A")
    @JsonProperty("LOAD_STATUS_NAME")
    private String load_status_name;

    /**
     * The estimated route of the subject vessel to destination in WKT format
     */
    @Schema(description = "property.ROUTE_WKT.description", example = "")
    @JsonProperty("ROUTE")
    private String route;
}
