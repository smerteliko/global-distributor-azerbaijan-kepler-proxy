package com.gda.kepler.proxy.model.marinetraffic.vesselpositionlegacy.exportvessels.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Request parameters for: Vessel Positions within a Port")
public class BaseExportVesselsRequest {

    /**
     * Version of the service to be executed. Use version 8 to get the latest
     */
    @Schema(description = "Version of the service to be executed. Use version 8 to get the latest", requiredMode = Schema.RequiredMode.REQUIRED, defaultValue = "1")
    @JsonProperty("v")
    private Integer v = 1;

    /**
     * The maximum age, in minutes, of the returned positions. Maximum value for terrestrial coverage is 60. Maximum value for satellite coverage is 180
     */
    @Schema(description = "The maximum age, in minutes, of the returned positions. Maximum value for terrestrial coverage is 60. Maximum value for satellite coverage is 180", defaultValue = "5")
    @JsonProperty("timespan")
    private Integer timespan = 5;

    /**
     * Filter data by vessel type:
     * * 2: Fishing
     * * 4: High Speed Craf
     * * 6: Passenger
     * * 7: Cargo
     * * 8: Tanker
     */
    @Schema(description = "Filter data by vessel type: * 2: Fishing * 4: High Speed Craf * 6: Passenger * 7: Cargo * 8: Tanker", allowableValues = {"2", "4", "6", "7", "8"})
    @JsonProperty("shiptype")
    private Integer shiptype;

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
    @Schema(description = "Response type.", defaultValue = "xml", allowableValues = {"csv", "json", "jsono", "xml"})
    @JsonProperty("protocol")
    private String protocol = "xml";
}
