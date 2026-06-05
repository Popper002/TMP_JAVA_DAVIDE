package Abstract;

public class Cat extends AnimalAb {

	public Cat(String name) {
		super(name);
	}

	@Override
	public void makeSound() {
		System.out.println(getName() + " says: Meow");
	}
}
