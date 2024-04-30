package com.example.exercise19.classes;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Class")
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ClassID")
    private int classID;

    @Column(name = "ClassName")
    private String className;

    @ManyToMany(mappedBy = "classes")
    private Set<Student> students = new HashSet<>();

    // Constructors, getters and setters
}