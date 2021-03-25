package com.example.demo.util;

import com.example.demo.model.MatchInfo;
import com.example.demo.model.MatchPO;
import com.example.demo.model.Team;
import com.example.demo.model.to.TeamTo;

/**
 * ObjectMapper
 *
 * @author Andrii Zhytar
 */
public class ObjectMapper {

    public static MatchPO toMatchPO(MatchInfo matchInfo) {
        return new MatchPO(
                matchInfo.getMatchId(),
                matchInfo.getLeagueEn(),
                matchInfo.getLeagueEnShort(),
                matchInfo.getMatchTime(),
                matchInfo.getHomeEn(),
                matchInfo.getAwayEn(),
                matchInfo.getHomeScore(),
                matchInfo.getAwayScore(),
                matchInfo.getRoundEn(),
                matchInfo.getGrouping()
        );
    }

    public static TeamTo toTeamTo(Team team) {
        String logo = team.getLogo();
        logo = ("".equals(logo)) ? null : logo + "?win007=sell";
        return new TeamTo(
                team.getTeamId(),
                team.getLeagueId(),
                team.getNameEn(),
                team.getAreaEn(),
                team.getGymEn(),
                logo
        );
    }
}
