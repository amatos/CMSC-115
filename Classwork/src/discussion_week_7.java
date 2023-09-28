import java.util.Arrays;
public class discussion_week_7 {
    public static void main(String[] args) {
        // Using a single array, we can print out a list of what fruits to get at the store
        String[] singleArray = {"Apple", "Banana", "Lemon", "Orange", "Pineapple"};
        System.out.println("Using a single array:");
        System.out.println(Arrays.toString(singleArray));

        // Using a 2d array, we can make this list into a shopping list, by listing the fruit and the quantity
        // desired
        String[][] doubleArray = {
                {"Apple", "5"},
                {"Banana", "12"},
                {"Lemon", "7"},
                {"Orange", "3"},
                {"Pineapple", "1"}
        };
        System.out.println();
        System.out.println("Using a double array:");
        System.out.println(Arrays.deepToString(doubleArray));
        System.out.println();

        // If we wanted to get fancy, we could use a 3d array to list the fruit, the quantity, and the price per
        // fruit, which would allow us to calculate the cost (minus tax) of the shopping list.
        String[][] tripleArray = {
                {"Apple", "5", "0.50"},
                {"Banana", "12", "0.08"},
                {"Lemon", "7", "0.8"},
                {"Orange", "3", "0.75"},
                {"Pineapple", "1", "3.50"}
        };
        double totalCost = 0;
        for (String[] fruit : tripleArray) {
            totalCost += Integer.parseInt(fruit[1]) * Double.parseDouble(fruit[2]);
            if (Integer.parseInt(fruit[1]) > 1) {
                fruit[0] = fruit[0] + "s";
            }
            System.out.println(fruit[1] + " " + fruit[0] + " at $" + fruit[2] + " each");
        }
        System.out.println("Total cost: $" + totalCost);
    }
}
