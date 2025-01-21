package Methods;

public class NegativeOrPositive {
    public static void main(String[] args) {
        int[] arr = {0, 0};
        double result = deviseToNegative(arr);
        System.out.println("Result: " + result);

    }

    static double deviseToNegative(int[] arr) {
        int positiveResult = 0;
        int negativeResult = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positiveResult += arr[i];
            } else {
                negativeResult += arr[i];
            }


        }
        if (negativeResult == 0) {
            System.out.println("No negative numbers found. Cannot divide by zero.");
            return -1;

        } else if (positiveResult == 0) {
            {
                System.out.println("No postive numbers found.The result is " + -1);
            }

        }

        double result = (double) positiveResult / negativeResult;

        System.out.println(result);
        return result;
    }

}