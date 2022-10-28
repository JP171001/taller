package com.example.demo.dao.LogIn;


import com.example.demo.model.login.LogInCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogInClienteDAO extends JpaRepository<LogInCliente, Integer> {
}
