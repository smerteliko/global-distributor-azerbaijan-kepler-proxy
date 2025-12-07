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
@Schema(description = "Request parameters for: Reverse Geocoding of a Single Point")
public class ReverseGeocodingOfASinglePointRequest {

    /**
     * A latitude/longitude pair that you wish to receive the MarineTraffic areas/assets that intersects with
     */
    @Schema(description = "A latitude/longitude pair that you wish to receive the MarineTraffic areas/assets that intersects with", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("coordinates")
    private String coordinates;

    /**
     * Maximum distance (in NM) from the given point that should be searched for nearby areas/assets Cannot be greater than 10NM
     */
    @Schema(description = "Maximum distance (in NM) from the given point that should be searched for nearby areas/assets Cannot be greater than 10NM")
    @JsonProperty("radius")
    private Double radius;

    /**
     * Flag that indicates if Ports information will be excluded from response in case given point intersects with them (0:no, 1:yes)
     */
    @Schema(description = "Flag that indicates if Ports information will be excluded from response in case given point intersects with them (0:no, 1:yes)")
    @JsonProperty("exclude_ports")
    private Integer excludePorts;

    /**
     * Flag that indicates if Berths information will be excluded from response in case given point intersects with them (0:no, 1:yes)
     */
    @Schema(description = "Flag that indicates if Berths information will be excluded from response in case given point intersects with them (0:no, 1:yes)")
    @JsonProperty("exclude_berths")
    private Integer excludeBerths;

    /**
     * Flag that indicates if Terminals information will be excluded from response in case given point intersects with them (0:no, 1:yes)
     */
    @Schema(description = "Flag that indicates if Terminals information will be excluded from response in case given point intersects with them (0:no, 1:yes)")
    @JsonProperty("exclude_terminals")
    private Integer excludeTerminals;

    /**
     * Flag that indicates if Standard Areas information will be excluded from response in case given point intersects with them (0:no, 1:yes)
     */
    @Schema(description = "Flag that indicates if Standard Areas information will be excluded from response in case given point intersects with them (0:no, 1:yes)")
    @JsonProperty("exclude_standard_areas")
    private Integer excludeStandardAreas;

    /**
     * Flag that indicates if Custom Areas information will be excluded from response in case given point intersects with them (0:no, 1:yes)
     */
    @Schema(description = "Flag that indicates if Custom Areas information will be excluded from response in case given point intersects with them (0:no, 1:yes)")
    @JsonProperty("exclude_custom_areas")
    private Integer excludeCustomAreas;

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
