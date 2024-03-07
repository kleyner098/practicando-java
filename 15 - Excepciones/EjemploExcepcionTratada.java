public class EjemploExcepcionTratada {
    public static void main (String args[]) {
        String cadenas[] = {"Cadena 1","Cadena 2","Cadena 3","Cadena 4"};
        try {
            for (int i=0; i<=4; i++) System.out.println(cadenas[i]); 
        } catch( ArrayIndexOutOfBoundsException aie ) {
            System.out.println("\nError: Fuera del índice del array\n");
        } catch( Exception e ) {
            // Captura cualquier otra excepción
            System.out.println("Excepción: " + e.toString() ); 
        } finally {
            System.out.println( "Esto se imprime siempre." );
        }
    }
}


