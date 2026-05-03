package com.osama;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Name cannot be empty")
    private String name;

    @Min(value = 0, message = "Grade cannot be negative")
    @Max(value = 100, message = "Grade cannot exceed 100")
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