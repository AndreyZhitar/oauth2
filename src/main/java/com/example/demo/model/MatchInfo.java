package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * MatchInfo
 *
 * @author Andrii Zhytar
 */
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class MatchInfo implements Serializable {

    private Integer matchId;
    private String color;
    private Integer kind;
    private Integer leagueId;
    private String leagueEn;
    private String leagueEnShort;
    private String leagueChsShort;
    private String leagueChtShort;
    private String subLeagueId;
    private String subLeagueEn;
    private String subLeagueChs;
    private String subLeagueCht;
    private String matchTime;
    private String startTime;
    private String homeEn;
    private String homeChs;
    private String homeCht;
    private String awayEn;
    private String awayChs;
    private String awayCht;
    private Integer homeId;
    private Integer awayId;
    private String state;
    private String homeScore;
    private String awayScore;
    private String homeHalfScore;
    private String awayHalfScore;
    private String homeRed;
    private String awayRed;
    private String homeYellow;
    private String awayYellow;
    private String homeCorner;
    private String awayCorner;
    private String homeRankEn;
    private String homeRankCn;
    private String awayRankEn;
    private String awayRankCn;
    private String isNeutral;
    private String hasLineup;
    private String season;
    private String groupId;
    private String roundEn;
    private String roundCn;
    private String grouping;
    private String locationEn;
    private String locationCn;
    private String weatherEn;
    private String weatherCn;
    private String temp;
    private String explainEn;
    private String explainCn;
    private String extraExplain;
    private String isHidden;
    private String updateTime;
}
