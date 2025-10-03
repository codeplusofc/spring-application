package com.pecuaria.application.exception;

import java.time.LocalDateTime;

public class ApiError {
    //entidade pra tratar os Errros
    //criar corpo de erro mostrado pro usuario

    //salva o nmro do Erro (404,500, -901...)
    private int statusCode;
    //msg de erro pro usuario
    private String error;
    //variavel de numeros -> (pega a data e hora da maquina da pessoa)
    private LocalDateTime timestamp;


    //Nome do Contreutor deve ser o mesmo da Classe
    //AO criar um OBJ usando essa classe, o Construtor ira inicializar o OBJ com as variaveis do Parametro
    public ApiError(int statusCode, String error, LocalDateTime timestamp) {
        this.statusCode = statusCode;
        this.error = error;
        this.timestamp = timestamp;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
