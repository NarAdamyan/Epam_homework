package Animal;

public class Monkey extends TrickingAnimal {
    public Monkey(String name,int age){
        super(name,age);
    }
    @Override
    public void performTrick() {
        System.out.println("Monkeys trick");
    }

    @Override
    public void makeSound() {
        System.out.println("Monkey makesound");

    }

    @Override
    public void eat() {
        System.out.println("Monkey eat banana");

    }
}
