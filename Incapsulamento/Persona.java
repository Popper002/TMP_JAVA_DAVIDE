package Incapsulamento;
/**
 * @author Popper002 - Riccardo Oro 
 * This an example of a stardard implementation of the incapsulazation pattern using a java class 
 */
public class Persona {

    //The attributes of the class, are declared private, this prevent the direct exposition to the extern  
    private String name; 
    private Integer age ; //Using the wrapped version of a int 
    private String surname; 

    public Persona(){
        //create an empty costructor
    }
    /**
     * To access to the atributes we use getter and setter method 
    */

    public String getName(){
        return this.name; //We can declare return name; because we have only one attributes called name, but is a good action declare like that
    }
    
    public void setName(String name){
        this.name = name;  //In this case we need to use the 'this' keyyword
    }
    //* Do this for all atributes, don't reapet yourself */


    @Override
    public String toString(){
        return "Nome: "+getName(); 
    }
    public static void main(String[] args) {
        Persona mario  = new Persona();
        mario.setName("Mario");
        System.out.println(mario.toString());
    }


}
