package com.example.demo.service.aImpl;

import com.example.demo.dao.clientePackage.FacturaCompraDAO;
import com.example.demo.model.clientePackage.FacturaAtencion;
import com.example.demo.model.clientePackage.FacturaCompra;
import com.example.demo.service.clientePackage.FacturaCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class FacturaCompraImpl implements FacturaCompraService {

    @Autowired
    private FacturaCompraDAO facturaCompraDAO;

    @Override
    public List<FacturaCompra> getAllFacturasCompra() {
        return facturaCompraDAO.findAll();
    }

    @Override
    public FacturaCompra saveFactura(FacturaCompra facturaCompra) {
        return facturaCompraDAO.save(facturaCompra);
    }

    @Override
    public FacturaCompra getFacturaById(int identificador) {
        return facturaCompraDAO.findById(identificador).get();
    }

    @Override
    public FacturaCompra updateFactura(FacturaCompra facturaCompra) {
        return facturaCompraDAO.save(facturaCompra);
    }

    @Override
    public void deleteFactura(int identificador) {
        facturaCompraDAO.deleteById(identificador);
    }

    @Override
    public List<FacturaCompra> listarPorFechas(Date fecha1, Date fecha2) {
        return facturaCompraDAO.listarPorFechas(fecha1, fecha2);
    }
}
