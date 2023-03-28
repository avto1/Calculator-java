package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        Scanner scanner = new Scanner(System.in);

        //first element
        double firstElement = scanner.nextDouble();

        //symbol
        char system = scanner.next().charAt(0);

        //second element
        double secondElement  = scanner.nextDouble();

        //result
        System.out.println(calculation.calculation(firstElement, system,secondElement));

    }
}
