package com.kube.vote.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kube.vote.model.Animal;
import com.kube.vote.model.Vote;
import com.kube.vote.repository.VotingRepository;

@RestController
@RequestMapping("/api/v1")
public class ResultController {

    @Autowired
    private VotingRepository votingRepository;
    
    @GetMapping("/result")
    public ResponseEntity<Map<String, Integer>> getResult() {
        List<Vote> votes = votingRepository.findAll();
        Map<String, Integer> res = new HashMap<>();
        int cat = 0;
        int dog = 0;
        for (Vote vote : votes) {
            if (Animal.CAT.equals(vote.getAnimal())) {
                cat += 1;
            } else {
                dog += 1;
            }
        }
        res.put("cat", cat);
        res.put("dog", dog);
        
        return ResponseEntity.ok(res);
    }
}
