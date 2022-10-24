package com.example.demo.service.hospitalPackage;

import com.example.demo.model.hospitalPackage.Servicio;

import java.util.List;

public interface ServicioService {

    List<Servicio> getAllServicio();

    Servicio saveServicio(Servicio servicio);

    Servicio getServicioById(int identificador);

    Servicio updateServicio(Servicio servicio);

    void deleteServicio(int identificador);
}
