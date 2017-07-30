package com.testing.calculator;

/**
 * Created by Pratik Ambani on 12/02/2017.
 */
public class MathApplication {

    private CalculatorService calculatorService;

    public MathApplication(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public void setCalculatorService(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public double add(double firstVal, double secondVal) {
        return calculatorService.add(firstVal, secondVal);
    }

    public double sub(double firstVal, double secondVal) {
        return calculatorService.sub(firstVal, secondVal);
    }

    public double mul(double firstVal, double secondVal) {
        return calculatorService.mul(firstVal, secondVal);
    }

    public double div(double firstVal, double secondVal) {
        return calculatorService.div(firstVal, secondVal);
    }

}
