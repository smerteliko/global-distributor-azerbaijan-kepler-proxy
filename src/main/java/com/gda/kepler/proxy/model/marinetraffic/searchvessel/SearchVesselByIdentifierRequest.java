package com.gda.kepler.proxy.model.marinetraffic.searchvessel;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Request parameters for: Search Vessel by Identifier")
public class SearchVesselByIdentifierRequest {


    /**
     * A uniquely assigned ID by MarineTraffic for the subject vessel You can <b>instead</b> use  mmsi or imo
     */
    @Schema(description = "description.parameter.shipid.or.imo.mmsi", requiredMode = Schema.RequiredMode.REQUIRED)    @JsonProperty("shipid")
    private Integer shipid;

    /**
     * description.parameter.imon <b>NOTE:</b> Using MMSI may potentially return multiple records as multiple vessels might have transponded the same MMSI
     */
    @Schema(description = "description.parameter.mmsi.note")
    @JsonProperty("mmsi")
    private Integer mmsi;

    /**
     * The International Maritime Organization (IMO) number of the vessel you wish to track <b>NOTE:</b> Using IMO may potentially return multiple records as multiple vessels might have transponded the same IMO
     */
    @Schema(description = "description.parameter.imo.note")
    @JsonProperty("imo")
    private Integer imo;

    /**
     * Filter data by vessel type: 
 * * 2: Fishing 
 * * 4: High Speed Craf 
 * * 6: Passenger 
 * * 7: Cargo 
 * * 8: Tanker
     */
    @Schema(description = "description.parameter.shiptype", allowableValues = {"2", "4", "6", "7", "8"})
    @JsonProperty("shiptype")
    private Integer shiptype;

    //TODO РАЗОБРАТЬСЯ
    /**
     * Data filter: AIS Shiptype Find more information here
     */
    @Schema(description = "description.parameter.type_name_id")
    @JsonProperty("type_name_id")
    private Integer typeNameID;

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
}
