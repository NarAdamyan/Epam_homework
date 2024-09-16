package Loops;

import java.util.Arrays;
import java.util.Scanner;

public class SliceArray {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int arrlen = myObj.nextInt();
        System.out.print("Enter the start of second array: ");
        int start = myObj.nextInt();
        System.out.print("Enter the end of second array: ");
        int end = myObj.nextInt();
        if (end > start && arrlen > end && start >= 0) {
            System.out.println("You enter " + arrlen + " start " + start + " end " + end);
        } else {
            System.out.println("Not valid initials: ");
            System.exit(0);
        }
        int[] arr = {1, 15, 3, 4, 5, 6, 6};
//        int[] arr=new int[arrlen];
        int[] newarr = new int[end - start];
        for (int count = start; count < end; count++) {
            newarr[count - 1] = arr[end - count];
        }
        System.out.println(Arrays.toString(newarr));
    }
}