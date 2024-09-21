import java.util.Scanner;

public class Tickets {
    public static void main(String[] args) {
        // Find the cost of tickets
        Scanner myObj = new Scanner(System.in);
        System.out.print("Please enter YES/NO:\nAre you a vip client??? ");
        String status = myObj.next();
        System.out.print("How old are you? ");
        int age = myObj.nextInt();
        if (age < 16) {
            System.out.println("You can't enter as you are under 16!!! ");

        } else if (status.equals("YES") || status.equals("Yes") || status.equals("yes")) {
            System.out.println("You are allowed to enter.\nYou must pay 4250AMD.\nAs vip client you have a 15% sale !!! ");


        } else {
            System.out.println("You are allowed to enter.\nYou must pay 5000AMD.!!! ");


        }
    }
}