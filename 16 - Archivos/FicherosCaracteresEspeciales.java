import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FicherosCaracteresEspeciales {
    public static void main(String[] args) {
        String cad;
        try {
            FileInputStream fis = new FileInputStream("ejemplo.txt");
            InputStreamReader isr = new InputStreamReader(fis, "ISO-8859-1");
            BufferedReader br = new BufferedReader(isr);
            while ((cad = br.readLine()) != null) {
            System.out.println(cad);
        }
        //Cerramos
        br.close();
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
}

    

