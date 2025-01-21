package Employee;

import java.util.Random;

public class TestAutomationEngenier extends Developer {
    private Random TestCase = new Random();

    public TestAutomationEngenier(String name, String surname, String id, String[] ide, String[] skills) {
        super(name, surname, id, skills, ide);
    }

    @Override
    public void useIde() {
        for(String ide:ide){
            System.out.println("IDEs list"+ide+" ");

        }
        System.out.println("Ides list");

    }

    @Override
    public void doesWork() {
        System.out.println("Testing your app");
    }

    @Override
    public void getSkills() {
        System.out.println("For Tester");

    }

    public boolean doHealthCheck() {
        System.out.print("Calling to API https/ararat.am/fe/healthCheck ");
        if (TestCase.nextInt() > 0) {
            System.out.println("Test case is ready");
            return true;
        }
        System.out.println("No Test Case");
        return false;
    }

}
