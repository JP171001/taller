package com.example.demo.model.hospitalPackage;

import com.example.demo.model.mascotaPackage.Mascota;
import com.example.demo.model.clientePackage.Cliente;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//Esta anotacion hace saber el tipo de bean, en este caso una entidad
@Entity
@Table(name = "venta_de_repuestos") //Se hace referencia a la tabla en la base de datos
public class VentaRepuestos {

    //Anotacion para hacer las relaciones respectivas de muchos a uno en la base de datos,
    //Con esto spring se encarga de hacer las conexiones respectivas a nivel de java, obentiendo los datos de las distinas tablas
    //en la base de datos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "identificador")
    private int identificador;

    @Column(name = "nombre")
    private String nombre;

    @OneToMany(mappedBy = "ventaAsociada")
    private List<Cliente> clienteList;

    @OneToMany(mappedBy = "hospital_asociado")
    private List<Mascota> mascotaList;


    //Gets y setters
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public void setClienteList(List<Cliente> clienteList) {
        this.clienteList = clienteList;
    }


    //Metodos extra

    //Obtiene los clientes de la entidad por nombre en vez de por instancia de clase
    public List<String> getClientesByName(){
        List<String> clientesName = new ArrayList<>();

        for(Cliente cliente : this.clienteList){
            clientesName.add(cliente.getNombre() + " " + cliente.getApellido());
        }
        return clientesName;
    }

    //Obtiene las mascotas de la entidad por nombre en vez de por instancia de clase
    public List<String> getMascotasByName(){
        List<String> mascotasName = new ArrayList<>();

        for(Mascota mascota : this.mascotaList){
            mascotasName.add(mascota.getNombre_mascota());
        }
        return mascotasName;
    }


}
