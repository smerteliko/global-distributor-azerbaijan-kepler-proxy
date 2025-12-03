package com.gda.kepler.proxy.model.common;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Standard error response format from Kepler API")
final public class KeplerError {

    @Schema(description = "The HTTP status code", example = "400")
    private int status;

    @Schema(description = "The error code specific to the Kepler API", example = "INVALID_REQUEST_FORMAT")
    private String code;

    @Schema(description = "Human-readable error message", example = "The required field 'refineryId' is missing.")
    private String message;
}
