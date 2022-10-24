package com.example.demo.controller.crudMethodsController;


import com.example.demo.model.veterinarioPackage.HorarioAtencion;
import com.example.demo.service.veterinarioPackage.HorarioAtencionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


// Controller para manejar las operaciones CRUD de la entidad horario atencion
@Controller
@RequestMapping
public class HorarioAtencionController {

    //Inyeccion de dependecia para obtener los metodos de los horarios de atencion
    @Autowired
    private HorarioAtencionService horarioAtencion;

    //Pantalla de select para mostrar todos los horarios
    @GetMapping("/horarios")
    public String showVeterinarios(Model model){
        //Se añade al modelo de la vista el select de la base con todos los horarios
        model.addAttribute("horarios", horarioAtencion.getAllVeterinarios());
        return "crud/horario_atencion/select_horario";
    }


}
