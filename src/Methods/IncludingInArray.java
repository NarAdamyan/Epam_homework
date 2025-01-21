package Methods;

public class IncludingInArray {
    public static void main(String[] args) {
        int[] arr = {1,  3};
        int num = 2;
        boolean result = findDigit(arr, num);
        System.out.println("Is " + num + " in the array? " + result);
    }

    static boolean findDigit(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}
