
class TiposPrimitivos {
    public static void main(String[] args) { 

            /* Numéricos enteros */
            byte numeroByte = 100;
            System.out.println("Esto es un byte: " + numeroByte); 

            short numeroShort = 20435;
            System.out.println("Esto es un short: " + numeroShort); 

            int numeroInt = 776855647;
            System.out.println("Esto es un int: " + numeroInt); 

            long numeroLong = 9223372036854775807L;  // Debe llevar el sufijo L tras el numero
            System.out.println("Esto es un long: " + numeroLong); 

            /* Numericos decimales */
            float numeroFloat = 3.141592F; // decimales de hasta 7 dígitos
            System.out.println("Esto es un float: " + numeroFloat); 

            double numeroDouble = 3.141592653589793; // decimales de hasta 15 dígitos
            System.out.println("Esto es un double: " + numeroDouble);

            /* Una variable booleana solamente puede guardar uno de los dos 
            posibles valores: true (verdadero) y false (falso). */
            boolean verdadero = true; 
            System.out.println("Esto es un boolean " + verdadero);
           
            /* Char: Un dato de tipo carácter se puede escribir entre comillas simples, por ejemplo 'a', 
            o también indicando su valor Unicode, por ejemplo '\u0061' */
            char caracter = 'a';
            char caracter2 = 97;
            char caracter3 = '\u0061';
            System.out.println("Esto es un char: " + caracter + " y esto también: " + caracter2 + " y esto: " + caracter3 + "\n"); 

            /* Para visualizar los valores por defecto creamos una nueva clase 
             * porque una variable sin inicializar da error en un método
            */
            ValoresPorDefecto vpf = new ValoresPorDefecto();
            vpf.imprimirValoresIniciales();

            /* Desbordamiento (Overflow) - Ocurre cuando sobrepasamos el limite de nuestras primitivas */
            int i = Integer.MAX_VALUE;
            int j = i + 1;  // Cuando un entero se desborda, vuelve al valor mínimo y comienza a contar desde allí.
            System.out.println("Valor maximo entero: " + i + " Operación desbordada " + j); // La variable 'j' volverá a -2147483648
            
            double d = Double.MAX_VALUE;
            double o = d + 1; // Los números en coma flotante se desbordan devolviendo el valor máximo
            System.out.println("Valor maximo double: " + d + " Operación desbordada " + o);  // La variable 'o' será el valor máximo

            double o2 = d * 1000; // Los números en coma flotante se desbordan devolviendo el valor máximo
            System.out.println("Valor maximo double: " + d + " Operación desbordada " + o2);  // La variable 'o' será el valor máximo

        }
    }