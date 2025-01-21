package Electronica;

public class Client {
    protected String name;
    protected String surname;
    protected String card;
    protected int balance;
    protected Bascet bascet;  // Assuming Basket is the correct class name

    public Client(String name, String surname, String card, int balance) {
        this.name = name;
        this.surname = surname;
        this.card = card;
        this.balance = balance;
        this.bascet = new Bascet(10);  // Assuming Basket has a constructor taking a size
    }

    public void payForShop() throws NotAvailableBalanceException {
        double totalPrice = bascet.checkout();  // Assuming checkout returns the total price

        if (this.balance >= totalPrice) {
            this.balance -= totalPrice;  // Deduct the total price from the balance
            System.out.println("Payment successful. Your new balance is: " + this.balance + " AMD.");
        } else {
            // Throwing a custom exception if balance is insufficient
            throw new NotAvailableBalanceException("You do not have enough balance to complete the payment.");
        }
      }
}
