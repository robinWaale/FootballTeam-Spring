package com.example.footballteamspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {

    private final TeamRepository teamrepository;

    @Autowired
    public TeamService(TeamRepository teamrepository) {
        this.teamrepository = teamrepository;
    }

    public List<Team> getTeam() {
        return teamrepository.getTeams();
    }

    public void addTeam(Team team){
        teamrepository.addTeam(team);
    }

    public void deleteTeam(Team team){
        teamrepository.deleteTeam(team);
    }
}
