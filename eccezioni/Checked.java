


public class Checked{

    public static void main(String[] args) {

        // Esempi di eccezioni unchecked (non richiesto il "throws"; runtime exceptions)
        System.out.println("--- Unchecked exceptions (runtime) ---");

        // 1) ArrayIndexOutOfBoundsException
        try{
            System.out.println(args[0]); // se non passo argomenti -> ArrayIndexOutOfBoundsException
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Unchecked: ArrayIndexOutOfBoundsException catturata");
            e.printStackTrace(System.out);
        }

        // 2) NullPointerException
        try{
            String s = null;
            s.length(); // NullPointerException
        }catch(NullPointerException e){
            System.out.println("Unchecked: NullPointerException catturata");
            e.printStackTrace(System.out);
        }

        // 3) ArithmeticException
        try{
            int z = 1/0; // ArithmeticException
            System.out.println(z);
        }catch(ArithmeticException e){
            System.out.println("Unchecked: ArithmeticException catturata");
            e.printStackTrace(System.out);
        }

        System.out.println();
        System.out.println("--- Checked exceptions (compile-time) ---");

        // Esempi di eccezioni checked: devono essere dichiarate o gestite
        // 1) FileNotFoundException (richiesta gestione)
        try{
            java.io.FileInputStream fis = new java.io.FileInputStream("file_che_non_esiste.txt");
            fis.close();
        }catch(java.io.FileNotFoundException e){
            System.out.println("Checked: FileNotFoundException catturata");
            e.printStackTrace(System.out);
        }catch(java.io.IOException e){
            // close() può lanciare IOException
            System.out.println("Checked: IOException durante close()");
            e.printStackTrace(System.out);
        }

        // 2) ClassNotFoundException (esempio con Class.forName)
        try{
            Class.forName("com.example.ClasseAssente");
        }catch(ClassNotFoundException e){
            System.out.println("Checked: ClassNotFoundException catturata");
            e.printStackTrace(System.out);
        }

        // 3) Uso di un metodo che dichiara throws (propaga un checked)
        try{
            readFirstByte("ancora_file_che_non_esiste.txt");
        }catch(java.io.IOException e){
            System.out.println("Checked: IOException propagata da readFirstByte");
            e.printStackTrace(System.out);
        }
    }

    // Metodo che dichiara un checked exception. Il chiamante deve gestirlo o dichiararlo.
        public static int readFirstByte(String path) throws java.io.IOException{
        try (java.io.FileInputStream in = new java.io.FileInputStream(path)){
            return in.read();
        }
    }

}