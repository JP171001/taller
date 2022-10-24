package com.example.demo.model.veterinarioPackage;

import javax.persistence.*;

//Esta anotacion hace saber el tipo de bean, en este caso una entidad
@Entity
@Table(name = "horario_atencion")//Se hace referencia a la tabla en la base de datos
public class HorarioAtencion {

    //Anotacion para hacer las relaciones respectivas de muchos a uno en la base de datos,
    //Con esto spring se encarga de hacer las conexiones respectivas a nivel de java, obentiendo los datos de las distinas tablas
    //en la base de datos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_horario")
    private int id_horario;

    @ManyToOne
    @JoinColumn(name="cedula_veterinario",nullable = false)
    private Veterinario veterinario;

    @Column(name = "dia")
    private String dia;

    @Column(name = "hora_inicio")
    private String hora_inicio;

    @Column(name = "hora_fin")
    private String hora_fin;


    //Gets y setters
    public int getId_horario() {
        return id_horario;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(String hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public String getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(String hora_fin) {
        this.hora_fin = hora_fin;
    }


    //Metodos extra
    @Override
    public String toString(){
        return "Día: " + this.getDia() + "\nHora de inicio: " + this.getHora_inicio() + "" +
                "\nHora de fin: " + this.getHora_fin();
    }
}
