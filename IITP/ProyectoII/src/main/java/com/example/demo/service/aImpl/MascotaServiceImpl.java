package com.example.demo.service.aImpl;

import com.example.demo.dao.mascotaPackage.MascotaDAO;
import com.example.demo.model.mascotaPackage.Mascota;
import com.example.demo.service.mascotaPackage.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaServiceImpl implements MascotaService {

    @Autowired
    private MascotaDAO mascotaDAO;

    @Override
    public List<Mascota> getAllMascota() {
        return mascotaDAO.findAll();
    }

    @Override
    public Mascota saveMascota(Mascota mascota) {
        return mascotaDAO.save(mascota);
    }

    @Override
    public Mascota getMascotaById(int identificador) {
        return mascotaDAO.findById(identificador).get();
    }

    @Override
    public Mascota updateMascota(Mascota mascota) {
        return mascotaDAO.save(mascota);
    }

    @Override
    public void deleteMascota(int identificador) {
        mascotaDAO.deleteById(identificador);

    }
}
