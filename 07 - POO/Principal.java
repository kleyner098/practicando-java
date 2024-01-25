public class Principal { // CamelCase
    /* Definición constantes fuera del main */
    static final int DIAS_SEMANA = 7;
    static final double PI = 3.141592;
    public static void main(String[] args) {
        
        Persona paco = new Persona("Paco");
        Persona pedro = new Persona("Pedro");
        Persona juan = new Persona("Juan");

        paco.presentarse();
        pedro.presentarse();
        juan.presentarse(); // Todos a 0 tal cual los creamos

        pedro.crecer(); 
        pedro.crecer(); // Llamamos dos veces al método crecer
        paco.presentarse();
        pedro.presentarse(); // Ahora Pedro tiene 2 años

        /* Definición de variables primitivas */
        int numeroEntero = 1;
        double numeroDecimal = 0.1;
        boolean expresion = true;

         /* Definición de constantes primitivas dentro del main */
        final int DIAS_SEMANA2 = 7;
        final double PI2 = 3.141592;
      
        /* Cadenas  - Las cadenas son objetos pero hasta ahora no hemos usado constructores */
        String cadena = "Hola";

        funcionEntero(); // Ejemplo invocación función
        numeroEntero = incrementar(numeroEntero);

        /* Objetos */
        Persona miAmigoPepe = new Persona("Pepe"); // Ejemplo construccion método
        miAmigoPepe.crecer();
        miAmigoPepe.presentarse();  // Ejemplo invocación método
            
    }

    static void funcionEntero(){//Función sin parámetros{
        System.out.println("Soy una función");
    }

    static int incrementar(int entero){//Función sin parámetros
        return entero+1; // La función más tonta del mundo
    }

}
