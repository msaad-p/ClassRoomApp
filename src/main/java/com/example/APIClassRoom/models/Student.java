package com.example.APIClassRoom.models;

import java.time.LocalDate;

public class Student {
    private Integer id;
    private Integer gradeLevel;
    private LocalDate birthDate;
    private String address;

    public Student() {
    }

    public Student(Integer id, Integer gradeLevel, LocalDate birthDate, String address) {
        this.id = id;
        this.gradeLevel = gradeLevel;
        this.birthDate = birthDate;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(Integer gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
