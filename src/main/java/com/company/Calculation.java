package com.company;

public class Calculation {
    public double calculation(double firstElement, char symbol, double secondElement) {
        switch (symbol) {
            case '+':
                return firstElement + secondElement;
            case '/':
                if (secondElement == 0) return 0;
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
