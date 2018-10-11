package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean isRepeat = true;
        String operation = "";
        Scanner sc = new Scanner(System.in);

        while (isRepeat) {

            System.out.println("Please, type 1st value:");
            float value1 = sc.nextFloat();
            System.out.println("Please, type 2nd value:");
            float value2 = sc.nextFloat();

            System.out.println("Please choose operation (+, -, *, /):");
            operation = sc.next();
            Calculator calc = new Calculator(value1, value2);
            float result = 0;
            switch (operation) {
                case "+":
                    result = calc.addition();
                    break;
                case "-":
                    result = calc.subtraction();
                    break;
                case "*":
                    result = calc.multiplication();
                    break;
                case "/":
                    result = calc.division();
                    break;
            }

            System.out.println("Result is: " + result);

            String continueAnswer = "";
            System.out.println("Do you want to continue? (yes/no)");
            continueAnswer = sc.next();
            switch (continueAnswer) {
                case "yes":
                    isRepeat = true;
                    break;
                case "no":
                    isRepeat = false;
                    break;
                default:
                    System.out.println("Answer only 'yes' or 'no'");
                    break;
            }
        }
    }
}
