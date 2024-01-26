public class Principal { // CamelCase
    /* Definición constantes fuera del main */
    static final int DIAS_SEMANA = 7;
    static final double PI = 3.141592;
    public static void main(String[] args) {
        
        Persona paco = new Persona("Paco");
        Persona pedro = new Persona("Pedro",16);
        Persona maria = new Persona("María",16);

        paco.presentarse();
        pedro.presentarse();

        // Ejemplo invocación método estático
        System.out.println (Persona.getContadorPersonas ()); // imprime 2
         
    }
}
