package com.example.demo.dao.veterinarioPackage;

import com.example.demo.model.veterinarioPackage.HorarioAtencion;
import org.springframework.data.jpa.repository.JpaRepository;

//DAO para acceder a las operaciones de la base de datos en la entidad de los horarios de atencion
//Se utiliza la biblioteca de spring JpaRepository para acceder a la base de datos
public interface HorarioAtencionDAO extends JpaRepository<HorarioAtencion, Integer> {
}
