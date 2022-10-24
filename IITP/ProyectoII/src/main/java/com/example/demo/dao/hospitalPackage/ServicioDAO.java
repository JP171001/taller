package com.example.demo.dao.hospitalPackage;

import com.example.demo.model.hospitalPackage.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;

//DAO para acceder a las operaciones de la base de datos en la entidad de los servicios del hospital
//Se utiliza la biblioteca de spring JpaRepository para acceder a la base de datos
public interface ServicioDAO extends JpaRepository<Servicio, Integer> {
}
