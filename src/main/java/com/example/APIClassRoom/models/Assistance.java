package com.example.APIClassRoom.models;

import com.example.APIClassRoom.helpers.Status;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "assistances")
public class Assistance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_assistance")
    private Integer id;

    @Column(nullable = false)
    private LocalDate date;

    @Column(nullable = false)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "fk_course", referencedColumnName = "id_course")
    @JsonBackReference
    private Course course;

    @ManyToOne
    @JoinColumn(name = "fk_student", referencedColumnName = "id_student")
    @JsonBackReference
    private Student student;

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