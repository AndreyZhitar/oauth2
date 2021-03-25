package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * MatchPO
 *
 * @author Andrii Zhytar
 */
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MatchPO {

    private Integer matchId;
    private String league;
    private String shortLeague;
    private String matchTime;
    private String homeName;
    private String awayName;
    private String homeScore;
    private String awayScore;
    private String round;
    private String grouping;

}
