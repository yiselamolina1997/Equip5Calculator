package com.example.calculator;

public class Operaciones {
    private final int num1;
    private final int num2;

    public Operaciones(int n1, int n2){
        this.num1 = n1;
        this.num2 = n2;
    }

    public int Suma(){
        return num1 + num2;
    }
    public int Resta(){
        return num1 - num2;
    }
    public int Division(){
        return num1 / num2;
    }
    public int Multiplicacion(){
        return num1 * num2;
    }
}
