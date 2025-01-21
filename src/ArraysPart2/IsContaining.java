package ArraysPart2;

public class IsContaining {

    public static void main(String[] args) {
        int[] arr1 = {9, 1, 9, 1};
        int[] arr2 = {1, 1, 1, 1};
        boolean contains = true;
        for (int i = 0; i < arr1.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                contains = false;
                break;
            }
        }

        if (contains) {
            System.out.println("arr2 contains  elements of arr1.");
        } else {
            System.out.println("arr2 does not contain  elements of arr1.");
        }
    }

}
