package com.nb.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long PersonId;
    private String personName;
    private LocalDate dob;

    @OneToOne(mappedBy = "person",cascade = CascadeType.ALL)
    private Passport passport;
}
