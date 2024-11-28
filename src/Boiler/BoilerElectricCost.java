package Boiler;

public class BoilerElectricCost extends Boiler {
    public BoilerElectricCost() {
        super(1.0); // Efficiency for electric boiler
    }

    @Override
    public double calculateDailyCost(double dailyEnergyNeeded, double costPerKwh) {
        double adjustedEnergy = dailyEnergyNeeded / this.getEfficiency();
        return adjustedEnergy * costPerKwh;
    }
}
