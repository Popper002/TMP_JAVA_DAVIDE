package Abstract;

public interface Talkable {
    // costante (public static final)
    String TYPE = "Talkable";

    // metodo astratto: le classi che implementano devono fornire un'implementazione
    void talk();

    // metodo default (Java 8+): fornisce implementazione di default
    default void sayHello() {
        System.out.println("Hello from " + TYPE);
    }

    // metodo statico nell'interfaccia
    static void info() {
        System.out.println("This is the Talkable interface");
    }
}
