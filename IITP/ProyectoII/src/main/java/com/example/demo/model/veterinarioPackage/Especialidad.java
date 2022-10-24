package com.example.demo.model.veterinarioPackage;


import javax.persistence.*;

//Esta anotacion hace saber el tipo de bean, en este caso una entidad
@Entity
@Table(name="especialidades")//Se hace referencia a la tabla en la base de datos
public class Especialidad {


    //Anotacion para hacer las relaciones respectivas de muchos a uno en la base de datos,
    //Con esto spring se encarga de hacer las conexiones respectivas a nivel de java, obentiendo los datos de las distinas tablas
    //en la base de datos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_esp")
    private int id_especialidad;

    @Column(name = "nombre_esp")
    private String nombre_especialidad;

    @ManyToOne
    @JoinColumn(name="veterinario",nullable = false)
    private Veterinario veterinario;

    //Gets y setters
    public int getId_especialidad() {
        return id_especialidad;
    }

    public void setId_especialidad(int id_especialidad) {
        this.id_especialidad = id_especialidad;
    }

    public String getNombre_especialidad() {
        return nombre_especialidad;
    }

    public void setNombre_especialidad(String nombre_especialidad) {
        this.nombre_especialidad = nombre_especialidad;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }
}
