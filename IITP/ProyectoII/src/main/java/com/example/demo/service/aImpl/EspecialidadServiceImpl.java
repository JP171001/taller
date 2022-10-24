package com.example.demo.service.aImpl;

import com.example.demo.dao.veterinarioPackage.EspecialidadDAO;
import com.example.demo.model.veterinarioPackage.Especialidad;
import com.example.demo.service.veterinarioPackage.EspecialidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EspecialidadServiceImpl implements EspecialidadService {

    @Autowired
    EspecialidadDAO especialidadDAO;

    @Override
    public List<Especialidad> getAllEspecialidades() {
        return especialidadDAO.findAll();
    }

    @Override
    public Especialidad saveEspecialidad(Especialidad especialidad) {
        return especialidadDAO.save(especialidad);
    }

    @Override
    public Especialidad getEspById(int cedula) {
        return especialidadDAO.findById(cedula).get();
    }

    @Override
    public Especialidad updateEspecialidad(Especialidad especialidad) {
        return especialidadDAO.save(especialidad);
    }

    @Override
    public void deleteEsp(int cedula) {
        especialidadDAO.deleteById(cedula);

    }
}
