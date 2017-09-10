package com.example.demo.repositories;

import com.example.demo.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by cherif.yazid on 10-09-2017.
 */
@Repository
public interface PlayerRepo extends JpaRepository<Player,Long> {
}
