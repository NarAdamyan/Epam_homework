public class Recursion {
    public static void main(String[] args) {
        DecimalToBinar(174);
    }

    public static void DecimalToBinar(int num) {
        if (num / 2 <= 0) return;
        DecimalToBinar(num / 2);
        System.out.println(num % 2);
    }
}
