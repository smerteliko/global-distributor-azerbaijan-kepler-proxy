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
    @Schema(description = "property.TYPE_NAME.description", example = "Passenger Ship")
    @JsonProperty("TYPE_NAME")
    private String type_name;

    /**
     * The Shiptype of the subject vessel according to AIS transmissions
     */
    @Schema(description = "property.SHIPTYPE.description", example = "36")
    @JsonProperty("SHIPTYPE")
    private String shiptype;

    /**
     * A uniquely designated identifier for the vessel's transmitter station
     */
    @Schema(description = "property.CALLSIGN.description", example = "9HA2978")
    @JsonProperty("CALLSIGN")
    private String callsign;

    /**
     * The flag of the subject vessel according to AIS transmissions
     */
    @Schema(description = "property.FLAG.description", example = "MT")
    @JsonProperty("FLAG")
    private String flag;

    /**
     * The overall Length (in metres) of the subject vessel
     */
    @Schema(description = "property.LENGTH.description", example = "162")
    @JsonProperty("LENGTH")
    private String length;

    /**
     * The Breadth (in metres) of the subject vessel
     */
    @Schema(description = "property.WIDTH.description", example = "24")
    @JsonProperty("WIDTH")
    private String width;

    /**
     * The Draught (in metres x10) of the subject vessel according to the AIS transmissions
     */
    @Schema(description = "property.DRAUGHT.description", example = "61")
    @JsonProperty("DRAUGHT")
    private String draught;

    /**
     * Gross Tonnage - unitless measure that calculates the moulded volume of all enclosed spaces of a ship
     */
    @Schema(description = "property.GRT.description", example = "25611")
    @JsonProperty("GRT")
    private String grt;

    /**
     * Deadweight - a measure (in metric tons) of how much weight a vessel can safely carry (excluding the vessel's own weight)
     */
    @Schema(description = "property.DWT.description", example = "1703")
    @JsonProperty("DWT")
    private String dwt;

    /**
     * The year that the subject vessel was built
     */
    @Schema(description = "property.YEAR_BUILT.description", example = "1980")
    @JsonProperty("YEAR_BUILT")
    private String year_built;


    /**
     * A uniquely assigned ID by MarineTraffic for the Last Port
     */
    @Schema(description = "property.LAST_PORT_ID.description", example = "17208")
    @JsonProperty("LAST_PORT_ID")
    private String last_port_id;

    /**
     * The Name of the Last Port the vessel has visited
     */
    @Schema(description = "property.LAST_PORT.description", example = "KUSADASI")
    @JsonProperty("LAST_PORT")
    private String last_port;

    /**
     * A uniquely assigned ID by United Nations for the Last Port
     */
    @Schema(description = "property.LAST_PORT_UNLOCODE.description", example = "TRKUS")
    @JsonProperty("LAST_PORT_UNLOCODE")
    private String last_port_unlocode;

    /**
     * The Country that the Last Port is located at
     */
    @Schema(description = "property.LAST_PORT_COUNTRY.description", example = "TR")
    @JsonProperty("LAST_PORT_COUNTRY")
    private String last_port_country;

    /**
     * The Date and Time (in UTC) that the subject vessel departed from the Last Port
     */
    @Schema(description = "property.LAST_PORT_TIME.description", example = "2020-03-13T17:38:00.000Z")
    @JsonProperty("LAST_PORT_TIME")
    private LocalDateTime last_port_time;

}
