/*
    A.Matos
    Week 3 Project 5:

    (Geometry: point in a rectangle?)
    Write a program that prompts the user to enter a point (x, y)
    and checks whether the point is within the rectangle centered at(0, 0) with width 10 and height 5.
    For example, (2, 2) is inside the rectangle and (6, 4) is outside the rectangle.
    (Hint: A point is in the rectangle if its horizontal distance to (0, 0) is less than or equal to
    10 / 2 and its vertical distance to (0, 0) is less than or equal to 5.0 / 2. Test your program to cover all cases.)
 */

import java.util.Scanner;

public class Exercise03_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        String providedValue = input.nextLine();

        // Extract the two values as doubles from the single inputted line.  Use " " to split the values.
        int counter = 0;
        double x = 0.0;
        double y = 0.0;
        for (String s : providedValue.split(" ")) {
            if (counter == 0) {
                x = Double.parseDouble(s);
            } else if (counter == 1) {
                y = Double.parseDouble(s);
            }
            counter++;
        }

        // Call insideRectangle() to get whether the points are inside the rectangle.
        boolean isInside = new Exercise03_23().insideRectangle(x, y);
        /*
        Print out the results.
        The wording is almost identical between the two results, except for a "not" when the value is not inside\
        the rectangle. So, I split the output out, inserting "not " in case of a false result.
        */
        System.out.print("Point (" + x + ',' + y + ") is ");
        if (!isInside) {
            System.out.print("not ");
        }
        System.out.println("in the rectangle");

        input.close();
    }

    public boolean insideRectangle (double x, double y) {
        // The rectangle is a 10,5 rectangle centered on the origin.
        // Define the min/max points:
        double minX = -5.0;
        double minY = -2.5;
        double maxX = 5.0;
        double maxY = 2.5;

        // If x is inside the min/max points AND y is inside the min/max points, return true.  Otherwise, return false.
        if ((x >= minX) && (x <= maxX)) {
            if ((y >= minY) && (y <= maxY)) {
                return true;
            }
        }
        return false;
    }
}
