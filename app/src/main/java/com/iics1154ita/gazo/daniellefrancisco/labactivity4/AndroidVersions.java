package com.iics1154ita.gazo.daniellefrancisco.labactivity4;

public class AndroidVersions {
    int logo;
    String name, version, api, releaseDate;

    public AndroidVersions(int logo, String name, String version, String api, String releaseDate) {
        this.logo = logo;
        this.name = name;
        this.version = version;
        this.api = api;
        this.releaseDate = releaseDate;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
