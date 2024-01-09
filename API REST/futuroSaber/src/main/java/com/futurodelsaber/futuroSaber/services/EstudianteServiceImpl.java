package com.futurodelsaber.futuroSaber.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.futurodelsaber.futuroSaber.models.EstudianteModel;
import com.futurodelsaber.futuroSaber.repositories.EstudianteRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EstudianteServiceImpl implements EstudianteService{
    
    @Autowired
    EstudianteRepository estudianteRepository;

    public List<EstudianteModel> obtenerEstudiante() {
        return estudianteRepository.findAll();      
    }

    public EstudianteModel guardarEstudiante(EstudianteModel usuario){
        return estudianteRepository.save(usuario);
    }

    public EstudianteModel obtenerPorId(Integer id) {
        return estudianteRepository.findById(id).orElse(null);      
    }

    public boolean eliminarEstudiante(Integer id){
        try{
            estudianteRepository.deleteById(id);
        }
        catch(Exception err){
            return false;
        }
        return true;
    }
}
