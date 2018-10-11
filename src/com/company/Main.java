package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean isRepeat = true;
        String operation = "";
        Scanner sc = new Scanner(System.in);

        while (isRepeat){

            System.out.println("Please, type 1st value:");
            float value1 = sc.nextFloat();
            System.out.println("Please, type 2nd value:");
            float value2 = sc.nextFloat();

            System.out.println("Please choose operation (+, -, *, /):");
            operation = sc.next();
            Calculator calc = new Calculator(value1, value2);
            float result = 0;
            switch (operation){
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

            String continue_answer = "";
            do {
                System.out.println("Do you want to continue? (yes/no)");
                continue_answer = sc.next();
                if (continue_answer.equals("no")) {
                    isRepeat = false;
                } else if (!continue_answer.equals("yes")) {
                    System.out.println("Answer only 'yes' or 'no'");
                }
            } while (!continue_answer.equals("yes") && !continue_answer.equals("no"));

        }
    }
}
