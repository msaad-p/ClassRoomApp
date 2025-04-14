package com.example.APIClassRoom.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "inscriptions")
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_inscription")
    private Integer id;

    @Column(name = "inscription_name", columnDefinition = "DATE DEFAULT CURRENT_DATE")
    private LocalDate inscriptionDate;

    @ManyToOne
    @JoinColumn(name = "fk_course", referencedColumnName = "id_course")
    @JsonBackReference
    private Course course;

    @ManyToOne
    @JoinColumn(name = "fk_student", referencedColumnName = "id_student")
    @JsonBackReference
    private Student student;

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

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}