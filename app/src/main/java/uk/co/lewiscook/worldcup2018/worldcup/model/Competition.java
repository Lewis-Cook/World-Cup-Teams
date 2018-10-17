package uk.co.lewiscook.worldcup2018.worldcup.model;

import com.google.gson.annotations.Expose;

@SuppressWarnings("unused")
public class Competition {

    @Expose
    private Area area;
    @Expose
    private String code;
    @Expose
    private Long id;
    @Expose
    private String lastUpdated;
    @Expose
    private String name;
    @Expose
    private String plan;

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

}
