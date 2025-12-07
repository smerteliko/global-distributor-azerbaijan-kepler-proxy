package com.gda.kepler.proxy.model.marinetraffic.voyageinformation.voyageforecast.fleetvoyageforecast;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Request parameters for: Fleet Voyage Forecast")
public class FleetVoyageForecastRequest {

    /**
     * Version of the service to be executed. Use version 2 to get the latest
     */
    @Schema(description = "Version of the service to be executed. Use version 2 to get the latest", requiredMode = Schema.RequiredMode.REQUIRED, defaultValue = "1")
    @JsonProperty("v")
    private Integer v = 1;

    /**
     * The fleet id you wish to receive voyage forecast for
     */
    @Schema(description = "The fleet id you wish to receive voyage forecast for", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("fleet_id")
    private Integer fleetID;

    /**
     * Resolution of the response. Available values: 
 * * simple 
 * * extended If used with the value <b>extended</b>, the response includes voyage related information (eg. distance travelled and to-go, load condition) and the estimated route to the vessel's destination
     */
    @Schema(description = "Resolution of the response. Available values: * simple * extended If used with the value extended, the response includes voyage related information (eg. distance travelled and to-go, load condition) and the estimated route to the vessel's destination", defaultValue = "simple", allowableValues = {"extended", "simple"})
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
