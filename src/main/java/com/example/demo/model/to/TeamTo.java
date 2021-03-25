package com.example.demo.model.to;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TeamTo
 *
 * @author Andrii Zhytar
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeamTo {

    private Integer teamId;
    private Integer leagueId;
    private String name;
    private String area;
    private String stadium;
    private String logo;
}
