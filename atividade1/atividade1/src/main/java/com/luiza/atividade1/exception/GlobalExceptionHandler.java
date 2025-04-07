package com.luiza.atividade1.exception;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler (IllegalArgumentException.class)
    public ResponseEntity<Map<String, Object>> handleIllegalArgumentException(IllegalArgumentException erro) {
       return ResponseEntity
       .status(HttpStatus.CONFLICT) 
       .body(Map.of("Mensagem", erro.getMessage()));
        
    }

    @ExceptionHandler(EmailJaCadastradoException.class)
    public ResponseEntity<Map<String, Object>> handleEmailJaCadastradoException(EmailJaCadastradoException erro) {
        return ResponseEntity
        .status(HttpStatus.BAD_REQUEST) 
        .body(Map.of("Mensagem", erro.getMessage()));
    }



}
