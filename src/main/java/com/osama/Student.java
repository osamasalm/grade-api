package com.osama;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double grade;

    public Student() {} // JPA requires this

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getGrade() { return grade; }
    public void setName(String name) { this.name = name; }
    public void setGrade(double grade) { this.grade = grade; }
}