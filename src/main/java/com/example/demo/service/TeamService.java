package com.example.demo.service;

import com.example.demo.model.*;
import com.example.demo.model.to.TeamTo;
import com.example.demo.util.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

/**
 * TeamService
 *
 * @author Andrii Zhytar
 */
@Service
@AllArgsConstructor
public class TeamService {

    private final RestTemplate template;

    public List<TeamTo> listTeamUrls() {
        TeamList teamList = template.getForObject("http://interface.win007.com/football/team.aspx", TeamList.class);
        return teamList.getTeamList().stream()
                .map(ObjectMapper::toTeamTo).collect(Collectors.toList());
    }
}
