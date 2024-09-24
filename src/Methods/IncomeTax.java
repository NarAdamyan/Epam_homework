package Methods;

public class IncomeTax {
    public static void main(String[] args) {
        double salary = 1000;
        boolean isItsector = true;
        double taxrate = -10;
        calculateIncomeTax(salary);
        calculateIncomeTax(salary, taxrate);
        calculateIncomeTax(salary, isItsector);
    }

    static double calculateIncomeTax(double salary) {
        double tax = (salary * 20) / 100;
        double result = salary - tax;

        if (salary > 0) {
            System.out.println("Your salary is: " + result);
        } else {
            System.out.println("Not a positive salary");
        }
        return result;
    }

    static double calculateIncomeTax(double salary, double taxrate) {
        double result = salary - (salary * taxrate / 100);

        if (salary > 0 && taxrate > 0) {
            System.out.println("Your salary is " + result);
        } else {
            System.out.println("Not a positive salary or tax");


        }
        return result;

    }

    static double calculateIncomeTax(double salary, boolean isItSector) {
        double result = salary - (salary * 10 / 100);

        if (isItSector && salary > 0) {
            System.out.println("Your tax is 10%: " + result);
        } else if (!isItSector && salary > 0) {
            System.out.println("Your salary not taxed");
        } else {
            System.out.println("Your salary not a positive");
        }
        return result;
    }
}
