package Methods;

public class Temperature {
    public static void main(String[] args) {
        int celsius = 0;
        double fahrenheit = -32;
        calcTemp(celsius);
        calcTemp(fahrenheit);

    }

    static double calcTemp(double fahrenheit) {
        double celsius = (fahrenheit - 32) / 1.8;
        System.out.printf(fahrenheit + "Fahrenheit =" + celsius + "Celsius");
        return celsius;
    }


    static double calcTemp(int celsius) {
        double fahrenheit = celsius * 9.0 / 5 + 32;
        System.out.printf("%d Celsius = %.2f Fahrenheit%n", celsius, fahrenheit);
        return fahrenheit;
    }


}