package com.gda.kepler.proxy.model.marinetraffic.vesselinformation.vesselmasterdata;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gda.kepler.proxy.model.marinetraffic.vesselinformation.vesselmasterdata.common.BaseVesselParticularsResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Simple")
public class VesselParticularsSimpleResponse extends BaseVesselParticularsResponse {

}
