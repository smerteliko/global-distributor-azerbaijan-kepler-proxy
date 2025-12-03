package com.gda.kepler.proxy.service.graphql;

import com.gda.kepler.proxy.model.graphql.GraphQLRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class GraphQLService {
    private final WebClient graphqlWebClient;
    private final String keplerApiKey;

    public GraphQLService(WebClient.Builder webClientBuilder,
                          @Value("${kepler.api-key}") String keplerApiKey,
                          @Value("${kepler.api.graphql-url}") String keplerGraphqlUrl) {
        this.graphqlWebClient = webClientBuilder.baseUrl(keplerGraphqlUrl).build();
        this.keplerApiKey = keplerApiKey;
    }

    // Проксирует GraphQL-запрос, возвращая сырой JSON-ответ
    public Mono<String> proxyGraphql(GraphQLRequest requestBody, String authorizationHeader) {
        return graphqlWebClient.post()
            .uri(uriBuilder -> uriBuilder.build())
            .contentType(MediaType.APPLICATION_JSON)
            .header("X-Kepler-API-Key", keplerApiKey)
            .header(HttpHeaders.AUTHORIZATION, authorizationHeader)
            .bodyValue(requestBody)
            .retrieve()
            // GraphQL обычно возвращает 200 OK даже при логических ошибках,
            // поэтому просто проксируем тело.
            .bodyToMono(String.class);
    }
}
