package com.futurodelsaber.futuroSaber.models;

/*import java.util.Date;*/

import jakarta.persistence.*;

@Entity
@Table(name = "estudiante")
public class EstudianteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Column(name = "tiposidentificacion_id")
    private Integer tipoId;

    public void setTipoId(Integer tipoId) {
        this.tipoId = tipoId;
    }

    public Integer getTipoId() {
        return tipoId;
    }

    @Column(name = "nombres")
    private String nombres;
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getNombres() {
        return nombres;
    }

    @Column(name = "apellidos")
    private String apellidos;

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Column(name = "fechanacimiento")
    private String nacimiento;

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Column(name = "ciudad")
    private String ciudad;

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    @Column(name = "direccion")
    private String direccion;

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    @Column(name = "email")
    private String email;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Column(name = "telefonofijo")
    private Integer telefonoFijo;

    public void setTelefonoFijo(Integer telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public Integer getTelefonoFijo() {
        return telefonoFijo;
    }

    @Column(name = "celular")
    private Integer celular;

    public void setCelular(Integer celular) {
        this.celular = celular;
    }

    public Integer getCelular() {
        return celular;
    }

    @Column(name = "acudiente")
    private String acudiente;

    public void setAcudiente(String acudiente) {
        this.acudiente = acudiente;
    }

    public String getAcudiente() {
        return acudiente;
    }
}