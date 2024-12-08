public class Recursion {
    public static void main(String[] args) {
        toBinar(10);
    }

    static void toBinar(int num) {
        if (num <= 0) return;
        toBinar(num / 2);
        System.out.println(num % 2);
    }
}