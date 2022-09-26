package com.company;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @BeforeTest
    public void init() {
        calculator = new Calculator();
    }

    @Test(groups = "test")
    public void addTest1() throws InterruptedException {
        int first = 5, second = 5;
        int expectedResult = first + second;
        int actualResult = (int) calculator.addition(first, second);
        Thread.sleep(3000);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void addTest2() throws InterruptedException {
        int first = 1, second = 13;
        int expectedResult = first + second;
        int actualResult = (int) calculator.addition(first, second);
        Thread.sleep(3000);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    @Parameters({"a", "b"})
    public void addTest3(int first, int second){
        int expected = first + second;
        int actual = (int) calculator.addition(first, second);
        assertEquals(expected, actual);
    }

    @Test(groups = "test")
    public void subtractionTest1() throws InterruptedException {
        int first = 485, second = 367;
        int expectedResult = first - second;
        float actualResult = calculator.subtraction(first, second);
        Thread.sleep(3000);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void subtractionTest2() throws InterruptedException {
        int first = 843, second = 1283;
        int expectedResult = first - second;
        float actualResult = calculator.subtraction(first, second);
        Thread.sleep(3000);
        assertEquals(actualResult, expectedResult);
    }

    @Test(groups = "test")
    public void multiplication1() throws InterruptedException {
        int first = 245, second = 8;
        int expectedResult = first * second;
        int actualResult = (int) calculator.multiplication(first, second);
        Thread.sleep(3000);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void multiplicationTest2() throws InterruptedException {
        int first = 2, second = 78;
        int expectedResult = first * second;
        int actualResult = (int) calculator.multiplication(first, second);
        Thread.sleep(3000);
        assertEquals(actualResult, expectedResult);
    }


    @Test(groups = "test")
    public void divisionTest1() throws InterruptedException {
        int first = 2543, second = 100;
        int expectedResult = first / second;
        int actualResult = (int) calculator.division(first, second);
        Thread.sleep(3000);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void divisionTest2() throws InterruptedException {
        int first = 12, second = 60;
        int expectedResult = first / second;
        int actualResult = (int) calculator.division(first, second);
        Thread.sleep(3000);
        assertEquals(actualResult, expectedResult);
    }
}
