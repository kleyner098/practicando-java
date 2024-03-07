import java.io.File;
import java.io.IOException;
public class IntroArchivos {
    public static void main(String[] args) {
        File f = new File("personas.txt");
        try {
            f.createNewFile();
        }
        catch (IOException e) {
                  
                // Si no se puede lanzamos un mensaje
                //con el error que pueda ocurrir
                e.printStackTrace();
            }
    }
}
