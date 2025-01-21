public class SimpleNumbers {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 9, 8, 5};  // Example array

        // Loop through the array and print if the number is prime or not
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " is prime: " + isPrime(arr[i]));
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int divisor = 2; divisor <= num/2; divisor++) {
            if (num % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}
