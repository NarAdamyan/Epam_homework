package Employee;

public class FEdeveloper extends Developer{


   public FEdeveloper(String name,String surname,String id,String [] ide,String[] skills){
      super(name,surname,id,skills,ide);}


   public boolean doHealthCheck() {
      System.out.print("Calling to API https/ararat.am/fe/healthCheck ");
      return randomStatus.nextBoolean();
   }
   @Override
   public void doesWork() {
      System.out.println("Fedev your app");
   }

   @Override
   public void getSkills() {
      System.out.println("For FeDev");

   }

}
