package com.futurodelsaber.futuroSaber.services;

import java.util.List;

import com.futurodelsaber.futuroSaber.models.UserModel;

public interface UserServices {
    
    List<UserModel> obtenerUsuario();

    UserModel guardarUsuario(UserModel usuario);

    UserModel obtenerPorId(Integer id);

    boolean eliminarUsuario(Integer id);
}
