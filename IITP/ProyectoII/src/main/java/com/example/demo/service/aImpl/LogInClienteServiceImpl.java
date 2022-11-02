package com.example.demo.service.aImpl;

import com.example.demo.dao.LogIn.LogInClienteDAO;
import com.example.demo.dao.administradorPackage.AdministradorDAO;
import com.example.demo.dao.clientePackage.ClienteDAO;
import com.example.demo.model.administradorPackage.Administrador;
import com.example.demo.model.clientePackage.Cliente;
import com.example.demo.service.loginPackage.LogInClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LogInClienteServiceImpl implements LogInClienteService {

    @Autowired
    private ClienteDAO clienteDAO;

    @Autowired
    private AdministradorDAO administradorDAO;

    @Override
    public int getUsertByType(int identificador, String contrasena) {

        Optional<Cliente> cliente = getClientById(identificador);
        Optional<Administrador> administrador = getAdminById(identificador);

        if (cliente.isPresent()) {
            if (cliente.get().getContrasena().equals(contrasena)) {
                return 0;
            }
            return -1;

        } else if (administrador.isPresent()) {
            if (administrador.get().getContrasena().equals(contrasena)) {
                return 1;
            }
            return -1;
        }

        return -2;
    }

    private Optional<Cliente> getClientById(int identificador) {
        return clienteDAO.findById(identificador);
    }


    private Optional<Administrador>  getAdminById(int identificador) {
        return administradorDAO.findById(identificador);
    }

}

