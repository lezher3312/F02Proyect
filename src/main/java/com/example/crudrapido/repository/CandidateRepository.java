package com.example.crudrapido.repository;

import com.example.crudrapido.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CandidateRepository extends JpaRepository<Candidate, Long>{
}
