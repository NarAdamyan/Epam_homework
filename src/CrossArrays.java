import java.util.Arrays;
import java.util.Scanner;

public class CrossArrays {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        double[] myList = {1, 2, 3, -3, 7.8};
        double[] newList = new double[myList.length];

        if (myList[0] > 0) {
            newList[4] = myList[0];
        }
        else{
            newList[0] = 0;

        }
        if (myList[1] > 0) {
            newList[3] = myList[1];
        }
        else{
            newList[3] = 0;
        }
        if (myList[2] > 0) {
            newList[2] = myList[2];
        }
        else{
            newList[2] = 0;
        }
        if (myList[3] > 0) {
            newList[1] = myList[3];
        }
        else{
            newList[1] = 0;
        }
        if (myList[4] > 0) {
            newList[0] = myList[4];
        }
        else{
            newList[0] = 0;
        }

        System.out.println(Arrays.toString(newList));
        System.out.println(Arrays.toString(myList));


    }
}
