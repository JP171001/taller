package com.example.demo.service.clientePackage;

import com.example.demo.model.clientePackage.FacturaAtencion;

import java.util.Date;
import java.util.List;

public interface FacturaAtencionService {

    List<FacturaAtencion> getAllFacturasAtencion();

    FacturaAtencion saveFactura(FacturaAtencion facturaAtencion);

    FacturaAtencion getFacturaById(int identificador);

    FacturaAtencion updateFactura(FacturaAtencion facturaAtencion);

    void deleteFactura(int identificador);

    List<FacturaAtencion> listarPorFechas(Date fecha1, Date fecha2);

}
