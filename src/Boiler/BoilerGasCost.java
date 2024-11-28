package Boiler;

public class BoilerGasCost extends Boiler {
    public BoilerGasCost() {
        super(0.85);
    }

    @Override
    public double calculateDailyCost(double dailyEnergyNeeded, double costPerKwh) {
        double adjustedEnergy = dailyEnergyNeeded / this.getEfficiency();
        return adjustedEnergy * costPerKwh;
    }
}
