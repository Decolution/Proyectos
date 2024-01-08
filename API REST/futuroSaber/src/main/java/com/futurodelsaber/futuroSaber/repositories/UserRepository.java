package com.futurodelsaber.futuroSaber.repositories;
/*Librerias*/

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/*Paquete UserModel*/
import com.futurodelsaber.futuroSaber.models.UserModel;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Long>{

    Object findAll = null;
} 