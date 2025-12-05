package com.gda.kepler.proxy.service.base;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriComponentsBuilder;
import reactor.core.publisher.Mono;

public abstract class KeplerProxyService {

    protected final WebClient keplerWebClient;
    protected final WebClient marinetrafficWebClient;

    @Value("${kepler.api-key}") protected String keplerApiKey;
    @Value("${marinetraffic.api-key}") protected String marinetrafficApiKey;
    @Value("${marinetraffic.api.base-url}") protected String marinetrafficBaseUrl;
    @Value("${kepler.api.base-url}") protected String keplerBaseUrl;

    public KeplerProxyService(WebClient.Builder webClientBuilder
    ) {
        this.keplerWebClient = webClientBuilder.baseUrl(keplerBaseUrl).build();
        this.marinetrafficWebClient = webClientBuilder.baseUrl(marinetrafficBaseUrl).build();
    }


    /**
     * Executes a GET request with transparent proxying.
     * Propagates the original Kepler API error response (status code and body)
     * using WebClientResponseException.
     * * @param pathTemplate URI template path relative to base URL.
     * @param authorizationHeader Authorization header (Bearer token) from the client.
     * @param responseType The expected response DTO class.
     * @return Mono of the expected response DTO.
     */
    protected <Res> Mono<Res> get(UriComponentsBuilder fullUri, String authorizationHeader, ParameterizedTypeReference<Res> responseType) {
        return keplerWebClient.get()
            .uri(fullUri.build().toUriString())
            .header("X-Kepler-API-Key", keplerApiKey)
            .header(HttpHeaders.AUTHORIZATION, authorizationHeader)
            .retrieve()
            .onStatus(status -> status.isError(), response ->
                // Transparent propagation of the original error body and status
                response.bodyToMono(String.class)
                    .flatMap(errorBody -> Mono.error(new WebClientResponseException(
                        response.statusCode().value(),
                        response.statusCode().toString(),
                        response.headers().asHttpHeaders(),
                        errorBody.getBytes(),
                        null
                    )))
            )
            .bodyToMono(responseType);
    }

    /**
     * Executes a POST request with transparent proxying.
     * Propagates the original Kepler API error response (status code and body)
     * using WebClientResponseException.
     * * @param path The target path relative to the base URL.
     * @param requestBody The request body object.
     * @param authorizationHeader The Authorization header (Bearer token) from the client.
     * @param responseType The expected response DTO class.
     * @return Mono of the expected response DTO.
     */
    protected <Req, Res> Mono<Res> post(String path, Req requestBody, String authorizationHeader, Class<Res> responseType) {
        return keplerWebClient.post()
            .uri(path)
            .contentType(MediaType.APPLICATION_JSON)
            .header("X-Kepler-API-Key", keplerApiKey)
            .header(HttpHeaders.AUTHORIZATION, authorizationHeader)
            .bodyValue(requestBody)
            .retrieve()
            .onStatus(status -> status.isError(), response ->
                response.bodyToMono(String.class)
                    .flatMap(errorBody -> Mono.error(new WebClientResponseException(
                        response.statusCode().value(),
                        response.statusCode().toString(),
                        response.headers().asHttpHeaders(),
                        errorBody.getBytes(),
                        null
                    )))
            )
            .bodyToMono(responseType);
    }

    /**
     * Executes a GET request with transparent proxying for Marine Traffic API.
     * Uses the required X-Container-API-Key header.
     * * @param fullUri UriComponentsBuilder containing the full path and query parameters.
     * @param containerApiKey The API key required for Marine Traffic (X-Container-API-Key).
     * @param responseType The expected response DTO type reference.
     * @param baseUrl Base URL for Marine Traffic (must be supplied by service implementation).
     * @return Mono of the expected response DTO.
     */
    protected <Res> Mono<Res> getMarineTraffic(
        UriComponentsBuilder fullUri,
        ParameterizedTypeReference<Res> responseType
    ){

        return marinetrafficWebClient.get()
            .uri(fullUri.build().toUriString())
            .retrieve()
            .onStatus(status -> status.isError(), response ->
                response.bodyToMono(String.class)
                    .flatMap(errorBody -> Mono.error(new WebClientResponseException(
                        response.statusCode().value(),
                        response.statusCode().toString(),
                        response.headers().asHttpHeaders(),
                        errorBody.getBytes(),
                        null
                    )))
            )
            .bodyToMono(responseType);
    }

    // --- MARINE TRAFFIC POST METHOD (Using X-Container-API-Key) ---

    /**
     * Executes a POST request with transparent proxying for Marine Traffic API.
     */
    protected <Req, Res> Mono<Res> postMarineTraffic(
        String path,
        Req requestBody,
        String containerApiKey,
        Class<Res> responseType
    ) {

        return marinetrafficWebClient.post()
            .uri(path)
            .contentType(MediaType.APPLICATION_JSON)
            .header("X-Container-API-Key", containerApiKey)
            .bodyValue(requestBody)
            .retrieve()
            .onStatus(status -> status.isError(), response ->
                response.bodyToMono(String.class)
                    .flatMap(errorBody -> Mono.error(new WebClientResponseException(
                        response.statusCode().value(),
                        response.statusCode().toString(),
                        response.headers().asHttpHeaders(),
                        errorBody.getBytes(),
                        null
                    )))
            )
            .bodyToMono(responseType);
    }
}