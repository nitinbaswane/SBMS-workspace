package com.nb.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Embeddable
@Data

public class UserId implements Serializable {
    private Integer userid;
    private String name;
}
