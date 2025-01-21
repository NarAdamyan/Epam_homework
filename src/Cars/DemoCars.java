package Cars;

public class DemoCars {
    public static void main(String[]args) {
        DieselMotor ford=new DieselMotor("Diesel","Ford",false);
        ElectricMotor tesla=new ElectricMotor("Electric","Tesla",false);
        HybridElectroCar mers=new HybridElectroCar("Electric","Mersedez",true,true);
        FuelMotor toyota=new FuelMotor("Fuel","Kia",true);
        MotorCycle moto=new MotorCycle("Gas","Moto",true);

        car [] cars={ford,tesla,mers,toyota,moto};
        for(car i:cars){
            System.out.println(i.gasSupport+ " " +i.getModel());
        }
        for(car i:cars){
            if(!i.gasSupport)
            i.switchToGas();
        }
        car mix=new HybridElectroCar("Diesel","Nissan",true,true);
        mix.switchToGas();
    }
}
