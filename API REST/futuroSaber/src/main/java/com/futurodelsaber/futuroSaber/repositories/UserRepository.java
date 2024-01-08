package com.futurodelsaber.futuroSaber.repositories;
/*Librerias*/

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/*Paquete UserModel*/
import com.futurodelsaber.futuroSaber.models.UserModel;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Integer>{
    
       List<UserModel> findAll();
} 