package Electronica;

public class Electronica {
    protected String brand;
    protected TypesElectronic type;
    protected int price;
    protected String id;

    public Electronica(String brand, TypesElectronic type, int price, String id) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.id = id;
    }

    public Electronica() {

    }


    public void validatePrice() throws NotAvailableTypeException {
        this.type.validatePrice(this.price);
    }

    @Override
    public String toString() {
        return this.type + " (AMD " + price + ")";
    }
}
