package BuildingCall;

public class TestHospital {
    public static void main(String[] args) {
        Hospital hospital = new Hospital(7, 7, 4, 89);
        hospital.addDisease("Cold");
        hospital.addDisease("Coldaaaaaa");
        hospital.listDisease();
        Person person=new Person("Doctor","Man",46);
        hospital.addPerson(person);
        System.out.println(hospital.getStuff());
        hospital.listStuff();
        hospital.removeStuff(person);
        System.out.println("test");
        hospital.listStuff();

    }
}



