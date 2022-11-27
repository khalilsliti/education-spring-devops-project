package com.project.education.services;

import com.project.education.entities.Team;

import java.util.List;

public interface ITeamService {

    List<Team> getAll();
    void addTeam(Team team);
    void updateTeam(Team team);
    void deleteTeam(Integer id);
    void getTeamById(Integer id);
}
