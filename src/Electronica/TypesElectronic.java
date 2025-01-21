package Electronica;

public enum TypesElectronic {
    HAIRDRYER(30000), TV(120000), MOBILE(80000), NOTEBOOK(100000);

    private final int maxPrice;

    TypesElectronic(int maxPrice) {
        this.maxPrice = maxPrice;
    }

    public void validatePrice(int price) throws NotAvailableTypeException {
        if (price > maxPrice) {
            throw new NotAvailableTypeException("Price exceeds maximum allowed for " + this.name() + ": " + maxPrice + " AMD");
        }
    }
}
