package com.futurodelsaber.futuroSaber.models;

import jakarta.persistence.*;

@Entity
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
