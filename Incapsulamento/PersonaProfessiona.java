package Incapsulamento;

import java.util.Collection;
import java.util.Collections;

public class PersonaProfessiona {
    /**
     * In this version of incapsulazation we use a more professional pattern 
     * 
     * 
     */

    private String name; 


    public PersonaProfessiona(){

    }


    public String getName(){
        String tmp = this.name; 
        return tmp; 
    }

    public String getRealName(){
        return Collections.singleton(this.name).toString();
    }

    public void setName(String name){
        this.name = name; 
    }

     @Override
    public String toString(){
        return "Nome: "+getRealName(); 
    }

    public static void main(String[] args) {
        
        PersonaProfessiona ps = new PersonaProfessiona();
        ps.setName("Pino");
       System.out.println(ps.toString());

        String name = ps.getRealName(); 
        name = "YES"; 
        ps.setName(name);
        System.out.println(ps.toString());
    }
    
}
