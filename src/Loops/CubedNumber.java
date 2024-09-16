//Ունեք ցանկացած ամբողջ թիվ, որը ներմուծում եք։ Ձեր խնդիրնա պարզել,
// թե արդյոք տվյալ թիվը հանդիսանումա մեկ այլ ամբողջ թվի խորանարդ։
// Եթե հա, տպեք էդ թիվը, հակառակ դեպքում զուտ հաղորդագրություն տպեք,
// որ ձեր ներմուծածը չի հանդիսանում որևէ ամբողջ թվի խորանարդ.

package Loops;

import java.util.Scanner;

public class CubedNumber {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Please enter the length of array : ");
        int cube = myObj.nextInt();
        int count = 0;
        boolean iscube = true;
        while (count * count * count <= cube) {
            if (count * count * count == cube) {
                iscube = true;
                break;  // Exit the loop if the number is a perfect cube
            }
            count++;
        }
        if (iscube) {
            System.out.println("The cube root of " + cube + " is " + count);
        } else {
            System.out.println("The number " + cube + " is not a perfect cube.");
        }
    }
}
