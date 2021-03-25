package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * TeamList
 *
 * @author Andrii Zhytar
 */
@Component
@Data
@AllArgsConstructor
public class TeamList {

    private final List<Team> teamList = new ArrayList<>();
}
