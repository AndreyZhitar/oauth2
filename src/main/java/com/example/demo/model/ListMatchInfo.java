package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * DayInfo
 *
 * @author Andrii Zhytar
 */
@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ListMatchInfo implements Serializable {

    private List<MatchInfo> matchList = new ArrayList<>();
}
