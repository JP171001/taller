package com.example.demo.model.administradorPackage;


import com.example.demo.model.ventaPackage.VentaRepuestos;
import com.example.demo.model.abstracts.Usuario;

import javax.persistence.*;

@Entity
@Table(name = "administrador")
public class Administrador extends Usuario {

    @ManyToOne
    @JoinColumn(name = "venta_id",nullable = false)
    private VentaRepuestos ventaAsociada;

    public VentaRepuestos getVentaAsociada() {return ventaAsociada;}

    public void setVentaAsociada(VentaRepuestos ventaAsociada) {
        this.ventaAsociada = ventaAsociada;}

}
