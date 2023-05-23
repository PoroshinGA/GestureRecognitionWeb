package com.FirstSpringBootProject.FirstSpringBootProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String home(Model model) {
        return "buffer";
    }
    @GetMapping("/info")
    public String info(Model model){
        return "info";
    }
    @GetMapping("/settings")
    public String settings(Model model){
        return "settings";
    }

}