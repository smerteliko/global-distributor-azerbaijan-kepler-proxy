package com.gda.kepler.proxy.model.marinetraffic.ais.singlevessel;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Builder;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

/**
 * Request model for the "Single Vessel Positions" service (AIS API).
 * Endpoint: /exportvessel/{api_key}
 */
@Data
@Validated
@Schema(description = "{single.vessel.positions.request.model.description}")
public class SingleVesselPositionsRequestModel {

    /**
     * Service version. Mandatory, must be 6.
     */
    @Schema(description = "{v.mta030ad3.description}", requiredMode = Schema.RequiredMode.REQUIRED, example = "6", defaultValue = "6")
    @NotNull(message = "{validation.vessel.id.required}")
    private final Integer v = 6;

    /**
     * Unique vessel ID assigned by MarineTraffic.
     */
    @Schema(description = "{ship.id.ps07.description}", example = "713139")
    private Integer shipid;

    /**
     * IMO number of the vessel.
     */
    @Schema(description = "{imo.ps07.description}", example = "9470959")
    private Integer imo;

    /**
     * MMSI of the vessel.
     */
    @Schema(description = "{mmsi.ps07.description}", example = "538003913")
    private Integer mmsi;

    /**
     * Maximum age of positions in minutes. Default is 5 minutes.
     */
    @Schema(description = "{timespan.mta030ad.description}", defaultValue = "5", example = "60")
    private Integer timespan = 5;

    /**
     * Response type: jsono or csv. Default is jsono.
     */
    @Schema(description = "{protocol.mandatory.description}", defaultValue = "jsono", allowableValues = {"jsono", "csv"})
    @Pattern(regexp = "jsono|csv", message = "{validation.protocol.invalid}")
    private String protocol = "jsono";

    // Default constructor for Spring
    public SingleVesselPositionsRequestModel() {
    }

    @Builder
    public SingleVesselPositionsRequestModel(Integer shipid, Integer imo, Integer mmsi, Integer timespan, String protocol) {
        this.shipid = shipid;
        this.imo = imo;
        this.mmsi = mmsi;
        // Apply documented defaults if not provided in Builder
        this.timespan = (timespan != null) ? timespan : 5;
        this.protocol = (protocol != null) ? protocol : "jsono";
    }
}
