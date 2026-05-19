package com.nb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebContoller {
    @GetMapping("/")
    public String getMsg() {
        return "hello , This is Boot";
    }
}
