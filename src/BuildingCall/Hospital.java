package BuildingCall;

import java.util.ArrayList;
import java.util.List;

public class Hospital extends Building {
    private int rooms;
    private List<String> diseases;
    private int stuff;
    private Person[] person;

    private List<Person> persons;


    public Hospital() {
    }
    public Hospital(int sewage, int energy, int rooms, int stuff) {
        super(sewage, energy);
        this.rooms = rooms;
        this.stuff = stuff;
        this.diseases = new ArrayList<>(); // Initialize the list
        this.persons = new ArrayList<>();


    }

    public int getRooms() {
        return rooms;
    }

    public int getStuff() {
        return stuff;
    }

    public void listDisease() {
        for (int i = 0; i < diseases.size(); i++) {
            System.out.println(diseases.get(i));
        }

    }
    public void addDisease(String disease) {
        diseases.add(disease);
    }
    public void addPerson(Person person) {
        this.stuff++;
        persons.add(person);
    }

    public void listStuff() {
        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }
    }
    public void removeStuff(Person person){
        this.stuff++;
        persons.remove(person);
    }

}
