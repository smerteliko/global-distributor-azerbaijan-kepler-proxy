package com.gda.kepler.proxy.controller;

import com.gda.kepler.proxy.model.common.KeplerError;
import com.gda.kepler.proxy.model.marinetraffic.ais.singlevessel.SingleVesselPositionModel;
import com.gda.kepler.proxy.model.marinetraffic.ais.singlevessel.SingleVesselPositionsRequestModel;
import com.gda.kepler.proxy.model.marinetraffic.ais.vesselpositions.VesselPositionsModel;
import com.gda.kepler.proxy.model.marinetraffic.ais.vesselpositions.VesselPositionsRequestModel;
import com.gda.kepler.proxy.model.marinetraffic.ais.vesselpositionscustomarea.VesselPositionsCustomAreaModel;
import com.gda.kepler.proxy.model.marinetraffic.ais.vesselpositionscustomarea.VesselPositionsCustomAreaRequestModel;
import com.gda.kepler.proxy.model.marinetraffic.common.BaseVesselPositionDataModel;
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
        summary = "{single.vessel.positions.summary}",
        description = "{single.vessel.positions.description}",
        parameters = {
        },
        responses = {
            @ApiResponse(
                responseCode = "200",
                description = "{successful.response.description}",
                content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                    schema = @Schema(implementation = SingleVesselPositionModel[].class))
            ),
            @ApiResponse(
                responseCode = "400",
                description = "{400.ps07.missing.ship.identifier.description}",
                content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                    schema = @Schema(implementation = KeplerError.class))
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
    @GetMapping(value = "/exportvessel/{apiKey}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<ResponseEntity<List<SingleVesselPositionModel>>> getSingleVesselPositions(
        @ParameterObject SingleVesselPositionsRequestModel requestModel
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
    @Operation(
        tags = {"ais.api.tag.name"},
        operationId = "exportvessels",
        summary = "{vessel.positions.summary}",
        description = "{vessel.positions.description}",

        responses = {
            @ApiResponse(
                responseCode = "200",
                description = "{successful.response.description}",
                content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                    schema = @Schema(implementation = VesselPositionsModel.class))
            ),
            @ApiResponse(
                responseCode = "429",
                description = "{too.many.requests.description}",
                content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                    schema = @Schema(implementation = KeplerError.class))
            )
        }
    )
    @GetMapping(value = "/exportvessels/{apiKey}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<ResponseEntity<VesselPositionsModel>> getVesselPositions(
        @ParameterObject VesselPositionsRequestModel requestModel
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
    @Operation(
        tags = {"ais.api.tag.name"},
        operationId = "exportvessels-custom-area",
        summary = "{vessel.positions.summary}",
        description = "{vessel.positions.description}",

        responses = {
            @ApiResponse(
                responseCode = "200",
                description = "{successful.response.description}",
                content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                    schema = @Schema(implementation = VesselPositionsCustomAreaRequestModel.class))
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
    public Mono<ResponseEntity<VesselPositionsCustomAreaModel>> getVesselPositionsCustomArea(
        @ParameterObject VesselPositionsCustomAreaRequestModel requestModel
    ) {
        return vesselPositionsCustomAreaService.getVesselPositionsCustomArea( requestModel)
            .map(ResponseEntity::ok)
            .onErrorResume(
                WebClientResponseException.class,
                e -> Mono.just(ResponseEntity.status(e.getStatusCode()).headers(e.getHeaders()).body(null)));
    }
}
