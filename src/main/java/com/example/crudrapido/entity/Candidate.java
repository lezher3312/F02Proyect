package com.example.crudrapido.entity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="tbl_candidate")
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long candidateId;
    private String candidate;
    private String department;
    private String municipality;
    @Column(name = "num_table",unique = true, nullable = false)
    private int num_table;
    private int num_votes;
}
