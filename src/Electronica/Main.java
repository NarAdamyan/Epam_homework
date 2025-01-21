package Electronica;

import static Electronica.TypesElectronic.*;

public class Main {
    public static void main(String[] args) {
        Bascet basket = new Bascet(10);
        Client client1 = new Client("N", "Ad", "123456789", 400);

        Electronica tv = new Electronica("LG", TV, 100000, "E001");
        Electronica notebook = new Electronica("Dell", NOTEBOOK, 80000, "E002");
        Electronica mobile = new Electronica("Samsung", MOBILE, 500000000, "E003");

        try {
            mobile.validatePrice();
        } catch (NotAvailableTypeException e) {
            System.out.println(e.getMessage());
        }

        try {
            tv.validatePrice(); // Valid price
            System.out.println("Price is valid for: " + tv);
        } catch (NotAvailableTypeException e) {
            System.out.println(e.getMessage());
        }

        // Gifts
        Gift hairdryer = new Gift("Philips", HAIRDRYER, 20000, "G001");
        Gift gift = new Gift("Sony", HAIRDRYER, 3000, "G002");

        basket.displayItems();
        basket.checkout();

        client1.bascet.addItem(tv);
        client1.bascet.addItem(hairdryer);
        client1.bascet.displayItems();
        client1.bascet.checkout();

        try {
            client1.payForShop();
        } catch (NotAvailableBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
