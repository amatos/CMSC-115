/*
    A.Matos
    Chapter 7 Project 2:
    (Count occurrence of numbers)
    Write a program that reads the integers between 1 and 100 and counts the occurrences of each.
    Assume the input ends with 0.

    Sample Run
    Enter the integers between 1 and 100: 2 5 6 5 4 3 23 43 2 0
    2 occurs 2 times
    3 occurs 1 time
    4 occurs 1 time
    5 occurs 2 times
    6 occurs 1 time
    23 occurs 1 time
    43 occurs 1 time

    Note that if a number occurs more than one time, the plural word “times” is used in the output. Also note that
    the numbers are displayed in increasing order.

    Class Name: Exercise07_03
 */

import java.util.Scanner;

public class Exercise07_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the integers between 1 and 100: ");
        String providedValue = input.nextLine();

        int[] numberList;
        numberList = new int[101];

        for (String s : providedValue.split(" ")) {
            numberList[Integer.parseInt(s)] += 1;
        }

        for (int counter = 1; counter <= 100; counter++) {
            if (numberList[counter] > 0) {
                String timeSingularOrPlural = " time";
                if (numberList[counter] > 1) {
                    timeSingularOrPlural = timeSingularOrPlural + 's';
                }
                System.out.println(counter + " occurs " + numberList[counter] + timeSingularOrPlural);
            }
        }
    }
}
