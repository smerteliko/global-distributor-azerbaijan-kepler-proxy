package com.gda.kepler.proxy.model.marinetraffic.balances;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Simple")
public class CreditsBalanceSimpleResponse {
    /**
     * A uniquely assigned ID by MarineTraffic for the subject MarineTraffic registered user
     */
    @Schema(description = "A uniquely assigned ID by MarineTraffic for the subject MarineTraffic registered user", example = "13541873")
    @JsonProperty("USER_ID")
    private String user_id;

    /**
     * The current Credits balance of the user
     */
    @Schema(description = "The current Credits balance of the user", example = "1542")
    @JsonProperty("CREDIT_BALANCE")
    private String credit_balance;

    /**
     * The last date and time (in UTC) that the user purchased Credits
     */
    @Schema(description = "The last date and time (in UTC) that the user purchased Credits", example = "2017-01-17T12:23:24.000Z")
    @JsonProperty("LAST_CHARGED")
    private String last_charged;
}
