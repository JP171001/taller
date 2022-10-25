package com.example.demo.service.hospitalPackage;

import com.example.demo.model.hospitalPackage.VentaRepuestos;

import java.util.List;

public interface HospitalService {

    List<VentaRepuestos> getAllHospitales();

    VentaRepuestos saveHospital(VentaRepuestos ventaRepuestos);

    VentaRepuestos getHospitalById(int identificador);

    VentaRepuestos updateHospital(VentaRepuestos ventaRepuestos);

    void deleteHospital(int identificador);
}
