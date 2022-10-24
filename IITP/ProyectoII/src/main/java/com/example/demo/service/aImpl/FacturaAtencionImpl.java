package com.example.demo.service.aImpl;

import com.example.demo.dao.clientePackage.FacturaAtencionDAO;
import com.example.demo.model.clientePackage.FacturaAtencion;
import com.example.demo.service.clientePackage.FacturaAtencionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class FacturaAtencionImpl implements FacturaAtencionService {

    @Autowired
    private FacturaAtencionDAO facturaAtencionDAO;

    @Override
    public List<FacturaAtencion> getAllFacturasAtencion() {
        return facturaAtencionDAO.findAll();
    }

    @Override
    public FacturaAtencion saveFactura(FacturaAtencion facturaAtencion) {
        return facturaAtencionDAO.save(facturaAtencion);
    }

    @Override
    public FacturaAtencion getFacturaById(int identificador) {
        return facturaAtencionDAO.findById(identificador).get();
    }

    @Override
    public FacturaAtencion updateFactura(FacturaAtencion facturaAtencion) {
        return facturaAtencionDAO.save(facturaAtencion);
    }

    @Override
    public void deleteFactura(int identificador) {
        facturaAtencionDAO.deleteById(identificador);

    }

    @Override
    public List<FacturaAtencion> listarPorFechas(Date fecha1, Date fecha2) {
        return facturaAtencionDAO.listarPorFechas(fecha1, fecha2);
    }




}
