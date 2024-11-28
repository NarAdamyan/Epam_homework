package Boiler;

public abstract class Boiler {
    private double efficiency;

    public Boiler(double efficiency) {
        this.efficiency = efficiency;
    }

    public double getEfficiency() {
        return efficiency;
    }

    public abstract double calculateDailyCost(double dailyEnergyNeeded, double costPerKwh);
}
