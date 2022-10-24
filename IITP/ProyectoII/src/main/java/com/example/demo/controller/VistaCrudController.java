package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.Column;

// Controller para el menu del crud
@Controller
@RequestMapping
public class VistaCrudController {

    @GetMapping("/crud")
    public String inicio(Model model){
        model.addAttribute("test");
        return "crud";
    }

}
