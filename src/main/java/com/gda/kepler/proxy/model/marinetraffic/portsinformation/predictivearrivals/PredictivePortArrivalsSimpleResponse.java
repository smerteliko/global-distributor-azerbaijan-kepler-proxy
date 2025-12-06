package com.gda.kepler.proxy.model.marinetraffic.portsinformation.predictivearrivals;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Simple")
public class PredictivePortArrivalsSimpleResponse {
    /**
     * International Maritime Organisation number - a seven-digit number that uniquely identifies vessels
     */
    @Schema(description = "International Maritime Organisation number - a seven-digit number that uniquely identifies vessels", example = "9020340")
    @JsonProperty("IMO")
    private String imo;

    /**
     * A uniquely assigned ID by MarineTraffic for the subject vessel
     */
    @Schema(description = "A uniquely assigned ID by MarineTraffic for the subject vessel", example = "337987")
    @JsonProperty("SHIP_ID")
    private String ship_id;

    /**
     * Maritime Mobile Service Identity - a nine-digit number sent in digital form over a radio frequency that identifies the vessel's transmitter station
     */
    @Schema(description = "Maritime Mobile Service Identity - a nine-digit number sent in digital form over a radio frequency that identifies the vessel's transmitter station", example = "271041000")
    @JsonProperty("MMSI")
    private String mmsi;

    /**
     * The Shipname of the subject vessel
     */
    @Schema(description = "The Shipname of the subject vessel", example = "MARTINE A")
    @JsonProperty("SHIPNAME")
    private String shipname;

    /**
     * The commercial market segment the subject vessel belongs to
     */
    @Schema(description = "The commercial market segment the subject vessel belongs to", example = "CONTAINER SHIPS")
    @JsonProperty("MARKET")
    private String market;

    /**
     * The class of the subject vessel based on vessel type and size
     */
    @Schema(description = "The class of the subject vessel based on vessel type and size", example = "FEEDER")
    @JsonProperty("SHIPCLASS")
    private String shipclass;

    /**
     * A uniquely assigned ID by MarineTraffic for the port that was used as origin to retrieve possible destinations
     */
    @Schema(description = "A uniquely assigned ID by MarineTraffic for the port that was used as origin to retrieve possible destinations", example = "1379")
    @JsonProperty("FROM_PORT_ID")
    private String from_port_id;

    /**
     * The port that was used as origin to retrieve possible destinations
     */
    @Schema(description = "The port that was used as origin to retrieve possible destinations", example = "BIZERTE")
    @JsonProperty("FROM_PORT")
    private String from_port;

    /**
     * A uniquely assigned ID by MarineTraffic for the Next Port
     */
    @Schema(description = "A uniquely assigned ID by MarineTraffic for the Next Port", example = "1")
    @JsonProperty("NEXT_PORT_ID")
    private String next_port_id;

    /**
     * The target port used to predict arrivals of vessels
     */
    @Schema(description = "The target port used to predict arrivals of vessels", example = "PIRAEUS")
    @JsonProperty("NEXT_PORT")
    private String next_port;

    /**
     * The area where the target port belongs to
     */
    @Schema(description = "The area where the target port belongs to", example = "EMED")
    @JsonProperty("NEXT_AREA")
    private String next_area;

    /**
     * The probability of visiting the target port
     */
    @Schema(description = "The probability of visiting the target port", example = "1.000")
    @JsonProperty("NEXT_PORT_PROB")
    private String next_port_prob;

    /**
     * The probability of visiting the area where the target port is
     */
    @Schema(description = "The probability of visiting the area where the target port is", example = "1.000")
    @JsonProperty("NEXT_AREA_PROB")
    private String next_area_prob;
}
