package com.gda.kepler.proxy.model.marinetraffic.vesselinformation.vesselmasterdata;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gda.kepler.proxy.model.marinetraffic.vesselinformation.vesselmasterdata.common.BaseVesselParticularsResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Extended")
public class VesselParticularsExtendedResponse extends BaseVesselParticularsResponse {

    /**
     * The Managing Company's Country
     */
    @Schema(description = "The Managing Company's Country", example = "SWITZERLAND")
    @JsonProperty("MANAGER_COUNTRY")
    private String manager_country;

    /**
     * The Managing Company's Town
     */
    @Schema(description = "The Managing Company's Town")
    @JsonProperty("MANAGER_TOWN")
    private String manager_town;

    /**
     * The Managing Company's Website
     */
    @Schema(description = "The Managing Company's Website", example = "http://www.mscgva.ch")
    @JsonProperty("MANAGER_WEBSITE")
    private String manager_website;

    /**
     * The Owning Company's Country
     */
    @Schema(description = "The Owning Company's Country", example = "SWITZERLAND")
    @JsonProperty("OWNER_COUNTRY")
    private String owner_country;

    /**
     * The Owning Company's Town
     */
    @Schema(description = "The Owning Company's Town")
    @JsonProperty("OWNER_TOWN")
    private String owner_town;

    /**
     * The Owning Company's Website
     */
    @Schema(description = "The Owning Company's Website", example = "http://www.mscgva.ch")
    @JsonProperty("OWNER_WEBSITE")
    private String owner_website;

    /**
     * The builder of the main engine
     */
    @Schema(description = "The builder of the main engine", example = "MITSUI TAMANO ENGINEERING & SHIPBUILDING")
    @JsonProperty("ENGINE_BUILDER")
    private String engine_builder;

    /**
     * The number of main engine cylinders
     */
    @Schema(description = "The number of main engine cylinders", example = "7")
    @JsonProperty("ENGINE_CYLINDERS")
    private String engine_cylinders;

    /**
     * Power of main engine in kW
     */
    @Schema(description = "Power of main engine in kW", example = "9988")
    @JsonProperty("ENGINE_POWER")
    private String engine_power;

    /**
     * The space the piston travels from top to bottom in mm
     */
    @Schema(description = "The space the piston travels from top to bottom in mm", example = "1910")
    @JsonProperty("ENGINE_STROKE")
    private String engine_stroke;

    /**
     * Number of main engines
     */
    @Schema(description = "Number of main engines", example = "1")
    @JsonProperty("ENGINE_NUMBER")
    private String engine_number;

    /**
     * The type of the main engine
     */
    @Schema(description = "The type of the main engine", example = "DIESEL")
    @JsonProperty("ENGINE_TYPE")
    private String engine_type;

    /**
     * Revolutions per minute
     */
    @Schema(description = "Revolutions per minute", example = "127")
    @JsonProperty("ENGINE_RPM")
    private String engine_rpm;

    /**
     * The Classification Society the vessel is registered in
     */
    @Schema(description = "The Classification Society the vessel is registered in", example = "KOREAN REGISTER OF SHIPPING")
    @JsonProperty("CLASS_SOCIETY")
    private String class_society;

    /**
     * The material the ship is made of
     */
    @Schema(description = "The material the ship is made of", example = "STEEL")
    @JsonProperty("HULL_MATERIAL")
    private String hull_material;

    /**
     * Defines whether a vessel is double, single hull etc.
     */
    @Schema(description = "Defines whether a vessel is double, single hull etc.", example = "SINGLE HULL")
    @JsonProperty("HULL_TYPE")
    private String hull_type;

    /**
     * Number of decks
     */
    @Schema(description = "Number of decks", example = "616")
    @JsonProperty("DECKS_NUMBER")
    private String decks_number;

    /**
     * Number of propellers
     */
    @Schema(description = "Number of propellers", example = "1 FIXED PITCH")
    @JsonProperty("PROPELLER")
    private String propeller;

    /**
     * The relative distance from the AIS station of the vessel to the foremost of it (front / bow). Contains no decimals, always rounded.
     */
    @Schema(description = "The relative distance from the AIS station of the vessel to the foremost of it (front / bow). Contains no decimals, always rounded.", example = "132")
    @JsonProperty("L_FORE")
    private String l_fore;

    /**
     * The relative distance from the AIS station of the vessel to the leftmost of it (left side / port). Contains no decimals, always rounded.
     */
    @Schema(description = "The relative distance from the AIS station of the vessel to the leftmost of it (left side / port). Contains no decimals, always rounded.", example = "25")
    @JsonProperty("W_LEFT")
    private String w_left;

    /**
     * The Financial Owner's country
     */
    @Schema(description = "The Financial Owner's country", example = "null,")
    @JsonProperty("FINANCIAL_OWNER_COUNTRY")
    private String financial_owner_country;

    /**
     * The Technical Manager's country
     */
    @Schema(description = "The Technical Manager's country", example = "CYPRUS")
    @JsonProperty("TECHNICAL_MANAGER_COUNTRY")
    private String technical_manager_country;
}
