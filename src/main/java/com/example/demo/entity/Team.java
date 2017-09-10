package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Created by cherif.yazid on 10-09-2017.
 */
@Data
@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String pays;

    @OneToMany(mappedBy = "team")
    private List<Player> playerList;
}
