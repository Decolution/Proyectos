package com.futurodelsaber.futuroSaber.repositories;
/*Librerias*/

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.futurodelsaber.futuroSaber.models.EstudianteModel;
/*Paquete UserModel*/

@Repository
public interface EstudianteRepository extends CrudRepository<EstudianteModel, Integer>{

       List<EstudianteModel> findAll();
} 