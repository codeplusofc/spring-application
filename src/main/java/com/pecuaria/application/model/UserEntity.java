package com.pecuaria.application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserEntity {
    //Mapeamentos pra JPA reconhecer
    @Id
    //Gerando um id automaticamente sequencial
    @GeneratedValue(strategy = GenerationType.AUTO)
    //Chave ID do tipo Long --> Armazena valores maiores (trilhões...) igual Int porem armazena mais
    public Long id;
    public String name;
    public String cpf;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
