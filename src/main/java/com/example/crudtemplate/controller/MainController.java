package com.example.crudtemplate.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class MainController {
    @GetMapping("/read-only")
    public String readonly() {
        return "read-only";
    }

    @GetMapping("/main")
    public String main() {
        return "crud-board";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
