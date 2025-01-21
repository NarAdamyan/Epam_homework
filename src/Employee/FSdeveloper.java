package Employee;

public class FSdeveloper extends Developer{

    public FSdeveloper(String name,String surname,String id,String [] ide,String[] skills){
        super(name,surname,id,skills,ide);}

    @Override
    public boolean doHealthCheck() {
        boolean feHealthCheck = super.doHealthCheck();
        System.out.print("& Calling to API https/ararat.am/be/healthCheck ");
        return feHealthCheck && randomStatus.nextBoolean();
    }
    @Override
    public void useIde() {
        System.out.println("Ides list");

    }

    @Override
    public void doesWork() {
        System.out.println("BSdev your app");
    }

    @Override
    public void getSkills() {
        System.out.println("For BSdev");

    }
}
