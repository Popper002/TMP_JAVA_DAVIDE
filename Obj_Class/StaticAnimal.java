package Obj_Class;
 
public class StaticAnimal {
    
    public static void faiVerso(){
        System.out.println("COIAOO");
    }

    public void faiVerso(String ds){
        System.out.println("COIAOO");

    }

    public static void main(String[] args) {
        StaticAnimal st = new StaticAnimal();
        StaticAnimal.faiVerso();
        st.faiVerso("CIAIAIOIAA");
        
    }
}
