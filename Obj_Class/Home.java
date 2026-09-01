package Obj_Class;

/**
 * @author Riccardo Oro - Popper002 
 * @category Learning java base 
 * @implNote È un esempio di cos'è una classe e oggetto e cosa sono attributi/metodi di classe e di oggetto 
*/



class HomeStatic{
    private static String  name;
    
    //Modo forse da discutere però è fattibile nessuno nega la questione 
    public static String getStaticName(){
        return HomeStatic.name; 
    }

    public static void sayHomeStatic(){
        System.out.println("HOME STATIC IS HERE");
    }
}


class HomeObj{
    /**
     * Attributi dell'oggetto, come li distinguo? la classe non è statica (static) e ne oggetti ne metodi 
     */
    private Integer numeroCivico; 
    private String via;
    
    /**
     * Creiamo il costruttore della classe Home, si possono avere n costruttore per classe, questo permette 
     * di settare valori di partenza per l'oggetto che allocheremo 
     * @param numeroCivico
     * @param via
     */
    public HomeObj(Integer numeroCivico, String via ){
        this.numeroCivico = numeroCivico; 
        this.via = via; 
    }

    public HomeObj(){

    } 
    
    public HomeObj(Integer numeroCivico ){
        this.numeroCivico = numeroCivico; 
    }

    public void sayHome(){
        System.out.println("CIAO SONO CASA DI VIA "+this.via +"Numero civico "+this.numeroCivico);
    }


}
public class Home{



    public static void main(String[] args) {
        /**
         * Siccome HomeObj è una classe non statica può essere allocata e quindi diventa oggetto
         */
        HomeObj casa= new HomeObj(); 
        HomeObj casaCorsoFrancia = new HomeObj(10, "Corso francia");
        casa.sayHome();
        casaCorsoFrancia.sayHome();
        /**
         * Homestatic non è un oggetto non è allocata e non può essere allocata
         */
        HomeStatic.sayHomeStatic();

    }
}
