package com.nb.entity;


import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Data
@Table( schema = "User_Data")
public class UserInfo {

    @EmbeddedId
    private UserId userId;
    private String gender;
    private Integer age;
    private String city;




}
