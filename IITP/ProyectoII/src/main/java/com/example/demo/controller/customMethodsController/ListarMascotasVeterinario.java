package com.example.demo.controller.customMethodsController;

import com.example.demo.service.veterinarioPackage.VeterinarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// Controller para manejar el metodo de listar las mascotaas por veterinario
@Controller
@RequestMapping
public class ListarMascotasVeterinario {

    //Inyeccion para obtener los metodos de veterinario
    @Autowired
    private VeterinarioService veterinarioService;

    //Pantalla para obtener la veterinario en especifico
    @GetMapping("/get_vet")
    public String getCliente(Model model){
        model.addAttribute("a");
        return "get/escoger_veterinario";
    }

    //Pantalla mostrar las mascotas respectivas
    @GetMapping("/vet_mascota")
    public String showClientes(@RequestParam(value = "id", required = true) int id, Model model){
        if ( id == 0){
            return "get/escoger_cliente";
        }

        //Se añade al modelo el veterinario especifico
        model.addAttribute("cym",veterinarioService.getVetById(id));
        return "post/vet_mascota";
    }
}
