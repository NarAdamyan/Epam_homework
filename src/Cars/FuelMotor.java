package Cars;

class FuelMotor extends car{
    public FuelMotor(String motor,String model,Boolean gasSupport){
        super(model,motor,gasSupport);
    }
    @Override
    public void start() {
        System.out.println("Fuel motor started");
    }
    @Override
    public void stop() {
        System.out.println("Fuel motor stopped");
    }
}
