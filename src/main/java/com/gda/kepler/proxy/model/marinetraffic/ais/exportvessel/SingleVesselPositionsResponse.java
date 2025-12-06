package com.gda.kepler.proxy.model.marinetraffic.ais.exportvessel;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gda.kepler.proxy.model.marinetraffic.ais.common.BaseDataResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.*;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Default")
public class SingleVesselPositionsResponse extends BaseDataResponse {
}
