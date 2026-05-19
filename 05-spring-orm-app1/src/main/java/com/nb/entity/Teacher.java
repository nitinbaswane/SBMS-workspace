package com.nb.entity;



import lombok.Data;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Teacher {
    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private String city;


}
