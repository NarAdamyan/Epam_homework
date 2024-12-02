package Electronica;

public class Main {
    public static void main(String[] args) {
        Electronica mobile = new Electronica("Samsung", "mobile", 98000, "123456");
        Electronica mobile1 = new Electronica("Apple", "mobile", 90000, "123457");
        Electronica tv = new Electronica("LG", "tv", 400000, "123458");
        Electronica tv1 = new Electronica("Lenovo", "tv", 600000, "123459");
        Electronica notebook = new Electronica("Acer", "notebook", 698000, "123460");
        Electronica notebook1 = new Electronica("Asus", "notebook", 290000, "123461");
        Electronica hairdryer = new Electronica("Philips", "notebook", 80000, "123461");
        Electronica hairdryer1 = new Electronica("Bombay", "notebook", 19000, "123461");
//        Gift mobilegift=new Gift(mobile1);

        Electronica[] variety = {mobile, mobile1, tv1, tv, notebook1, notebook, hairdryer1, hairdryer};

        Shop shop = new Shop("Zigzag", variety);
        Client client = new Client("Narine", "Adamyan", "1234561234561234", 300000);
        Client client2 = new Client("Nar", "Adamyan", "1234561234564321", 11000);
        Client client3 = new Client("NNNNNN", "Adamyan", "1234561234564311", 1000000);
        // Add items to the client's basket
        client3.bascet.addItem(tv);
        client3.bascet.addItem(tv);
        client3.bascet.addItem(tv);
        client3.bascet.addItem(notebook);

        client3.bascet.displayBasket();
        client3.bascet.removeItem(tv.id);
        client3.bascet.displayBasket();
        client3.gift.addGift(mobile1);
        client3.gift.addGift(mobile1);
        client3.gift.addGift(mobile);
        client3.bascet.displayBasket();
        client3.bascet.removeItem(mobile1.id);
        client3.bascet.displayBasket();


        client3.bascet.checkout();
    }
}
