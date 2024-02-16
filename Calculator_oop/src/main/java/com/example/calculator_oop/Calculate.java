package com.example.calculator_oop;

public class Calculate {
    public float calculateBinaryNumber(float number1,float number2,String operator){
        switch (operator) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            case "%":
                return number1 % number2;
            case "/":
                if(number2==0)
                    return 0;
                return number1 / number2;
            default:
                break;
        }
        return 0;
    }
    public float calculateUnaryNumber(float number1,String operator){
        switch (operator) {
            case "sin":
                return (float)Math.sin(number1);
            case "cos":
                return (float)Math.cos(number1);
            case "tan":
                return (float)Math.tan(number1);
            case "e^x":
                return (float) Math.exp(number1);
            case "x^2":
                return number1*number1;
            case "x^3":
                return number1*number1*number1;
            default:
                break;
        }
        return 0;
    }

}
