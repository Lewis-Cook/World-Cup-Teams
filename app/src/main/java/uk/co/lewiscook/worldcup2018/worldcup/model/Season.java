package uk.co.lewiscook.worldcup2018.worldcup.model;

import com.google.gson.annotations.Expose;

@SuppressWarnings("unused")
public class Season {

    @Expose
    private Long currentMatchday;
    @Expose
    private String endDate;
    @Expose
    private Long id;
    @Expose
    private String startDate;
    @Expose
    private Winner winner;

    public Long getCurrentMatchday() {
        return currentMatchday;
    }

    public void setCurrentMatchday(Long currentMatchday) {
        this.currentMatchday = currentMatchday;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public Winner getWinner() {
        return winner;
    }

    public void setWinner(Winner winner) {
        this.winner = winner;
    }

}
