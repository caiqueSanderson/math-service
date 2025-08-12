package com.infnet.math_service.service;

import org.springframework.stereotype.Service;

@Service
public class MathService {
    public double add(double a, double b) {
        return a + b;
    };

    public double subtract(double a, double b){
        return a - b;
    };

    public double multiply(double a, double b){
        return a * b;
    };

    public double divide(double a, double b){
        if(b == 0.0) throw new IllegalArgumentException("Divisor must not be zero.");
        return a / b;
    };

    public double power(double base, double exponent){
        return Math.pow(base,exponent);
    };
}
