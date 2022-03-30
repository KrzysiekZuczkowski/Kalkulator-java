package com.example.kalkulator;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtracts(double a, double b) {
        return a - b;
    }

    public static void main(String[] args) {
        int a = -7;
        int b = 3;
        System.out.println("addition result " + new Calculator().add(a, b));
        System.out.println("\nsubtraction result " + new Calculator().subtracts(a, b));
    }
}

