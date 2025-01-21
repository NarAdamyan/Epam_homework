package Animal;

public class Elephant extends TrickingAnimal {
    public Elephant (String name,int age){
        super(name,age);
    }
    @Override
    public void performTrick() {
        System.out.println("Elephant trick");
    }

    @Override
    public void makeSound() {
        System.out.println("Elephant makes sound");

    }

    @Override
    public void eat() {
        System.out.println("Elephant eat grass");

    }
}
