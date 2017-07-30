package com.testing.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

/**
 * Created by Pratik Ambani on 12/02/2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTest {

    CalculatorService calculatorService = mock(CalculatorService.class);

    @InjectMocks
    MathApplication mathApplication = new MathApplication(calculatorService);


    @Test
    public void testAdd() {
        when(calculatorService.add(10, 20)).thenReturn(30.00);
        Assert.assertEquals(mathApplication.add(10, 20), 30.00, 0.001);

        //ensures whether add is called or not
        verify(calculatorService).add(10, 20);


        when(calculatorService.sub(20, 10)).thenReturn(10.00);
        Assert.assertEquals(mathApplication.sub(20, 10), 10.00, 0.001);
        Assert.assertEquals(mathApplication.sub(20, 10), 10.00, 0.001);
        verify(calculatorService, times(2)).sub(20, 10);


        verify(calculatorService, never()).div(20, 10);


        verify(calculatorService, atLeastOnce()).add(10, 20);

        verify(calculatorService, atLeast(2)).sub(20, 10);

//        verify(calculatorService, atMost(1)).add(10, 20);


 //       doThrow(ArithmeticException.class).when(calculatorService).div(20, 0);
//        Assert.assertEquals(mathApplication.div(20, 0), 20, 0.001);


        //given
        given(calculatorService.add(20, 10)).willReturn(30.00);

        //when
        double result = calculatorService.add(20, 10);

        //then
        Assert.assertEquals(result, 30.00, 0.01);
    }
}
