package com.gda.kepler.proxy.model.marinetraffic.routinginformation.vesselroutetoport;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gda.kepler.proxy.model.marinetraffic.routinginformation.common.BaseRoutingResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Extended")
public class VesselRouteToPortExtendedResponse extends BaseRoutingResponse {

    /**
     * Route/Waypoints as Linestring Geometry in WKT - Well-Known Text
     */
    @Schema(description = "Route/Waypoints as Linestring Geometry in WKT - Well-Known Text", example = "LINESTRING (23.6031 37.9345, 23.6022 37.8302, 23.7127 37.6496, 23.7056 37.6035, 23.6234 37.3639, 23.4216 36.9451, 23.229 36.4224, 23.1209 36.4007, 22.9908 36.4161, 22.8799 36.4056, 22.5453 36.3436, 22.0771 36.3505, 19.8853 36.3859, 17.0453 36.4213, 16.0126 36.4389, 14.5459 36.461, 12.2835 37.0352, 11.0962 37.4966, 10.2338 37.6534, 9.5746 37.6577, 8.8824 37.6447, 7.8552 37.5924, 6.2292 37.4225, 4.3781 37.2391, 3.5815 37.1472, 2.2467 37.0245, 0.1648 36.7609, -1.9391 36.4655, -2.9718 36.3328, -4.021 36.2132, -5.3448 36.0269, -5.5563 35.9713, -5.8612 35.9625, -6.1963 35.9558, -9.0088 36.6948, -9.1681 36.7609, -9.3109 36.884, -9.3713 37.1341, -9.657 38.1043, -9.8602 38.7455, -9.8492 39.0491, -9.8492 39.6818, -9.8383 40.1873, -9.7998 42.3829, -9.7943 42.9444, -9.7778 43.2091, -6.861 47.1486, -5.9876 48.3051, -5.6195 48.7562, -5.1691 48.9442, -4.5428 49.1781, -3.3893 49.6214, -2.9169 49.8026, -2.439 49.8911, -1.5491 50.0501, -0.3571 50.2612, 0.9668 50.4889, 1.3528 50.7125, 1.4177 50.8727, 1.4687 50.906, 1.7071 51.0776, 2.0596 51.2246, 2.2412 51.4745, 3.1406 52.1546, 3.5788 52.4091, 4.1803 52.4844, 4.5456 52.4644, 4.6609 52.4627, 4.6788 52.4526, 4.7173 52.4351, 4.7392 52.4301, 4.7763 52.4251, 4.7955 52.4234, 4.8225 52.4197, 4.8581 52.4147, 4.8793 52.4083, 4.8985 52.389)")
    @JsonProperty("FINAL_PATH")
    private String final_path;
}
