package com.gda.kepler.proxy.model.marinetraffic.balances;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "schema.balances.credits_balance.title")
public class CreditsBalanceSimpleResponse {
    /**
     * A uniquely assigned ID by MarineTraffic for the subject MarineTraffic registered user
     */
    @Schema(description = "property.USER_ID.description", example = "13541873")
    @JsonProperty("USER_ID")
    private String user_id;

    /**
     * The current Credits balance of the user
     */
    @Schema(description = "property.CREDIT_BALANCE.description", example = "1542")
    @JsonProperty("CREDIT_BALANCE")
    private String credit_balance;

    /**
     * The last date and time (in UTC) that the user purchased Credits
     */
    @Schema(description = "property.CREDIT_LAST_CHARGED.description", example = "2017-01-17T12:23:24.000Z")
    @JsonProperty("LAST_CHARGED")
    private String last_charged;
}
