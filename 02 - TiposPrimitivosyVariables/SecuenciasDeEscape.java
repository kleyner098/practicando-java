// Demostración de secuencias de escape comunes
public class SecuenciasDeEscape {
    public static void main(String[] args) { 

       // Las unicas secuencias de escape validas son: (\b  \t  \n  \f  \r  \"  \'  \\ )
        System.out.println("Impresión de apostrofes: " + "\'A\'" ); 
        System.out.println("Impresión de comillas: " + "\"Cadena de texto\"" ); 
        System.out.println("Impresión de la diagonal invertida: " + "\\" );
        System.out.println("Texto separado \b\b el cursor vuelve atras un espacio");
        System.out.println("Texto separado \t\t por dos tabulaciones");
        System.out.println("Texto separado \n\n por dos saltos de linea");
        System.out.println("Texto separado \f\f por dos comienzos de página's (igual que saltos de línea en este compilador)");
        System.out.println("Ejemplo para motrar el retorno de carro\rHola (se escribe sobre el ejemplo anterior)");
        
        String pais = "Espa\u00F1a";
        System.out.println("Ejemplo para escapar caracter unicode: " + pais);

        long tarjetaCredito = 1234_5678_9012_3456L;
        System.out.println("El número se muestra sin espacios: " + tarjetaCredito);

    }
}
