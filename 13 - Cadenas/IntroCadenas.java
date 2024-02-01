import java.util.Arrays;
import java.util.Scanner;



public class IntroCadenas {
    public static void main(String[] args) {

        String palabraMagica = "abracadabra";
        System.out.println(palabraMagica);

        Scanner lector = new Scanner(System.in);
        System.out.print("¿Cómo te llamas? ");
        // Leemos la línea del usuario y se la asignamos a la variable nombre
        String nombre = lector.nextLine();
        System.out.println(nombre);

        String bienvenida = "Buenos días, " + nombre; // Concatenación de cadenas
        System.out.println(bienvenida);
    
        lector.close();   

        String text = "Piedra";

        if (text.equals("Piedra")) {
             System.out.println("Las cadena es Piedra");
        } else {
            System.out.println("Las cadena es otra cosa ");
        }

        String seleccionOrdenador = "piedra";
        if (text.equalsIgnoreCase(seleccionOrdenador)) {
            System.out.println("Las cadena es Piedra");
        } else {
           System.out.println("Las cadena es otra cosa ");
        }

        String cadenaCompuesta = "primero segundo tercero cuarto";
        String[] piezas = cadenaCompuesta.split(" ");
        System.out.println(piezas[0]);
        System.out.println(piezas[1]);
        System.out.println(piezas[2]);
        System.out.println(piezas[3]);

        System.out.println();

        for (int i = 0; i < piezas.length; i++) {
            System.out.println("* " + piezas[i]);
        }

        String cadena = "Hola mundo";
        char[] arrayCadena = cadena.toCharArray();
        System.out.println(arrayCadena[0]); //Imprime H
        System.out.println(arrayCadena[1]); //Imprime o
        System.out.println(arrayCadena);    //Imprime toda la cadena
        
        /* Ojo a la hora de ordenar cadenas con arrays!! */
        Arrays.sort(arrayCadena);
        System.out.println(arrayCadena);    //ArrayOrdenado
        
        char[] minusculas = cadena.toLowerCase().toCharArray();
        Arrays.sort(minusculas);
        System.out.println(minusculas);    //ArrayOrdenado

        //devuelve true porque ola está en "Hola mundo"
        boolean encontrado=cadena.contains("ola"); 
        //devuelve fals porque alo no está en "Hola mundo
        boolean perdido=cadena.contains("alo"); 

        System.out.println("Encontrado " + encontrado + " Perdido " + perdido);
        
        // Buscamos el primer indice de la ocurrencia de o en la cadena "Hola mundo"
        System.out.println(cadena.indexOf("o")); // Busca la primera ocurrencia (1)
        System.out.println(cadena.lastIndexOf("o")); // Busca la ultima ocurrencia (9)
        // Busca la ocurrencia a partir de este indice (9)
        System.out.println(cadena.indexOf("o",2)); 
        // Devuelve -1 porque no encuentra más
        System.out.println(cadena.indexOf("o",10)); 

        System.out.println(cadena.indexOf("h")); // Ojo con las mayúsculas y minúsculas
        System.out.println(cadena.indexOf("a")); 
        
        String str="texto"; 
        //devuelve el carácter ‘e’ ya que éste está en la posición 1 (uno) de la variable.
        char letra=str.charAt(1); 
        System.out.println(letra);

        // Reemplazar una cadena de texto por otra
        System.out.println(cadena);
        String nuevaCadena = cadena.replace("mundo", "clase");
        System.out.println(nuevaCadena);

    }
}
