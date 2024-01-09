package com.futurodelsaber.futuroSaber.models;

import java.sql.Date;

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

    @Column(name = "TiposIdentificacion_id")
    private String tipoId;

    public void setTipoId(String tipoId) {
        this.tipoId = tipoId;
    }

    public String getTipoId() {
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

    @Column(name = "fechaNacimiento")
    private Date fechaNacimiento;

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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

    @Column(name = "telefonoFijo")
    private String telefonoFijo;

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    @Column(name = "celular")
    private String celular;

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCelular() {
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