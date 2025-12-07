package com.gda.kepler.proxy.model.marinetraffic.voyageinformation.predictivedestinationareas.fleetpredictivedestinations;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Request parameters for: Fleet Predictive Destinations")
public class FleetPredictiveDestinationsRequest {

    /**
     * The Maritime Mobile Service Identity (MMSI) of the vessel you wish to track You can <b>instead</b> use imo or shipid
     */
    @Schema(description = "The Maritime Mobile Service Identity (MMSI) of the vessel you wish to track You can instead use imo or shipid", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("mmsi")
    private Integer mmsi;

    /**
     * The International Maritime Organization (IMO) number of the vessel you wish to track
     */
    @Schema(description = "The International Maritime Organization (IMO) number of the vessel you wish to track")
    @JsonProperty("imo")
    private Integer imo;

    /**
     * A uniquely assigned ID by MarineTraffic for the subject vessel
     */
    @Schema(description = "property.SHIP_ID.description")
    @JsonProperty("shipid")
    private Integer shipid;

    /**
     * The MarineTraffic ID of the port you wish to receive a prediction (found on the URL of the respective Port page)
     */
    @Schema(description = "The MarineTraffic ID of the port you wish to receive a prediction (found on the URL of the respective Port page)")
    @JsonProperty("fromportid")
    private Integer fromportid;

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
