package Employee;

import java.util.ArrayList;

public abstract class ItWorker {
    protected String name;
    protected String surname;
    protected String id;
    protected String[] skills;
    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Not valid name");
            return;
        }
        this.name = name;
    }
    public ItWorker(String name,String surname,String id,String... skills){
        this.name=name;
        this.surname=surname;
        if(id.length()!=9 || id.charAt(0)==0){
            System.out.println(this.getName()+" Not valid id");
            return;
        }
        this.id=id;
        this.skills=skills;
    }

    public String getName() {
        return  name;
    }
    public void setSurName(String surname) {
        if (name.isEmpty()) {
            System.out.println("Not valid name");
            return;
        }
        this.surname = surname;
    }
    public String getSurName() {
        return  name;
    }
    public void setId(String id){
        if(id.length()!=9 || id.charAt(0)==0){
            System.out.println("Not valid id");
            return;
        }
        this.id=id;
    }
    public String getId(){
        return this.id;
    }
    public  void getSkills(){
        System.out.println("employer skills");

    }
    public  void doesWork(){
        System.out.println("employer works");
    }

}
