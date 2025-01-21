package BuildingCall;

public class Testing {
    public static void main(String[]args) {
        School school=new School(8,8,90,5000);
        System.out.println(school.getEnergy());
        System.out.println(school.getCountStudents());
        Person person=new Person("Narine","Adamyan",-29);
        Person person1=new Person("ԱԱԱ","Adamyan",17);
        Person person2=new Person("Naiiiiiiiiiiin","Adamyan",18);
        Person person4=new Person("Nan","Adamyan",  18);
        Person person5=new Person("Nmmmmmmmmmman","Adamyan",20);
        school.addPerson(person);
        school.addPerson(person1);
        school.addPerson(person4);
        school.addPerson(person2);
        school.addPerson(person5);
        System.out.println(person5.getName());
        System.out.println(person5.getSurname());
        System.out.println(school.getCountStudents());
        school.listStudents();
    }
}
