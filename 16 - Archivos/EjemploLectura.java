import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjemploLectura {
    public static void main(String[] args) throws IOException {

        InputStreamReader rd; 
        rd = new InputStreamReader(System.in);

        BufferedReader bf; 
        bf = new BufferedReader(rd);

        String s = bf.readLine(); 
       
        System.out.println("La cadena introducida es: " +s);
    }

}
