package Abstract;

public class DemoAbstract {
    public static void main(String[] args) {
        // Non si può istanziare una classe astratta:
        // AnimalAb a = new AnimalAb("X"); // errore di compilazione

        // Istanza concreta tramite sottoclasse
        AnimalAb kitty = new Cat("Whiskers");
        kitty.makeSound();
        kitty.sleep();

        AnimalAb rex = new Dog("Rex");
        rex.makeSound();

        // Classe anonima che estende l'astratta al volo
        AnimalAb mystery = new AnimalAb("Mystery") {
            @Override
            public void makeSound() {
                System.out.println(getName() + " makes an unknown sound");
            }
        };
        mystery.makeSound();

        // Polimorfismo: tutte sono AnimalAb
        AnimalAb[] zoo = {kitty, rex, mystery};
        for (AnimalAb a : zoo) {
            System.out.println(a);
        }

        // --- Esempio con interfaccia ---
        // Un'interfaccia dichiara un contratto: metodi astratti devono essere implementati
        // (a meno che non siano default/static). Non può avere campi di istanza, solo costanti.
        Parrot polly = new Parrot("Polly");
        polly.makeSound();            // metodo ereditato da AnimalAb
        polly.talk();                 // metodo richiesto dall'interfaccia Talkable
        polly.sayHello();             // metodo default dell'interfaccia
        Talkable.info();              // metodo statico dell'interfaccia
        System.out.println("Interface type: " + Talkable.TYPE);
    }
}
