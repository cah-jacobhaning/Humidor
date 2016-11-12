package com.jacobhaning.humidor.model;

import java.io.Serializable;

public class Cigar implements Serializable{
    private String brand;
    private String name;
    private String type;
    private int length;
    private int gauge;
    private String country;
    private String wrapper;
    private String filler;
    private String binder;
    private String burn;
    private String robustness;
    private String draw;
    private String score;
    private String notes;

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getLength() {
        return length;
    }

    public int getGauge() {
        return gauge;
    }

    public String getCountry() {
        return country;
    }

    public String getWrapper() {
        return wrapper;
    }

    public String getFiller() {
        return filler;
    }

    public String getBinder() {
        return binder;
    }

    public String getBurn() {
        return burn;
    }

    public String getRobustness() {
        return robustness;
    }

    public String getDraw() {
        return draw;
    }

    public String getScore() {
        return score;
    }

    public String getNotes() {
        return notes;
    }
}
