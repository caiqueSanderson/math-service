package com.infnet.math_service.dto;

public class OperationResponse {
    private String operation;
    private Double a;
    private Double b;
    private Double result;

    public OperationResponse(){};

    public OperationResponse(String operation,Double a,Double b,Double result) {
        this.operation = operation;
        this.a = a;
        this.b =b;
        this.result = result;
    }

    public String getOperation() {return operation;}
    public void setOperation(String operation) {this.operation = operation;}

    public Double getA() {return a;}
    public void setA(Double a) {this.a = a;}

    public Double getB() {return b;}
    public void setB(Double b) {this.b = b;}

    public Double getResult() {return result;}
    public void setResult(Double result) {this.result = result;}
}
