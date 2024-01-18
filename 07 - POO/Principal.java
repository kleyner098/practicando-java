public class Principal {
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

    
            
    }
}
