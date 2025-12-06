package com.gda.kepler.proxy.model.marinetraffic.routinginformation.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Request parameters for: Vessel Route to Port")
public class BaseRoutingRequest {

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
    @Schema(description = "A uniquely assigned ID by MarineTraffic for the subject vessel")
    @JsonProperty("shipid")
    private Integer shipid;

    /**
     * The MarineTraffic ID of the port you wish to put as target port (found on the URL of the respective Port page) or port UN/LOCODE
     */
    @Schema(description = "The MarineTraffic ID of the port you wish to put as target port (found on the URL of the respective Port page) or port UN/LOCODE", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("port_target_id")
    private Integer portTargetID;

    /**
     * Use 1 to search for all available routes regarding the specific journey or 0 to not include alternative routes
     */
    @Schema(description = "Use 1 to search for all available routes regarding the specific journey or 0 to not include alternative routes")
    @JsonProperty("includealternatives")
    private Integer includealternatives;

    /**
     * Use 1 in order to receive routes which include inland waterways or 0 to not include alternative routes
     */
    @Schema(description = "Use 1 in order to receive routes which include inland waterways or 0 to not include alternative routes")
    @JsonProperty("includeinland")
    private Integer includeinland;

    /**
     * Resolution of the response. Available values:
     * * simple
     * * extended If used with the value <b>extended</b>, the response includes also route/waypoints as Linestring Geometry in WKT - Well-Known Text
     */
    @Schema(description = "Resolution of the response. Available values: * simple * extended If used with the value extended, the response includes also route/waypoints as Linestring Geometry in WKT - Well-Known Text", defaultValue = "simple", allowableValues = {"extended", "simple"})
    @JsonProperty("msgtype")
    private String msgtype = "simple";

    /**
     * Response type. Use one of the following:
     * * xml
     * * csv
     * * json
     * * jsono
     */
    @Schema(description = "Response type. Use one of the following: * xml * csv * json * jsono", defaultValue = "xml", allowableValues = {"csv", "json", "jsono", "xml"})
    @JsonProperty("protocol")
    private String protocol = "xml";
}
