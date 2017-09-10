package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by cherif.yazid on 10-09-2017.
 */
@Data
@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private Integer age;
    @ManyToOne
    @JoinColumn(name = "team")
    private Team team;
}
