import java.io.FileWriter;
import java.io.PrintWriter;
/* Usamos un bucle for para escribir varias veces en un archivo */
public class EscribirFichero02 {
    public static void main(String[] args) {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("mensaje2.txt");
            pw = new PrintWriter(fichero);
            for (int i = 0; i < 10; i++)
            pw.println("Linea " + i);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
            // Aprovechamos el finally para asegurarnos que se cierra el fichero.
            if (null != fichero) fichero.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}

