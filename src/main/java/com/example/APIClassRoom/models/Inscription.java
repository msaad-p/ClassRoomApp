package com.example.APIClassRoom.models;

import java.time.LocalDate;

public class Inscription {
    private Integer id;
    private LocalDate inscriptionDate;

    public Inscription() {
    }

    public Inscription(Integer id, LocalDate inscriptionDate) {
        this.id = id;
        this.inscriptionDate = inscriptionDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getInscriptionDate() {
        return inscriptionDate;
    }

    public void setInscriptionDate(LocalDate inscriptionDate) {
        this.inscriptionDate = inscriptionDate;
    }
}
