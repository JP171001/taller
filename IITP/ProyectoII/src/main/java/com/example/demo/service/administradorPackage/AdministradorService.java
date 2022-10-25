package com.example.demo.service.administradorPackage;

import com.example.demo.model.administradorPackage.Administrador;

import java.util.List;

public interface AdministradorService {

    List<Administrador> getAllAdministradores();

    Administrador saveAdministradores(Administrador administrador);

    Administrador getAdminById(int cedula);

    Administrador updateAdmin(Administrador administrador);

    void deleteAdmin(int cedula);
}
