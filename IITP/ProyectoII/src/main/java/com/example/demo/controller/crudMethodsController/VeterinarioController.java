package com.example.demo.controller.crudMethodsController;

import com.example.demo.service.veterinarioPackage.VeterinarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// Controller para manejar las operaciones CRUD de los veterinario
@Controller
@RequestMapping
public class VeterinarioController {

    //Inyeccion de dependecia para obtener los metodos de veterinario
    @Autowired
    VeterinarioService veterinarioService;

    //Pantalla de select para mostrar todos los veterinarios
    @GetMapping("/veterinarios")
    public String showVeterinarios(Model model){
        //Se añade al modelo de la vista el select de los veterinarios
        model.addAttribute("veterinarios", veterinarioService.getAllVeterinarios());
        return "crud/veterinario/select_veterinario";
    }

}
