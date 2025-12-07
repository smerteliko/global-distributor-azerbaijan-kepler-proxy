package com.gda.kepler.proxy.model.marinetraffic.voyageinformation.predictivedestinationareas.fleetpredictivedestinations;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Simple")
public class FleetPredictiveDestinationsSimpleResponse {
    /**
     * International Maritime Organisation number - a seven-digit number that uniquely identifies vessels
     */
    @Schema(description = "property.IMO.description", example = "9450832")
    @JsonProperty("IMO")
    private String imo;

    /**
     * A uniquely assigned ID by MarineTraffic for the subject vessel
     */
    @Schema(description = "property.SHIP_ID.description", example = "4615400")
    @JsonProperty("SHIP_ID")
    private String ship_id;

    /**
     * Maritime Mobile Service Identity - a nine-digit number sent in digital form over a radio frequency that identifies the vessel's transmitter station
     */
    @Schema(description = "property.MMSI.description", example = "538003690")
    @JsonProperty("MMSI")
    private String mmsi;

    /**
     * The Shipname of the subject vessel
     */
    @Schema(description = "property.SHIPNAME.description", example = "APHRODITE M")
    @JsonProperty("SHIPNAME")
    private String shipname;

    /**
     * The class of the subject vessel based on vessel type and size
     */
    @Schema(description = "property.SHIPCLASS.description", example = "HANDYSIZE")
    @JsonProperty("SHIPCLASS")
    private String shipclass;

    /**
     * The commercial market segment the subject vessel belongs to
     */
    @Schema(description = "property.MARKET.description", example = "DRY BULK")
    @JsonProperty("MARKET")
    private String market;

    /**
     * The Managing Company of the subject vessel (null if the Owner and the Manager are the same)
     */
    @Schema(description = "property.MANAGER.description", example = "EMPIRE BULKERS")
    @JsonProperty("MANAGER")
    private String manager;

    /**
     * The Owning Company of the subject vessel (null if the Owner and the Manager are the same)
     */
    @Schema(description = "property.OWNER.description", example = "BANK OF AMERICA LEASING AND CAPITAL")
    @JsonProperty("OWNER")
    private String owner;

    /**
     * A uniquely assigned ID by MarineTraffic for the port that was used as origin to retrieve possible destinations
     */
    @Schema(description = "property.FROM_PORT_ID.description", example = "257")
    @JsonProperty("FROM_PORT_ID")
    private String from_port_id;

    /**
     * The port that was used as origin to retrieve possible destinations
     */
    @Schema(description = "property.FROM_PORT.description", example = "ARATU")
    @JsonProperty("FROM_PORT")
    private String from_port;

    /**
     * A uniquely assigned ID by MarineTraffic for the most probable destination port from the given port of origin
     */
    @Schema(description = "property.NEXT_PORT_N_ID.description", example = "5018")
    @JsonProperty("NEXT_PORT_1_ID")
    private String next_port_1_id;

    /**
     * Most probable destination port from the given port of origin
     */
    @Schema(description = "property.NEXT_PORT_N_NAME.description", example = "FORTALEZA")
    @JsonProperty("NEXT_PORT_1")
    private String next_port_1;

    /**
     * The probability of visiting the most likely destination port
     */
    @Schema(description = "property.NEXT_PORT_N_PROB.description", example = "0.400")
    @JsonProperty("NEXT_PORT_1_PROB")
    private String next_port_1_prob;

    /**
     * The area where the most probable port is
     */
    @Schema(description = "property.NEXT_AREA_N_NAME.description", example = "ECSA")
    @JsonProperty("NEXT_AREA_1")
    private String next_area_1;

    /**
     * The probability of visiting the area where the predicted port is
     */
    @Schema(description = "property.NEXT_AREA_N_PROB.description", example = "1.000")
    @JsonProperty("NEXT_AREA_1_PROB")
    private String next_area_1_prob;

    /**
     * A uniquely assigned ID by MarineTraffic for the second most probable destination port from the given port of origin
     */
    @Schema(description = "property.NEXT_PORT_N_ID.description", example = "5026")
    @JsonProperty("NEXT_PORT_2_ID")
    private String next_port_2_id;

    /**
     * Second most probable destination port from the given port of origin
     */
    @Schema(description = "property.NEXT_PORT_N_NAME.description", example = "RECIFE")
    @JsonProperty("NEXT_PORT_2")
    private String next_port_2;

    /**
     * The probability of visiting the second most likely destination port
     */
    @Schema(description = "property.NEXT_PORT_N_PROB.description", example = "0.200")
    @JsonProperty("NEXT_PORT_2_PROB")
    private String next_port_2_prob;

    /**
     * The area where the second most probable port is
     */
    @Schema(description = "property.NEXT_AREA_N_NAME.description", example = "ECSA")
    @JsonProperty("NEXT_AREA_2")
    private String next_area_2;

    /**
     * The probability of visiting the area where the predicted port is
     */
    @Schema(description = "property.NEXT_AREA_N_PROB.description", example = "1.000")
    @JsonProperty("NEXT_AREA_2_PROB")
    private String next_area_2_prob;

    /**
     * A uniquely assigned ID by MarineTraffic for the third most probable destination port from the given port of origin
     */
    @Schema(description = "property.NEXT_PORT_N_ID.description", example = "645")
    @JsonProperty("NEXT_PORT_3_ID")
    private String next_port_3_id;

    /**
     * Third most probable destination port from the given port of origin
     */
    @Schema(description = "property.NEXT_PORT_N_NAME.description", example = "VITORIA")
    @JsonProperty("NEXT_PORT_3")
    private String next_port_3;

    /**
     * The probability of visiting the third most likely destination port
     */
    @Schema(description = "property.NEXT_PORT_N_PROB.description", example = "0.200")
    @JsonProperty("NEXT_PORT_3_PROB")
    private String next_port_3_prob;

    /**
     * The area where the third most probable port is
     */
    @Schema(description = "property.NEXT_AREA_N_NAME.description", example = "ECSA")
    @JsonProperty("NEXT_AREA_3")
    private String next_area_3;

    /**
     * The probability of visiting the area where the predicted port is
     */
    @Schema(description = "property.NEXT_AREA_N_PROB.description", example = "1.000")
    @JsonProperty("NEXT_AREA_3_PROB")
    private String next_area_3_prob;

    /**
     * A uniquely assigned ID by MarineTraffic for the fourth most probable destination port from the given port of origin
     */
    @Schema(description = "property.NEXT_PORT_N_ID.description", example = "2479")
    @JsonProperty("NEXT_PORT_4_ID")
    private String next_port_4_id;

    /**
     * Fourth most probable destination port from the given port of origin
     */
    @Schema(description = "property.NEXT_PORT_N_NAME.description", example = "CABEDELO")
    @JsonProperty("NEXT_PORT_4")
    private String next_port_4;

    /**
     * The probability of visiting the fourth most likely destination port
     */
    @Schema(description = "property.NEXT_PORT_N_PROB.description", example = "0.200")
    @JsonProperty("NEXT_PORT_4_PROB")
    private String next_port_4_prob;

    /**
     * The area where the fourth most probable port is
     */
    @Schema(description = "property.NEXT_AREA_N_NAME.description", example = "ECSA")
    @JsonProperty("NEXT_AREA_4")
    private String next_area_4;

    /**
     * The probability of visiting the area where the predicted port is
     */
    @Schema(description = "property.NEXT_AREA_N_PROB.description", example = "1.000")
    @JsonProperty("NEXT_AREA_4_PROB")
    private String next_area_4_prob;

    /**
     * A uniquely assigned ID by MarineTraffic for the fifth most probable destination port from the given port of origin
     */
    @Schema(description = "property.NEXT_PORT_N_ID.description", example = "")
    @JsonProperty("NEXT_PORT_5_ID")
    private String next_port_5_id;

    /**
     * Fifth most probable destination port from the given port of origin
     */
    @Schema(description = "property.NEXT_PORT_N_NAME.description", example = "")
    @JsonProperty("NEXT_PORT_5")
    private String next_port_5;

    /**
     * The probability of visiting the fifith most likely destination port
     */
    @Schema(description = "property.NEXT_PORT_N_PROB.description", example = "")
    @JsonProperty("NEXT_PORT_5_PROB")
    private String next_port_5_prob;

    /**
     * The area where the fifth most probable port is
     */
    @Schema(description = "property.NEXT_AREA_N_NAME.description", example = "")
    @JsonProperty("NEXT_AREA_5")
    private String next_area_5;

    /**
     * The probability of visiting the area where the predicted port is
     */
    @Schema(description = "property.NEXT_AREA_N_PROB.description", example = "")
    @JsonProperty("NEXT_AREA_5_PROB")
    private String next_area_5_prob;
}
