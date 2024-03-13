/* Ejemplo creación de un nuevo directorio en el Escritorio */
import java.io.File;
public class EjemploDirectorio {
    public static void main(String[] args) {
        //en este caso creará un directorio en el escritorio, si existe indica que ya existe
        File f = new File("c:\\Directorio\\directorio_nuevo");
        // comprobar si el directorio puede ser creado
        if (f.mkdirs()) System.out.println("Directorio creado");
        else System.out.println("Directorio ya existe");
        
        // en este segundo ejemplo se indica Desktop2 el cual no existe
        // la primera vez creará los dos directorios.
        File f2 = new File("c:\\Directorio2\\directorio_nuevo");
        if (f2.mkdirs()) System.out.println("Directorio creado");
        else System.out.println("Directorio ya existe");
    }
}

