package com.mahabir;

public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

//    setting the value of the firstNumber
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

//    getting the value of the firstNumber
    public double getFirstNumber(){
        return this.firstNumber;
    }

    //    setting the value of the secondNumber
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    //    getting the value of the secondNumber
    public double getSecondNumber(){
        return this.secondNumber;
    }
// getting the sum of the first and second numbers
    public double getAdditionResult(){
        return (this.firstNumber + this.secondNumber);
    }
    // getting the difference of the first and second numbers
    public double getSubtractionResult(){
        return (this.firstNumber - this.secondNumber);
    }

    // getting the product of the first and second numbers
    public double getMultiplicationResult(){
        return (this.firstNumber * this.secondNumber);
    }

    // getting the quotient of the first and second numbers
    public double getDivisionResult(){
        if(this.secondNumber == 0){
            return 0;
        }
        return (this.firstNumber / this.secondNumber);
    }
}
