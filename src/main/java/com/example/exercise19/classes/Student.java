package com.example.exercise19.classes;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ForeignKey;
import org.hibernate.annotations.JoinColumnOrFormula;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "StudentID")
    private int studentID;

    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "LastName")
    private String lastName;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
            name = "StudentClass",
            joinColumns = @JoinColumn(name = "StudentID"),
            inverseJoinColumns = @JoinColumn(name = "ClassID")
    )
    private Set<Class> classes = new HashSet<>();

    // Constructors, getters and setters
}
