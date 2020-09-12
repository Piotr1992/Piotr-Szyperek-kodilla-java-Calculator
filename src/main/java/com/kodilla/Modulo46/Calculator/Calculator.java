package com.kodilla.Modulo46.Calculator;

public class Calculator {

    public void add(double x, double y) {
        System.out.println("Sum = " + (x + y));
    }

    public void subtract(double x, double y) {
        System.out.println("Difference = " + (x - y));
    }

    public static void main(String[] args) {

        double firstNumber = 1.23,
                secondNumber = 4.56;

        Calculator cal = new Calculator();

        cal.add(firstNumber, secondNumber);

        cal.subtract(firstNumber, secondNumber);

    }

}