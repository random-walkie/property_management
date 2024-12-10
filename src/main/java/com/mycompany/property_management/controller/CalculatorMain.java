package com.mycompany.property_management.controller;

/*
This class is just to illustrate what we are trying to do in CalculatorController, with @RequestParam
 */
public class CalculatorMain {
    public static void main(String[] args) {
        CalculatorController controller = new CalculatorController();
        Double result = controller.add(14.5, 8.5);
        System.out.println(result);
    }
}
