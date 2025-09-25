package com.pecuaria.application.controller;

import com.pecuaria.application.Service.UserService;
import com.pecuaria.application.model.UserEntity;
import com.pecuaria.application.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//Avisa o Spring que a classe é um controlador
@RestController
//Caminho do LocalHost
@RequestMapping("/user_list")
public class UserController {
    @Autowired
    UserService userService;
    //Metodo Post
    @PostMapping
    //Pega o BodyJson enviado na requisição '@RequestBody' e cria um novo User na tabela 'userEntity',
    public UserEntity createUser(@RequestBody UserEntity userEntity) {
        return userService.createUser(userEntity);
    }
    @GetMapping
    public List<UserEntity> userEntityList() {
        return userService.listarUser();
    }
    @DeleteMapping("/{id}")
    public void deleteUserbyId(@PathVariable Long id) {
        userService.deleteUserByID(id);
    }

    @GetMapping("/{id}")
    public Optional<UserEntity> getUserbyid(@PathVariable Long id) {
        return userService.listarUserID(id);
    }

    @PutMapping("/{id}")
    public UserEntity atualizarUser(@RequestBody UserEntity userEntity, @PathVariable Long id) {
        return userService.atualizarUser(id, userEntity);
    }

}
