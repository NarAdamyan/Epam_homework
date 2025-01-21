package Cars;

class HybridElectroCar extends ElectricMotor {
    private Boolean isElectricSupport;

    public HybridElectroCar(String motor, String model, Boolean gasSupport,Boolean isElectric ) {
        super(model, motor, gasSupport);
        this.isElectricSupport=isElectric;
    }
    @Override
    public void start() {
        if (this.isElectricSupport)
            System.out.println("Electric motor started");
        System.out.println("Fuel motor started");

    }
    @Override
    public void stop() {
        if (this.isElectricSupport)
            System.out.println("Electric motor stopped");
        System.out.println("Fuel motor stopped");
    }

    public void switchToFuel() {
        if (this.isElectricSupport) {
            System.out.println("Already in Electric");
            return;
        }
        System.out.println("Switched to Electric");
    }
}
