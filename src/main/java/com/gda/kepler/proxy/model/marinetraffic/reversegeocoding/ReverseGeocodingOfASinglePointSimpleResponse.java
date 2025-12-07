package com.gda.kepler.proxy.model.marinetraffic.reversegeocoding;

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
public class ReverseGeocodingOfASinglePointSimpleResponse {
    /**
     * A uniquely assigned ID by MarineTraffic for the returned area/asset
     */
    @Schema(description = "property.ID.description", example = "1")
    @JsonProperty("ID")
    private String id;

    /**
     * Name of the returned area/asset
     */
    @Schema(description = "property.GEONAME.description", example = "PIRAEUS")
    @JsonProperty("NAME")
    private String name;

    /**
     * Type of the returned area/asset
     */
    @Schema(description = "property.TYPE.description", example = "Port")
    @JsonProperty("TYPE")
    private String type;

    /**
     * Subtype of the returned area/asset
     */
    @Schema(description = "property.SUBTYPE.description", example = "P")
    @JsonProperty("SUBTYPE")
    private String subtype;

    /**
     * Country of the returned area/asset. Not applicable for Standard Areas and Custom Areas
     */
    @Schema(description = "property.COUNTRY.description", example = "GR")
    @JsonProperty("COUNTRY")
    private String country;

    /**
     * A uniquely assigned ID by United Nations for a Port . Only applicable for Ports, Berths and Terminals
     */
    @Schema(description = "property.UNLOCODE.description", example = "GRPIR")
    @JsonProperty("UNLOCODE")
    private String unlocode;

    /**
     * Geometry center of the returned area
     */
    @Schema(description = "property.GEOMETRY_CENTER.description", example = "37.1111,23.222")
    @JsonProperty("GEOMETRY_CENTER")
    private String geometry_center;

    /**
     * Distance of the returned area/asset from the given point (in NM)
     */
    @Schema(description = "property.DISTANCE.description", example = "0")
    @JsonProperty("DISTANCE")
    private String distance;

    /**
     * ID of the Terminal the returned Berth belongs to . Only applicable for Berths
     */
    @Schema(description = "property.TERMINAL.description")
    @JsonProperty("TERMINAL")
    private String terminal;

    /**
     * URL of MarineTraffic page with area/asset details (if exists)
     */
    @Schema(description = "property.URL.description", example = "https://marinetraffic.com/en/ais/details/ports/1")
    @JsonProperty("URL")
    private String url;
}
