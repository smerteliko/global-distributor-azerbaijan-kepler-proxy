package com.gda.kepler.proxy.model.marinetraffic.fleets.getfleets;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "schema.fleets.list_fleets_response.title")
public class ListFleetsSimpleResponse {
    /**
     * A uniquely assigned ID by MarineTraffic for the subject Fleet
     */
    @Schema(description = "property.FLEET_ID.description", example = "1696822")
    @JsonProperty("ID")
    private String id;

    /**
     * The Name of the subject Fleet
     */
    @Schema(description = "property.FLEET_NAME.description", example = "Demo fleet")
    @JsonProperty("NAME")
    private String name;

    /**
     * The Status of the subject Fleet (1 = Active )
     */
    @Schema(description = "property.FLEET_ACTIVE_STATUS.description", example = "1")
    @JsonProperty("ACTIVE")
    private String active;

    /**
     * The Date and Time (in UTC) that the subject Fleet was created
     */
    @Schema(description = "property.FLEET_CREATED_DATE.description", example = "2020-09-22T06:51:00.000Z")
    @JsonProperty("CREATED")
    private String created;

    /**
     * 1 = Default Fleet
     */
    @Schema(description = "property.FLEET_DEFAULT_FLAG.description", example = "1")
    @JsonProperty("DEFAULT")
    private String isDefault;
}
