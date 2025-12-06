package com.gda.kepler.proxy.model.marinetraffic.portsinformation.predictivearrivals;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Request parameters for: Predictive Port Arrivals")
public class PredictivePortArrivalsRequest {


    /**
     * The MarineTraffic ID of the port you wish to receive probable visits (found on the URL of the respective Port page)
     */
    @Schema(description = "The MarineTraffic ID of the port you wish to receive probable visits (found on the URL of the respective Port page)", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("portid")
    private Integer portid;

    /**
     * Define market for which you would like to receive probable visits - more 
 * * if undefined and ship-class is also undefined, then return all 
 * * if undefined and ship-class is defined, return based on ship-class 
 * * If defined and ship-class is undefined, return all ship-classes of the specific market
     */
    @Schema(
        description = "Define market for which you would like to receive probable visits <ul><li> if undefined and ship-class is also undefined, then return all </li><li> if undefined and ship-class is defined, return based on ship-class </li><li> if defined and ship-class is undefined, return all ship-classes of the specific market</li></ul>",
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
    private Integer market;

    /**
     * Define ship class of interest - more
     */
    @Schema(description = "Define ship class of interest - more")
    @JsonProperty("shipclass")
    private Integer shipclass;

    /**
     * Define probability over which you would like to receive probable visits (accepted > 0.3)
     */
    @Schema(description = "Define probability over which you would like to receive probable visits (accepted > 0.3)", minimum = "0.3")
    @JsonProperty("probability")
    private Integer probability;

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
