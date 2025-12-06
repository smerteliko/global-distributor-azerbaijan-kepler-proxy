package com.gda.kepler.proxy.model.marinetraffic.vesselpositionlegacy.exportvesselscustomarea;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.gda.kepler.proxy.model.marinetraffic.vesselpositionlegacy.exportvessels.common.BaseExportVesselsResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Simple")
public class VesselPositionsInACustomAreaSimpleResponse extends BaseExportVesselsResponse {

}
