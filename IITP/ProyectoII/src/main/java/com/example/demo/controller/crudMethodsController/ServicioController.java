package com.example.demo.controller.crudMethodsController;

import com.example.demo.service.hospitalPackage.ProductoService;
import com.example.demo.service.hospitalPackage.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// Controller para manejar las operaciones CRUD de los servicios
@Controller
@RequestMapping
public class ServicioController {

    //Inyeccion de dependecia para obtener los metodos de servicio
    @Autowired
    ServicioService servicioService;

    //Pantalla de select para mostrar todos los servicios
    @GetMapping("/servicios")
    public String showVeterinarios(Model model){
        //Se añade al modelo de la vista el select de la base con todos los servicios
        model.addAttribute("servicios", servicioService.getAllServicio());
        return "crud/servicio/select_servicio";
    }

}
