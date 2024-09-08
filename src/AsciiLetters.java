import java.util.Scanner;

public class AsciiLetters {
    public static void main(String[] args) {
        // Find the capital letter via ascii
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter your letter: ");
        char character = myObj.next().charAt(0);
        if ((int) character > 92 && (int) character < 123) {

            int asciiValue = ((int) character - 32);
            char letter = (char) asciiValue;
            System.out.println("Capital letter is: " + letter);
        } else {
            System.out.println("Please enter small letter!!!!");
        }
    }
}
