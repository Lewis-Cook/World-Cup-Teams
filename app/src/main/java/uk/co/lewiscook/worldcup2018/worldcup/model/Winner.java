package uk.co.lewiscook.worldcup2018.worldcup.model;

import com.google.gson.annotations.Expose;

@SuppressWarnings("unused")
public class Winner {

    @Expose
    private String crestUrl;
    @Expose
    private Long id;
    @Expose
    private String name;
    @Expose
    private String shortName;
    @Expose
    private String tla;

    public String getCrestUrl() {
        return crestUrl;
    }

    public void setCrestUrl(String crestUrl) {
        this.crestUrl = crestUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getTla() {
        return tla;
    }

    public void setTla(String tla) {
        this.tla = tla;
    }

}
