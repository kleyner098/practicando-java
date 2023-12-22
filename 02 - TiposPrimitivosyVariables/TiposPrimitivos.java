
class TiposPrimitivos {
    public static void main(String[] args) { 

            /* Variables booleanas: 
            Una variable booleana solamente puede guardar uno de los dos 
            posibles valores: true (verdadero) y false (falso). */

            boolean verdadero = true;
            System.out.println("Esto es un boolean " + verdadero);
            // Ojo!!! Asignar boolean verdad = 1 daría error pese a que puede usarse en otros lenguajes

            byte numero1 = 100;
            System.out.println("Esto es un byte: " + numero1); 

            /* Char: Un dato de tipo carácter se puede escribir entre comillas simples, por ejemplo 'a', 
            o también indicando su valor Unicode, por ejemplo '\u0061' */
            char caracter = 'a';
            char caracter2 = 65;
            char caracter3 = '\u0061';
            System.out.println("Esto es un char: " + caracter + " y esto también " + caracter2 + " y esto " + caracter3); 

            /* Para visualizar los valores por defecto creamos una nueva clase */
            ValoresPorDefecto vpf = new ValoresPorDefecto();
            vpf.imprimirValoresIniciales();
         
        }
    }