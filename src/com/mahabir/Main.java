package com.mahabir;

public class Main {

    public static void main(String[] args) {
//        created the object of the class
        SimpleCalculator calculator = new SimpleCalculator();
//        passing in the value of the firstNumber
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add = " + calculator.getAdditionResult());
        System.out.println("subtract = " + calculator.getSubtractionResult());

        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply = " + calculator.getMultiplicationResult());
        System.out.println("divide = " + calculator.getDivisionResult());

    }

}
