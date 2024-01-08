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
import com.futurodelsaber.futuroSaber.services.UserServices;

@RestController
/*En que direccion del servidor PATH se van a activar los metodos de la clase */
@RequestMapping("/usuario")
public class UserController {
    
    @Autowired
    UserServices usuarioService;

    @GetMapping()
    public List<UserModel> obtenerUsuario(){
        return usuarioService.obtenerUsuario();
    }

    @PostMapping()
    public UserModel guardarUsuarios(@RequestBody UserModel usuario){
        return this.usuarioService.guardarUsuario(usuario);
        
    }

    @GetMapping("/{id}")
    public UserModel obtenerPorId(@PathVariable("id") Integer id){
        return this.usuarioService.obtenerPorId(id);
    } 
}
