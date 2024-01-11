import java.util.Scanner;

public class OperadorModulo {
    public static void main(String[] args) {

        int resto = 7 % 2;
        System.out.println(resto); // Muestra 1
        System.out.println(5 % 3); // Muestra 2
        System.out.println(7 % 4); // Muestra 3
        System.out.println(8 % 4); // Muestra 0
        System.out.println(1 % 2); // Muestra 1

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero:");
        int numero = Integer.valueOf(sc.nextLine());

        if (numero % 400 == 0) {
            System.out.println("El número " + numero + " es divisible por 400.");
        } else {
            System.out.println("El número " + numero + " no es divisible por 400.");
        }

        sc.close();
        // Escribo un comentario
        
    }
}