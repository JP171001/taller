package com.example.demo.model.clientePackage;

import com.example.demo.model.abstracts.FacturasInterface;
import com.example.demo.model.hospitalPackage.Producto;
import com.example.demo.model.hospitalPackage.Servicio;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//Esta anotacion hace saber el tipo de bean, en este caso una entidad
@Entity
@Table(name = "factura_atencion") //Se hace referencia a la tabla en la base de datos
public class FacturaAtencion implements FacturasInterface {

    //Anotacion para hacer las relaciones respectivas de muchos a uno en la base de datos,
    //Con esto spring se encarga de hacer las conexiones respectivas a nivel de java, obentiendo los datos de las distinas tablas
    //en la base de datos
    @Id
    @Column(name = "numero_factura_atencion", nullable = false)
    private int numero_factura_atencion;

    @Column(name = "fecha")
    @Temporal(TemporalType.DATE) //Esta anotacion realiza el mapeo de una clase Date a un date de la base de datos
    @DateTimeFormat(pattern = "yyyy-MM-dd") //Se especifica el formato de la fecha
    private Date fecha;

    @ManyToOne
    @JoinColumn(name="cedula_cliente",nullable = false)
    private Cliente cliente;

    @ManyToMany
    @JoinTable(name = "factura_atencion_servicio",
            joinColumns = @JoinColumn(name = "numero_factura"),
            inverseJoinColumns = @JoinColumn(name = "servicio_id"))
    List<Servicio> servicios;

    @ManyToMany
    @JoinTable(name = "factura_atencion_producto",
            joinColumns = @JoinColumn(name = "numero_factura"),
            inverseJoinColumns = @JoinColumn(name = "producto_id"))
    List<Producto> productos;

    //Gets y setters
    public int getNumero_factura_atencion() {
        return numero_factura_atencion;
    }

    public void setNumero_factura_atencion(int numero_factura_atencion) {
        this.numero_factura_atencion = numero_factura_atencion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }


    //Metodos extra

    //Implementacion de los metodos de la interfaz
    @Override
    public String getProductosByName(){
        String productos = "";
        List<String> productos1 = new ArrayList<String>();

        for(Producto producto : this.getProductos()){
            productos1.add(producto.getNombre_prod());
        }

        //Se separa cada producto por coma
        return String.join(", ", productos1);
    }

}
