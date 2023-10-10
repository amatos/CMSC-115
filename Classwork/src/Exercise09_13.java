/*
(The Location class)
Design a class named Location for locating a maximal value and its location in a two-dimensional array.
The class contains public data fields row, column, and maxValue that store the maximal value and its indices in a two-dimensional array with row and column as int types and maxValue as a double type.

Write the following method that returns the location of the largest element in a two-dimensional array:
public static Location locateLargest(double[][] a)
The return value is an instance of Location.

Write a test program that prompts the user to enter a two-dimensional array and displays the location of the largest element in the array.  If there are more than one largest element, find the location with the smallest row index and then the smallest column index.

Sample Run
Enter the number of rows and columns in the array:  3 4
Enter the array:
23.5  35  2  10
4.5   3  45  3.5
35   44  5.5  9.6
The largest element is 45, located at (1, 2)

Class Name: Exercise09_13
 */

public class Exercise09_13 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter the number of rows and columns in the array:  ");
        int rows = input.nextInt();
        int columns = input.nextInt();
        double[][] array = new double[rows][columns];

        System.out.println("Enter the array:");
        for (int counter1 = 0; counter1 < array.length; counter1++) {
            for (int counter2 = 0; counter2 < array[counter1].length; counter2++)
                array[counter1][counter2] = input.nextDouble();
        }

        Location.locateLargest(array);
        System.out.println("The largest element is " + Location.getMaxValue() + ", located at (" + Location.getRow()
                + ", " + Location.getColumn() + ")");
    }
}
