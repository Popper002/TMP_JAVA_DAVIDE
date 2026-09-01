package Obj_Class; 


/**
 * metodi 
 * 
 * atrtibuti 
 *  
 * Animal
 */


public class Animal{ 
    
    public int numeroZampe; 
    
    private String razza; 
    
    private String colore;
    
    public boolean isVivo;

    private String suonoVerso; 

    void faiVerso(){
        System.out.println("VERSOOOO: "+suonoVerso);    
    }
    
    public Animal(){

    }
    public Animal(String name){

    }
    
    public static void main(String[] args) {
        
        Animal anime = new Animal();
        
        Animal animaleConNome = new Animal("CARLINO");

    }
}