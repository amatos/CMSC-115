/*
    A.Matos
    Chapter 7 Project 5:

    (Sorted?)
    Write the following method that returns true if the list is already sorted in increasing order.
    public static boolean isSorted(int[] list)
    Write a test program that prompts the user to enter a list and displays whether the list is sorted or not.
    Here is a sample run. Note that the first number in the input indicates the number of the elements in
    the list. This number is not part of the list.

    Sample Run 1
    Enter list: 8 10 1 5 16 61 9 11 1
    The list is not sorted

    Sample Run 2
    Enter list: 10 1 1 3 4 4 5 7 9 11 21
    The list is already sorted

    Class Name: Exercise07_19
 */

import java.util.Scanner;

public class Exercise07_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list: ");
        int providedLength = input.nextInt();

        int[] list = new int[providedLength];
        for (int counter=0; counter < providedLength; counter++) {
            list[counter] = input.nextInt();
        }
        if (isSorted(list)) {
            System.out.println("The list is already sorted");
        } else {
            System.out.println("The list is not sorted");
        }
    }

    public static boolean isSorted(int[] list) {
        for (int counter=0; counter < list.length-1; counter++) {
            if (list[counter] > list[counter+1]) {
                return false;
            }
        }
        return true;
    }
}
