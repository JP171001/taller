package com.example.demo.model.veterinarioPackage;


import com.example.demo.model.hospitalPackage.HospitalVeterinario;
import com.example.demo.model.abstracts.Persona;
import com.example.demo.model.hospitalPackage.Producto;
import com.example.demo.model.veterinarioPackage.Especialidad;
import com.example.demo.model.veterinarioPackage.HorarioAtencion;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "veterinario")
public class Veterinario extends Persona {

    @ManyToOne
    @JoinColumn(name = "hospital_id",nullable = false)
    private HospitalVeterinario hospitalAsociado;

    @OneToMany(mappedBy = "veterinario")
    private List<Especialidad> especialidades;

    @OneToMany(mappedBy = "id_horario")
    private List<HorarioAtencion> horarios_atencion;


    public HospitalVeterinario getHospitalAsociado() {return hospitalAsociado;}

    public void setHospitalAsociado(HospitalVeterinario hospitalAsociado) {
        this.hospitalAsociado = hospitalAsociado;}

    public List<Especialidad> getEspecialidades() {return especialidades;}

    public void setEspecialidades(List<Especialidad> especialidades) {
        this.especialidades = especialidades;}

    public List<HorarioAtencion> getHorarios_atencion() {return horarios_atencion;}

    public void setHorarios_atencion(List<HorarioAtencion> horarios_atencion) {
        this.horarios_atencion = horarios_atencion;}

    public String getEspecialidadesByName(){
        String especialidad = "";
        List<String> espcialidades = new ArrayList<String>();

        for(Especialidad especialidad1 : this.getEspecialidades()){
            espcialidades.add(especialidad1.getNombre_especialidad());
        }

        return String.join(", ", espcialidades);
    }

    public String horarios(){
        List<String> horarios = new ArrayList<String>();

        for(HorarioAtencion horarioAtencion : this.horarios_atencion){
            horarios.add(horarioAtencion.toString());
        }

        return String.join(", ", horarios);
    }
}
