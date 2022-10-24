package com.example.demo.service.aImpl;

import com.example.demo.dao.hospitalPackage.ServicioDAO;
import com.example.demo.model.hospitalPackage.Servicio;
import com.example.demo.service.hospitalPackage.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioServiceImpl implements ServicioService  {

    @Autowired
    private ServicioDAO servicioDAO;

    @Override
    public List<Servicio> getAllServicio() {
        return servicioDAO.findAll();
    }

    @Override
    public Servicio saveServicio(Servicio servicio) {
        return servicioDAO.save(servicio);
    }

    @Override
    public Servicio getServicioById(int identificador) {
        return servicioDAO.findById(identificador).get();
    }

    @Override
    public Servicio updateServicio(Servicio servicio) {
        return servicioDAO.save(servicio);
    }

    @Override
    public void deleteServicio(int identificador) {
        servicioDAO.deleteById(identificador);

    }
}
