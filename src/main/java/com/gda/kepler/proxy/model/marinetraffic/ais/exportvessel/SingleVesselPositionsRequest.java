package com.gda.kepler.proxy.model.marinetraffic.ais.exportvessel;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Request parameters for: Single Vessel Positions")
public class SingleVesselPositionsRequest {

    /**
     * Version of the service to be executed. Use version 5 to get the latest
     */
    @Schema(description = "Version of the service to be executed. Use version 6 to get the latest", requiredMode = Schema.RequiredMode.REQUIRED, defaultValue = "6")
    @JsonProperty("v")
    private Integer v = 6;

    /**
     * A uniquely assigned ID by MarineTraffic for the subject vessel You can <b>instead</b> use imo or mmsi
     */
    @Schema(description = "A uniquely assigned ID by MarineTraffic for the subject vessel You can instead use imo or mmsi", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("shipid")
    private Integer shipid;

    /**
     * The International Maritime Organization (IMO) number of the vessel you wish to track
     */
    @Schema(description = "The International Maritime Organization (IMO) number of the vessel you wish to track")
    @JsonProperty("imo")
    private Integer imo;

    /**
     * The Maritime Mobile Service Identity (MMSI) of the vessel you wish to track
     */
    @Schema(description = "The Maritime Mobile Service Identity (MMSI) of the vessel you wish to track")
    @JsonProperty("mmsi")
    private Integer mmsi;

    /**
     * The maximum age, in minutes, of the returned positions. Maximum value is 2880
     */
    @Schema(description = "Overrides the default timespan", defaultValue = "5")
    @JsonProperty("timespan")
    private Integer timespan = 5;


    /**
     * Response type. Use one of the following: 
 * * xml 
 * * csv 
 * * json 
 * * jsono
     */
    @Schema(description = "Response type.", defaultValue = "xml", allowableValues = {"csv", "jsono"})
    @JsonProperty("protocol")
    private String protocol = "xml";
}
