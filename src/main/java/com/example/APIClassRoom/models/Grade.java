package com.example.APIClassRoom.models;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Grade {
    private Integer id;
    private BigDecimal grade;
    private LocalDate testDate;

    public Grade() {
    }

    public Grade(Integer id, BigDecimal grade, LocalDate testDate) {
        this.id = id;
        this.grade = grade;
        this.testDate = testDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getGrade() {
        return grade;
    }

    public void setGrade(BigDecimal grade) {
        this.grade = grade;
    }

    public LocalDate getTestDate() {
        return testDate;
    }

    public void setTestDate(LocalDate testDate) {
        this.testDate = testDate;
    }
}
