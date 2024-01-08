package com.futurodelsaber.futuroSaber.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.futurodelsaber.futuroSaber.models.EstudianteModel;
import com.futurodelsaber.futuroSaber.services.EstudianteService;

@RestController
/*En que direccion del servidor PATH se van a activar los metodos de la clase */
@RequestMapping("/estudiante")
public class EstudianteController {
    
    @Autowired
    EstudianteService estudianteService;

    @GetMapping()
    public List<EstudianteModel> obtenerEstudiante(){
        return estudianteService.obtenerEstudiante();
    }

    @PostMapping()
    public EstudianteModel guardarEstudiante(@RequestBody EstudianteModel estudiante){
        return this.estudianteService.guardarEstudiante(estudiante);
        
    }

    @GetMapping("/{id}")
    public EstudianteModel obtenerPorId(@PathVariable("id") Integer id){
        return this.estudianteService.obtenerPorId(id);
    } 
}
