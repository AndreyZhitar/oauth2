package com.example.demo.service;

import com.example.demo.model.ListMatchInfo;
import com.example.demo.model.ListMatchPO;
import com.example.demo.model.MatchPO;
import com.example.demo.util.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

/**
 * MatchService
 *
 * @author Andrii Zhytar
 */
@Service
@Data
@AllArgsConstructor
public class MatchService {

    private final RestTemplate template;

    public ListMatchPO listMatchPO() {
        ListMatchInfo listMatchInfo = template.getForObject("http://interface.win007.com/football/today.aspx", ListMatchInfo.class);
        List<MatchPO> matchPOList = listMatchInfo.getMatchList().stream()
                .map(ObjectMapper::toMatchPO).collect(Collectors.toList());
        return new ListMatchPO(matchPOList);
    }

    public ListMatchPO listMatchPOByDay(String date) {
        System.out.println(date);
        ListMatchInfo listMatchInfo = template.getForObject(("http://interface.win007.com/football/schedule.aspx?date=" + date), ListMatchInfo.class);
        List<MatchPO> matchPOList = listMatchInfo.getMatchList().stream()
                .map(ObjectMapper::toMatchPO).collect(Collectors.toList());
        return new ListMatchPO(matchPOList);
    }
}
