public class Rectangle {
    private double width = 1;
    private double height = 1;

    public Rectangle() {
    }

    /** Construct a rectangle with specified width and height */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    /** Return width */
    public double getArea() {
        return (width * height);
    }

    /** Return height */
    public double getPerimeter() {
        return (2 * (width + height));
    }
}
