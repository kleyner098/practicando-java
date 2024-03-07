import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PropagacionDeExcepciones {
  
    public static void main(String[] argumentos) {
        BufferedReader lector = new BufferedReader (new InputStreamReader(System.in));
        try{
            mostrar_mensaje(lector);
        }catch (IOException e){
            System.out.println("Fallo de lectura");
        }finally{
            System.out.println("Aquí pondremos lo que queremos ejegcutar siempre");
        }       
        
        System. out .println ("Final del main");
    }
    static void mostrar_mensaje (BufferedReader b) throws IOException{ //Propaga la excepción
        //el método declara la excepción para que sea propagada.
        System.out.print("Escribe mensaje: ");
        String str=b.readLine(); //esta línea provoca una excepción
        System.out.println (str);
    }

}
