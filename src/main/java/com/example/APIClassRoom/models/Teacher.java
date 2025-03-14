package com.example.APIClassRoom.models;

public class Teacher {
    private Integer id;
    private String expertise;

    public Teacher() {
    }

    public Teacher(Integer id, String expertise) {
        this.id = id;
        this.expertise = expertise;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }
}
