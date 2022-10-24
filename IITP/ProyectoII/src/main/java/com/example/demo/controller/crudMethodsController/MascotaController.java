package com.example.demo.controller.crudMethodsController;

import com.example.demo.service.mascotaPackage.MascotaService;
import com.example.demo.service.veterinarioPackage.VeterinarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// Controller para manejar las operaciones CRUD de la entidad mascota
@Controller
@RequestMapping
public class MascotaController {

    //Inyeccion de dependecia para obtener los metodos de la mascota
    @Autowired
    MascotaService mascotaService;

    //Pantalla de select para mostrar todos las mascotas
    @GetMapping("/mascotas")
    public String showVeterinarios(Model model){
        model.addAttribute("mascotas", mascotaService.getAllMascota());
        return "crud/mascota/select_mascota";
    }
}
