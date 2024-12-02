package Electronica;

public class Bascet {
    protected Electronica[] bascet;
    protected int count = 0; // Tracks the number of items in the basket
    protected Shop shop; // Assuming this will be used later
//    protected  boolean giftAdded ; // Initialize the flag


    // Constructor to initialize the basket with a specified capacity
    public Bascet(int capacity) {
        this.bascet = new Electronica[capacity]; // Initialize the basket array
//        this.giftAdded = false; // Initialize the flag

    }

    public void addItem(Electronica item) {
        if (count >= bascet.length) {
            System.out.println("Basket is full. Cannot add more items.");
            return;
        }

        // Check if the item already exists in the basket by comparing 'id'
        for (Electronica e : bascet) {
            if (e != null && e.id.equals(item.id)) {  // Compare 'id' of non-null items
                System.out.println("This item is already in your basket."+e.id);
                return;
            }
        }

        // Add the item to the basket
        this.bascet[count] = item;
        System.out.println("Item added to the basket: " + this.bascet[count]);
        count++; // Increment the count
    }

    // Method to display all items in the basket
    public void displayBasket() {
        if (count == 0) {
            System.out.println("Basket is empty.");
            return;
        }

        System.out.println("Items in the basket:");
        for (int i = 0; i < count; i++) {
            Electronica item = bascet[i];
            if (item != null) {
                if (item.type.equals("gift")) { // Identify the gift
                    System.out.println("- Gift: " + item.type + " (" + item.type + ") $" + item.price);
                } else {
                    System.out.println("- " + item.type + " (" + item.type + ") $" + item.price);
                }
            }
        }
    }


    public void removeItem(String id) {
        boolean found = false;

        // Find the item by comparing 'id'
        for (int i = 0; i < this.count; i++) {
            if (this.bascet[i] != null && this.bascet[i].id.equals(id)) {
                found = true;

                // Save the item that will be removed
                Electronica removedItem = this.bascet[i];

                // Shift elements to the left to fill the gap
                for (int j = i; j < this.count - 1; j++) {
                    this.bascet[j] = this.bascet[j + 1];
                }

                // Clear the last element
                this.bascet[this.count - 1] = null;

                // Decrease the count
                this.count--;

                // Print the correct removed item
                System.out.println("Item removed from the basket: " + removedItem);
                break;
            }
        }

        if (!found) {
            System.out.println("Item not found in the basket.");
        }
    }



//    public int checkout() {
//        int sum = 0;
//
//        for (Electronica e : bascet) {
//            if (e != null ) { // Check for non-null elements
//                sum += e.price; // Add the price of the item
//            }
//        }
//        System.out.println("Your total price is "+sum);
//        return sum;
//
// Method to calculate the checkout price
public int checkout() {
    int sum = 0;
    boolean giftFound = false;

    for (Electronica e : bascet) {
        if (e != null) {
            // If a gift has been added, exclude its price from the total
            if (!giftFound && e.type.equals("gift")) {
                giftFound = true; // Mark gift as found
                continue; // Skip adding the gift's price
            }
            sum += e.price; // Add the price of non-gift items
        }
    }

    System.out.println("Your total price is $" + sum);
    return sum;

    }

}