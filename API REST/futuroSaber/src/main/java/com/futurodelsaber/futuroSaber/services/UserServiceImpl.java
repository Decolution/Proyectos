package com.futurodelsaber.futuroSaber.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.futurodelsaber.futuroSaber.models.UserModel;
import com.futurodelsaber.futuroSaber.repositories.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService{
    
    @Autowired
    UserRepository usuarioRepository;

    public List<UserModel> obtenerEstudiantes() {
        return usuarioRepository.findAll();      
    }

    public UserModel guardarEstudiante(UserModel estudiante){
        return usuarioRepository.save(estudiante);
    }

    public UserModel obtenerPorId(Integer id) {
        return usuarioRepository.findById(id).orElse(null);      
    }
}
