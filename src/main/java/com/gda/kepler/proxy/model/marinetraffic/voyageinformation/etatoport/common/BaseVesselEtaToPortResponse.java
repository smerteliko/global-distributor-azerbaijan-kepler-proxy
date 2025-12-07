package com.gda.kepler.proxy.model.marinetraffic.voyageinformation.etatoport.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Simple")
public class BaseVesselEtaToPortResponse {
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
     * International Maritime Organisation number - a seven-digit number that uniquely identifies vessels
     */
    @Schema(description = "property.IMO.description", example = "9450832")
    @JsonProperty("IMO")
    private String imo;

    /**
     * A uniquely assigned ID by MarineTraffic for the Last Port
     */
    @Schema(description = "property.LAST_PORT_ID.description", example = "133")
    @JsonProperty("LAST_PORT_ID")
    private String last_port_id;

    /**
     * The Name of the Last Port the vessel has visited
     */
    @Schema(description = "property.LAST_PORT.description", example = "TERNEUZEN")
    @JsonProperty("LAST_PORT")
    private String last_port;

    /**
     * A uniquely assigned ID by United Nations for the Last Port
     */
    @Schema(description = "property.LAST_PORT_UNLOCODE.description", example = "NLTNZ")
    @JsonProperty("LAST_PORT_UNLOCODE")
    private String last_port_unlocode;

    /**
     * The Date and Time (in UTC) that the subject vessel departed from the Last Port
     */
    @Schema(description = "property.LAST_PORT_TIME.description", example = "2020-10-23T07:20:00.000Z")
    @JsonProperty("LAST_PORT_TIME")
    private LocalDateTime last_port_time;

    /**
     * The Name of the Next Port as derived by MarineTraffic based on the subject vessel's reported Destination
     */
    @Schema(description = "property.NEXT_PORT_NAME.description", example = "ARATU")
    @JsonProperty("NEXT_PORT_NAME")
    private String next_port_name;

    /**
     * A uniquely assigned ID by United Nations for the Next Port
     */
    @Schema(description = "property.NEXT_PORT_UNLOCODE.description", example = "BRARB")
    @JsonProperty("NEXT_PORT_UNLOCODE")
    private String next_port_unlocode;

    /**
     * The name of the Port that was provided by the user as input parameter during the API call and that was used by MarineTraffic for ETA and voyage calculations
     */
    @Schema(description = "property.ETA_PORT_NAME.description", example = "ROTTERDAM")
    @JsonProperty("ETA_PORT_NAME")
    private String eta_port_name;

    /**
     * A uniquely assigned ID by United Nations for the Port that was provided by the user as input parameter during the API call and that was used by MarineTraffic for ETA and voyage calculations
     */
    @Schema(description = "property.ETA_PORT_UNLOCODE.description", example = "NLRTM")
    @JsonProperty("ETA_PORT_UNLOCODE")
    private String eta_port_unlocode;

    /**
     * The Estimated Time of Arrival to Destination of the subject vessel according to the MarineTraffic calculations
     */
    @Schema(description = "property.ETA_CALC.description", example = "2020-11-17T04:18:35.000Z")
    @JsonProperty("ETA_CALC")
    private LocalDateTime eta_calc;
}
