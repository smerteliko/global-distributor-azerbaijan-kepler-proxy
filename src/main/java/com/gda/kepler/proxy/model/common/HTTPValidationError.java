package com.gda.kepler.proxy.model.common;

import graphql.validation.ValidationError;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.Value;

import java.util.List;

/**
 * Top-level model for validation errors, matching the 422 response in the OpenAPI spec.
 */
@Data
@Schema(description = "HTTP Request Validation Error (Status 422)")
final public class HTTPValidationError {

    @Schema(description = "List of error details")
    List<ValidationError> detail;
}
