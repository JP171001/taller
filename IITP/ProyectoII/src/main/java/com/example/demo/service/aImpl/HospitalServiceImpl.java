package com.example.demo.service.aImpl;

import com.example.demo.dao.hospitalPackage.HospitalDAO;
import com.example.demo.model.hospitalPackage.HospitalVeterinario;
import com.example.demo.service.hospitalPackage.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalServiceImpl implements HospitalService {

    @Autowired
    private HospitalDAO hospitalDao;

    @Override
    public List<HospitalVeterinario> getAllHospitales() {
       return this.hospitalDao.findAll();
    }

    @Override
    public HospitalVeterinario saveHospital(HospitalVeterinario hospitalVeterinario) {
        return this.hospitalDao.save(hospitalVeterinario);
    }

    @Override
    public HospitalVeterinario getHospitalById(int identificador) {
        return this.hospitalDao.findById(identificador).get();
    }

    @Override
    public HospitalVeterinario updateHospital(HospitalVeterinario hospitalVeterinario) {
        return this.hospitalDao.save(hospitalVeterinario);
    }

    @Override
    public void deleteHospital(int identificador) {
        this.hospitalDao.deleteById(identificador);

    }
}
