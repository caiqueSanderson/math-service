package com.infnet.math_service.dto;

public class OperationRequest  {
    private Double a;
    private Double b;
    private Double base;
    private Double exponent;

    public OperationRequest(){}

    public Double getA() {return a;}
    public void setA(Double a) {this.a = a;}

    public Double getB() {return b;}
    public void setB(Double b) {this.b = b;}

    public Double getBase() {return base;}
    public void setBase(Double base) {this.base = base;}

    public Double getExponent() {return exponent;}
    public void setExponent(Double exponent) {this.exponent = exponent;}
}
