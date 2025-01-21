package Electronica;

public class NotAvailableBalanceException extends Exception{
    public NotAvailableBalanceException(String message){
        super(message);
    }
    public NotAvailableBalanceException(String message,Throwable cause){
        super(message,cause);

    }

}
