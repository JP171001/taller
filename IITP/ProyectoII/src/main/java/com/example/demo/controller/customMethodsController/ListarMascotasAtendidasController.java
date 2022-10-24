package com.example.demo.controller.customMethodsController;


import com.example.demo.service.mascotaPackage.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// Controller para manejar las mascotas atendidas
@Controller
@RequestMapping
public class ListarMascotasAtendidasController {

    //Inyeccion de dependecia para obtener los metodos de mascota
    @Autowired
    private MascotaService mascotaService;

    //Pantalla para mostrar las mascotas
    @GetMapping("/mascotas_atendidas")
    public String listDueño(Model model){

        //Se añade al modelo de las vista todas las mascotas
        model.addAttribute("ma",mascotaService.getAllMascota());
        return "post/mascotas_atendidas";
    }

}
