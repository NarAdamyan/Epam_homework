package Cars;

class ElectricMotor extends car{
    public ElectricMotor(String motor,String model,Boolean gasSupport){
        super(model,motor,gasSupport);
    }
    @Override
    public void start() {
        System.out.println("Electric motor started");
    }
    @Override
    public void stop() {
        System.out.println("Electric motor stopped");
    }
}
