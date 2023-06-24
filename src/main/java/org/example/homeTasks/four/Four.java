package org.example.homeTasks.four;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        // Home task four

        System.out.println("Enter two numbers: ");
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan1.nextInt();
        int additionResult = addition(a, b);
        int multiplicationResult = multiplication(a, b);
        int subtractionResult = subtraction(a, b);
        double divisionResult = division(a, b);

        System.out.println("Addition result: " + additionResult);
        System.out.println("Multiplication result: " + multiplicationResult);
        System.out.println("Subtraction result: " + subtractionResult);
        System.out.println("Division result: " + divisionResult);
    }

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static double division(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return (double) a / b;
    }
}
