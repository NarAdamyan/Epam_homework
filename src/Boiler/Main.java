package Boiler;

public class Main {
    public static void main(String[] args) {
        Home home = new Home(80, 22, "house");
        Boiler gasBoiler = new BoilerGasCost();
        Boiler electricBoiler = new BoilerElectricCost();

        AverageCost costCalculator = new AverageCost(0.10, 0.25, home);

        System.out.println("Gas Boiler:");
        costCalculator.calculateMonthlyCost(2, -5, gasBoiler);

        System.out.println("Electric Boiler:");
        costCalculator.calculateMonthlyCost(2, -5, electricBoiler);
    }
}
