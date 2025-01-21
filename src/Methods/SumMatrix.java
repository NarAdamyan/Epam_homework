package Methods;

public class SumMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 8}, {1, 2, 5, 9}, {23, 45, 67, 10}, {23, 45, 67, 10}};
        int diaganalSum = sumMatrix(arr);
    }

    static int sumMatrix(int[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    count += arr[i][j];
                }

            }

        }
        System.out.println(count);
        return count;

    }
}