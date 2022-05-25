package com.nhnacademy.springjpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class IndexController {
    @GetMapping(value = { "/", "/index.nhn" })
    public String index() {
        return "index/index";
    }
}
