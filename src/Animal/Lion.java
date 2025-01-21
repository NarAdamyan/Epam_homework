package Animal;

public class Lion extends Animal{
    public Lion (String name,int age){
        super(name,age);}
    @Override
    public void makeSound(){
        System.out.println("Lion says raw");

    }
    @Override
    public void eat(){
        System.out.println("Lion eat Meat");

    }
}
