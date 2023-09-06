/*
    A.Matos
    Week 3 Project 3:

    (Find the number of days in a month)
    Write a program that prompts the user to enter the month and year and displays the number of days in the month.
    For example,
    If the user entered month 2 and year 2012, the program should display that
    February 2012 has 29 days.
    If the user entered month 3 and year 2015, the program should display that
    March 2015 has 31 days.
 */

import java.util.Scanner;

public class Exercise03_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a month in the year (e.g., 1 for Jan): ");
        int month = input.nextInt();
        System.out.println();

        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.println();

        switch (month) {
            case 1:
                System.out.println("January " + year + " has 31 days");
                break;
            case 2:
                /*
                Leap year calculation:
                A leap year must be divisible by 4, unless it's the start of a century.  If so, it must be divisible
                by 400. (e.g. Feb 2000 was a leap year, Feb 1900 was not.)
                 */
                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0) {
                            System.out.println("February " + year + " has 29 days");
                        } else {
                            System.out.println("February " + year + " has 28 days");
                        }
                    } else {
                        System.out.println("February " + year + " has 29 days");
                    }
                } else {
                    System.out.println("February " + year + " has 28 days");
                }
                break;
            case 3:
                System.out.println("March " + year + " has 31 days");
                break;
            case 4:
                System.out.println("April " + year + " has 30 days");
                break;
            case 5:
                System.out.println("May " + year + " has 31 days");
                break;
            case 6:
                System.out.println("June " + year + " has 30 days");
                break;
            case 7:
                System.out.println("July " + year + " has 31 days");
                break;
            case 8:
                System.out.println("August " + year + " has 31 days");
                break;
            case 9:
                System.out.println("September " + year + " has 30 days");
                break;
            case 10:
                System.out.println("October " + year + " has 31 days");
                break;
            case 11:
                System.out.println("November " + year + " has 30 days");
                break;
            case 12:
                System.out.println("December " + year + " has 31 days");
                break;

        }
    input.close();
    }
}
