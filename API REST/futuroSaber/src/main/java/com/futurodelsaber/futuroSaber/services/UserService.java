package com.futurodelsaber.futuroSaber.services;

import java.util.List;

import com.futurodelsaber.futuroSaber.models.UserModel;

public interface UserService {
    
    List<UserModel> obtenerEstudiantes();

    UserModel guardarEstudiante(UserModel estudiante);

    UserModel obtenerPorId(Integer id);
}
