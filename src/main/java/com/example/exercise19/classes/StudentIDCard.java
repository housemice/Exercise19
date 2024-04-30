package com.example.exercise19.classes;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Primary;

import java.util.Date;
@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "StudentIDCard")
public class StudentIDCard {
    @Id
    @Column(name = "CardID")
    Integer CardID;

    @Column(name = "CardNumber")
    Integer CardNumber;

    @Column(name = "ExpiryDate")
    Date ExpiryDate;

}
