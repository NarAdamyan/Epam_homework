import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        // Find the digits of a number
        Scanner myObj = new Scanner(System.in);


        FirstPart fst=new FirstPart();
        fst.display();
        SecondPart sp = new SecondPart();
        sp.display();
        ThirdPart tp = new ThirdPart();
        tp.display();
        ForthPart fp=new ForthPart();
        fp.display();
        myObj.close();
    }
}
class FirstPart {
    void display() {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Please enter a 4-digit number: ");

        int number = myObj.nextInt();
        System.out.println("Number: " + number);

        int first = number / 1000;
        System.out.println("First digit: " + first);

        int second = (number % 1000) / 100;
        System.out.println("Second digit: " + second);

        int third = (number % 100) / 10;
        System.out.println("Third digit: " + third);

        int fourth = number % 10;
        System.out.println("Fourth digit: " + fourth);

    }
}
class SecondPart {
    void display() {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter three double values: ");
        double first = myObj.nextDouble();
        double second = myObj.nextDouble();
        double third = myObj.nextDouble();
        double sum = first + second + third;
        int result = (int) first+(int)second+(int)third;
        System.out.println("Sum (Integer part): " + result);
        double fractionalPart = sum - (int)sum;
        System.out.println("Sum (Fractional part): " + fractionalPart);

    }
}
class ThirdPart {
    void display() {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter two integer values (a and b): ");
        int a = myObj.nextInt();
        int b = myObj.nextInt();
        boolean divisible = a % b == 0;
        System.out.println("a divided by b: " + divisible);

    }
}
class ForthPart {
    void display() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your letter");
        char character = myObj.next().charAt(0);
        int asciiValue = ((int) character-32);
        char letter = (char) asciiValue;
        System.out.println("Capital letter is: " + letter);
    }
}

