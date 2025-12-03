package com.gda.kepler.proxy.controller;

//import com.kepler.proxy.model.common.KeplerError;
//import com.kepler.proxy.model.graphql.GraphQLRequest;
//import com.kepler.proxy.service.GraphQLService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@Tag(name = "GraphQL Proxy", description = "${doc.tag.graphql}")
public class GraphQLController {
//
//    private final GraphQLService service;
//
//    public GraphQLController(GraphQLService service) {
//        this.service = service;
//    }
//
//    @Operation(
//        operationId = "proxyGraphql",
//        summary = "${op.graphql.summary}",
//        description = "${op.graphql.description}",
//        requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
//            content = @Content(schema = @Schema(implementation = GraphQLRequest.class))),
//        responses = {
//            @ApiResponse(responseCode = "200", description = "Success or GraphQL error (body contains errors object)",
//                content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)),
//            @ApiResponse(responseCode = "400", description = "Invalid JSON or Malformed Request",
//                content = @Content(schema = @Schema(implementation = KeplerError.class)))
//        }
//    )
//    @PostMapping(path = "/graphql", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//    public Mono<ResponseEntity<String>> proxyGraphql(
//        @RequestBody GraphQLRequest requestBody,
//        @RequestHeader(value = HttpHeaders.AUTHORIZATION, required = false) String authorizationHeader) {
//
//        // Проксируем сырой ответ, чтобы сохранить структуру GraphQL-ответа
//        return service.proxyGraphql(requestBody, authorizationHeader)
//            .map(ResponseEntity::ok);
//    }
}
