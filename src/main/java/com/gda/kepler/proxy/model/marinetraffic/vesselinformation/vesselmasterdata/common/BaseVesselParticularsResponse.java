package com.gda.kepler.proxy.model.marinetraffic.vesselinformation.vesselmasterdata.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseVesselParticularsResponse {
    /**
     * Maritime Mobile Service Identity - a nine-digit number sent in digital form over a radio frequency that identifies the vessel's transmitter station
     */
    @Schema(description = "property.MMSI.description", example = "440389000")
    @JsonProperty("MMSI")
    private String mmsi;

    /**
     * International Maritime Organisation number - a seven-digit number that uniquely identifies vessels
     */
    @Schema(description = "property.IMO.description", example = "9360283")
    @JsonProperty("IMO")
    private String imo;

    /**
     * European Number of Identification - a unique eight-digit registration number for vessels capable of navigating on inland European waters
     */
    @Schema(description = "property.ENI.description")
    @JsonProperty("ENI")
    private String eni;

    /**
     * The Name of the subject vessel
     */
    @Schema(description = "property.MD_NAME.description", example = "DONGJIN AUBE")
    @JsonProperty("NAME")
    private String name;

    /**
     * The Builder of the subject vessel
     */
    @Schema(description = "property.BUILDER.description", example = "HAKATA SHIPBUILDING")
    @JsonProperty("BUILDER")
    private String builder;

    /**
     * The place the subject vessel was built at
     */
    @Schema(description = "property.PLACE_OF_BUILD.description", example = "MATSUYAMA JAPAN")
    @JsonProperty("PLACE_OF_BUILD")
    private String place_of_build;

    /**
     * The year that the subject vessel was built
     */
    @Schema(description = "property.YEAR_BUILT.description", example = "2005")
    @JsonProperty("BUILD")
    private String build;

    /**
     * The number assigned to the subject vessel from the Shipyard (prior to her commercial name)
     */
    @Schema(description = "property.YARD_NUMBER.description", example = "HN. 670")
    @JsonProperty("YARD_NUMBER")
    private String yard_number;

    /**
     * The extreme breadth (in metres) of the subject vessel
     */
    @Schema(description = "property.BREADTH_EXTREME.description", example = "25")
    @JsonProperty("BREADTH_EXTREME")
    private String breadth_extreme;

    /**
     * The Moulded Breadth (in meters) of the subject vessel
     */
    @Schema(description = "property.BREADTH_MOULDED.description", example = "25")
    @JsonProperty("BREADTH_MOULDED")
    private String breadth_moulded;

    /**
     * The Extreme Depth (in meters) of the subject vessel
     */
    @Schema(description = "property.DEPTH.description", example = "13.7")
    @JsonProperty("DEPTH")
    private String depth;

    /**
     * Deadweight - a measure (in metric tons) of how much weight a vessel can safely carry (excluding the vessel's own weight)
     */
    @Schema(description = "property.SUMMER_DWT.description", example = "15220")
    @JsonProperty("SUMMER_DWT")
    private String summer_dwt;

    /**
     * Displacement - a measure of the vessel's weight
     */
    @Schema(description = "property.DISPLACEMENT_SUMMER.description")
    @JsonProperty("DISPLACEMENT_SUMMER")
    private String displacement_summer;

    /**
     * A uniquely designated identifier for the vessel's transmitter station
     */
    @Schema(description = "property.CALLSIGN.description", example = "D7OT")
    @JsonProperty("CALLSIGN")
    private String callsign;

    /**
     * The flag of the subject vessel according to AIS transmissions - more
     */
    @Schema(description = "property.FLAG.description", example = "KR")
    @JsonProperty("FLAG")
    private String flag;

    /**
     * The Maximum Draught (in metres) of the subject vessel
     */
    @Schema(description = "property.DRAUGHT.description", example = "8.97")
    @JsonProperty("DRAUGHT")
    private String draught;

    /**
     * The Overall Length (in metres) of the subject vessel
     */
    @Schema(description = "property.LENGHT_OVERALL.description")
    @JsonProperty("LENGHT_OVERALL")
    private String lenght_overall;

    /**
     * The Length (in meters) measured between perpendiculars for the subject vessel
     */
    @Schema(description = "property.LENGTH_B_W_PERPENDICULARS.description", example = "135")
    @JsonProperty("LENGTH_B_W_PERPENDICULARS")
    private String length_b_w_perpendiculars;

    /**
     * The Fuel Consumption of the subject vessel
     */
    @Schema(description = "property.FUEL_CONSUMPTION.description", example = "36 t/day at 17.50 kn")
    @JsonProperty("FUEL_CONSUMPTION")
    private String fuel_consumption;

    /**
     * The Maximum Operational Speed of the subject vessel
     */
    @Schema(description = "property.SPEED_MAX.description")
    @JsonProperty("SPEED_MAX")
    private String speed_max;

    /**
     * The Speed that the vessel is designed to sail under certain conditions
     */
    @Schema(description = "property.SPEED_SERVICE.description", example = "18")
    @JsonProperty("SPEED_SERVICE")
    private String speed_service;

    /**
     * The Capacity of a containership measured in twenty-foot equivalent units (TEU)
     */
    @Schema(description = "property.TEU.description", example = "1060")
    @JsonProperty("TEU")
    private String teu;

    /**
     * The Gross Tonnage of the subject vessel
     */
    @Schema(description = "property.GROSS_TONNAGE.description", example = "12679")
    @JsonProperty("GROSS_TONNAGE")
    private String gross_tonnage;

    /**
     * The Net Tonnage of the subject vessel
     */
    @Schema(description = "property.NET_TONNAGE.description", example = "5614")
    @JsonProperty("NET_TONNAGE")
    private String net_tonnage;

    /**
     * The Capacity (in cubic metres) of the wet cargo the vessel can carry
     */
    @Schema(description = "property.LIQUID_OIL.description")
    @JsonProperty("LIQUID_OIL")
    private String liquid_oil;

    /**
     * The Capacity (in cubic metres) of the gas cargo the vessel can carry
     */
    @Schema(description = "property.LIQUID_GAS.description")
    @JsonProperty("LIQUID_GAS")
    private String liquid_gas;

    /**
     * The Capacity (in cubic metres) of the grain cargo the vessel can carry
     */
    @Schema(description = "property.GRAIN.description")
    @JsonProperty("GRAIN")
    private String grain;

    /**
     * The Owning Company of the subject vessel
     */
    @Schema(description = "property.OWNER.description", example = "DONG JIN SHIPPING CO LTD")
    @JsonProperty("OWNER")
    private String owner;

    /**
     * The Managing Company of the subject vessel
     */
    @Schema(description = "property.MANAGER.description", example = "DONG JIN SHIPPING CO LTD")
    @JsonProperty("MANAGER")
    private String manager;

    /**
     * The Financial Owner of the subject vessel
     */
    @Schema(description = "property.FINANCIAL_OWNER.description", example = "DONG JIN SHIPPING CO LTD")
    @JsonProperty("FINANCIAL_OWNER")
    private String financial_owner;

    /**
     * The Technical Manager of the subject vessel
     */
    @Schema(description = "property.TECHNICAL_MANAGER.description")
    @JsonProperty("TECHNICAL_MANAGER")
    private String technical_manager;

    /**
     * The Insurer of the subject vessel
     */
    @Schema(description = "property.INSURER.description", example = "JAPAN SHIP OWNERS P & I ASSOCIATION")
    @JsonProperty("INSURER")
    private String insurer;

    /**
     * The specific type of the subject vessel
     */
    @Schema(description = "property.VESSEL_TYPE.description", example = "CONTAINER SHIP")
    @JsonProperty("VESSEL_TYPE")
    private String vessel_type;
}
