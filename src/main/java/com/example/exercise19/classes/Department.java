package com.example.exercise19.classes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "Department")
public class Department {

    @Id
    @Column(name = "DepartmentID")
    Integer DepartmentID;

    @Column(name = "DepartmentName")
    String DepartmentName;
}
