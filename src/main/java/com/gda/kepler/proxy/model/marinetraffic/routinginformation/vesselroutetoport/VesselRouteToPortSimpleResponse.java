package com.gda.kepler.proxy.model.marinetraffic.routinginformation.vesselroutetoport;

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
public class VesselRouteToPortSimpleResponse {
    /**
     * The Distance (in NM) between the specified point or port to the destination port
     */
    @Schema(description = "The Distance (in NM) between the specified point or port to the destination port", example = "2938")
    @JsonProperty("DISTANCE")
    private String distance;

    /**
     * Flag to indicate whether the vessel route passes via the Panama canal (0:no, 1:yes)
     */
    @Schema(description = "Flag to indicate whether the vessel route passes via the Panama canal (0:no, 1:yes)", example = "0")
    @JsonProperty("PANAMA")
    private String panama;

    /**
     * Flag to indicate whether the vessel route passes via the Suez canal (0:no, 1:yes)
     */
    @Schema(description = "Flag to indicate whether the vessel route passes via the Suez canal (0:no, 1:yes)", example = "0")
    @JsonProperty("SUEZ")
    private String suez;
}
