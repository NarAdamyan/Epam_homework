package BuildingCall;

import java.util.ArrayList;
import java.util.List;

class School extends Building {
    private int teachers;
    private int students;
    private Person[] person;
    private int countStudents;
    private List<Person> persons;
    private static final int MaxStudents = 4;

    public static int getMaxStudent() {
        return MaxStudents;
    }

    public int getTeachers() {
        return teachers;
    }

    public int getCountStudents() {
        return this.countStudents;
    }

    public int setCountStudents(int count) {
        if (countStudents < 0) {
            System.out.println("Almost 5000 student");
            return -1;
        }
        return this.countStudents;
    }

    public int getStudents() {
        return students;
    }

    public int setTeachers(int teacher) {

        return teachers;
    }

    public int setStudents() {

        return students;
    }

    public School(int sewage, int energy, int teachers, int students) {
        super(sewage, energy);
        getEnergy();
        getTeachers();
        getCountStudents();
        this.persons = new ArrayList<>();

    }

    public void addPerson(Person person) {
        if (this.countStudents >= MaxStudents) {
            System.out.println("Almost 5000 student");
            return;
        }
        this.countStudents++;
        persons.add(person);
    }

    public void listStudents() {
        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }
    }
}

