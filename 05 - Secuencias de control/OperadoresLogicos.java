import java.util.Scanner;

public class OperadoresLogicos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero entero");
        int numero = Integer.valueOf(sc.nextLine());

        /* El número está comprendido entre 5 y 10 (ambos incluidos) */
        if (numero >= 5 && numero <= 10) {
            System.out.println("El número está entre 5 y 10");
        } 
        /* El número es o bien menor que 100 o bien mayor que 150 */
        if (numero < 100 || numero > 150) {
            System.out.println("El número o es menor a 100 o es mayor de 150");
        } /*  !(numero >= 100 && numero <= 150) debería dar el mismo resultado*/
        
        if (!(numero == 7)) {
             System.out.println("El número no es 7");
        }

        sc.close();
    
    }
}