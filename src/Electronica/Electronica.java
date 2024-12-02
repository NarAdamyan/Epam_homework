package Electronica;

public class Electronica {
    protected String  brand;
    protected String  type;
    protected int price;
    protected String id;

    public Electronica(String brand,String type,int price,String id){
        this.brand=brand;
        this.type=type;
        this.price=price;
        this.id=id;
    }
    public  Electronica(){

    }
    public boolean isEligibleGiftFor(Electronica item) {
        if ((item.type.equals("notebook") && this.type.equals("mobile") && this.price <= 100000) ||
                (item.type.equals("tv") && this.type.equals("hairdryer") && this.price <= 30000)) {
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return this.type + " (AMD " + price + ")";
    }
}
