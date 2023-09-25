import java.util.Scanner;

/*
A.Matos
Week 6 Project 5:

(Format an integer)
Write a method with the following header to format the integer with the specified width.
public static String format(int number, int width)

The method returns a string for the number with one or more prefix 0s. The size of the string is the width.

For example,
format(34, 4) returns 0034
format(34, 5) returns 00034

If the number is longer than the width, the method returns the string representation for the number.
For example,
format(34, 1) returns 34

Write a test program that prompts the user to enter a number and its width and displays a string returned by invoking
format(number, width).

Sample Run
Enter an Integer: 34
Enter the width: 5
The formatted number is 00034

Class Name: Exercise06_37
 */
public class Exercise06_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int width;

        System.out.print("Enter an Integer: ");
        number = input.nextInt();

        System.out.print("Enter the width: ");
        width = input.nextInt();

        System.out.println("The formatted number is " + format(number, width));

        input.close();

    }

    public static String format(int number, int width) {
        // Convert the number to a string.
        String numberAsString = Integer.toString(number);

        // If the number is longer than the requested width, return the string representation of the number.
        if (numberAsString.length() > width) {
            return numberAsString;
        }

        // If the number is shorter than the width, pad the front of the string with 0 until it is the correct length.
        while (numberAsString.length() < width) {
            // As a safety precaution, test that the length of the string is less than Integer.MAX_VALUE (the maximum
            // length of a string in Java) before adding a 0 to the front of the string.  If the string is that long,
            // break out of the loop.
            // (This is to prevent an infinite loop... although I don't think anyone would be patient enough to wait
            // until the program gets to that length of a string.)
            if (numberAsString.length() < Integer.MAX_VALUE) {
                numberAsString = "0" + numberAsString;
            } else {
                break;
            }
        }

        // Return the string representation of the number.
        return numberAsString;
    }
}
