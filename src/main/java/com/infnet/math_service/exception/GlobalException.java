package com.infnet.math_service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Map;

@ControllerAdvice
public class GlobalException {
    @ExceptionHandler(DivideByZeroException.class)
    public ResponseEntity<Map<String,String>> handleDivideByZero(DivideByZeroException ex){
        return ResponseEntity.badRequest()
                .body(Map.of("error", "DIVIDE_BY_ZERO", "message", ex.getMessage()));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String,String>> handleGeneral(Exception ex){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(Map.of("error","INTERNAL_ERROR","message", ex.getMessage()));
        }
    }

