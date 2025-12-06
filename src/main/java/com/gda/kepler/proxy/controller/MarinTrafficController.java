package com.gda.kepler.proxy.controller;

import com.gda.kepler.proxy.model.common.KeplerError;
import com.gda.kepler.proxy.model.marinetraffic.ais.exportvessel.SingleVesselPositionsRequest;
import com.gda.kepler.proxy.model.marinetraffic.ais.exportvessel.SingleVesselPositionsResponse;
import com.gda.kepler.proxy.model.marinetraffic.ais.exportvessels.VesselPositionsRequest;
import com.gda.kepler.proxy.model.marinetraffic.ais.exportvessels.VesselPositionsResponse;
import com.gda.kepler.proxy.model.marinetraffic.ais.exportvessels_custom_area.VesselPositionsInAnAreaOfInterestRequest;
import com.gda.kepler.proxy.model.marinetraffic.ais.exportvessels_custom_area.VesselPositionsInAnAreaOfInterestResponse;
import com.gda.kepler.proxy.service.marinetraffic.ais.singlevessel.SingleVesselPositionsService;
import com.gda.kepler.proxy.service.marinetraffic.ais.vesselpositions.VesselPositionsService;
import com.gda.kepler.proxy.service.marinetraffic.ais.vesselpositionscustomarea.VesselPositionsCustomAreaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/marinetraffic")
public class MarinTrafficController {

    private SingleVesselPositionsService singleVesselPositionsService;
    private VesselPositionsService vesselPositionsService;
    private VesselPositionsCustomAreaService vesselPositionsCustomAreaService;

    public MarinTrafficController(
        SingleVesselPositionsService singleVesselPositionsService,
        VesselPositionsService vesselPositionsService,
        VesselPositionsCustomAreaService vesselPositionsCustomAreaService
    ) {
        this.singleVesselPositionsService = singleVesselPositionsService;
        this.vesselPositionsService = vesselPositionsService;
        this.vesselPositionsCustomAreaService = vesselPositionsCustomAreaService;
    }

    // =========================================================================
    // 2. AIS
    // =========================================================================
    /**
     * Retrieves the latest available position and voyage information for a single vessel.
     * Corresponds to the /exportvessel/{api_key} endpoint in the AIS Data API (version 6).
     *
     * @param requestModel Request model with filtering parameters.
     * @return List of vessel position data.
     */
    @Tag(name = "ais.api.tag.name", description = "doc.tag.aisapi.MarineTraffic")
    @Operation(
        operationId = "exportvessel_",
        summary = "single.vessel.positions.summary",
        description = "single.vessel.positions.description",
        parameters = {
        },
        responses = {
            @ApiResponse(
                responseCode = "200",
                description = "{successful.response.description}",
                content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                    schema = @Schema(implementation = SingleVesselPositionsResponse.class))
            ),
            @ApiResponse(
                responseCode = "429",
                description = "{too.many.requests.description}",
                content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                    schema = @Schema(implementation = KeplerError.class))
            )
        }
    )
    // IMPORTANT: The trailing space in the path is essential for an exact match with the Kepler/MarineTraffic API.
    @GetMapping(value = "/exportvessel/", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<ResponseEntity<List<SingleVesselPositionsResponse>>> getSingleVesselPositions(
        @ParameterObject SingleVesselPositionsRequest requestModel
    ) {
        return singleVesselPositionsService.getSingleVesselPositions(
             requestModel
        ).map(ResponseEntity::ok)
            .onErrorResume(
                WebClientResponseException.class,
                e -> Mono.just(ResponseEntity.status(e.getStatusCode()).headers(e.getHeaders()).body(null)));
    }

    /**
     * Tracks vessels of interest anywhere in the world.
     * Corresponds to the /exportvessels/{api_key} endpoint in the AIS Data API (version 9).
     */
    @Tag(name = "ais.api.tag.name", description = "doc.tag.aisapi.MarineTraffic")
    @Operation(
        operationId = "exportvessels",
        summary = "vessel.positions.summary",
        description = "vessel.positions.description",

        responses = {
            @ApiResponse(
                responseCode = "200",
                description = "{successful.response.description}",
                content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                    schema = @Schema(implementation = VesselPositionsResponse.class))
            ),
            @ApiResponse(
                responseCode = "429",
                description = "{too.many.requests.description}",
                content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                    schema = @Schema(implementation = KeplerError.class))
            )
        }
    )
    @GetMapping(value = "/exportvessels/", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<ResponseEntity<VesselPositionsResponse>> getVesselPositions(
        @ParameterObject VesselPositionsRequest requestModel
    ) {
        return vesselPositionsService.getVesselPositions( requestModel)
            .map(ResponseEntity::ok)
            .onErrorResume(
                WebClientResponseException.class,
                e -> Mono.just(ResponseEntity.status(e.getStatusCode()).headers(e.getHeaders()).body(null)));
    }

    /**
     * Tracks vessels of interest anywhere in the world.
     * Corresponds to the /exportvessels-custom-area/{api_key} endpoint in the AIS Data API (version 2).
     */
    @Tag(name = "ais.api.tag.name", description = "doc.tag.aisapi.MarineTraffic")
    @Operation(
        operationId = "exportvessels-custom-area",
        summary = "{vessel.positions.summary}",
        description = "{vessel.positions.description}",

        responses = {
            @ApiResponse(
                responseCode = "200",
                description = "{successful.response.description}",
                content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                    schema = @Schema(implementation = VesselPositionsInAnAreaOfInterestResponse.class))
            ),
            @ApiResponse(
                responseCode = "429",
                description = "{too.many.requests.description}",
                content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                    schema = @Schema(implementation = KeplerError.class))
            )
        }
    )
    @GetMapping(value = "/exportvessels-custom-area/{apiKey}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<ResponseEntity<VesselPositionsInAnAreaOfInterestResponse>> getVesselPositionsCustomArea(
        @ParameterObject VesselPositionsInAnAreaOfInterestRequest requestModel
    ) {
        return vesselPositionsCustomAreaService.getVesselPositionsCustomArea( requestModel)
            .map(ResponseEntity::ok)
            .onErrorResume(
                WebClientResponseException.class,
                e -> Mono.just(ResponseEntity.status(e.getStatusCode()).headers(e.getHeaders()).body(null)));
    }
}
