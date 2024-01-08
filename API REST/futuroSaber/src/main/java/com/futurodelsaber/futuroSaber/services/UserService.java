package com.futurodelsaber.futuroSaber.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.futurodelsaber.futuroSaber.models.UserModel;
import com.futurodelsaber.futuroSaber.repositories.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository usuarioRepository;

    public ArrayList<UserModel> obtenerUsuarios() {
        return (ArrayList<UserModel>)usuarioRepository.findAll();      
    }

    public UserModel guardarUsuario(UserModel usuario){
        return usuarioRepository.save(usuario);


    }

}
