package Boiler;

public class AverageCost {
    private double gasCostPerKwh;
    private double electricCostPerKwh;
    private Home home;

    public AverageCost(double gasCostPerKwh, double electricCostPerKwh, Home home) {
        this.gasCostPerKwh = gasCostPerKwh;
        this.electricCostPerKwh = electricCostPerKwh;
        this.home = home;
    }

    public void calculateMonthlyCost(int month, int outdoorTemp, Boiler boiler) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int tempDifference = 20 - outdoorTemp;

        double dailyEnergyNeeded = home.getSize() * tempDifference * 0.024;

        double dailyCost = boiler.calculateDailyCost(dailyEnergyNeeded,
                boiler instanceof BoilerGasCost ? gasCostPerKwh : electricCostPerKwh);

        double monthlyCost = dailyCost * daysInMonth[month - 1];

        System.out.printf("Month %d: Monthly Cost = $%.2f%n", month, monthlyCost);
    }
}
