public class Recursion {
    public static void main(String[] args) {
        try {
            DecimalToBinar(174);
            System.out.println();
            DecimalToBinar(-8);
        } catch (NegativNumberException e) {
            System.out.println("Caught invalid number: " + e.getMessage());
        }
    }

    public static void DecimalToBinar(int num) throws NegativNumberException {
        if (num / 2 < 0)
            throw new NegativNumberException("Not valid number");
        if (num == 0) {
            return;
        }
        DecimalToBinar(num / 2);
        System.out.println(num % 2);
    }
}
