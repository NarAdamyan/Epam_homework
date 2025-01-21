package Loops;

public class CheckPositivNegativELements {
    public static void main(String[] args) {
        double[] arr = {2, 100, -100, 0, 0, 100, 10, 10, 10};
        int result = 0;
        for (int count = 0; count < arr.length; count++) {
            System.out.println(arr[count] + "   " + count);
            if (arr[count] > 0) {
                result += arr[count];
                count += 1;
            } else if (arr[count] < 0) {
                result += arr[count];
            } else {
                break;
            }
            System.out.println(result);

        }

    }

}