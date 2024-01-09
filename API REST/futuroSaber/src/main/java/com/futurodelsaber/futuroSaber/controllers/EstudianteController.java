package com.futurodelsaber.futuroSaber.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("/{id}")
    public String eliminarPorId(@PathVariable("id") Integer id){
        boolean ok = this.estudianteService.eliminarEstudiante(id);
        if (ok){
            return "Se eliminó el Estudiante con id " + id;
        }else{
            return "No pudo eliminar el Estudiante con id" + id;
        }
    }
}
