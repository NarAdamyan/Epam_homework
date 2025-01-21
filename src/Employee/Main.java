package Employee;

public class Main {
    public static void main(String[] args) {
    FEdeveloper Nar = new FEdeveloper("Nar", "Adamyan", "999999999", new String[]{"Framework", "Pycharm"}, new String[]{"Java", "Python"});
    BEdeveloper Ann = new BEdeveloper("Ann", "AAAA", "987678987", new String[]{"Django"}, new String[]{"Python"});
    ProjectManager Andre = new ProjectManager("Andre", "Backer", "987542738", new String[]{"Manage"});
    ProjectManager Henry = new ProjectManager("Henry", "Backer", "988542738", new String[]{"Manage"});
    FSdeveloper Ada = new FSdeveloper("Ada", "Vardan", "97777", new String[]{"Api"}, new String[]{"Python", "Java", "JS"});
    TestAutomationEngenier Narine = new TestAutomationEngenier("Narine", "Adamyan", "99999999", new String[]{"Selenium", "Pytest"}, new String[]{"Java", "python"});
    Developer [] developers={Nar,Ann,Ada,Narine,new TestAutomationEngenier("Anna","Harut","99999222",new String[]{"Selenium"},new  String[]{"Python"})};
    ItWorker [] workers={Nar,Ann,Andre,Ada,Narine,Henry};

for(ItWorker worker: workers){
    System.out.print(worker.getName()+" ");
    worker.doesWork();
    }
for (Developer dev:developers){
    System.out.println(dev.getName());
   dev.doHealthCheck();
}
}}