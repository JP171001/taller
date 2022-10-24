package com.example.demo.service.aImpl;

import com.example.demo.dao.veterinarioPackage.VeterinarioDAO;
import com.example.demo.model.veterinarioPackage.Veterinario;
import com.example.demo.service.veterinarioPackage.VeterinarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeterinarioServiceImpl implements VeterinarioService {

    @Autowired
    private VeterinarioDAO veterinarioDAO;

    @Override
    public List<Veterinario> getAllVeterinarios() {
        return veterinarioDAO.findAll();
    }

    @Override
    public Veterinario saveVeterianario(Veterinario veterinario) {
       return veterinarioDAO.save(veterinario);
    }

    @Override
    public Veterinario getVetById(int cedula) {
        return veterinarioDAO.findById(cedula).get();
    }

    @Override
    public Veterinario updateVet(Veterinario veterinario) {
        return veterinarioDAO.save(veterinario);
    }

    @Override
    public void deleteVet(int cedula) {
        veterinarioDAO.deleteById(cedula);

    }
}
