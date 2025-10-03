package com.pecuaria.application.validation;

import com.pecuaria.application.exception.BadRequestException;
import com.pecuaria.application.model.UserEntity;
import org.hibernate.ObjectNotFoundException;

import java.util.Optional;

public class UserValidator {
    public static void validarUser(Optional<UserEntity> userEntityValidation){
        //se o objeto no banco estiver vazio->
        if (userEntityValidation.isEmpty()) {
            throw new ObjectNotFoundException("Usuario Inexistente",UserEntity.class);
        }
    }
    public static void validarCampos(UserEntity userEntity){
        if(userEntity.getName().isEmpty()){
            throw new BadRequestException("Insira um Nome!");
        }
        if(userEntity.getCpf().isEmpty()){
            throw new BadRequestException("Insira um CPF!!");
        }
    }

}
