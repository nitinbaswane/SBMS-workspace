package com.nb.entity;

import com.nb.generators.CustomGenerator;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import org.hibernate.annotations.UuidGenerator;
import org.springframework.aot.generate.Generated;

@Entity
@Data
public class Fruit {

    @Id
    @fruitId
    private String fruitId;
    private String fruitName;
    private String fruitColor;
    private String fruitShape;


}
