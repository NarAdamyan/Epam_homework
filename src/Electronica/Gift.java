package Electronica;
public class Gift extends Electronica {
    protected Electronica electronica;
    protected Electronica []bascet;
    int count=0;


    public Gift(String brand,String type,int price,String id){
        super (brand,type,price,id)   ; }

    public Gift(Electronica electronica) {
        this.electronica = electronica;
    }
    public void addGift(Electronica gift) {
        for (Electronica e : bascet) {
            if (e != null && e.id.equals(gift.id)) {  // Compare 'id' of non-null items
                System.out.println("This item is already in your basket."+e.id);
                return;
            }
        }
        if (count >= bascet.length) {
            System.out.println("Basket is full. Cannot add a gift.");
            return;
        }

        boolean isEligible = false;

        // Check if the gift is eligible for any item in the basket
        for (int i = 0; i < count; i++) {
            if (gift.isEligibleGiftFor(bascet[i])) {
                isEligible = true;
                break;
            }
        }

        if (isEligible) {
            bascet[count] = gift;
            System.out.println("A gift has been added to your basket: " + gift);
            count++;
//            giftAdded = true; // Mark the gift as added
        } else {
            System.out.println("This gift is not eligible for the items in your basket.");
        }
    }


}
