package com.example.APIClassRoom.models;

import com.example.APIClassRoom.helpers.Status;

import java.time.LocalDate;

public class Assistance {
    private Integer id;
    private LocalDate date;
    private Status status;

    public Assistance() {
    }

    public Assistance(Integer id, LocalDate date, Status status) {
        this.id = id;
        this.date = date;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
