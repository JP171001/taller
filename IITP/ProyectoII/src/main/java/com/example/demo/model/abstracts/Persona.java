package com.example.demo.model.abstracts;

import javax.persistence.*;

//Esta anotacion le hace saber a la base de datos que las clases que hereden de esta van a tener los atributos
// en sus tablas respectivas
@MappedSuperclass
public abstract class Persona {

    //Atributos de una persona
    //La anotacion de column en cada atributo es para denotar su posicion en la base de datos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cedula")
    private int cedula;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "telefono")
    private int telefono;

    //Gets y setters
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    //Metodos extras

    //Obtiene el nombre y el apellido y los devuelve como un solo String
    public String getNombreCompleto(){
        return (this.getNombre() + " " + this.apellido);
    }
}
