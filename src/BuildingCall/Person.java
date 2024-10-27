package BuildingCall;

public class Person {
    private String name;
    private String surname;
    private int age;

    // Constructor
    public Person() {
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        setAge(age);
    }

    // Getters and setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age cannot be negative.");
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Surname: " + surname + ", Age: " + age;
    }
}

