package com.example.APIClassRoom.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "grades")
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_grade")
    private Integer id;

    @Column(nullable = false)
    private BigDecimal grade;

    @Column(name = "test_date", nullable = false)
    private LocalDate testDate;

    @ManyToOne
    @JoinColumn(name = "fk_subject", referencedColumnName = "id_subject")
    @JsonBackReference
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "fk_student", referencedColumnName = "id_student")
    @JsonBackReference
    private Student student;

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

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}