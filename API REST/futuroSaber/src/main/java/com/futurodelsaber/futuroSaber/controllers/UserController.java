package com.futurodelsaber.futuroSaber.controllers;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.futurodelsaber.futuroSaber.models.UserModel;
import com.futurodelsaber.futuroSaber.services.UserService;

@RestController
/*En que direccion del servidor PATH se van a activar los metodos de la clase */
@RequestMapping("/estudiante")
public class UserController {
    
    @Autowired
    UserService estudianteService;

    @GetMapping()
    public List<UserModel> obtenerEstudiantes(){
        return estudianteService.obtenerEstudiantes();
    }

    @PostMapping()
    public UserModel guardarEstudiante(@RequestBody UserModel estudiante){
        return this.estudianteService.guardarEstudiante(estudiante);
        
    }

    @GetMapping("/{id}")
    public UserModel obtenerPorId(@PathVariable("id") Integer id){
        return this.estudianteService.obtenerPorId(id);
    } 
}
