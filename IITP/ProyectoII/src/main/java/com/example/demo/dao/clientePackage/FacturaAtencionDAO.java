package com.example.demo.dao.clientePackage;

import com.example.demo.model.clientePackage.FacturaAtencion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

//DAO para acceder a las operaciones de la base de datos en la entidad de las factuas de atencion
//Se utiliza la biblioteca de spring JpaRepository para acceder a la base de datos
public interface FacturaAtencionDAO extends JpaRepository<FacturaAtencion, Integer> {

    //Se añade el metodo para listar por fechas, ya que el jpa no implemente este tipo de metodos
    @Query("from FacturaAtencion fa where fa.fecha between :inicio and :fin")
    List<FacturaAtencion> listarPorFechas(@Param("inicio")Date inicio,
                                                      @Param("fin")Date fin);



}
