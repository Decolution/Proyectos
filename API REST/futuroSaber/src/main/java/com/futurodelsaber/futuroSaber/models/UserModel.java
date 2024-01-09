package com.futurodelsaber.futuroSaber.models;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    private Integer id;
    private String user;
    private String password;

    public Integer getId(){
        return id;
    }

    public void setUser(String usuario){
        this.user = usuario;
    }

    public String usuario(){
        return user;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String password(){
        return password;
    }
}
