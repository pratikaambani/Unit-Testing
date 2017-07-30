package com.testing.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;

/**
 * Created by Pratik Ambani on 12/02/2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTest2 {

    private CalculatorService calculatorService;

    private MathApplication mathApplication;

    @Before
    public void setUp() {
        calculatorService = mock(CalculatorService.class);
        mathApplication = mock(MathApplication.class);


        Calculator calculator = new Calculator();
        calculatorService = spy(calculator);

        mathApplication.setCalculatorService(calculatorService);

    }

    @Test
    public void testAdd() {
        Assert.assertEquals(mathApplication.add(10, 20), 30.00, 0.001);
    }

    class Calculator implements CalculatorService {

        @Override
        public double add(double firstVal, double secondVal) {
            return firstVal + secondVal;
        }

        @Override
        public double sub(double firstVal, double secondVal) {
            return firstVal - secondVal;
        }

        @Override
        public double mul(double firstVal, double secondVal) {
            return firstVal * secondVal;
        }

        @Override
        public double div(double firstVal, double secondVal) {
            return firstVal / secondVal;
        }
    }
}
