package com.pecuaria.application.service;

import com.pecuaria.application.model.UserEntity;
import com.pecuaria.application.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.pecuaria.application.validation.UserValidator.validarCampos;
import static com.pecuaria.application.validation.UserValidator.validarUser;

//

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public UserEntity createUser(UserEntity userEntity){
        validarCampos(userEntity);
        return userRepository.save(userEntity);
    }
    public List<UserEntity> listarUser(){
        return userRepository.findAll();
    }
    public Optional<UserEntity> listarUserID(Long id){
        return userRepository.findById(id);
    }
    public void deleteUserByID(Long id){
        userRepository.deleteById(id);
    }
    public UserEntity atualizarUser(Long id, UserEntity userEntity){
        var userBanco = userRepository.findById(id);
        //validação -> Exception
        validarUser(userBanco);

        userBanco.get().setName(userEntity.getName());
        userBanco.get().setCpf(userEntity.getCpf());
        //salvando no banco o usuario atualizado
        return userRepository.save(userBanco.get());
    }
}
