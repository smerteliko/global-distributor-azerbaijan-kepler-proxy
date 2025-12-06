package com.gda.kepler.proxy.model.marinetraffic.voyageinformation.etatoport;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Request parameters for: Vessel ETA to Port")
public class VesselEtaToPortRequest {

    /**
     * Version of the service to be executed. Use version 2 to get the latest
     */
    @Schema(description = "Version of the service to be executed. Use version 2 to get the latest", requiredMode = Schema.RequiredMode.REQUIRED, defaultValue = "1")
    @JsonProperty("v")
    private Integer v = 1;

    /**
     * The MarineTraffic ID of the port you wish to receive ETA info You can <b>instead</b> use unlocode
     */
    @Schema(description = "The MarineTraffic ID of the port you wish to receive ETA info You can instead use unlocode", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("portid")
    private Integer portid;

    /**
     * The UN LOCODE (without gaps or spaces) of the port you wish to receive ETA info
     */
    @Schema(description = "The UN LOCODE (without gaps or spaces) of the port you wish to receive ETA info")
    @JsonProperty("unlocode")
    private String unlocode;

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
     * The Speed of the Vessel that MarineTraffic will use to produce the ETA value 
 * * f not defined the last average speed of the Vessel will be used 
 * * if no average speed exists then a default value of 12(kn) will be used
     */
    @Schema(description = "The Speed of the Vessel that MarineTraffic will use to produce the ETA value * f not defined the last average speed of the Vessel will be used * if no average speed exists then a default value of 12(kn) will be used", allowableValues = {"f not defined the last average speed of the Vessel will be used", "if no average speed exists then a default value of 12(kn) will be used"})
    @JsonProperty("speed_calc")
    private Integer speedCalc;

    /**
     * Resolution of the response. Available values: 
 * * simple 
 * * extended If used with the value <b>extended</b>, the response includes voyage related data
     */
    @Schema(description = "Resolution of the response. Available values: * simple * extended If used with the value extended, the response includes voyage related data", defaultValue = "simple", allowableValues = {"extended", "simple"})
    @JsonProperty("msgtype")
    private String msgtype = "simple";

    /**
     * Response type. Use one of the following: 
 * * xml 
 * * csv 
 * * json 
 * * jsono
     */
    @Schema(description = "Response type.", defaultValue = "xml", allowableValues = {"csv", "json", "jsono", "xml"})
    @JsonProperty("protocol")
    private String protocol = "xml";
}
