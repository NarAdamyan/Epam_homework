import java.util.Scanner;

public class ShortNumbers {
    public static void main(String[] args) {

        // Find the arithmetic mean
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your digits,please! ");
        short a = myObj.nextShort();
        short b = myObj.nextShort();
        short c = myObj.nextShort();
        int result = (a + b + c) / 3;

        int arithmeticMean = 0;

        if (a < 0) {
            arithmeticMean = arithmeticMean + (-a);
        } else {
            arithmeticMean = arithmeticMean + a;
        }

        if (b < 0) {
            arithmeticMean = arithmeticMean + (-b);
        } else {
            arithmeticMean = arithmeticMean + b;
        }

        if (c < 0) {
            arithmeticMean = arithmeticMean + (-c);
        } else {
            arithmeticMean = arithmeticMean + c;
        }

        if (result == 0) {
            System.out.println("the result is 0");
        } else {
            int output = arithmeticMean / result;
            System.out.println(output);

        }


    }
}

