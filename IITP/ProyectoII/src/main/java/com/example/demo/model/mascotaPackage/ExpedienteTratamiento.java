package com.example.demo.model.mascotaPackage;


import com.example.demo.model.administradorPackage.Administrador;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "exp_tratamientos")
public class ExpedienteTratamiento {
    @Id
    @Column(name = "id_exp_tratamiento", nullable = false)
    private int id_exp_trat;

    @Column(name = "nombre_tratamiento")
    private String nombre_tratamiento;

    @Column(name = "fecha_trat")
    private Date fecha;

    @Column(name = "descripcion_trat")
    private String descripcion;

    @ManyToOne
    @JoinColumn(name="cedula_vet",nullable = false)
    private Administrador administrador;

    @ManyToOne
    @JoinColumn(name = "id_mascota")
    private Mascota mascota;



    public int getId_exp_trat() {return id_exp_trat;}

    public void setId_exp_trat(int id_exp_trat) {this.id_exp_trat = id_exp_trat;}

    public Date getFecha() {return fecha;}

    public void setFecha(Date fecha) {this.fecha = fecha;}

    public String getDescripcion() {return descripcion;}

    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}

    public Administrador getVeterinario() {return administrador;}

    public void setVeterinario(Administrador administrador) {this.administrador = administrador;}

    public Mascota getMascota() {return mascota;}

    public void setMascota(Mascota mascota) {this.mascota = mascota;}


}
