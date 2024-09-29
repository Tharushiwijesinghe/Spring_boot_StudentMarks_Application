package com.example.studentform.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String studentId;
    private String studentName;
    private int caMarks;
    private int practicalMarks;
    private int theoryMarks;
    private double finalMarks;

    public Student(long id, String studentId, String studentName, int caMarks, int practicalMarks, int theoryMarks, double finalMarks) {
        this.id = id;
        this.studentId = studentId;
        this.studentName = studentName;
        this.caMarks = caMarks;
        this.practicalMarks = practicalMarks;
        this.theoryMarks = theoryMarks;
        this.finalMarks = finalMarks;
    }

    public Student() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getCaMarks() {
        return caMarks;
    }

    public void setCaMarks(int caMarks) {
        this.caMarks = caMarks;
    }

    public int getPracticalMarks() {
        return practicalMarks;
    }

    public void setPracticalMarks(int practicalMarks) {
        this.practicalMarks = practicalMarks;
    }

    public int getTheoryMarks() {
        return theoryMarks;
    }

    public void setTheoryMarks(int theoryMarks) {
        this.theoryMarks = theoryMarks;
    }

    public double getFinalMarks() {
        return finalMarks;
    }

    public void setFinalMarks(int finalMarks) {
        this.finalMarks = finalMarks;
    }

    public void calculateFinalMarks() {
        finalMarks = ( 0.2*caMarks) + (0.2 * practicalMarks) + (0.6*theoryMarks);
    }
}
