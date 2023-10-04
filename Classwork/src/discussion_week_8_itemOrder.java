public class discussion_week_8_itemOrder {
    private String itemName;
    private double itemPrice;
    private int itemQuantity;

    public discussion_week_8_itemOrder(String itemName, double itemPrice, int itemQuantity) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }

    public void displayOrder() {
        // Display the item name, price, quantity, and subtotal, nicely formatted.
        // Personal pet peeve, I've split the println into 3 separate lines to make it easier to read without having
        // to scroll horizontally.
        // Each entry is padded out to 10 characters, except for ItemPrice, which is padded out to 20.
        System.out.println(String.format("%10s", itemName) + String.format("%10s", "$" + String.format("%.2f", itemPrice))
                + String.format("%10s", itemQuantity) + String.format("%20s", " Item Price: $"
                + String.format("%.2f", (itemPrice * itemQuantity))));

    }

    public static void main(String[] args) {
        // Borrowing from Week 7's content, I'm using the same array of items, just stored in a class instead of an array.
        discussion_week_8_itemOrder item1 = new discussion_week_8_itemOrder("Apple", 0.50, 5);
        discussion_week_8_itemOrder item2 = new discussion_week_8_itemOrder("Banana", 0.08, 12);
        discussion_week_8_itemOrder item3 = new discussion_week_8_itemOrder("Lemon", 0.8, 7);
        discussion_week_8_itemOrder item4 = new discussion_week_8_itemOrder("Orange", 0.75, 3);
        discussion_week_8_itemOrder item5 = new discussion_week_8_itemOrder("Pineapple", 3.50, 1);

        // Create an array named shoppingList to contain the items in the order.
        discussion_week_8_itemOrder[] shoppingList = {item1, item2, item3, item4, item5};

        // Print out the header of the order display
        System.out.println(String.format("%10s", "Name") + String.format("%10s", "Price")
                + String.format("%10s", "Quantity") + String.format("%20s", " Subtotal: "));
        // We also use a double to keep track of the total order cost.
        double orderTotal = 0;
        for (discussion_week_8_itemOrder item : shoppingList) {
            item.displayOrder();
            orderTotal += (item.itemPrice * item.itemQuantity);
        }
        // And lastly, print out the order total.
        System.out.println("Order Total: $" + String.format("%.2f", orderTotal));
    }
}
