package com.nb.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Fruit {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private String fruitId;
    private String fruitName;
    private String fruitColor;
    private String fruitShape;


}
