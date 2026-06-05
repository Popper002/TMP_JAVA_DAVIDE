package Abstract;

public class Dog extends AnimalAb {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof");
    }
}
