package com.gda.kepler.proxy.model.marinetraffic.vesselpositionlegacy.exportvessel;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data

@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Request parameters for: Single Vessel Positions")
public class SingleVesselPositionsRequest {


    /**
     * Version of the service to be executed. Use version 5 to get the latest
     */
    @Schema(description = "description.parameter.v.legacy.single", requiredMode = Schema.RequiredMode.REQUIRED, defaultValue = "1")
    @JsonProperty("v")
    private Integer v = 1;

    /**
     * A uniquely assigned ID by MarineTraffic for the subject vessel You can <b>instead</b> use imo or mmsi
     */
    @Schema(description = "description.parameter.shipid.or.imo.mmsi")
    @JsonProperty("shipid")
    private Integer shipid;

    /**
     * The International Maritime Organization (IMO) number of the vessel you wish to track
     */
    @Schema(description = "description.parameter.imo")
    @JsonProperty("imo")
    private Integer imo;

    /**
     * The Maritime Mobile Service Identity (MMSI) of the vessel you wish to track
     */
    @Schema(description = "description.parameter.mmsi")
    @JsonProperty("mmsi")
    private Integer mmsi;

    /**
     * The maximum age, in minutes, of the returned positions. Maximum value is 2880
     */
    @Schema(description = "description.parameter.timespan", defaultValue = "2", maximum = "2880")
    @JsonProperty("timespan")
    private Integer timespan = 2;

    /**
     * Resolution of the response. Available values: 
 * * simple 
 * * extended If used with the value <b>extended</b>, the response includes scheduled static and voyage related vessel data report (AIS Message 5). In this case your request frequency might be limited (depending on your service terms) If omitted, the returned records include only position reports (AIS Messages 1, 2, 3/ 18, 19)
     */
    @Schema(description = "description.parameter.msgtype.extended", defaultValue = "simple", allowableValues = {"extended", "simple"})
    @JsonProperty("msgtype")
    private String msgtype = "simple";

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
