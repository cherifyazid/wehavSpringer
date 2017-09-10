package com.example.demo.repositories;

import com.example.demo.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by cherif.yazid on 10-09-2017.
 */
@Repository
public interface TeamRepo extends JpaRepository<Team,Long> {

    public List<Team> findByPays(String pays);
}
