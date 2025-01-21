package Employee;

public class ProjectManager extends ItWorker{
    public ProjectManager(String name,String surname,String id,String[] skills){
        super(name,surname,id,skills);
    }
    @Override
    public  void getSkills(){
        System.out.println("Project manager skills");

    }
    public  void doesWork(){
        System.out.println("Project manager works");
    }
}
