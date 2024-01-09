package com.futurodelsaber.futuroSaber.services;

import java.util.List;

import com.futurodelsaber.futuroSaber.models.EstudianteModel;

public interface EstudianteService {
    
    List<EstudianteModel> obtenerEstudiante();

    EstudianteModel guardarEstudiante(EstudianteModel estudiante);

    EstudianteModel obtenerPorId(Integer id);

    boolean eliminarEstudiante(Integer id);
}
