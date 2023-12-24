// Introducción a la utilidad Scanner para leer la entrada del usuario
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        // Creamos una herramienta para leer la entrada del usuario y la llamamos scanner
        Scanner scanner = new Scanner(System.in);

        // Mostramos "Escribe un mensaje: "
        System.out.println("Escribe un mensaje y presiona enter: ");

        // Leemos la entrada escrita por el usuario y la asignamos a la memoria del programa
        String message = scanner.nextLine();

        // Mostramos el mensaje escrito por el usuario
        System.out.println(message);
        // Cerramos el recurso
        scanner.close();
    }
}