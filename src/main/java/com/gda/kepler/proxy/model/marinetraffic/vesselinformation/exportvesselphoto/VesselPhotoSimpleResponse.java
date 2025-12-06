package com.gda.kepler.proxy.model.marinetraffic.vesselinformation.exportvesselphoto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data

@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Simple")
public class VesselPhotoSimpleResponse {
    /**
     * The URL of the photo.
     */
    @Schema(description = "The URL of the photo.", example = "https://photos.marinetraffic.com/ais/showphoto.aspx?photoid=534918")
    @JsonProperty("URL")
    private String url;
}
