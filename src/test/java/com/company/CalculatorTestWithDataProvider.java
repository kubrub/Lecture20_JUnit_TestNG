package com.company;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class CalculatorTestWithDataProvider implements CalculatorDataProvider{
    private Calculator calculator;

    @BeforeTest
    public void init() {
        calculator = new Calculator();
    }

    @Test(dataProvider = "dataProviderAddition")
    void addTest(int first, int second, int result){
        Assert.assertEquals(calculator.addition(first, second), result);
    }
    @Test(dataProvider = "dataProviderSubtraction")
    void subTest(int first, int second, int result){
        Assert.assertEquals(calculator.subtraction(first, second), result);
    }
    @Test(dataProvider = "dataProviderMultiplication")
    void mulTest(int first, int second, int result){
        Assert.assertEquals(calculator.multiplication(first, second), result);
    }
    @Test(dataProvider = "dataProviderDivision")
    void divTest(int first, int second, int result){
        Assert.assertEquals(calculator.division(first, second), result);
    }
}
