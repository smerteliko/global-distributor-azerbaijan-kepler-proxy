package com.gda.kepler.proxy.model.marinetraffic.ais.vesselpositionscustomarea;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Builder;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

/**
 * Request model for the "Vessel Positions" service (AIS API).
 * Endpoint: /exportvessels/{api_key}
 */
@Data
@Validated
@Schema(description = "{vessel.positions.request.model.description}")
public class VesselPositionsCustomAreaRequestModel {

    /**
     * Service version. Mandatory, defaults to 9. (v_MTA030AD_1)
     */
    @Schema(description = "{v.mta030ad1.description}", requiredMode = Schema.RequiredMode.REQUIRED, defaultValue = "2", example = "2")
    @NotNull(message = "{validation.vessel.id.required}")
    private final Integer v = 2;

    /**
     * Filter vessels based on vessel types.
     */
    @Schema(description = "{vessel.type.id.list.description}", example = "60,71")
    private String vesseltypeid;

    /**
     * Maximum age of positions in minutes. Default is 5 minutes.
     */
    @Schema(description = "{timespan.mta030ad.description}", defaultValue = "5", example = "60")
    private Integer timespan = 5;

    /**
     * The pagination cursor provided in the previous response.
     */
    @Schema(description = "{cursor.description}")
    private String cursor;

    /**
     * The limit of vessels per page (min=1000, max=5000). Default is 2000.
     */
    @Schema(description = "{limit.description}", defaultValue = "2000", example = "5000")
    private Integer limit = 2000;

    /**
     * Response type: jsono or csv. Default is jsono. (protocol_mandatory)
     */
    @Schema(description = "{protocol.mandatory.description}", defaultValue = "jsono", allowableValues = {"jsono", "csv"})
    @Pattern(regexp = "jsono|csv", message = "{validation.protocol.invalid}")
    private String protocol = "jsono";

    // Default constructor for Spring
    public VesselPositionsCustomAreaRequestModel() {
    }

    @Builder
    public VesselPositionsCustomAreaRequestModel(String vesseltypeid, Integer timespan, String cursor, Integer limit, String protocol) {
        this.vesseltypeid = vesseltypeid;
        this.timespan = (timespan != null) ? timespan : 5;
        this.cursor = cursor;
        this.limit = (limit != null) ? limit : 2000;
        this.protocol = (protocol != null) ? protocol : "jsono";
    }
}
