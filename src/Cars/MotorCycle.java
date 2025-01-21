package Cars;

public class MotorCycle extends car{
    public MotorCycle(String motor,String model,Boolean gasSupport){
        super(model,motor,gasSupport);
    }
    @Override
    public void start() {
        System.out.println("MotoCycle started");
    }
    @Override
    public void stop() {
        System.out.println("MotoCycle stopped");
    }
}
