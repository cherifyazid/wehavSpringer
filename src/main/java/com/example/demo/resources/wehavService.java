package com.example.demo.resources;

import com.example.demo.entity.Team;
import com.example.demo.repositories.TeamRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by cherif.yazid on 10-09-2017.
 */
@RestController
public class wehavService {


    @Autowired
    TeamRepo teamRepo;


    @RequestMapping("/wehav")
    public String getTeam(){

    return teamRepo.findOne(1L).getNom();
    }


    @RequestMapping("/yazid")
    public List<String> getTeamByPays(){

      //  return teamRepo.findByPays("spain").stream().
        //        map(e->e.getNom()).collect(Collectors.toList());
          return teamRepo.getEquipe().stream().
               map(e->e.getNom()).collect(Collectors.toList());
        }

    @RequestMapping("/insertTeam")
    public void addTeam(Team t){

        teamRepo.save(t);
    }
}
