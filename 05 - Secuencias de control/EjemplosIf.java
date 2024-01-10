
public class EjemplosIf {
    public static void main(String[] args) {
    
        // Operadores condicionales

        int numero = 11;

        if (numero > 10) {
            System.out.println("El número es mayor que 10");
        }
        
        if (numero != 0) {
            System.out.println("El número es distinto de cero");
        }

        if (numero >= 1000) {
            System.out.println("El número es al menos 1000");  //aquí no entra porque no cumple la condición
        }
        else {
            System.out.println("El número es menor a 1000");
        }
        
    }
}