package com.example.crudrapido.controller;

import com.example.crudrapido.entity.Candidate;
import com.example.crudrapido.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/candidates")
public class CandidateController {
    @Autowired
    private CandidateService candidateService;
    @GetMapping
    public List<Candidate> getAll(){
        return candidateService.getCandidates();

    }
    @GetMapping ("/{candidateID}")
    public Optional<Candidate> getBId(@PathVariable("candidateId") Long candidateId){
        return candidateService.getCandidates(candidateId);

    }

    @PostMapping
    public void saveUpdate(@RequestBody Candidate candidate){
        candidateService.saveOrUpdate(candidate);
    }

    @DeleteMapping("/{candidateId}")
    public void saveUpdate(@PathVariable("candidateId") Long candidateId){ candidateService.delete(candidateId);
    }


}
