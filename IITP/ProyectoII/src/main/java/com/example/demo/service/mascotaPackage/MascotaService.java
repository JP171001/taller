package com.example.demo.service.mascotaPackage;

import com.example.demo.model.mascotaPackage.Mascota;

import java.util.List;

public interface MascotaService {

    List<Mascota> getAllMascota();

    Mascota saveMascota(Mascota mascota);

    Mascota getMascotaById(int identificador);

    Mascota updateMascota(Mascota mascota);

    void deleteMascota(int identificador);
}
