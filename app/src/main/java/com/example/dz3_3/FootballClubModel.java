package com.example.dz3_3;

import java.io.Serializable;

public class FootballClubModel implements Serializable {

    private String labelUri;
    private String name;
    private int wins;
    private String colorClub;

    public FootballClubModel(String labelUri, String name, int wins, String colorClub) {
        this.labelUri = labelUri;
        this.name = name;
        this.wins = wins;
        this.colorClub = colorClub;
    }

    public String getLabelUri() {
        return labelUri;
    }

    public void setLabelUri(String labelUri) {
        this.labelUri = labelUri;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public String getColorClub() {
        return colorClub;
    }

    public void setColorClub(String colorClub) {
        this.colorClub = colorClub;
    }
}
