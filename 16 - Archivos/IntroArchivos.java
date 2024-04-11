import java.io.File;
import java.io.IOException;
public class IntroArchivos {
    public static void main(String[] args) {

        /* Primer constructor */
        File f = new File("personas.txt");
        File f2 = new File("ficheros/personas.txt");

        // Segundo constructor 
        File f3 = new File("ficheros", "personas2.dat" );
        File f4 = new File("C:\\Directorio\\Otro Directorio", "personas3.txt" );

        // Tercer constructor
        File ruta = new File("ficheros");
        File f5 = new File(ruta, "personas5.dat" );

        File ruta2 = new File("C:\\Directorio\\Otro Directorio");
        File f6 = new File(ruta2, "personas6.dat" );
        
        try {
            f.createNewFile();
            f2.createNewFile();
            f3.createNewFile();
            f4.createNewFile();
            f5.createNewFile();
            f6.createNewFile();
        }
        catch (IOException e) {
                  
                // Si no se puede lanzamos un mensaje
                //con el error que pueda ocurrir
                e.printStackTrace();
            }

        
    }
}
