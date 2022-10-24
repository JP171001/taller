package com.example.demo.controller.crudMethodsController;

import com.example.demo.service.veterinarioPackage.EspecialidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// Controller para manejar las operaciones CRUD de la entidad especialidad
@Controller
@RequestMapping
public class EspecialidadController {

    //Inyeccion de dependecia para obtener los metodos de la especialidad
    @Autowired
    EspecialidadService especialidadService;


    //Pantalla de select para mostrar todas las especialidades
    @GetMapping("/especilidad")
    public String showClientes(Model model){
        //Se añade al modelo de la vista el select de la base con todas las especialidades
        model.addAttribute("especialidades", especialidadService.getAllEspecialidades());
        return "crud/especialidad/select_especialidad";
    }
}
