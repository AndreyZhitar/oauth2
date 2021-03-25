package com.example.demo.controller;

import com.example.demo.model.to.TeamTo;
import com.example.demo.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * TeamController
 *
 * @author Andrii Zhytar
 */
@RestController
@AllArgsConstructor
@RequestMapping("team")
public class TeamController {

    private final TeamService teamService;

    @GetMapping
    public List<TeamTo> listTeam() {
        return teamService.listTeamUrls();
    }
}
