package com.example.demo.controller;


import com.example.demo.service.loginPackage.LogInClienteService;
import com.example.demo.service.ventaPackage.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping
public class VistaLogInClienteController {


    @Autowired
    private LogInClienteService logInClienteService;

    @GetMapping("/loginView")
    public String inicio(Model model){
        model.addAttribute("test");
        return "login";
    }

    @GetMapping("/login")
    public String login(@RequestParam(value = "id", required = true) String idString,
                        @RequestParam(value = "password", required = true) String password, Model model) {

        int id = Integer.parseInt(idString);
        System.out.println(String.valueOf(id) + " " + password);

        if (id == 0 || password.equals("")) {
            return "login";
        }


        int resultado_login = logInClienteService.getUsertByType(id, password);

        if (resultado_login == 0) {
            return "cliente";
        } else if (resultado_login == 1) {
            return "admin";
        }

        return "login";
    }
}
