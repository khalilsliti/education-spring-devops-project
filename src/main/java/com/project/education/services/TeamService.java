package com.project.education.services;

import com.project.education.entities.Team;
import com.project.education.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService implements ITeamService {
    @Autowired
    private TeamRepository teamRepository;

    @Override
    public List<Team> getAll() {
        return this.teamRepository.findAll();
    }

    @Override
    public void addTeam(Team team) {
        this.teamRepository.save(team);
    }

    @Override
    public void updateTeam(Team team) {
        this.teamRepository.save(team);
    }

    @Override
    public void deleteTeam(Integer id) {
        this.teamRepository.deleteById(id);
    }

    @Override
    public void getTeamById(Integer id) {

    }
}
