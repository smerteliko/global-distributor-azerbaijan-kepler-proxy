package com.gda.kepler.proxy.model.marinetraffic.fleets.getfleet;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Request parameters for: Vessels in Fleet")
public class VesselsInFleetRequest {

    /**
     * Version of the service to be executed. Use version 2 to get the latest
     */
    @Schema(description = "description.parameter.v.voyage_forecast", requiredMode = Schema.RequiredMode.REQUIRED, defaultValue = "1")
    @JsonProperty("v")
    private Integer v = 1;

    /**
     * If used, will return specific fleet otherwise default fleet is used
     */
    @Schema(description = "description.parameter.fleet_id_pu02")
    @JsonProperty("fleet_id")
    private Integer fleetID;

    /**
     * Specifies the number of the results page to return. Use this parameter to navigate through paginated results (with version 2) when the fleet contains more than 100 vessels.
     */
    @Schema(description = "description.parameter.page_pu02")
    @JsonProperty("page")
    private Integer page;

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
