package Employee;

public class BEdeveloper extends Developer {

    public BEdeveloper(String name, String surname, String id, String[] ide, String[] skills) {
        super(name, surname, id, skills, ide);
    }

    public boolean doHealthCheck() {
        System.out.print("Calling to API https/ararat.am/fe/healthCheck ");
        return randomStatus.nextBoolean();
    }

    @Override
    public void useIde() {
        System.out.println("Ides list");

    }

    @Override
    public void doesWork() {
        System.out.println("Bedev your app");
    }

    @Override
    public void getSkills() {
        System.out.println("For BEdev");

    }
}
