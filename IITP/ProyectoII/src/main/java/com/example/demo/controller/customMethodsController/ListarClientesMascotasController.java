package com.example.demo.controller.customMethodsController;

import com.example.demo.service.clientePackage.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// Controller para manejar el metodo de desplegar todos los clientes y sus mascotas
@Controller
@RequestMapping
public class ListarClientesMascotasController {

    //Inyeccion de dependecia para obtener los metodos del cliente
    @Autowired
    private ClienteService clienteService;

    //Pantalla de select para mostrar todos los clientes
    @GetMapping("/cliente_mascota")
    public String listDueño(Model model){
        //Se añade al modelo de la vista el select de la base con todos los clientes
        model.addAttribute("cym",clienteService.getAllClientes());
        return "post/cliente_mascotas";
    }
}
