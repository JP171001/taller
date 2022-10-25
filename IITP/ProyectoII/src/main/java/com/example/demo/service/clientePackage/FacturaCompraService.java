package com.example.demo.service.clientePackage;

import com.example.demo.model.clientePackage.FacturaCompra;

import java.util.Date;
import java.util.List;

public interface FacturaCompraService {

    List<FacturaCompra> getAllFacturasCompra();

    FacturaCompra saveFactura(FacturaCompra facturaCompra);

    FacturaCompra getFacturaById(int identificador);

    FacturaCompra updateFactura(FacturaCompra facturaCompra);

    void deleteFactura(int identificador);

    List<FacturaCompra> listarPorFechas(Date fecha1, Date fecha2);
}
