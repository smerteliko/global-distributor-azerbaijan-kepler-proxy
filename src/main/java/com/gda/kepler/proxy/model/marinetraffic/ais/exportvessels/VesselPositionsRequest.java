package com.gda.kepler.proxy.model.marinetraffic.ais.exportvessels;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Request parameters for: Vessel Positions")
public class VesselPositionsRequest {

    /**
     * Version of the service to be executed. Use version 8 to get the latest
     */
    @Schema(description = "description.parameter.v.legacy.export", requiredMode = Schema.RequiredMode.REQUIRED, defaultValue = "9")
    @JsonProperty("v")
    private Integer v = 9;

    /**
     * Filter data by vessel type:
     * * 2: Fishing
     * * 4: High Speed Craf
     * * 6: Passenger
     * * 7: Cargo
     * * 8: Tanker
     */
    @Schema(description = "Filter data by vessel type", allowableValues = {"2", "4", "6", "7", "8"})
    @JsonProperty("vesselTypeId")
    private Integer vesselTypeId;

    /**
     * The maximum age, in minutes, of the returned positions. Maximum value for terrestrial coverage is 60. Maximum value for satellite coverage is 180
     */
    @Schema(description = "description.parameter.timespan.export", defaultValue = "5")
    @JsonProperty("timespan")
    private Integer timespan = 5;

    @Schema(description = "metadata.cursor.description")
    @JsonProperty("cursor")
    private String cursor;

    @Schema(description = "limit.description", minimum ="1000",maximum = "5000", defaultValue = "2000")
    @JsonProperty("cursor")
    private Integer limit = 2000;


    /**
     * Response type. Use one of the following: 
 * * xml 
 * * csv 
 * * json 
 * * jsono
     */
    @Schema(description = "protocol.mandatory.description", defaultValue = "jsono", allowableValues = {"csv", "jsono",})
    @JsonProperty("protocol")
    private String protocol = "jsono";
}
