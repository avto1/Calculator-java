package com.company;

import com.sun.jdi.connect.IllegalConnectorArgumentsException;

public class Calculation {
    public double calculation(double firstElement, char symbol, double secondElement) {
        switch (symbol) {
            case '+':
                return firstElement + secondElement;
            case '/':
                if (secondElement == 0) try {
                    throw new IllegalArgumentException();
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                }
                return firstElement / secondElement;
            case '*':
                return firstElement * secondElement;
            case '-':
                return firstElement - secondElement;
            case '^':
                return Math.pow(firstElement, secondElement);
            case '%':
                return firstElement % secondElement;
            default:
                System.out.println("this symbol is not affected");
        }
        return -1;
    }
}
