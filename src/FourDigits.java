import java.util.Scanner;

public class FourDigits {
    public static void main(String[] args) {
        // Find the digits of 4 digits number
        Scanner myObj = new Scanner(System.in);
        {
            System.out.print("Please enter a 4-digit number: ");

            int number = myObj.nextInt();
            System.out.println("Number: " + number);

            if (number > 999 && number < 10000) {
                int first = number / 1000;
                System.out.println("First digit: " + first);

                int second = (number % 1000) / 100;
                System.out.println("Second digit: " + second);

                int third = (number % 100) / 10;
                System.out.println("Third digit: " + third);

                int fourth = number % 10;
                System.out.println("Fourth digit: " + fourth);
            } else {
                System.out.println("Please enter 4 digits number!!!");
            }


        }

    }
}
