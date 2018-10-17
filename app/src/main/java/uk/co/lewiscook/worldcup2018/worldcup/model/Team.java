package uk.co.lewiscook.worldcup2018.worldcup.model;

import com.google.gson.annotations.Expose;

@SuppressWarnings("unused")
public class Team {

    @Expose
    private String address;
    @Expose
    private Area area;
    @Expose
    private String clubColors;
    @Expose
    private Object crestUrl;
    @Expose
    private String email;
    @Expose
    private Long founded;
    @Expose
    private Long id;
    @Expose
    private String lastUpdated;
    @Expose
    private String name;
    @Expose
    private String phone;
    @Expose
    private String shortName;
    @Expose
    private String tla;
    @Expose
    private String venue;
    @Expose
    private String website;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public String getClubColors() {
        return clubColors;
    }

    public void setClubColors(String clubColors) {
        this.clubColors = clubColors;
    }

    public Object getCrestUrl() {
        return crestUrl;
    }

    public void setCrestUrl(Object crestUrl) {
        this.crestUrl = crestUrl;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getFounded() {
        return founded;
    }

    public void setFounded(Long founded) {
        this.founded = founded;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

}
