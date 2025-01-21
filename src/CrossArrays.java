import java.util.Arrays;

public class CrossArrays {
    public static void main(String[] args) {
        double[] myList = {1, -2, 5, 3, -7};
        double[] newList = new double[myList.length];

        int positiveIndex = myList.length - 1;
        int zeroIndex = 0;

        for (int i = 0; i < myList.length; i++) {
            if (myList[i] < 0) {
                newList[zeroIndex] = 0;
                zeroIndex++;
            } else {
                newList[positiveIndex] = myList[i];
                positiveIndex--;
            }
        }

        System.out.println("New List: " + Arrays.toString(newList));
        System.out.println("Original List: " + Arrays.toString(myList));
    }
}
