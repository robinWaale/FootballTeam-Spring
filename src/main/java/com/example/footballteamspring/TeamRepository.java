package com.example.footballteamspring;

import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class TeamRepository {

    private final Logger logger = LoggerFactory.getLogger(TeamRepository.class);

    @Getter
    private ArrayList<Team> teams = new ArrayList<>();

    public TeamRepository(){
        teams.add(new Team("Liverpool", "Anfield", "Liverpool"));
        teams.add(new Team("Arsenal", "Emirates", "London"));
    }

    public void addTeam(Team team){
        teams.add(team);
    }

    public void deleteTeam(Team team){
        try{
            teams.remove(team);
        } catch (Exception e){
            logger.error(e.getMessage());
        }
    }

}
