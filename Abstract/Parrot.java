package Abstract;

public class Parrot extends AnimalAb implements Talkable {

    public Parrot(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " squawks!");
    }

    @Override
    public void talk() {
        System.out.println(getName() + " says: Polly wants a cracker!");
    }
}
/**
 * Implementazione obbligatoria:

interface: i metodi astratti (implicitamente public abstract) devono essere implementati dalla classe che la implements, a meno che l'interfaccia non fornisca un default o static (Java 8+) o metodi private (Java 9+).
abstract class: solo i metodi dichiarati abstract devono essere implementati; i metodi concreti ereditati restano così come sono.
Stato e campi:

interface: non può avere campi di istanza; solo costanti public static final.
abstract class: può avere campi di istanza, inizializzatori, e costruttori.
Ereditarietà:

Una classe può implement molteplici interfacce.
Una classe può extend una sola (abstract o concreta) classe.
Visibilità e membri:

Metodi di interfaccia sono tipicamente public; abstract class permette qualunque modificatore di accesso (private, protected, public).
abstract class può avere metodi protected/helper per le sottoclassi.
Costruttori e inizializzazione:

interface non ha costruttori.
abstract class può definire costruttori per inizializzare lo stato comune.
Quando scegliere:

Usa interface per definire un contratto puro (API) indipendente dallo stato.
Usa abstract class se vuoi fornire implementazioni parziali, stato condiviso o costruttori comuni.
Esempi rapidi:
 */