package com.gda.kepler.proxy.controller;

import com.gda.kepler.proxy.model.common.HTTPValidationError;
import com.gda.kepler.proxy.model.refineries_v2.consumption.ConsumptionModel;
import com.gda.kepler.proxy.model.refineries_v2.consumption.ConsumptionRequestModel;
import com.gda.kepler.proxy.model.refineries_v2.crudequality.CrudeQualityModel;
import com.gda.kepler.proxy.model.refineries_v2.crudequality.CrudeQualityRequestModel;
import com.gda.kepler.proxy.model.refineries_v2.grossmargins.GrossMarginsModel;
import com.gda.kepler.proxy.model.refineries_v2.grossmargins.GrossMarginsRequestModel;
import com.gda.kepler.proxy.model.refineries_v2.imports.ImportsCrudeCoModel;
import com.gda.kepler.proxy.model.refineries_v2.imports.ImportsCrudeCoRequestModel;
import com.gda.kepler.proxy.model.refineries_v2.imports.ImportsOtherFeedstockModel;
import com.gda.kepler.proxy.model.refineries_v2.imports.ImportsOtherFeedstockRequestModel;
import com.gda.kepler.proxy.model.refineries_v2.particular.ParticularModel;
import com.gda.kepler.proxy.model.refineries_v2.particular.ParticularRequestModel;
import com.gda.kepler.proxy.model.refineries_v2.common.BaseDateSplitOutputModel;
import com.gda.kepler.proxy.model.refineries_v2.refinedproducts.RefinedProductsModel;
import com.gda.kepler.proxy.model.refineries_v2.refinedproducts.RefinedProductsRequestModel;
import com.gda.kepler.proxy.model.refineries_v2.unitruns.UnitRunsModel;
import com.gda.kepler.proxy.model.refineries_v2.unitruns.UnitRunsRequestModel;
import com.gda.kepler.proxy.model.refineries_v2.utilizationrate.UtilisationRatesModel;
import com.gda.kepler.proxy.model.refineries_v2.utilizationrate.UtilizationRatesRequestModel;
import com.gda.kepler.proxy.service.refineries_v2.consumption.ConsumptionProxyService;
import com.gda.kepler.proxy.service.refineries_v2.crudequality.CrudeQualityProxyService;
import com.gda.kepler.proxy.service.refineries_v2.grossmargins.GrossMarginsProxyService;
import com.gda.kepler.proxy.service.refineries_v2.imports.ImportsProxyService;
import com.gda.kepler.proxy.service.refineries_v2.particular.RefineriesProxyService;
import com.gda.kepler.proxy.service.refineries_v2.refinedproducts.RefinedProductsProxyService;
import com.gda.kepler.proxy.service.refineries_v2.unitruns.UnitRunsProxyService;
import com.gda.kepler.proxy.service.refineries_v2.utilizationrate.UtilizationRatesProxyService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/v2/refineries")
public class RefineriesController {


    @Autowired private RefineriesProxyService refineriesProxyService;
    @Autowired private UnitRunsProxyService unitRunsProxyService;
    @Autowired private UtilizationRatesProxyService utilizationRatesProxyService;
    @Autowired private GrossMarginsProxyService grossMarginsProxyService;
    @Autowired private RefinedProductsProxyService refinedProductsProxyService;
    @Autowired private ImportsProxyService importsProxyService;
    @Autowired private CrudeQualityProxyService crudeQualityProxyService;
    @Autowired private ConsumptionProxyService consumptionProxyService;


    // =========================================================================
    // 1. PARTICULARS - GET /v2/refineries/particulars
    // =========================================================================

    /**
     * Proxies the GET request to Kepler API: /refineries/particulars
     */
    @GetMapping("/particulars")
    @Tag(name = "Particulars", description = "Refinery details (owner, age, NCI, status, etc.).")
    @Operation(
        summary = "Proxy: Read Particulars",
        description = "Returns a list of refineries with their details.",
        responses = {
            @ApiResponse(
                responseCode = "200",
                description = "Successful Response",
                content = @Content(array = @ArraySchema(schema = @Schema(implementation = ParticularModel.class)))
            ),
            @ApiResponse(
                responseCode = "422",
                description = "Request Validation Error",
                content = @Content(schema = @Schema(implementation = HTTPValidationError.class))
            ),
            @ApiResponse(responseCode = "401", description = "Authorization Error"),
            @ApiResponse(responseCode = "500", description = "Internal Proxy or Kepler API Error")
        }
    )
    public Mono<ResponseEntity<List<ParticularModel>>> getParticulars(
        @RequestHeader(name = HttpHeaders.AUTHORIZATION, required = true)
        @Parameter(description = "Authorization header (Bearer token) for Kepler API")
        String authorizationHeader,
        @ParameterObject ParticularRequestModel requestModel
    ) {
        return refineriesProxyService.getParticulars(
                authorizationHeader,
                requestModel
            )
            .map(ResponseEntity::ok)
            .onErrorResume(
                WebClientResponseException.class,
                e -> Mono.just(ResponseEntity.status(e.getStatusCode()).headers(e.getHeaders()).body(null)));
    }

    // =========================================================================
    // 2. UNIT RUNS - GET /v2/refineries/unit-runs/primary-distillation
    // =========================================================================

    /**
     * Proxies the GET request to Kepler API: /refineries/unit-runs/primary-distillation
     */
    @GetMapping("/unit-runs/primary-distillation")
    @Tag(name = "Unit Runs", description = "Operational run data for Primary and Secondary Distillation Units.")
    @Operation(
        summary = "Proxy: Read Primary Distillation Runs",
        description = "Retrieves operational run data of Primary Distillation Units. Granularity is required.",
        responses = {
            @ApiResponse(
                responseCode = "200",
                description = "Successful Response",
                content = @Content(array = @ArraySchema(schema = @Schema(implementation = UnitRunsModel.class)))
            ),
            @ApiResponse(
                responseCode = "422",
                description = "Request Validation Error",
                content = @Content(schema = @Schema(implementation = HTTPValidationError.class))
            ),
            @ApiResponse(responseCode = "401", description = "Authorization Error"),
            @ApiResponse(responseCode = "500", description = "Internal Proxy or Kepler API Error")
        }
    )
    public Mono<ResponseEntity<List<UnitRunsModel>>> getPrimaryDistillationRuns(
        @RequestHeader(name = HttpHeaders.AUTHORIZATION, required = true)
        @Parameter(description = "Authorization header (Bearer token) for Kepler API")
        String authorizationHeader,

        @RequestParam(required = true)
        @Parameter(description = "Time series aggregation (monthly, daily, weekly, etc.)", example = "daily",
            schema = @Schema(allowableValues = {"monthly", "daily", "weekly", "eia-weekly", "yearly", "quarterly"}))
        String granularity,


        // Optional list parameters with no API default value (empty list is default)
        @RequestParam(required = false)
        @Parameter(description = "Crude grade names")
        List<String> crudeGrades,

        @RequestParam(required = false)
        @Parameter(description = "Crude Qualities (Light Sweet, Heavy Sour, etc.)")
        List<String> crudeQualities,

        // requestModel contains optional unit (defaults to kbd), startDate/endDate (dynamic defaults), zones, installations, players.
        @ParameterObject
        UnitRunsRequestModel requestModel
    ) {
        return unitRunsProxyService.getPrimaryDistillationRuns(
                authorizationHeader,
                granularity,
                crudeGrades,
                crudeQualities,
                requestModel
            )
            .map(ResponseEntity::ok)
            .onErrorResume(WebClientResponseException.class,
                e -> Mono.just(ResponseEntity.status(e.getStatusCode()).headers(e.getHeaders()).body(null)));
    }

    // =========================================================================
    // 3. UNIT RUNS - GET /v2/refineries/unit-runs/secondary-units
    // =========================================================================

    /**
     * Proxies the GET request to Kepler API: /refineries/unit-runs/secondary-units
     */
    @GetMapping("/unit-runs/secondary-units")
    @Operation(
        tags = {"Unit Runs"},
        summary = "Proxy: Read Secondary Units Runs",
        description = "Retrieves operational run data of Secondary Units. Granularity and unitType are required.",
        responses = {
            @ApiResponse(
                responseCode = "200",
                description = "Successful Response",
                content = @Content(array = @ArraySchema(schema = @Schema(implementation = UnitRunsModel.class)))
            ),
            @ApiResponse(
                responseCode = "422",
                description = "Request Validation Error",
                content = @Content(schema = @Schema(implementation = HTTPValidationError.class))
            ),
            @ApiResponse(responseCode = "401", description = "Authorization Error"),
            @ApiResponse(responseCode = "500", description = "Internal Proxy or Kepler API Error")
        }
    )
    public Mono<ResponseEntity<List<UnitRunsModel>>> getSecondaryUnitsRuns(
        @RequestHeader(name = HttpHeaders.AUTHORIZATION, required = true)
        @Parameter(description = "Authorization header (Bearer token) for Kepler API")
        String authorizationHeader,

        @RequestParam(required = true)
        @Parameter(description = "Time series aggregation (monthly, daily, weekly, etc.)", example = "daily",
            schema = @Schema(allowableValues = {"monthly", "daily", "weekly", "eia-weekly", "yearly", "quarterly"}))
        String granularity,

        @RequestParam(required = true)
        @Parameter(description = "Refinery unit name (Reformer, Coker, FCC, Distillate Hydrocracker)", example = "Coker",
            schema = @Schema(allowableValues = {"Reformer", "Coker", "FCC", "Distillate Hydrocracker"}))
        String unitType,

        // Optional list parameter with API default value 'total'
        @RequestParam(required = false, defaultValue = "total")
        @Parameter(description = "Field names to use on aggregation (defaults to 'total' if omitted).")
        List<String> splits,

        // requestModel contains optional unit (defaults to kbd), startDate/endDate (dynamic defaults), zones, installations, players.
        @ParameterObject
        UnitRunsRequestModel requestModel
    ) {
        return unitRunsProxyService.getSecondaryUnitsRuns(
                authorizationHeader,
                granularity,
                unitType,
                splits,
                requestModel
            )
            .map(ResponseEntity::ok)
            .onErrorResume(WebClientResponseException.class,
                e -> Mono.just(ResponseEntity.status(e.getStatusCode()).headers(e.getHeaders()).body(null)));
    }

    // =========================================================================
    // 4. UTILIZATION RATES - GET /v2/refineries/utilization-rates
    // =========================================================================

    /**
     * Proxies the GET request to Kepler API: /refineries/utilization-rates
     */
    @GetMapping("/utilization-rates")
    @Tag(name = "Utilization Rates",  description = "asdf")
    @Operation(
        summary = "Proxy: Read Utilization Rates",
        description = "Returns the available utilization rate for the chosen unit type. Granularity is required.",
        responses = {
            @ApiResponse(
                responseCode = "200",
                description = "Successful Response",
                content = @Content(array = @ArraySchema(schema = @Schema(implementation = UtilisationRatesModel.class)))
            ),
            @ApiResponse(
                responseCode = "422",
                description = "Request Validation Error",
                content = @Content(schema = @Schema(implementation = HTTPValidationError.class))
            ),
            @ApiResponse(responseCode = "401", description = "Authorization Error"),
            @ApiResponse(responseCode = "500", description = "Internal Proxy or Kepler API Error")
        }
    )
    public Mono<ResponseEntity<List<UtilisationRatesModel>>> getUtilizationRates(
        @RequestHeader(name = HttpHeaders.AUTHORIZATION, required = true)
        @Parameter(description = "Authorization header (Bearer token) for Kepler API")
        String authorizationHeader,

        @ParameterObject
        UtilizationRatesRequestModel requestModel
    ) {
        return utilizationRatesProxyService.getUtilizationRates(
                authorizationHeader,
                requestModel
            )
            .map(ResponseEntity::ok)
            .onErrorResume(WebClientResponseException.class, e ->
                Mono.just(ResponseEntity.status(e.getStatusCode()).headers(e.getHeaders()).body(null))
            );
    }

    // =========================================================================
    // 5. GROSS MARGINS - GET /v2/refineries/margins
    // =========================================================================

    /**
     * Proxies the GET request to Kepler API: /refineries/margins
     */
    @GetMapping("/margins")
    @Tag(name = "Gross Margins",  description = "asdf")
    @Operation(
        summary = "Proxy: Read Gross Margins",
        description = "Returns the Gross Margin per unit volume. Granularity is required.",
        responses = {
            @ApiResponse(
                responseCode = "200",
                description = "Successful Response",
                content = @Content(array = @ArraySchema(schema = @Schema(implementation = GrossMarginsModel.class)))
            ),
            @ApiResponse(
                responseCode = "422",
                description = "Request Validation Error",
                content = @Content(schema = @Schema(implementation = HTTPValidationError.class))
            ),
            @ApiResponse(responseCode = "401", description = "Authorization Error"),
            @ApiResponse(responseCode = "500", description = "Internal Proxy or Kepler API Error")
        }
    )
    public Mono<ResponseEntity<List<GrossMarginsModel>>> getGrossMargins(
        @RequestHeader(name = HttpHeaders.AUTHORIZATION, required = true)
        @Parameter(description = "Authorization header (Bearer token) for Kepler API")
        String authorizationHeader,
        @ParameterObject
        GrossMarginsRequestModel requestModel
    ) {
        return grossMarginsProxyService.getGrossMargins(
                authorizationHeader,
                requestModel
            )
            .map(ResponseEntity::ok)
            .onErrorResume(WebClientResponseException.class, e ->
                Mono.just(ResponseEntity.status(e.getStatusCode()).headers(e.getHeaders()).body(null))
            );
    }

    // =========================================================================
    // 6. REFINED PRODUCTS SUPPLY - GET /v2/refineries/refined-products-supply
    // ...
    // =========================================================================

    /**
     * Proxies the GET request to Kepler API: /refineries/refined-products-supply
     */
    @GetMapping("/refined-products-supply")
    @Tag(name = "Refined Products Supply", description = "asdf")
    @Operation(
        summary = "Proxy: Read Refined Products Supply",
        description = "Returns the aggregated production of each refined product. Granularity is required.",
        responses = {
            @ApiResponse(
                responseCode = "200",
                description = "Successful Response",
                content = @Content(array = @ArraySchema(schema = @Schema(implementation = RefinedProductsModel.class)))
            ),
            @ApiResponse(
                responseCode = "422",
                description = "Request Validation Error",
                content = @Content(schema = @Schema(implementation = HTTPValidationError.class))
            ),
            @ApiResponse(responseCode = "401", description = "Authorization Error"),
            @ApiResponse(responseCode = "500", description = "Internal Proxy or Kepler API Error")
        }
    )
    public Mono<ResponseEntity<List<RefinedProductsModel>>> getRefinedProductsSupply(
        @RequestHeader(name = HttpHeaders.AUTHORIZATION, required = true)
        @Parameter(description = "Authorization header (Bearer token) for Kepler API")
        String authorizationHeader,
        @ParameterObject
        RefinedProductsRequestModel requestModel
    ) {
        return refinedProductsProxyService.getRefinedProductsSupply(
                authorizationHeader,
                requestModel
            )
            .map(ResponseEntity::ok)
            .onErrorResume(WebClientResponseException.class, e ->
                Mono.just(ResponseEntity.status(e.getStatusCode()).headers(e.getHeaders()).body(null))
            );
    }

    // =========================================================================
    // 7. IMPORTS - GET /v2/refineries/imports/crude-co
    // ...
    // =========================================================================

    /**
     * Proxies the GET request to Kepler API: /refineries/imports/crude-co
     */
    @GetMapping("/imports/crude-co")
    @Tag(name = "Imports", description = "asdf")
    @Operation(
        summary = "Proxy: Read Crude Oil and Condensate Imports",
        description = "Retrieves import data for crude oil and condensate. Granularity is required.",
        responses = {
            @ApiResponse(
                responseCode = "200",
                description = "Successful Response",
                content = @Content(array = @ArraySchema(schema = @Schema(implementation = ImportsCrudeCoModel.class)))
            ),
            @ApiResponse(
                responseCode = "422",
                description = "Request Validation Error",
                content = @Content(schema = @Schema(implementation = HTTPValidationError.class))
            ),
            @ApiResponse(responseCode = "401", description = "Authorization Error"),
            @ApiResponse(responseCode = "500", description = "Internal Proxy or Kepler API Error")
        }
    )
    public Mono<ResponseEntity<List<ImportsCrudeCoModel>>> getImportsCrudeCo(
        @RequestHeader(name = HttpHeaders.AUTHORIZATION, required = true)
        @Parameter(description = "Authorization header (Bearer token) for Kepler API")
        String authorizationHeader,

        @ParameterObject
        ImportsCrudeCoRequestModel requestModel
    ) {
        return importsProxyService.getImportsCrudeCo(
                authorizationHeader,
                requestModel
            )
            .map(ResponseEntity::ok)
            .onErrorResume(WebClientResponseException.class, e ->
                Mono.just(ResponseEntity.status(e.getStatusCode()).headers(e.getHeaders()).body(null))
            );
    }

    // =========================================================================
    // 8. IMPORTS - GET /v2/refineries/imports/other-feedstock
    // ...
    // =========================================================================

    /**
     * Proxies the GET request to Kepler API: /refineries/imports/other-feedstock
     */
    @GetMapping("/imports/other-feedstock")
    @Operation(
        tags = {"Imports"},
        summary = "Proxy: Read Other Feedstock Imports",
        description = "Retrieves import data for other feedstocks (SRFO, HSFO, VGO). Granularity is required.",
        responses = {
            @ApiResponse(
                responseCode = "200",
                description = "Successful Response",
                content = @Content(array = @ArraySchema(schema = @Schema(implementation = ImportsOtherFeedstockModel.class)))
            ),
            @ApiResponse(
                responseCode = "422",
                description = "Request Validation Error",
                content = @Content(schema = @Schema(implementation = HTTPValidationError.class))
            ),
            @ApiResponse(responseCode = "401", description = "Authorization Error"),
            @ApiResponse(responseCode = "500", description = "Internal Proxy or Kepler API Error")
        }
    )
    public Mono<ResponseEntity<List<ImportsOtherFeedstockModel>>> getImportsOtherFeedstock(
        @RequestHeader(name = HttpHeaders.AUTHORIZATION, required = true)
        @Parameter(description = "Authorization header (Bearer token) for Kepler API")
        String authorizationHeader,

        @RequestParam(required = false, defaultValue = "kbd")
        ImportsOtherFeedstockRequestModel requestModel
    ) {
        return importsProxyService.getImportsOtherFeedstock(
                authorizationHeader,
                requestModel
            )
            .map(ResponseEntity::ok)
            .onErrorResume(WebClientResponseException.class, e ->
                Mono.just(ResponseEntity.status(e.getStatusCode()).headers(e.getHeaders()).body(null))
            );
    }

    // =========================================================================
    // 9. CRUDE QUALITY - GET /v2/refineries/crude-quality
    // =========================================================================

    /**
     * Proxies the GET request to Kepler API: /refineries/crude-quality
     */
    @GetMapping("/crude-quality")
    @Tag(name = "Crude Quality",  description = "asdf")
    @Operation(
        summary = "Proxy: Read Crude Quality",
        description = "Returns the volume weighted average API gravity and sulfur content of the crude slate. Granularity is required.",
        responses = {
            @ApiResponse(
                responseCode = "200",
                description = "Successful Response",
                content = @Content(array = @ArraySchema(schema = @Schema(implementation = CrudeQualityModel.class)))
            ),
            @ApiResponse(
                responseCode = "422",
                description = "Request Validation Error",
                content = @Content(schema = @Schema(implementation = HTTPValidationError.class))
            ),
            @ApiResponse(responseCode = "401", description = "Authorization Error"),
            @ApiResponse(responseCode = "500", description = "Internal Proxy or Kepler API Error")
        }
    )
    public Mono<ResponseEntity<List<CrudeQualityModel>>> getCrudeQuality(
        @RequestHeader(name = HttpHeaders.AUTHORIZATION, required = true)
        @Parameter(description = "Authorization header (Bearer token) for Kepler API")
        String authorizationHeader,

        @ParameterObject
        CrudeQualityRequestModel requestModel
    ) {
        return crudeQualityProxyService.getCrudeQuality(
                authorizationHeader,
                requestModel
            )
            .map(ResponseEntity::ok)
            .onErrorResume(WebClientResponseException.class, e ->
                Mono.just(ResponseEntity.status(e.getStatusCode()).headers(e.getHeaders()).body(null))
            );
    }

    // =========================================================================
    // 10. CONSUMPTION - GET /v2/refineries/consumption/other-feedstock
    // =========================================================================

    /**
     * Proxies the GET request to Kepler API: /refineries/consumption/other-feedstock
     */
    @GetMapping("/consumption/other-feedstock")
    @Tag(name = "Consumption",  description = "asdf")
    @Operation(
        summary = "Proxy: Read Other Feedstock Consumption",
        description = "Returns the amount of imported other feedstocks consumed by the selected refinery. Granularity is required.",
        responses = {
            @ApiResponse(
                responseCode = "200",
                description = "Successful Response",
                content = @Content(array = @ArraySchema(schema = @Schema(implementation = ConsumptionModel.class)))
            ),
            @ApiResponse(
                responseCode = "422",
                description = "Request Validation Error",
                content = @Content(schema = @Schema(implementation = HTTPValidationError.class))
            ),
            @ApiResponse(responseCode = "401", description = "Authorization Error"),
            @ApiResponse(responseCode = "500", description = "Internal Proxy or Kepler API Error")
        }
    )
    public Mono<ResponseEntity<List<ConsumptionModel>>> getConsumptionOtherFeedstock(
        @RequestHeader(name = HttpHeaders.AUTHORIZATION, required = true)
        @Parameter(description = "Authorization header (Bearer token) for Kepler API")
        String authorizationHeader,

        @ParameterObject
        ConsumptionRequestModel requestModel
    ) {
        return consumptionProxyService.getConsumptionOtherFeedstock(
                authorizationHeader,
                requestModel
            )
            .map(ResponseEntity::ok)
            .onErrorResume(WebClientResponseException.class, e ->
                Mono.just(ResponseEntity.status(e.getStatusCode()).headers(e.getHeaders()).body(null))
            );
    }
}

