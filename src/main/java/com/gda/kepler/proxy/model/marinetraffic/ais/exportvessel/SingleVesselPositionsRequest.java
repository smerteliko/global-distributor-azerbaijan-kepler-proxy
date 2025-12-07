package com.gda.kepler.proxy.model.marinetraffic.ais.exportvessel;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "model.request.ais.single.description")
public class SingleVesselPositionsRequest {

    /**
     * description.parameter.v.particulars
     */
    @Schema(
        description = "v.mta030ad3.description",
        requiredMode = Schema.RequiredMode.REQUIRED,
        defaultValue = "6",
        minimum = "1",
        maximum = "6"
    )
    @JsonProperty("v")
    private Integer v = 6;

    /**
     * A uniquely assigned ID by MarineTraffic for the subject vessel You can <b>instead</b> use imo or mmsi
     */
    @Schema(description = "description.parameter.shipid.or.imo.mmsi", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("shipid")
    private Integer shipid;

    /**
     * The International Maritime Organization (IMO) number of the vessel you wish to track
     */
    @Schema(description = "imo.description")
    @JsonProperty("imo")
    private Integer imo;

    /**
     * The Maritime Mobile Service Identity (MMSI) of the vessel you wish to track
     */
    @Schema(description = "description.parameter.mmsi")
    @JsonProperty("mmsi")
    private Integer[] mmsi;

    /**
     * The maximum age, in minutes, of the returned positions. Maximum value is 2880
     */
    @Schema(description = "description.parameter.timespan", defaultValue = "5", maximum = "2880")
    @JsonProperty("timespan")
    private Integer timespan = 5;


    /**
     * Response type. Use one of the following: 
 * * xml 
 * * csv 
 * * json 
 * * jsono
     */
    @Schema(description = "protocol.mandatory.description", defaultValue = "xml", allowableValues = {"csv", "jsono"})
    @JsonProperty("protocol")
    private String protocol = "xml";
}
