package ru.maxima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hello-endpoint")
    public String test(){
        return "hello-view.html";
    }
}