package com.gda.kepler.proxy.model.marinetraffic.searchvessel;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Simple")
public class SearchVesselByIdentifierSimpleResponse {
    /**
     * The Shipname of the subject vessel
     */
    @Schema(description = "property.SHIPNAME.description", example = "THE QUEEN JACQUELINE")
    @JsonProperty("SHIPNAME")
    private String shipname;

    /**
     * Maritime Mobile Service Identity - a nine-digit number sent in digital form over a radio frequency that identifies the vessel's transmitter station
     */
    @Schema(description = "property.MMSI.description", example = "244740452")
    @JsonProperty("MMSI")
    private String mmsi;

    /**
     * International Maritime Organisation number - a seven-digit number that uniquely identifies vessels
     */
    @Schema(description = "property.IMO.description", example = "0")
    @JsonProperty("IMO")
    private String imo;

    /**
     * A uniquely assigned ID by MarineTraffic for the subject vessel
     */
    @Schema(description = "property.SHIP_ID.description", example = "639")
    @JsonProperty("SHIP_ID")
    private String ship_id;

    /**
     * A uniquely designated identifier for the vessel's transmitter station
     */
    @Schema(description = "property.CALLSIGN.description", example = "PE6545")
    @JsonProperty("CALLSIGN")
    private String callsign;

    /**
     * The Type of the subject vessel
     */
    @Schema(description = "property.TYPE_NAME.description", example = "Inland, Ferry")
    @JsonProperty("TYPE_NAME")
    private String type_name;

    /**
     * Deadweight - a measure (in metric tons) of how much weight a vessel can safely carry (excluding the vessel's own weight)
     */
    @Schema(description = "property.DWT.description", example = "")
    @JsonProperty("DWT")
    private String dwt;

    /**
     * The flag of the subject vessel according to AIS transmissions
     */
    @Schema(description = "property.FLAG.description", example = "NL")
    @JsonProperty("FLAG")
    private String flag;

    /**
     * The country of the subject vessel according to AIS transmissions
     */
    @Schema(description = "property.SHIP_CLASS.description", example = "Netherlands")
    @JsonProperty("COUNTRY")
    private String country;

    /**
     * The year that the subject vessel was built
     */
    @Schema(description = "property.YEAR_BUILT.description", example = "")
    @JsonProperty("YEAR_BUILT")
    private String year_built;

    /**
     * URL to the Details page of the subject vessel at MarineTraffic
     */
    @Schema(description = "property.MT_URL.description", example = "http://www.marinetraffic.com/en/ais/details/ships/shipid:639/mmsi:244740452/vessel:639")
    @JsonProperty("MT_URL")
    private String mt_url;
}
