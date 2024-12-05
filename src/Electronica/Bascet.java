package Electronica;

public class Bascet {
    protected Electronica[] basket;
    protected int count;

    public Bascet(int size) {
        basket = new Electronica[size];
        count = 0;
    }

    public void displayItems() {
        if (count == 0) {
            System.out.println("Basket is empty.");
            return;
        }

        System.out.println("Items in the basket:");
        for (int i = 0; i < count; i++) {
            Electronica item = basket[i];
            if (item instanceof Gift) {
                System.out.println("- Gift: " + item.type + " (" + item.brand + ") $" + item.price);
            } else {
                System.out.println("- " + item.type + " (" + item.brand + ") $" + item.price);
            }
        }
    }

    public void addItem(Electronica item) {
        if (item == null) {
            System.out.println("Cannot add null item.");
            return;
        }

        if (count >= basket.length) {
            System.out.println("Basket is full. Cannot add more items.");
            return;
        }

        for (int i = 0; i < count; i++) {
            if (basket[i] != null && basket[i].id.equals(item.id)) {
                System.out.println("This item is already in the basket: " + item.id);
                return;
            }
        }

        basket[count] = item;
        count++;
        System.out.println("Added item to basket: " + item.type + " (" + item.brand + ") $" + item.price);
    }

    public double checkout() {
        double total = 0;
        int giftCount = 0;

        // Calculate total price and count gifts
        for (int i = 0; i < count; i++) {
            if (basket[i] instanceof Gift && isAvailableGift(basket[i])) {
                giftCount++;
            } else {
                total += basket[i].price; // Add price of non-gift items
            }
        }
        System.out.println("Your total price is " + total);
        return total;
    }

    public boolean isAvailableGift(Electronica gift) {
        for (Electronica e : basket) {
            if (e != null) {
                if (e.type == TypesElectronic.NOTEBOOK && gift.type == TypesElectronic.MOBILE) {
                    System.out.println("Available gift: Mobile for Notebook");
                    return true;
                } else if (e.type == TypesElectronic.TV && gift.type == TypesElectronic.HAIRDRYER) {
                    System.out.println("Available gift: Hairdryer for TV");
                    return true;
                }
            }
        }
        System.out.println("Not available gift");
        return false;
    }
}