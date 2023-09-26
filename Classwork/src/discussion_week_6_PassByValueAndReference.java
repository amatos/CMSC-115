public class discussion_week_6_PassByValueAndReference {
    int x = 1;
    int y = 2;

    public static void main(String[] args) {

        // Create an instance of the class
        // example.x and example.y will be picked up from the class definition above, i.e. 1 and 2.
        discussion_week_6_PassByValueAndReference example = new discussion_week_6_PassByValueAndReference();

        // In passByValue, we are passing copies of the values in example.x and example.y
        System.out.println("Pass-by-value example");
        System.out.println("Before the method call: " + example.x + ", " + example.y);
        passByValue(example.x, example.y);
        System.out.println("After the method call: " + example.x + ", " + example.y);

        System.out.println();

        // In passByReference, we are passing a copy of the reference to the object example, which is to say,
        // the copy of the address in memory that points to the object example.
        // This isn't really passing-by-reference, but it's the closest we can get in Java.
        System.out.println("Pass-by-reference example");
        System.out.println("Before the method call: " + example.x + ", " + example.y);
        passByReference(example);
        System.out.println("After the method call: " + example.x + ", " + example.y);
    }

    public static void passByValue(int x, int y) {
        // x and y are copies of the values of example.x and example.y, so any changes to it here won't impact
        // the values of example.x and example.y in the main method.
        x = 65;
        y = 34446;
        System.out.println("During value being passed through method: (" + x + "," + y + ")");
    }

    public static void passByReference(discussion_week_6_PassByValueAndReference example) {
        // Here, example is a reference to the object created in the main method, so any changes to it here will impact
        // example in the main method as well.
        // ALTHOUGH, technically, what is really happening is that we are passing a copy of the reference to the object
        // example, so any changes to example.x or example.y are changes to the object that example is pointing to.
        example.x = 1101;
        example.y = 314;
        System.out.println("Before value is passed through method: (" + example.x + "," + example.y + ")");
    }
}
