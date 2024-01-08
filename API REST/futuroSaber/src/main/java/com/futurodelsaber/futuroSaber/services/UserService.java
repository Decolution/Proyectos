package com.futurodelsaber.futuroSaber.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.futurodelsaber.futuroSaber.models.UserModel;
import com.futurodelsaber.futuroSaber.repositories.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {
    @Autowired
    UserRepository usuarioRepository;

    public ArrayList<UserModel> obtenerEstudiantes() {
        return (ArrayList<UserModel>)usuarioRepository.findAll();      
    }

    public UserModel guardarEstudiante(UserModel estudiante){
        return usuarioRepository.save(estudiante);
    }

    public Optional<UserModel> obtenerPorId(Integer id) {
        return usuarioRepository.findById(id);      
    }
}
