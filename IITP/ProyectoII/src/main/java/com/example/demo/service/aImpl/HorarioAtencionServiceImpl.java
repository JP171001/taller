package com.example.demo.service.aImpl;

import com.example.demo.dao.veterinarioPackage.HorarioAtencionDAO;
import com.example.demo.model.veterinarioPackage.HorarioAtencion;
import com.example.demo.service.veterinarioPackage.HorarioAtencionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HorarioAtencionServiceImpl implements HorarioAtencionService {

    @Autowired
    private HorarioAtencionDAO horarioAtencionDAO;

    @Override
    public List<HorarioAtencion> getAllVeterinarios() {
        return horarioAtencionDAO.findAll();
    }

    @Override
    public HorarioAtencion saveVeterianario(HorarioAtencion horarioAtencion) {
        return horarioAtencionDAO.save(horarioAtencion);
    }

    @Override
    public HorarioAtencion getVetById(int cedula) {
        return horarioAtencionDAO.findById(cedula).get();
    }

    @Override
    public HorarioAtencion updateVet(HorarioAtencion horarioAtencion) {
        return horarioAtencionDAO.save(horarioAtencion);
    }



    @Override
    public void deleteVet(int cedula) {
        horarioAtencionDAO.deleteById(cedula);
    }
}
