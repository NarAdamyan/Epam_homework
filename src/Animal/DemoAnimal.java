package Animal;

public class DemoAnimal {
    public static void main(String[] args) {
        Animal lion = new Lion("Lion", 6);
        Monkey monkey = new Monkey("King kong", 90000);
        TrickingAnimal elephant = new Elephant("Elephant", 70000);
        elephant.setage(1888);
        elephant.getage();

        Animal[] zooList = {new Monkey("mmm", 6), new Elephant("LLL", 4), lion, monkey,elephant};
        for (Animal zoo : zooList) {
            if (zoo instanceof TrickingAnimal) {
                ((TrickingAnimal) zoo).performTrick();}
            else {zoo.eat();zoo.makeSound();elephant.getage();}
        }

    }
}
