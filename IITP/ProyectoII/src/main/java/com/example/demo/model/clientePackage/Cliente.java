package com.example.demo.model.clientePackage;

import com.example.demo.model.hospitalPackage.HospitalVeterinario;
import com.example.demo.model.hospitalPackage.Producto;
import com.example.demo.model.hospitalPackage.Servicio;
import com.example.demo.model.abstracts.Persona;
import com.example.demo.model.mascotaPackage.Mascota;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//Esta anotacion hace saber el tipo de bean, en este caso una entidad
@Entity
@Table(name = "cliente") //Se hace referencia a la tabla en la base de datos
public class Cliente extends Persona {

    //Anotacion para hacer las relaciones respectivas de muchos a uno en la base de datos,
    //Con esto spring se encarga de hacer las conexiones respectivas a nivel de java, obentiendo los datos de las distinas tablas
    //en la base de datos
    @ManyToOne
    @JoinColumn(name = "hospital_id",nullable = false)
    private HospitalVeterinario hospitalAsociado;

    @OneToMany(mappedBy = "dueno")
    private List<Mascota> mascotas;

    @OneToMany(mappedBy = "cliente")
    private List<FacturaCompra> facturasCompra;

    @OneToMany(mappedBy = "cliente")
    private List<FacturaAtencion> facturasAtencions;


    //Gets y setters
    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public HospitalVeterinario getHospitalAsociado() {
        return hospitalAsociado;
    }

    public void setHospitalAsociado(HospitalVeterinario hospitalAsociado) {
        this.hospitalAsociado = hospitalAsociado;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public List<FacturaCompra> getFacturasCompra() {
        return facturasCompra;
    }

    public void setFacturasCompra(List<FacturaCompra> facturasCompra) {
        this.facturasCompra = facturasCompra;
    }

    public List<FacturaAtencion> getFacturasAtencions() {
        return facturasAtencions;
    }

    public void setFacturasAtencions(List<FacturaAtencion> facturasAtencions) {
        this.facturasAtencions = facturasAtencions;
    }


    //Metodos extra
    public List<Integer> getFacturasById(){
        List<Integer> facturasId = new ArrayList<>();

        for(FacturaCompra facturaCompra : this.getFacturasCompra()){
            facturasId.add(facturaCompra.getNumero_factura_compra());
        }

        return facturasId;
    }

    public List<String> getMascotasByName(){
        List<String> mascotasName = new ArrayList<>();

        for(Mascota mascotaActual : this.getMascotas()){
            mascotasName.add(mascotaActual.getNombre_mascota());
        }

        return mascotasName;
    }

    public List<Integer> getFacturasCompraById(){
        List<Integer> facturasId = new ArrayList<>();

        for(FacturaCompra facturaCompra : this.getFacturasCompra()){
            facturasId.add(facturaCompra.getNumero_factura_compra());
        }

        return facturasId;
    }

    public List<List<String>> getNombresProductosFacturaCompra(){
        List<List<String>> productosPorFactura = new ArrayList<>();
        List<List<Producto>> productos_de_factura = new ArrayList<>();
        for(FacturaCompra facturaCompra : this.getFacturasCompra()){
            productos_de_factura.add(facturaCompra.getProductos_comprados());
        }
        for(List<Producto> lista_producto : productos_de_factura){
            List<String> nombre_productos = new ArrayList<>();
            for (Producto producto : lista_producto){
                nombre_productos.add(producto.getNombre_prod());
            }
            productosPorFactura.add(nombre_productos);
        }
        return productosPorFactura;
    }

    public List<String> factura_compra_string(){
        List<String> returnList = new ArrayList<>();
        String stringFactura = null;
        for (Integer factura : this.getFacturasCompraById()) {
            stringFactura = factura + ", ";
            List<String> nombres = new ArrayList<>();
            nombres = this.getNombresProductosFacturaCompra().get((factura-1));
            stringFactura = stringFactura + " " + nombres.toString();
            returnList.add(stringFactura);
        }
        return returnList;
    }

    public List<Integer> getFacturasAtencionById(){
        List<Integer> facturasId = new ArrayList<>();

        for(FacturaAtencion facturaAtencion : this.getFacturasAtencions()){
            facturasId.add(facturaAtencion.getNumero_factura_atencion());
        }

        return facturasId;
    }

    public List<List<String>> getNombresServiciosFacturaAtencion(){
        List<List<String>> serviciosPorFactura = new ArrayList<>();
        List<List<Servicio>> servicios_de_factura = new ArrayList<>();
        for(FacturaAtencion facturaAtencion : this.getFacturasAtencions()){
            servicios_de_factura.add(facturaAtencion.getServicios());
        }
        for(List<Servicio> lista_servicios : servicios_de_factura){
            List<String> nombre_servicios = new ArrayList<>();
            for (Servicio servicio : lista_servicios){
                nombre_servicios.add(servicio.getNombre_servicio());
            }
            serviciosPorFactura.add(nombre_servicios);
        }
        return serviciosPorFactura;
    }

    public String factura_atencion_string(){
        List<String> returnList = new ArrayList<>();
        String stringFactura = null;
        System.out.println(this.getFacturasAtencionById());
        for (Integer factura = 0; factura <= this.getFacturasAtencions().toArray().length; factura++) {
            stringFactura = factura + ", ";
            List<String> nombres = new ArrayList<>();
            nombres = this.getNombresServiciosFacturaAtencion().get((factura));
            stringFactura = stringFactura + " " + nombres.toString();
            returnList.add(stringFactura);
        }
        return returnList.toString();
    }


}

