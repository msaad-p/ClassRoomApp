package com.example.APIClassRoom.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_student")
    private Integer id;

    @Column(name = "grade_level", nullable = false)
    private Integer gradeLevel;

    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;

    @Column(length = 254, nullable = false)
    private String address;

    @OneToMany(mappedBy = "student")
    @JsonManagedReference
    private List<Inscription> inscriptions;

    @OneToMany(mappedBy = "student")
    @JsonManagedReference
    private List<Assistance> assistances;

    @OneToMany(mappedBy = "student")
    @JsonManagedReference
    private List<Grade> grades;

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

    public List<Inscription> getInscriptions() {
        return inscriptions;
    }

    public void setInscriptions(List<Inscription> inscriptions) {
        this.inscriptions = inscriptions;
    }

    public List<Assistance> getAssistances() {
        return assistances;
    }

    public void setAssistances(List<Assistance> assistances) {
        this.assistances = assistances;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }
}