package com.example.demo.service.veterinarioPackage;

import com.example.demo.model.veterinarioPackage.HorarioAtencion;
import com.example.demo.model.veterinarioPackage.Veterinario;

import java.util.List;

public interface HorarioAtencionService {

    List<HorarioAtencion> getAllVeterinarios();

    HorarioAtencion saveVeterianario(HorarioAtencion horarioAtencion);

    HorarioAtencion getVetById(int cedula);

    HorarioAtencion updateVet(HorarioAtencion horarioAtencion);

    void deleteVet(int cedula);
}
