package com.gda.kepler.proxy.model.graphql;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import java.util.Map;

@Data
@Schema(description = "Standard structure for a GraphQL request")
public class GraphQLRequest {

    @Schema(description = "The GraphQL query string", example = "query { asset (id: \"A1\") { name } }")
    private String query;

    @Schema(description = "The name of the operation being executed", example = "GetAssetName", required = false)
    private String operationName;

    @Schema(description = "Variables passed to the query", required = false)
    private Map<String, Object> variables;
}
