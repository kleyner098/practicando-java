// Introducción a la utilidad Scanner para leer la entrada del usuario
import java.util.Scanner;

public class Conversion {

    public static void main(String[] args) {
        // Creamos una herramienta para leer la entrada del usuario y la llamamos scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe un entero y presiona enter: ");

        // Leemos la entrada escrita por el usuario y la asignamos a la memoria del programa
        int entero = Integer.valueOf(scanner.nextLine()); // No introducir un valor entero dará error

        // Mostramos el mensaje escrito por el usuario
        System.out.println("Imprimimos el entero: " + entero);
        // Cerramos el recurso
        scanner.close();

        String valorComoCadena = "42.42";
        double decimal = Double.valueOf(valorComoCadena);
        System.out.println(decimal);
        
        String booleanComoCadena = "True";
        boolean miBoolean = Boolean.valueOf(booleanComoCadena);
        System.out.println(miBoolean);


    }
}