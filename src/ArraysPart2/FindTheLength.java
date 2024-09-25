package ArraysPart2;

public class FindTheLength {
    public static void main(String[] args) {
        int count = 1;
        int maxCount = 1;
        int[] arr = { 5,9, -2, -3, 7};

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                count++;

                if (count > maxCount) {
                    maxCount = count-1;
                }
            } else {
                count = 1;
            }
        }

        System.out.println("The length of the longest increasing subarray is: " + maxCount);
    }
}
