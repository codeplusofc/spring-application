package com.pecuaria.application.exception;

public class BadRequestException extends RuntimeException{
    //RuntimeException => transforma a classe em classe de EXEÇÃO
    public BadRequestException(String message) {
        super(message);
    }
    //
}