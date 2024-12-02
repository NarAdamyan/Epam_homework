package Electronica;

public class Shop {
    protected String name;
    protected Electronica[] electronica; // Inventory of the shop
    protected Bascet bascet; // Basket for managing items

    // Constructor
    public Shop(String name, Electronica[] electronica) {
        this.name = name;
        this.electronica = electronica;
        this.bascet = new Bascet(10); // Initialize the basket with a capacity
    }

}
