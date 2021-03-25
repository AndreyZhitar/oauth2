package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * ListMatchPO
 *
 * @author Andrii Zhytar
 */
@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ListMatchPO {

    private List<MatchPO> matchPOList = new ArrayList<>();
}
