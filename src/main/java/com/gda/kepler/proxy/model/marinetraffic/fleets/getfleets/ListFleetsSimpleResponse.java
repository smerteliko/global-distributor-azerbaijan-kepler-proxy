package com.gda.kepler.proxy.model.marinetraffic.fleets.getfleets;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Simple")
public class ListFleetsSimpleResponse {
    /**
     * A uniquely assigned ID by MarineTraffic for the subject Fleet
     */
    @Schema(description = "A uniquely assigned ID by MarineTraffic for the subject Fleet", example = "1696822")
    @JsonProperty("ID")
    private String id;

    /**
     * The Name of the subject Fleet
     */
    @Schema(description = "The Name of the subject Fleet", example = "Demo fleet")
    @JsonProperty("NAME")
    private String name;

    /**
     * The Status of the subject Fleet (1 = Active )
     */
    @Schema(description = "The Status of the subject Fleet (1 = Active )", example = "1")
    @JsonProperty("ACTIVE")
    private String active;

    /**
     * The Date and Time (in UTC) that the subject Fleet was created
     */
    @Schema(description = "The Date and Time (in UTC) that the subject Fleet was created", example = "2020-09-22T06:51:00.000Z")
    @JsonProperty("CREATED")
    private String created;

    /**
     * 1 = Default Fleet
     */
    @Schema(description = "1 = Default Fleet", example = "1")
    @JsonProperty("DEFAULT")
    private String varDefault;
}
