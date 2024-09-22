package Loops;

import java.util.Scanner;

public class CubedNumber {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int cube = myObj.nextInt();
        int count = 0;
        boolean isCube = false;

        while (count * count * count <= Math.abs(cube)) {
            if (count * count * count == Math.abs(cube)) {
                isCube = true;
                break;
            }
            count++;
        }

        if (isCube) {
            if (cube < 0) {
                System.out.println("The cube root of " + cube + " is " + (-count));
            } else {
                System.out.println("The cube root of " + cube + " is " + count);
            }
        } else {
            System.out.println("The number " + cube + " is not a perfect cube.");
        }
    }
}
