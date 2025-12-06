package com.gda.kepler.proxy.model.marinetraffic.vesselpositionlegacy.exportvessels.vesselpositionsinapredefinedboundingbox;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gda.kepler.proxy.model.marinetraffic.vesselpositionlegacy.exportvessels.common.BaseExportVesselsRequest;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Request parameters for: Vessel Positions in a Predefined Bounding Box")
public class VesselPositionsInAPredefinedBoundingBoxRequest extends BaseExportVesselsRequest {

}
