package ru.maxima.controller;

import org.springframework.stereotype.Controller;

@Controller
public class FirstController {
    public String test(){
        return "hello";
    }
}
