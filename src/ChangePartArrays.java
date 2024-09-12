import java.util.Arrays;
import java.util.Scanner;

public class ChangePartArrays {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Please enter the length of array : ");
        int n = myObj.nextInt();
        System.out.print("Please enter the index : ");
        int a = myObj.nextInt();


        int[] arr = new int[n];
        if (n < a + 4) {
            System.out.println("Wrong index!!! ");
            System.exit(0);
        } else if (n >= a + 4) {
            arr[a + 1] = a + 1;
            arr[a + 2] = a + 2;
            arr[a + 3] = a + 3;
        }
        System.out.println(arr[a + 1]);
        System.out.println(arr[a + 2]);
        System.out.println(arr[a + 3]);
    }

}
