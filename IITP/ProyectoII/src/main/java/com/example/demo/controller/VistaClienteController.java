package com.example.demo.controller;

// Controller para el menu del crud

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class VistaClienteController {

    @GetMapping("/cliente")
    public String inicio(Model model){
        model.addAttribute("test");
        return "cliente";
    }
}
