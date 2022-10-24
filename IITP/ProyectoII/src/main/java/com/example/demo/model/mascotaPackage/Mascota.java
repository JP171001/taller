package com.example.demo.model.mascotaPackage;

import com.example.demo.model.hospitalPackage.HospitalVeterinario;
import com.example.demo.model.clientePackage.Cliente;
import com.example.demo.model.clientePackage.FacturaCompra;
import com.example.demo.model.mascotaPackage.ExpedienteTratamiento;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

//Esta anotacion hace saber el tipo de bean, en este caso una entidad
@Entity
@Table(name = "mascota") //Se hace referencia a la tabla en la base de datos
public class Mascota {


    //Anotacion para hacer las relaciones respectivas de muchos a uno en la base de datos,
    //Con esto spring se encarga de hacer las conexiones respectivas a nivel de java, obentiendo los datos de las distinas tablas
    //en la base de datos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mascota")
    private int id_mascota;

    @Column(name = "tipo_mascota")
    private String tipo_mascota;

    @Column(name = "nombre_mascota")
    private String nombre_mascota;

    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fecha_nacimiento;

    @ManyToOne
    @JoinColumn(name="cedula_dueño",nullable = false)
    private Cliente dueno;

    @ManyToOne
    @JoinColumn(name="hospital_id",nullable = false)
    private HospitalVeterinario hospital_asociado;

    @ManyToMany(mappedBy = "mascota_asociadas")
    List<FacturaCompra> facturas_asociada;

    @OneToMany
    @JoinTable(name = "tratamiento_mascota",
            joinColumns = @JoinColumn(name = "id_mascota"),
            inverseJoinColumns = @JoinColumn(name = "id_tratamiento"))
    private List<ExpedienteTratamiento> expedienteTratamiento;


    //Gets y setters
    public int getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(int id_mascota) {
        this.id_mascota = id_mascota;
    }

    public String getTipo_mascota() {
        return tipo_mascota;
    }

    public void setTipo_mascota(String tipo_mascota) {
        this.tipo_mascota = tipo_mascota;
    }

    public String getNombre_mascota() {
        return nombre_mascota;
    }

    public void setNombre_mascota(String nombre_mascota) {
        this.nombre_mascota = nombre_mascota;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Cliente getDueno() {
        return dueno;
    }

    public void setDueno(Cliente dueno) {
        this.dueno = dueno;
    }

    public HospitalVeterinario getHospital_asociado() {
        return hospital_asociado;
    }

    public void setHospital_asociado(HospitalVeterinario hospital_asociado) {
        this.hospital_asociado = hospital_asociado;
    }

    public List<FacturaCompra> getFacturas_asociada() {
        return facturas_asociada;
    }

    public void setFacturas_asociada(List<FacturaCompra> facturas_asociada) {
        this.facturas_asociada = facturas_asociada;
    }

    public List<ExpedienteTratamiento> getExpedienteTratamiento() {
        return expedienteTratamiento;
    }

    public void setExpedienteTratamiento(List<ExpedienteTratamiento> expedienteTratamiento) {
        this.expedienteTratamiento = expedienteTratamiento;
    }

    //Metodos extra
    //Obtiene el dueño de la entidad por nombre en vez de por instancia de clase
    public String getDuenoByName(){
        return this.getDueno().getNombre() + " " +  this.getDueno().getApellido();
    }
}
