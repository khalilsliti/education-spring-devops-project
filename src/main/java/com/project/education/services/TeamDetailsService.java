package com.project.education.services;

import com.project.education.entities.TeamDetails;
import com.project.education.repositories.TeamDetailsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamDetailsService implements ITeamDetailsService {
    private TeamDetailsRepository teamDetailsRepository;

    @Override
    public List<TeamDetails> getAll() {
        return this.teamDetailsRepository.findAll();
    }

    @Override
    public void addTeamDetails(TeamDetails teamDetails) {
        this.teamDetailsRepository.save(teamDetails);
    }

    @Override
    public void updateTeamDetails(TeamDetails teamDetails) {
        this.teamDetailsRepository.save(teamDetails);
    }

    @Override
    public void deleteTeamDetails(Integer id) {
        this.teamDetailsRepository.deleteById(id);
    }

    @Override
    public void getTeamDetailsById(Integer id) {
        this.teamDetailsRepository.findById(id);
    }
}
