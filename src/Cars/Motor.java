package Cars;

public abstract class Motor {
    protected String motor;

    abstract void start();

    abstract void stop();


    public Motor(String motor) {
        this.motor = motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getMotor() {
        return this.motor;
    }
}

//
//    class DieselMotor extends Motor {
//        public void start() {
//            System.out.println("Motor started");
//        }
//
//        public void stop() {
//            System.out.println("Motor stopped");
//        }
//    }
//}
