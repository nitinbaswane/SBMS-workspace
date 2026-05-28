package com.nb.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long passportId;

    private String passportNum;
    private LocalDate issuedDate;
    private LocalDate expDate;

    @OneToOne
    @JoinColumn(name  = "person_id")
    private Person person;
}
