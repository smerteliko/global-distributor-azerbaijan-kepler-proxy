package com.gda.kepler.proxy.model.marinetraffic.voyageinformation.etatoport;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gda.kepler.proxy.model.marinetraffic.voyageinformation.etatoport.common.BaseVesselEtaToPortResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Simple")
public class VesselEtaToPortSimpleResponse extends BaseVesselEtaToPortResponse {

}
