package Animal;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        if (name.length() < 3) {
            System.out.println("Not valid name");
            return;
        }
        this.name = name;
        if (age < 0 || age > 20) {
            System.out.println("Not valid age");
            return;
        }
        this.age = age;
    }

    public String getname() {
        return this.name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getage() {
        return this.age;
    }

    public void setage(int age) {
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Animal makesound");

    }

    public void eat() {
        System.out.println(" Animal eat meat");

    }
}
