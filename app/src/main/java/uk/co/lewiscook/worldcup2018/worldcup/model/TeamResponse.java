package uk.co.lewiscook.worldcup2018.worldcup.model;

import java.util.List;

import com.google.gson.annotations.Expose;

@SuppressWarnings("unused")
public class TeamResponse {

    @Expose
    private Competition competition;
    @Expose
    private Long count;
    @Expose
    private Season season;
    @Expose
    private List<Team> teams;

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

}
