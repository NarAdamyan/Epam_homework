package Animal;

public abstract class TrickingAnimal extends Animal {


    public TrickingAnimal(String name, int age) {
        super(name, age);
    }

    public void performTrick() {
        System.out.println("TrickingAnimal");

    }
}