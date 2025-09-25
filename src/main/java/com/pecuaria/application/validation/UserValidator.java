package com.pecuaria.application.validation;

import com.pecuaria.application.model.UserEntity;

import java.util.Optional;

public class UserValidator {
    public static void validarUser(Optional<UserEntity> userEntityValidation){
        //se o objeto no banco estiver vazio->
        if (userEntityValidation.isEmpty()) {
            throw new RuntimeException("Usuario Inexistente");
        }
    }
    public static void validarCampos(UserEntity userEntity){
        if(userEntity.getName().isEmpty() || userEntity.getCpf().isEmpty()){
            throw new RuntimeException("Inserir campos!");
        }
    }
}
