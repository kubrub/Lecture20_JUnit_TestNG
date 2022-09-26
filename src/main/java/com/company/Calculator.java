package com.company;

public class Calculator {
    private int result;
    public static float addition(int num1, int num2){
        return num1+num2;
    }
    public static float subtraction(int num1, int num2){
        return num1 - num2;
    }
    public static float multiplication(int num1, int num2){
        return num1*num2;
    }
    public static float division(int num1, int num2){
        if (num2==0){
            return 0;}
        else{
            return (float)num1/num2;}
    }
}
