package Abstract;

public abstract class AnimalAb {
    protected String name;

    public AnimalAb(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    // Abstract method: subclasses must implement this
    public abstract void makeSound();

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" + name + ")";
    }
}
