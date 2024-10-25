package Teacher;

import java.util.Scanner;

public class DemoTeacherSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter K (must be >= 1): ");
        int K = scanner.nextInt();
        System.out.print("Enter MIN_SALARY (must be >= 1): ");
        int MIN_SALARY = scanner.nextInt();

        Teacher.initializeSalaryCoefficients(K, MIN_SALARY);

        System.out.print("Enter teacher's W (must be >= 1): ");
        int W = scanner.nextInt();

        Teacher teacher = new Teacher("Math", true, 9, 3, W);
        Salary salaryCalculator = new Salary(teacher);

        System.out.println("Teacher's Salary: " + salaryCalculator.TeacherSalary());
    }
}
