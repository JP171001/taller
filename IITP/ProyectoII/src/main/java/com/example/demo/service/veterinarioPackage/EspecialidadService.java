package com.example.demo.service.veterinarioPackage;

import com.example.demo.model.veterinarioPackage.Especialidad;
import com.example.demo.model.veterinarioPackage.Veterinario;

import java.util.List;

public interface EspecialidadService {
    List<Especialidad> getAllEspecialidades();

    Especialidad saveEspecialidad(Especialidad especialidad);

    Especialidad getEspById(int cedula);

    Especialidad updateEspecialidad(Especialidad especialidad);

    void deleteEsp(int cedula);
}
