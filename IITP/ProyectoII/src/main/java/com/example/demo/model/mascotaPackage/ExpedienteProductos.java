package com.example.demo.model.mascotaPackage;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "exp_productos")
public class ExpedienteProductos {

    @Id
    @Column(name = "id_exp_prod", nullable = false)
    private int id_exp_prod;

    @Column(name = "producto_comprado")
    private String producto_comprado;

    @Column(name = "cantidad_comprada")
    private int cantidad_comprada;

    @Column(name = "id_mascota")
    private int id_mascota;

    public int getId_exp_prod() {return id_exp_prod;}

    public void setId_exp_prod(int id_exp_prod) {this.id_exp_prod = id_exp_prod;}

    public String getProducto_comprado() {return producto_comprado;}

    public void setProducto_comprado(String producto_comprado) {this.producto_comprado = producto_comprado;}

    public int getCantidad_comprada() {return cantidad_comprada;}

    public void setCantidad_comprada(int cantidad_comprada) {this.cantidad_comprada = cantidad_comprada;}

    public int getId_mascota() {return id_mascota;}

    public void setId_mascota(int id_mascota) {this.id_mascota = id_mascota;}


}
