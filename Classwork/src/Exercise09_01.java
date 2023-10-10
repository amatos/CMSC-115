/*
(The Rectangle class)
Following the example of the Circle class in Section 9.2, design a class named Rectangle to represent a rectangle.
The class contains:
- Two double data fields named width and height that specify the width and height of the rectangle. The default values are 1 for both width and height.
- A no-arg constructor that creates a default rectangle.
- A constructor that creates a rectangle with the specified width and height.
- A method named getArea() that returns the area of this rectangle.
- A method named getPerimeter() that returns the perimeter.
Draw the UML diagram for the class and then implement the class.
Write a test program that creates two Rectangle objects—one with width 4 and height 40 and the other with width 3.5 and height 35.9.
Display the width, height, area, and perimeter of each rectangle in this order.

Sample Run
The area of a rectangle with width 4.0 and height 40.0 is 160.0
The perimeter of a rectangle is 88.0
The area of a rectangle with width 3.5 and height 35.9 is 125.64999999999999
The perimeter of a rectangle is 78.8

Class Name: Exercise09_01
 */

public class Exercise09_01 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        System.out.println("The area of a rectangle with width " + rectangle1.getWidth() + " and height " + rectangle1.getHeight() + " is " + rectangle1.getArea());
        System.out.println("The perimeter of a rectangle is " + rectangle1.getPerimeter());
        System.out.println("The area of a rectangle with width " + rectangle2.getWidth() + " and height " + rectangle2.getHeight() + " is " + rectangle2.getArea());
        System.out.println("The perimeter of a rectangle is " + rectangle2.getPerimeter());
    }
}
