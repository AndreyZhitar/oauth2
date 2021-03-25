package com.example.demo.model;

import lombok.Data;

/**
 * Team
 *
 * @author Andrii Zhytar
 */
@Data
public class Team {

    private Integer teamId;
    private Integer leagueId;
    private String nameEn;
    private String nameChs;
    private String nameCht;
    private String foundingDate;
    private String areaEn;
    private String areaCn;
    private String gymEn;
    private String gymCn;
    private String capacity;
    private String logo;
    private String addrEn;
    private String addrCn;
    private String website;
    private String coachEn;
    private String coachCn;

}
