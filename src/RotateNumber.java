import javax.print.attribute.standard.PresentationDirection;
import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        // Rotate the number
        Scanner myObj = new Scanner(System.in);
        {
            System.out.print("Please enter a 3-digit number: ");
            int a = 0;
            int b = 0;
            int c = 0;
            int number = myObj.nextInt();
            if (number < 1000 && number > 99 && number % 10 != 0) {
                a = number / 100;
                b = (number - a * 100) / 10;
                c = number % 10;
                String result = String.valueOf(c) + String.valueOf(b) + String.valueOf(a);
                System.out.println(Integer.parseInt(result));

            } else if (number % 10 == 0) {
                System.out.println("The last digit is 0!!!");


            } else {
                System.out.println("Enter correct number");
            }
        }
    }
}