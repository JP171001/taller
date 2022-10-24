package com.example.demo.service.hospitalPackage;

import com.example.demo.model.hospitalPackage.HospitalVeterinario;

import java.util.List;

public interface HospitalService {

    List<HospitalVeterinario> getAllHospitales();

    HospitalVeterinario saveHospital(HospitalVeterinario hospitalVeterinario);

    HospitalVeterinario getHospitalById(int identificador);

    HospitalVeterinario updateHospital(HospitalVeterinario hospitalVeterinario);

    void deleteHospital(int identificador);
}
