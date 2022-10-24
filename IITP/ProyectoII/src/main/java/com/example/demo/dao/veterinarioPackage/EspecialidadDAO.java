package com.example.demo.dao.veterinarioPackage;

import com.example.demo.model.veterinarioPackage.Especialidad;
import org.springframework.data.jpa.repository.JpaRepository;

//DAO para acceder a las operaciones de la base de datos en la entidad de las especialidades
//Se utiliza la biblioteca de spring JpaRepository para acceder a la base de datos
public interface EspecialidadDAO extends JpaRepository<Especialidad,Integer> {
}
