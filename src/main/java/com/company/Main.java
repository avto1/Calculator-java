package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        Scanner scanner = new Scanner(System.in);
        double firstElement = scanner.nextDouble();
        char system = scanner.next().charAt(0);
        double secondElement  = scanner.nextDouble();
        System.out.println(calculation.calculation(firstElement, system,secondElement));

    }
}
