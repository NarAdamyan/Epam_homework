import java.util.Scanner;

public class CreateTriangle {
    public static void main(String[] args) {
        // Find the sides of triangle
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the sides!!! ");

        System.out.print("Enter first side: ");
        int a = myObj.nextInt();
        System.out.println("a = " + a);

        System.out.print("Enter second side: ");
        int b = myObj.nextInt();
        System.out.println("b = " + b);

        System.out.print("Enter third side: ");
        int c = myObj.nextInt();
        System.out.println("c = " + c);

        if (a + b > c && b + c > a && a + c > b) {
            System.out.print("You can create a triangle with ");
            System.out.print(a + ",");
            System.out.print(b + ",");
            System.out.print(c);

        } else {
            System.out.print("You can not  create a triangle with ");
            System.out.print(a + ",");
            System.out.print(b + ",");
            System.out.print(c);
        }
    }
}

