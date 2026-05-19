package com.nitz.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    private String name;

    public String getNameByID(int id) {
        if (id == 100) {
            return "John";
        } else {
            return "Smith";
        }
    }
}
