package com.project.education.services;

import com.project.education.entities.TeamDetails;

import java.util.List;

public interface ITeamDetailsService {
    List<TeamDetails> getAll();
    void addTeamDetails(TeamDetails teamDetails);
    void updateTeamDetails(TeamDetails teamDetails);
    void deleteTeamDetails(Integer id);
    void getTeamDetailsById(Integer id);
}
