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
@Table(name = "Book")
public class Book {
    @Id
    @Column(name = "BookID")
    Integer BookID;

    @Column(name = "Title")
    String Title;

    @Column(name = "Author")
    String Author;
}
