package com.example.demo.model.administradorPackage;


import com.example.demo.model.hospitalPackage.VentaRepuestos;
import com.example.demo.model.abstracts.Usuario;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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
