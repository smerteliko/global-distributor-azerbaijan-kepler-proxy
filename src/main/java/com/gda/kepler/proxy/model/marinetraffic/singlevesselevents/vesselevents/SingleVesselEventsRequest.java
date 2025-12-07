package com.gda.kepler.proxy.model.marinetraffic.singlevesselevents.vesselevents;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Request parameters for: Single Vessel Events")
public class SingleVesselEventsRequest {

    /**
     * Version of the service to be executed. Use version 2 to get the latest
     */
    @Schema(
        description = "description.parameter.v.voyage_forecast",
        requiredMode = Schema.RequiredMode.REQUIRED,
        defaultValue = "1"
    )
    @JsonProperty("v")
    private Integer v = 1;

    /**
     * A uniquely assigned ID by MarineTraffic for the subject vessel You can <b>instead</b> use imo or mmsi
     */
    @Schema(description = "description.parameter.shipid.or.imo.mmsi", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("shipid")
    private Integer shipid;

    /**
     * The Maritime Mobile Service Identity (MMSI) of the vessel you wish to track
     */
    @Schema(description = "The Maritime Mobile Service Identity (MMSI) of the vessel you wish to track")
    @JsonProperty("mmsi")
    private Integer mmsi;

    /**
     * The International Maritime Organization (IMO) number of the vessel you wish to track
     */
    @Schema(description = "The International Maritime Organization (IMO) number of the vessel you wish to track")
    @JsonProperty("imo")
    private Integer imo;

    /**
     * The maximum age, in minutes, of the returned port calls. Maximum value is 2880
     */
    @Schema(
        description = "The maximum age, in minutes, of the returned port calls",
        defaultValue = "60",
        maximum = "2880"
    )
    @JsonProperty("timespan")
    private Integer timespan = 60;

    /**
     * Vessel Events between fromdate and todate Date format: YYYY-MM-DD HH:MM:SS
     */
    @Schema(
        description = "Vessel Events between fromdate and todate Date format: YYYY-MM-DD HH:MM:SS",
        format = "date-time"
    )
    @JsonProperty("fromdate")
    private LocalDateTime fromdate;

    /**
     * Vessel Events between fromdate and todate Date format: YYYY-MM-DD HH:MM:SS
     */
    @Schema(
        description = "Vessel Events between fromdate and todate Date format: YYYY-MM-DD HH:MM:SS",
        format = "date-time"
    )
    @JsonProperty("todate")
    private LocalDateTime todate;

    /**
     * You may use one or more event ids in comma separated format for the events you wish to receive
     */
    @Schema(description = "You may use one or more event ids in comma separated format for the events you wish to receive")
    @JsonProperty("event_type")
    private Integer eventType;

    /**
     * Limit the number of results
     */
    @Schema(description = "Limit the number of results")
    @JsonProperty("limit_events")
    private Integer limitEvents;

    /**
     * Response type. Use one of the following: 
 * * xml 
 * * csv 
 * * jsono
     */
    @Schema(description = "protocol.mandatory.description",
        defaultValue = "xml",
        allowableValues = {"csv", "jsono", "xml"}
    )
    @JsonProperty("protocol")
    private String protocol = "xml";
}
