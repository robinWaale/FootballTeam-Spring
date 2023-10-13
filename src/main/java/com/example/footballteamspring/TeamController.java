package com.example.footballteamspring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/teams")
@Slf4j
public class TeamController {

    private final TeamService teamService;

    @Autowired
    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping()
    public ResponseEntity<List<Team>> getTeams(){
        return ResponseEntity.ok(teamService.getTeam());
    }

    @PostMapping()
    public void addTeam(@RequestBody Team team) {
        teamService.addTeam(team);
    }

    @DeleteMapping()
    public void deleteTeam(@RequestBody Team team){
        teamService.deleteTeam(team);
    }


}
