package com.example.demo.service.ventaPackage;

import com.example.demo.model.ventaPackage.VentaRepuestos;

import java.util.List;

public interface VentaService {

    List<VentaRepuestos> getAllHospitales();

    VentaRepuestos saveHospital(VentaRepuestos ventaRepuestos);

    VentaRepuestos getHospitalById(int identificador);

    VentaRepuestos updateHospital(VentaRepuestos ventaRepuestos);

    void deleteHospital(int identificador);
}
