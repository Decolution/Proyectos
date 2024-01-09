package com.futurodelsaber.futuroSaber.models;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    private Integer id;

    @Column(name = "user")
    private String user;

    @Column(name = "password")
    private String password;

    public Integer getId(){
        return id;
    }

    public void setUser(String usuario){
        this.user = usuario;
    }

    public String getUser(){
        return user;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return password;
    }
}
