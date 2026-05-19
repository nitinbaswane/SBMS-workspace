package com.nb.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class UserInfo {
    @Id
    private Integer userid;
    private String name;
    private String gender;
    private Integer age;
    private String city;


}
