package com.gda.kepler.proxy.model.marinetraffic.portsinformation.expectedarrivals.expectedcountryarivals;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gda.kepler.proxy.model.marinetraffic.portsinformation.expectedarrivals.common.BaseExpectedArrivalsResponse;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Extended")
public class ExpectedCountryArrivalsExtendedResponse extends BaseExpectedArrivalsResponse {

    /**
     * The Type of the subject vessel
     */
    @Schema(description = "The Type of the subject vessel", example = "Passenger Ship")
    @JsonProperty("TYPE_NAME")
    private String type_name;

    /**
     * The Shiptype of the subject vessel according to AIS transmissions
     */
    @Schema(description = "The Shiptype of the subject vessel according to AIS transmissions", example = "36")
    @JsonProperty("SHIPTYPE")
    private String shiptype;

    /**
     * A uniquely designated identifier for the vessel's transmitter station
     */
    @Schema(description = "A uniquely designated identifier for the vessel's transmitter station", example = "9HA2978")
    @JsonProperty("CALLSIGN")
    private String callsign;

    /**
     * The flag of the subject vessel according to AIS transmissions
     */
    @Schema(description = "The flag of the subject vessel according to AIS transmissions", example = "MT")
    @JsonProperty("FLAG")
    private String flag;

    /**
     * The overall Length (in metres) of the subject vessel
     */
    @Schema(description = "The overall Length (in metres) of the subject vessel", example = "162")
    @JsonProperty("LENGTH")
    private String length;

    /**
     * The Breadth (in metres) of the subject vessel
     */
    @Schema(description = "The Breadth (in metres) of the subject vessel", example = "24")
    @JsonProperty("WIDTH")
    private String width;

    /**
     * The Draught (in metres x10) of the subject vessel according to the AIS transmissions
     */
    @Schema(description = "The Draught (in metres x10) of the subject vessel according to the AIS transmissions", example = "61")
    @JsonProperty("DRAUGHT")
    private String draught;

    /**
     * Gross Tonnage - unitless measure that calculates the moulded volume of all enclosed spaces of a ship
     */
    @Schema(description = "Gross Tonnage - unitless measure that calculates the moulded volume of all enclosed spaces of a ship", example = "25611")
    @JsonProperty("GRT")
    private String grt;

    /**
     * Deadweight - a measure (in metric tons) of how much weight a vessel can safely carry (excluding the vessel's own weight)
     */
    @Schema(description = "Deadweight - a measure (in metric tons) of how much weight a vessel can safely carry (excluding the vessel's own weight)", example = "1703")
    @JsonProperty("DWT")
    private String dwt;

    /**
     * The year that the subject vessel was built
     */
    @Schema(description = "The year that the subject vessel was built", example = "1980")
    @JsonProperty("YEAR_BUILT")
    private String year_built;


    /**
     * A uniquely assigned ID by MarineTraffic for the Last Port
     */
    @Schema(description = "A uniquely assigned ID by MarineTraffic for the Last Port", example = "17208")
    @JsonProperty("LAST_PORT_ID")
    private String last_port_id;

    /**
     * The Name of the Last Port the vessel has visited
     */
    @Schema(description = "The Name of the Last Port the vessel has visited", example = "KUSADASI")
    @JsonProperty("LAST_PORT")
    private String last_port;

    /**
     * A uniquely assigned ID by United Nations for the Last Port
     */
    @Schema(description = "A uniquely assigned ID by United Nations for the Last Port", example = "TRKUS")
    @JsonProperty("LAST_PORT_UNLOCODE")
    private String last_port_unlocode;

    /**
     * The Country that the Last Port is located at
     */
    @Schema(description = "The Country that the Last Port is located at", example = "TR")
    @JsonProperty("LAST_PORT_COUNTRY")
    private String last_port_country;

    /**
     * The Date and Time (in UTC) that the subject vessel departed from the Last Port
     */
    @Schema(description = "The Date and Time (in UTC) that the subject vessel departed from the Last Port", example = "2020-03-13T17:38:00.000Z")
    @JsonProperty("LAST_PORT_TIME")
    private LocalDateTime last_port_time;

}
