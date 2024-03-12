import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Flujos {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        
        // Un flujo en Java es como un río de datos que fluye continuamente.
        // Puede fluir hacia adentro (entrada) o hacia afuera (salida).

        // Ejemplo de flujo de entrada (leer datos):
        InputStream inputStream = new FileInputStream("archivo.txt");
        int data = inputStream.read(); // Lee el próximo byte de datos.

        // Ejemplo de flujo de salida (escribir datos):
        OutputStream outputStream = new FileOutputStream("archivo.txt");
        outputStream.write(data); // Escribe un byte de datos.

        // Siempre debemos cerrar los flujos para liberar recursos:
        inputStream.close();
        outputStream.close();

    }
}
