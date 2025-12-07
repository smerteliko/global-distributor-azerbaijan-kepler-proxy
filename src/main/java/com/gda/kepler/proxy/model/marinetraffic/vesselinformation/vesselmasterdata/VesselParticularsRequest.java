package com.gda.kepler.proxy.model.marinetraffic.vesselinformation.vesselmasterdata;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "vessel.particulars.request.model.description")
public class VesselParticularsRequest {


    /**
     * Version of the service to be executed. Use version 5 to get the latest
     */
    @Schema(description = "description.parameter.v.particulars",
        requiredMode = Schema.RequiredMode.REQUIRED,
        defaultValue = "1",
        minimum = "1",
        maximum = "5"
    )
    @JsonProperty("v")
    private Integer v = 1;

    /**
     * The Maritime Mobile Service Identity (MMSI) of the vessel you wish to track (single or comma separated values) You can <b>instead</b> use imo or shipid
     */
    @Schema(description = "description.parameter.mmsi.multi", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("mmsi")
    private String mmsi;

    /**
     * The International Maritime Organization (IMO) number of the vessel you wish to track (single or comma separated values)
     */
    @Schema(description = "description.parameter.imo", type = "string")
    @JsonProperty("imo")
    private String imo;

    /**
     * A uniquely assigned ID by MarineTraffic for the subject vessel (single or comma separated values)
     */
    @Schema(description = "description.parameter.shipid")
    @JsonProperty("shipid")
    private String shipid;

    /**
     * The timespan parameter defines the period of time, during which we want to receive the change in a vessel's details The maximum value can be either 5 when the interval parameter is set to days or 2880 when the interval is set to minutes
     */
    @Schema(description = "description.parameter.timespan")
    @JsonProperty("timespan")
    private Integer timespan;

    /**
     * The interval parameter can be either minutes or days
     */
    @Schema(description = "description.parameter.interval", defaultValue = "minutes", allowableValues = {"minutes", "days"})
    @JsonProperty("interval")
    private String interval = "minutes";

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

    /**
     * Page number of the results to be returned
     */
    @Schema(description = "description.parameter.page", defaultValue = "1")
    @JsonProperty("page")
    private Integer page = 1;

    /**
     * Resolution of the response. Available values:
     * * simple
     * * extended
     */
    @Schema(description = "description.parameter.msgtype", defaultValue = "simple", allowableValues = {"extended", "simple"})
    @JsonProperty("msgtype")
    private String msgtype = "simple";
}
