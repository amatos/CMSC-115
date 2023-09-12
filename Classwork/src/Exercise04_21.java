/*
    A.Matos
    Week 4 project 21

    (Check SSN)
    Write a program that prompts the user to enter a Social Security Number in the format
    DDD-DD-DDDD, where D is a digit.
    Your program should check whether the input is valid.
 */

import java.util.Scanner;

public class Exercise04_21 {
    public static void main(String[] args) {
        boolean isSSN = true;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a SSN: ");
        String providedValue = input.nextLine();

        int len = providedValue.length();
        if (len != 11) {
            isSSN = false;
        }

        for (int counter = 0; counter < len; counter++) {
            if ((counter == 3) || (counter == 6)) {
                if (!providedValue.substring(counter, counter + 1).equals("-")) {
                    isSSN = false;
                }
            } else {
                if (!Character.isDigit(providedValue.charAt(counter))) {
                    isSSN = false;
                }
            }
        }

        if (!isSSN) {
            System.out.println(providedValue + " is an invalid social security number");
        }
        if (isSSN) {
            System.out.println(providedValue + " is a valid social security number");
        }
    }
}
