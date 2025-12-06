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
    @Schema(description = "A uniquely assigned ID by MarineTraffic for the returned area/asset", example = "1")
    @JsonProperty("ID")
    private String id;

    /**
     * Name of the returned area/asset
     */
    @Schema(description = "Name of the returned area/asset", example = "PIRAEUS")
    @JsonProperty("NAME")
    private String name;

    /**
     * Type of the returned area/asset
     */
    @Schema(description = "Type of the returned area/asset", example = "Port")
    @JsonProperty("TYPE")
    private String type;

    /**
     * Subtype of the returned area/asset
     */
    @Schema(description = "Subtype of the returned area/asset", example = "P")
    @JsonProperty("SUBTYPE")
    private String subtype;

    /**
     * Country of the returned area/asset. Not applicable for Standard Areas and Custom Areas
     */
    @Schema(description = "Country of the returned area/asset. Not applicable for Standard Areas and Custom Areas", example = "GR")
    @JsonProperty("COUNTRY")
    private String country;

    /**
     * A uniquely assigned ID by United Nations for a Port . Only applicable for Ports, Berths and Terminals
     */
    @Schema(description = "A uniquely assigned ID by United Nations for a Port . Only applicable for Ports, Berths and Terminals", example = "GRPIR")
    @JsonProperty("UNLOCODE")
    private String unlocode;

    /**
     * Geometry center of the returned area
     */
    @Schema(description = "Geometry center of the returned area", example = "37.1111,23.222")
    @JsonProperty("GEOMETRY_CENTER")
    private String geometry_center;

    /**
     * Distance of the returned area/asset from the given point (in NM)
     */
    @Schema(description = "Distance of the returned area/asset from the given point (in NM)", example = "0")
    @JsonProperty("DISTANCE")
    private String distance;

    /**
     * ID of the Terminal the returned Berth belongs to . Only applicable for Berths
     */
    @Schema(description = "ID of the Terminal the returned Berth belongs to . Only applicable for Berths")
    @JsonProperty("TERMINAL")
    private String terminal;

    /**
     * URL of MarineTraffic page with area/asset details (if exists)
     */
    @Schema(description = "URL of MarineTraffic page with area/asset details (if exists)", example = "https://marinetraffic.com/en/ais/details/ports/1")
    @JsonProperty("URL")
    private String url;
}
