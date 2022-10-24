package com.example.demo.service.veterinarioPackage;

import com.example.demo.model.veterinarioPackage.Veterinario;

import java.util.List;

public interface VeterinarioService {

    List<Veterinario> getAllVeterinarios();

    Veterinario saveVeterianario(Veterinario veterinario);

    Veterinario getVetById(int cedula);

    Veterinario updateVet(Veterinario veterinario);

    void deleteVet(int cedula);
}
