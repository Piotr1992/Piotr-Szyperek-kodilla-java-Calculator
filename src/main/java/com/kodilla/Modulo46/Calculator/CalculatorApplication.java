package com.kodilla.Modulo46.Calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

    void add(double x, double y) {
        System.out.println("Sum = " + (x+y));
    }

    void subtract(double x, double y) {
        System.out.println("Difference = " + (x-y));
    }

    public static void main(String[] args) {

        System.out.println("main = ");

    }

}
