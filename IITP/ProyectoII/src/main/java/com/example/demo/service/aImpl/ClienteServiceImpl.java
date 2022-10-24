package com.example.demo.service.aImpl;

import com.example.demo.dao.clientePackage.ClienteDAO;
import com.example.demo.model.clientePackage.Cliente;
import com.example.demo.service.clientePackage.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteDAO clienteDAO;


    @Override
    public List<Cliente> getAllClientes() {
        return clienteDAO.findAll();
    }

    @Override
    public Cliente saveCliente(Cliente cliente) {


        return clienteDAO.save(cliente);
    }

    @Override
    public Cliente getClienteById(int cedula) {
        return clienteDAO.findById(cedula).get();
    }

    @Override
    public Cliente updateCliente(Cliente cliente) {
        return clienteDAO.save(cliente);
    }

    @Override
    public void deleteCliente(int cedula) {
        clienteDAO.deleteById(cedula);
    }
}
