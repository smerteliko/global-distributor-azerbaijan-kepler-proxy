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
@Schema(description = "Simple")
public class SingleVesselEventsSimpleResponse {
    /**
     * Maritime Mobile Service Identity - a nine-digit number sent in digital form over a radio frequency that identifies the vessel's transmitter station
     */
    @Schema(description = "property.MMSI.description", example = "310624000")
    @JsonProperty("MMSI")
    private String mmsi;

    /**
     * International Maritime Organisation number - a seven-digit number that uniquely identifies vessels
     */
    @Schema(description = "property.IMO.description", example = "")
    @JsonProperty("IMO")
    private String imo;

    /**
     * A uniquely assigned ID by MarineTraffic for the subject vessel
     */
    @Schema(description = "property.SHIP_ID.description", example = "")
    @JsonProperty("SHIP_ID")
    private String ship_id;

    /**
     * The Shipname of the subject vessel
     */
    @Schema(description = "property.SHIPNAME.description", example = "QUEEN VICTORIA")
    @JsonProperty("SHIPNAME")
    private String shipname;

    /**
     * The ID of the subject event - more
     */
    @Schema(description = "property.EVENT_ID.description", example = "1")
    @JsonProperty("EVENT_ID")
    private String event_id;

    /**
     * The Name of the subject Event
     */
    @Schema(description = "property.EVENT_NAME.description", example = "FIRST_DAILY_POS")
    @JsonProperty("EVENT_NAME")
    private String event_name;

    /**
     * The description of the subject Event
     */
    @Schema(description = "property.EVENT_CONTENT.description", example = "At N 50° 12' 06.53'' - W 002° 41' 31.37''")
    @JsonProperty("EVENT_CONTENT")
    private String event_content;

    /**
     * The date and time (in UTC) that the subject vessel's position or event was recorded by MarineTraffic
     */
    @Schema(description = "property.TIMESTAMP.description", example = "2020-10-20T00:13:00.000Z")
    @JsonProperty("TIMESTAMP")
    private LocalDateTime timestamp;
}
