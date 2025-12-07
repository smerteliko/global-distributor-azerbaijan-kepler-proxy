package com.gda.kepler.proxy.model.marinetraffic.vesselinformation.exportvesselphoto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data

@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Request parameters for: Vessel Photo")
public class VesselPhotoRequest {

    /**
     * The Maritime Mobile Service Identity (MMSI) or the IMO number of the vessel You can <b>instead</b> use shipid
     */
    @Schema(description = "The Maritime Mobile Service Identity (MMSI) or the IMO number of the vessel You can instead use shipid")
    @JsonProperty("vessel_id")
    private Integer vesselID;

    /**
     * A uniquely assigned ID by MarineTraffic for the subject vessel
     */
    @Schema(description = "property.SHIP_ID.description")
    @JsonProperty("shipid")
    private Integer shipid;

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
