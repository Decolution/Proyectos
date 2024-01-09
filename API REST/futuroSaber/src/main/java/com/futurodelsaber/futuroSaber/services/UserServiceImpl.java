package com.futurodelsaber.futuroSaber.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.futurodelsaber.futuroSaber.models.UserModel;
import com.futurodelsaber.futuroSaber.repositories.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserServices{
    
    @Autowired
    UserRepository usuarioRepository;

    public List<UserModel> obtenerUsuario() {
        return usuarioRepository.findAll();      
    }

    public UserModel guardarUsuario(UserModel usuario){
        return usuarioRepository.save(usuario);
    }

    public UserModel obtenerPorId(Integer id) {
        return usuarioRepository.findById(id).orElse(null);      
    }

    public boolean eliminarUsuario(Integer id){
        try{
            usuarioRepository.deleteById(id);
        }
        catch(Exception err){
            return false;
        }
        return true;
    }
}
