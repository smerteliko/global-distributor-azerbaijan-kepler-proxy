package com.gda.kepler.proxy.model.marinetraffic.vesselpositionlegacy.exportvesselscustomarea;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Request parameters for: Vessel Positions in a Custom Area")
public class VesselPositionsInACustomAreaRequest {

    /**
     * Version of the service to be executed. Use version 1 to get the latest
     */
    @Schema(description = "Version of the service to be executed. Use version 1 to get the latest", requiredMode = Schema.RequiredMode.REQUIRED, defaultValue = "1")
    @JsonProperty("v")
    private Integer v = 1;

    /**
     * The maximum age, in minutes, of the returned positions. Maximum value is 2880
     */
    @Schema(description = "The maximum age, in minutes, of the returned positions. Maximum value is 2880", defaultValue = "5")
    @JsonProperty("timespan")
    private Integer timespan = 5;

    /**
     * Filter vessels based on generic vessel types, comma separated values supported Vessel type ID should be used and not vessel type name (2=Fishing / 4=High Speed Craft / 6=Passenger / 7=Cargo / 8=Tanker) Should not be combined with shiptype_detailed filter
     */
    @Schema(description = "Filter vessels based on generic vessel types, comma separated values supported Vessel type ID should be used and not vessel type name (2=Fishing / 4=High Speed Craft / 6=Passenger / 7=Cargo / 8=Tanker) Should not be combined with shiptype_detailed filter")
    @JsonProperty("shiptype_generic")
    private Integer shiptypeGeneric;

    /**
     * Filter vessels based on detailed vessel types, comma separated values supported Vessel type ID should be used and not vessel type name - more Should not be combined with shiptype_generic filter
     */
    @Schema(description = "Filter vessels based on detailed vessel types, comma separated values supported Vessel type ID should be used and not vessel type name - more Should not be combined with shiptype_generic filter")
    @JsonProperty("shiptype_detailed")
    private Integer shiptypeDetailed;

    /**
     * Resolution of the response. Available values: 
 * * simple 
 * * extended 
 * * full If used with the value <b>extended</b> or <b>full</b>, the response includes scheduled static and voyage related vessel data report (AIS Message 5). In this case your request frequency might be limited (depending on your service terms) If omitted, the returned records include only position reports (AIS Messages 1, 2, 3/ 18, 19)
     */
    @Schema(description = "Resolution of the response. Available values: * simple * extended * full If used with the value extended or full, the response includes scheduled static and voyage related vessel data report (AIS Message 5). In this case your request frequency might be limited (depending on your service terms) If omitted, the returned records include only position reports (AIS Messages 1, 2, 3/ 18, 19)", defaultValue = "simple", allowableValues = {"extended", "full", "simple"})
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
