package com.example.demo.dao.mascotaPackage;

import com.example.demo.model.mascotaPackage.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;

//DAO para acceder a las operaciones de la base de datos en la entidad de las mascotas
//Se utiliza la biblioteca de spring JpaRepository para acceder a la base de datos
public interface MascotaDAO extends JpaRepository<Mascota, Integer> {
}
