import java.util.Scanner;

public class CompararCadenas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la primera cadena");
        String primera = sc.nextLine();
        System.out.println("Introduce la segunda cadena");
        String segunda = sc.nextLine();
        
        /* No vamos a poder comparar dos cadenas directamente con el operador igual */
        if (primera == segunda) {
            System.out.println("Las cadenas son iguales");
        } else {
            System.out.println("Las cadenas son distintas si las comparamos directamente");
        }

        /* Para comparar cadenas */
        if (primera.equals(segunda)) {
            System.out.println("Las cadenas son iguales si usamos equals para comparar");
        } else {
            System.out.println("Las cadenas son distintas si las comparamos directamente");
        }

        sc.close();
    
    }
}