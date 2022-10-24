package com.example.demo.model.hospitalPackage;

import com.example.demo.model.clientePackage.FacturaAtencion;

import javax.persistence.*;
import java.util.List;

//Esta anotacion hace saber el tipo de bean, en este caso una entidad
@Entity
@Table(name = "servicio") //Se hace referencia a la tabla en la base de datos
public class Servicio {

    //Anotacion para hacer las relaciones respectivas de muchos a uno en la base de datos,
    //Con esto spring se encarga de hacer las conexiones respectivas a nivel de java, obentiendo los datos de las distinas tablas
    //en la base de datos
    @Id
    @Column(name = "servicio_id", nullable = false)
    private int servicio_id;

    @Column(name = "nombre_servicio")
    private String nombre_servicio;

    @ManyToMany(mappedBy = "servicios")
    private List<FacturaAtencion> factura_atencion_asociada;

    public int getServicio_id() {
        return servicio_id;
    }

    public void setServicio_id(int servicio_id) {
        this.servicio_id = servicio_id;
    }

    public String getNombre_servicio() {
        return nombre_servicio;
    }

    public void setNombre_servicio(String nombre_servicio) {
        this.nombre_servicio = nombre_servicio;
    }

    public List<FacturaAtencion> getFactura_atencion_asociada() {
        return factura_atencion_asociada;
    }

    public void setFactura_atencion_asociada(List<FacturaAtencion> factura_atencion_asociada) {
        this.factura_atencion_asociada = factura_atencion_asociada;
    }
}
