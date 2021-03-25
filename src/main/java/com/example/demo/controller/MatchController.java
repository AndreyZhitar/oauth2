package com.example.demo.controller;

import com.example.demo.model.ListMatchPO;
import com.example.demo.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * MatchController
 *
 * @author Andrii Zhytar
 */
@RestController
@RequestMapping("matches")
public class MatchController {

    @Autowired
    private MatchService matchService;

    @GetMapping
    public ListMatchPO allMatches() {
        return matchService.listMatchPO();
    }

    @GetMapping("/{date}")
    public ListMatchPO allMatchesByDay(@PathVariable String date) {
        return matchService.listMatchPOByDay(date);
    }
}
