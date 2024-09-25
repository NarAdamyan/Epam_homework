package ArraysPart2;

public class AddElement {
    public static void main(String[] args) {
        int[] arr = {1, 1, 7, 1};

        int negativeCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negativeCount++;
            }
        }

        int[] newArr = new int[arr.length + negativeCount];

        int newIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            newArr[newIndex] = arr[i];
            newIndex++;

            if (arr[i] < 0) {
                newArr[newIndex] = i;
                newIndex++;
            }
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
