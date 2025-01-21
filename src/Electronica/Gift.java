package Electronica;

public class Gift extends Electronica {

    public Gift(String brand, TypesElectronic type, int price, String id) {
        super(brand, type, price, id);

    }

    @Override
    public String toString() {
        return "Gift: " + type + " (" + brand + ") $" + price;
    }
}
