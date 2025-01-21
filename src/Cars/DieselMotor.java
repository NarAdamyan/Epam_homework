package Cars;

class DieselMotor extends car{
        public DieselMotor(String motor,String model,Boolean gasSupport){
            super(model,motor,gasSupport);
        }
        public void start() {
            System.out.println("Diesel motor started");
        }

        public void stop() {
            System.out.println("Diesel motor stopped");
        }
}
