package com.gda.kepler.proxy.model.marinetraffic.vesselpositionlegacy.exportvessel;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.gda.kepler.proxy.model.marinetraffic.vesselpositionlegacy.exportvessel.common.BaseSingleVesselPositionsResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Simple")
public class SingleVesselPositionsSimpleResponse extends BaseSingleVesselPositionsResponse {

}
