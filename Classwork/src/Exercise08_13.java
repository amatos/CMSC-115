/*
    A.Matos
    Chapter 8 Project 3:

    (Locate the largest element)
    Write the following method that returns the location of the largest element in a two-dimensional array.
    public static int[] locateLargest(double[][] a)
    The return value is a one-dimensional array that contains two elements. These two elements indicate the
    row and column indices of the largest element in the two-dimensional array. If there are more than one
    largest element, return the smallest row index and then the smallest column index.
    Write a test program that prompts the user to enter a two-dimensional array and displays the location
    of the largest element in the array.

    Sample Run
    Enter the number of rows and columns of the array: 3 4
    Enter the array:
    23.5 35 2 10
    4.5 3 45 3.5
    35 44 5.5 9.6
    The location of the largest element is at (1, 2)

    Class Name: Exercise08_13
*/

import java.util.Scanner;

public class Exercise08_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns of the array: ");
        int rows = input.nextInt();
        int columns = input.nextInt();

        System.out.println("Enter the array:");
        double[][] array = new double[rows][columns];
        for (int row=0; row < array.length; row++) {
            for (int column=0; column < array[row].length; column++) {
                array[row][column] = input.nextDouble();
            }
        }

        int[] resultArray = locateLargest(array);
        System.out.println("The location of the largest element is at (" + resultArray[0] + ", " + resultArray[1] + ")");
    }

    public static int[] locateLargest(double[][] a) {
        int[] largest = new int[2];
        double largestEntry = a[0][0];
        for (int row=0; row < a.length; row++) {
            for (int column=0; column < a[row].length; column++) {
                if (a[row][column] > largestEntry) {
                    largestEntry = a[row][column];
                    largest[0] = row;
                    largest[1] = column;
                }
            }
        }
        return largest;
    }
}
