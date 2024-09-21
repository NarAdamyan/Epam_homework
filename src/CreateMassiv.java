import java.util.Scanner;

public class CreateMassiv {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Please enter the length of array 0-8: ");
        int arraylen = myObj.nextInt();
        if (arraylen > 0 && arraylen <= 8) {
            System.out.println("Your array length is: " + arraylen);
        } else {
            System.out.println("You enter wrong number");
            System.exit(0);
        }
        int[] arr = new int[arraylen];
        System.out.print("Add 2 numbers: ");
        int a = myObj.nextInt();
        int b = myObj.nextInt();
        int constant = arr.length / 2;
        if (a < b && arraylen>2) {
            arr[constant - 1] = a;
            arr[constant + 1] = b;
            System.out.print(arr[constant - 1] + "," + arr[constant] + "," + arr[constant + 1]);
        } else if (a > b && arraylen>2) {
            arr[constant - 1] = b;
            arr[constant + 1] = a;
            System.out.print(arr[constant - 1] + ","+arr[constant] + arr[constant + 1]);
        }
        else{System.out.println("Wrong initials");}


    }
}