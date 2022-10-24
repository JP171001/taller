package com.example.demo.service.clientePackage;



import com.example.demo.model.clientePackage.Cliente;

import java.util.List;

public interface ClienteService {

    List<Cliente> getAllClientes();

    Cliente saveCliente(Cliente cliente);

    Cliente getClienteById(int cedula);

    Cliente updateCliente(Cliente cliente);

    void deleteCliente(int cedula);
}
