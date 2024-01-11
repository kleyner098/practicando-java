public class Underflow {
    public static void main(String[] args) {
        
            /* Desbordamiento (Underflow) - Ocurre cuando sobrepasamos el mínimos de nuestras primitivas */
            int k = Integer.MIN_VALUE;
            int l = k - 1;  // Cuando un entero se desborda por el mínimo, vuelve al valor máximo y comienza a contar desde allí.
            System.out.println("Valor mínimo entero: " + k + " Operación desbordada por abajo " + l); // La variable 'l' volverá a 2147483647
            double f = Double.MIN_VALUE;
            double h = f - 1; // El valor mínimo en coma flotante es 2^(-1074) que es igual a 4,9E-324  
            System.out.println("Valor mínimo double: " + f + " Operación desbordada " + h);  //En algunos casos pierde precisión
            // Intentar valores más pequeños
            double valorMuyPequeno = Double.MIN_VALUE;
            System.out.println("Valor demasiado pequeño: " + valorMuyPequeno/10000000); //Devuelve cero
    }
}
