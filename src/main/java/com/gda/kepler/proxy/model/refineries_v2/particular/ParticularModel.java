package com.gda.kepler.proxy.model.refineries_v2.particular;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.Value;

import java.time.LocalDate;
import java.util.List;

/**
 * Particular DTO representing refinery details from the /particulars endpoint.
 * This DTO mirrors the structure of the successful response (200) from the Kepler API.
 */
@Data
@Schema(description = "Refinery details retrieved from the /particulars API")
final public class ParticularModel {
    @JsonProperty("Installation")
    @Schema(description = "Name of the installation")
    String installation;

    @JsonProperty("Installation id")
    @Schema(description = "Unique identifier assigned to each installation")
    Long installationId;

    @JsonProperty("Refinery")
    @Schema(description = "Name of the refinery associated with the installation")
    String refinery;

    @JsonProperty("Refinery id")
    @Schema(description = "Id of the refinery associated with the installation")
    Long refineryId;

    @JsonProperty("Owner")
    @Schema(description = "The entity that owns the refinery", example = "[\"Valero Energy Corporation\"]")
    List<String> owner;

    @JsonProperty("Age")
    @Schema(description = "The number of years since the refinery was started")
    Integer age;

    @JsonProperty("Nci")
    @Schema(description = "Nelson Complexity Index - a measure of a refinery's complexity")
    Double nci;

    @JsonProperty("Type")
    @Schema(description = "Refinery type: Simple, Medium complexity, Highly complex")
    String type;

    @JsonProperty("Status")
    @Schema(description = "The current operational state: operational, closed, future")
    String status;

    @JsonProperty("State")
    @Schema(description = "The state where the refinery is situated")
    String state;

    @JsonProperty("Country")
    @Schema(description = "The country in which the refinery is located")
    String country;

    @JsonProperty("Startup")
    @Schema(description = "The date when the refinery first became operational")
    LocalDate startup;

    @JsonProperty("Shutdown")
    @Schema(description = "The date (if any) when the refinery was shut down or decommissioned")
    LocalDate shutdown;
}
