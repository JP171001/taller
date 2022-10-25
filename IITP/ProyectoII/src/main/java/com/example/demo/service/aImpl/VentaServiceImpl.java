package com.example.demo.service.aImpl;

import com.example.demo.dao.hospitalPackage.HospitalDAO;
import com.example.demo.model.hospitalPackage.VentaRepuestos;
import com.example.demo.service.hospitalPackage.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaServiceImpl implements HospitalService {

    @Autowired
    private HospitalDAO hospitalDao;

    @Override
    public List<VentaRepuestos> getAllHospitales() {
       return this.hospitalDao.findAll();
    }

    @Override
    public VentaRepuestos saveHospital(VentaRepuestos ventaRepuestos) {
        return this.hospitalDao.save(ventaRepuestos);
    }

    @Override
    public VentaRepuestos getHospitalById(int identificador) {
        return this.hospitalDao.findById(identificador).get();
    }

    @Override
    public VentaRepuestos updateHospital(VentaRepuestos ventaRepuestos) {
        return this.hospitalDao.save(ventaRepuestos);
    }

    @Override
    public void deleteHospital(int identificador) {
        this.hospitalDao.deleteById(identificador);

    }
}
