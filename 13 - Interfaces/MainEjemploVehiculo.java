public class MainEjemploVehiculo {
    public static void main(String[] args) {
        
        // Podemos instanciar un objeto como una instancia del interfaz
        Vehiculo tesla = new Coche(); 
        tesla.arrancar(); // arrancar el motor...

        Coche ford = new Coche(); // y tb como una instancia de la clase
        ford.arrancar(); // arrancar el motor...

        Vehiculo tata = new Camion();

        Arrancador.arrancarMotor(tesla); // arrancando motor...
        Arrancador.arrancarMotor(tata); // arrancar el motor del camión...
    }
    
}
