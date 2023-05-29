package com.example.crudrapido.service;


import com.example.crudrapido.entity.Candidate;
import com.example.crudrapido.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CandidateService {
    @Autowired
    CandidateRepository candidateRepository;
    public List<Candidate> getCandidates(){
        return candidateRepository.findAll();
    }
    public Optional<Candidate> getCandidates(Long id){
        return candidateRepository.findById(id);
    }

    public void saveOrUpdate(Candidate candidate){
        candidateRepository.save(candidate);
    }

    public void delete (Long id){
        candidateRepository.deleteById(id);
    }
}
