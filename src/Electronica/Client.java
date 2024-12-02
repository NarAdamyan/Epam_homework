package Electronica;

public class Client {
    protected String name;
    protected String surname;
    protected String card;
    protected int balance;
    protected Bascet bascet;
    protected Gift gift;


    public Client (String name,String surname,String card, int balance){
        this.name=name;
        this.surname=surname;
        this.card=card;
        this.balance=balance;
        this.bascet = new Bascet(10);



    }
}
