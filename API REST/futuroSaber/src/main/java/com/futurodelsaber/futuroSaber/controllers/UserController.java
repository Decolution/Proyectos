package com.futurodelsaber.futuroSaber.controllers;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public UserModel guardarUsuario(@RequestBody UserModel usuario){
        return this.usuarioService.guardarUsuario(usuario);
        
    }

    @GetMapping("/{id}")
    public UserModel obtenerPorId(@PathVariable("id") Integer id){
        return this.usuarioService.obtenerPorId(id);
    } 

    @DeleteMapping("/{id}")
    public String eliminarPorId(@PathVariable("id") Integer id){
        boolean ok = this.usuarioService.eliminarUsuario(id);
        if (ok){
            return "Se eliminó el usuario con id " + id;
        }else{
            return "No pudo eliminar el usuario con id" + id;
        }
    }
}
