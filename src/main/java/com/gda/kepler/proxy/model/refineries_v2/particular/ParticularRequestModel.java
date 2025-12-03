package com.gda.kepler.proxy.model.refineries_v2.particular;

import com.gda.kepler.proxy.model.refineries_v2.common.BaseTimeSeriesRequestModel;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.Value;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

/**
 * DTO representing all query parameters and headers required for the /particulars API endpoint.
 * This model simplifies the controller and service method signatures.
 */
@Data
@Schema(description = "Request model for retrieving refinery particulars.")
final public class ParticularRequestModel extends BaseTimeSeriesRequestModel {

    // Note: The Authorization header is typically handled separately in WebFlux filters or directly in the controller
    // since it's a header, not a query parameter. We will keep it in the controller method signature
    // but include all query parameters here for grouping.

    // Authorization header (moved to controller method signature as it is a header, not a bean parameter)
    // String authorizationHeader;


}