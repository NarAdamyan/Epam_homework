package Employee;

import java.util.ArrayList;
import java.util.Random;

public abstract class Developer extends ItWorker {
    protected String[] ide;
    protected Random randomStatus = new Random();

    public Developer(String name,String surname,String id,String[] ide,String[] skills){
        super(name,surname,id,skills);
        this.ide=ide;
    }


    public void useIde() {
        for(String ide:ide){
            System.out.println("IDEs list"+ide+" ");

        }

    }

    public  boolean doHealthCheck(){
        return randomStatus.nextBoolean();
    }





    @Override
    public void getSkills() {
        System.out.println("Coddind skill" + this.ide);

    }



    @Override
    public void doesWork() {
        System.out.println("Codder");
    }

}

