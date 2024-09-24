package Methods;

public class Temperature {
    public static void main(String[] args) {
        int celsius = 0;
        int fahrenheit = -32;
        calcCelsius(celsius);
        calcfahrenheit(fahrenheit);

    }

    static double calcCelsius(int fahrenheit) {
        double celsius = (fahrenheit - 32) / 1.8;
        System.out.printf("%d Fahrenheit = %.2f Celsius%n", fahrenheit, celsius);
        return celsius;
    }


    static double calcfahrenheit(int celsius) {
        double fahrenheit = celsius * 9.0 / 5 + 32;
        System.out.printf("%d Celsius = %.2f Fahrenheit%n", celsius, fahrenheit);
        return fahrenheit;
    }


}