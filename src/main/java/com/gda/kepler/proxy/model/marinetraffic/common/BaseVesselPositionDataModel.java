package com.gda.kepler.proxy.model.marinetraffic.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Base data model for a vessel's position and voyage information.
 * Used as a response object for several AIS API endpoints.
 * Corresponds to the structure of objects in schemas like 200_MTA030AD_single and 200_MTA030AD.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "{base.vessel.position.data.model.description}")
public class BaseVesselPositionDataModel {

    @Schema(description = "{mmsi.description}", example = "538003913")
    @JsonProperty("MMSI")
    private String mmsi;

    @Schema(description = "{imo.description}", example = "9470959")
    @JsonProperty("IMO")
    private String imo;

    @Schema(description = "{ship.id.description}", example = "713139")
    @JsonProperty("SHIP_ID")
    private String shipId;

    @Schema(description = "{latitude.description}", example = "37.388430")
    @JsonProperty("LAT")
    private String lat;

    @Schema(description = "{longitude.description}", example = "23.871230")
    @JsonProperty("LON")
    private String lon;

    @Schema(description = "{speed.knotsx10.description}", example = "6")
    @JsonProperty("SPEED")
    private String speed;

    @Schema(description = "{heading.description}", example = "104")
    @JsonProperty("HEADING")
    private String heading;

    @Schema(description = "{course.description}", example = "41")
    @JsonProperty("COURSE")
    private String course;

    @Schema(description = "{status.description}", example = "0")
    @JsonProperty("STATUS")
    private String status;

    @Schema(description = "{timestamp.description}", example = "2020-10-15T12:21:44.000Z")
    @JsonProperty("TIMESTAMP")
    private String timestamp;

    @Schema(description = "{dsrc.description}", example = "TER")
    @JsonProperty("DSRC")
    private String dsrc;

    @Schema(description = "{utc.seconds.description}", example = "45")
    @JsonProperty("UTC_SECONDS")
    private String utcSeconds;

    @Schema(description = "{market.description}", example = "SUPPORTING VESSELS")
    @JsonProperty("MARKET")
    private String market;

    @Schema(description = "{ship.name.description}", example = "SUNNY STAR")
    @JsonProperty("SHIPNAME")
    private String shipname;

    @Schema(description = "{ship.type.description}", example = "89")
    @JsonProperty("SHIPTYPE")
    private String shiptype;

    @Schema(description = "{callsign.description}", example = "V7TZ6")
    @JsonProperty("CALLSIGN")
    private String callsign;

    @Schema(description = "{flag.description}", example = "MH")
    @JsonProperty("FLAG")
    private String flag;

    @Schema(description = "{length.description}", example = "184")
    @JsonProperty("LENGTH")
    private String length;

    @Schema(description = "{width.description}", example = "27.43")
    @JsonProperty("WIDTH")
    private String width;

    @Schema(description = "{grt.description}", example = "23313")
    @JsonProperty("GRT")
    private String grt;

    @Schema(description = "{dwt.description}", example = "37857")
    @JsonProperty("DWT")
    private String dwt;

    @Schema(description = "{draught.description}", example = "95")
    @JsonProperty("DRAUGHT")
    private String draught;

    @Schema(description = "{year.built.description}", example = "2010")
    @JsonProperty("YEAR_BUILT")
    private String yearBuilt;

    @Schema(description = "{ship.country.description}", example = "Marshall Is")
    @JsonProperty("SHIP_COUNTRY")
    private String shipCountry;

    @Schema(description = "{ship.class.description}", example = "HANDYSIZE")
    @JsonProperty("SHIP_CLASS")
    private String shipClass;

    @Schema(description = "{rot.description}", example = "0")
    @JsonProperty("ROT")
    private String rot;

    @Schema(description = "{type.name.description}", example = "Oil/Chemical Tanker")
    @JsonProperty("TYPE_NAME")
    private String typeName;

    @Schema(description = "{ais.type.summary.description}", example = "Tanker")
    @JsonProperty("AIS_TYPE_SUMMARY")
    private String aisTypeSummary;

    @Schema(description = "{destination.description}", example = "FOR ORDERS")
    @JsonProperty("DESTINATION")
    private String destination;

    @Schema(description = "{eta.description}", example = "2020-10-14T12:00:00.000Z")
    @JsonProperty("ETA")
    private String eta;

    @Schema(description = "{l.fore.description}", example = "5")
    @JsonProperty("L_FORE")
    private String lFore;

    @Schema(description = "{w.left.description}", example = "5")
    @JsonProperty("W_LEFT")
    private String wLeft;

    @Schema(description = "{last.port.description}", example = "AGIOI THEODOROI")
    @JsonProperty("LAST_PORT")
    private String lastPort;

    @Schema(description = "{last.port.time.description}", example = "2020-10-13T23:39:00.000Z")
    @JsonProperty("LAST_PORT_TIME")
    private String lastPortTime;

    @Schema(description = "{last.port.id.description}", example = "29")
    @JsonProperty("LAST_PORT_ID")
    private String lastPortId;

    @Schema(description = "{last.port.unlocode.description}", example = "GRAGT")
    @JsonProperty("LAST_PORT_UNLOCODE")
    private String lastPortUnlocode;

    @Schema(description = "{last.port.country.description}", example = "GR")
    @JsonProperty("LAST_PORT_COUNTRY")
    private String lastPortCountry;

    @Schema(description = "{current.port.description}", example = "")
    @JsonProperty("CURRENT_PORT")
    private String currentPort;

    @Schema(description = "{current.port.id.description}", example = "")
    @JsonProperty("CURRENT_PORT_ID")
    private String currentPortId;

    @Schema(description = "{current.port.unlocode.description}", example = "")
    @JsonProperty("CURRENT_PORT_UNLOCODE")
    private String currentPortUnlocode;

    @Schema(description = "{current.port.country.description}", example = "")
    @JsonProperty("CURRENT_PORT_COUNTRY")
    private String currentPortCountry;

    @Schema(description = "{next.port.id.description}", example = "")
    @JsonProperty("NEXT_PORT_ID")
    private String nextPortId;

    @Schema(description = "{next.port.unlocode.description}", example = "")
    @JsonProperty("NEXT_PORT_UNLOCODE")
    private String nextPortUnlocode;

    @Schema(description = "{next.port.name.description}", example = "")
    @JsonProperty("NEXT_PORT_NAME")
    private String nextPortName;

    @Schema(description = "{next.port.country.description}", example = "")
    @JsonProperty("NEXT_PORT_COUNTRY")
    private String nextPortCountry;

    @Schema(description = "{eta.calc.description}", example = "")
    @JsonProperty("ETA_CALC")
    private String etaCalc;

    @Schema(description = "{eta.updated.description}", example = "")
    @JsonProperty("ETA_UPDATED")
    private String etaUpdated;

    @Schema(description = "{distance.to.go.description}", example = "0")
    @JsonProperty("DISTANCE_TO_GO")
    private String distanceToGo;

    @Schema(description = "{distance.travelled.description}", example = "74")
    @JsonProperty("DISTANCE_TRAVELLED")
    private String distanceTravelled;

    @Schema(description = "{avg.speed.description}", example = "12.6")
    @JsonProperty("AVG_SPEED")
    private String avgSpeed;

    @Schema(description = "{max.speed.description}", example = "13.2")
    @JsonProperty("MAX_SPEED")
    private String maxSpeed;
}